package com.itheima.controller;

import cn.itcast.utils.Page;
import com.itheima.pojo.BaseDict;
import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;
import com.itheima.service.CustomerService;
import com.itheima.test.ScheduleEmailJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Value("${customer.dict.source}")
    private String source;

    @Value("${customer.dict.industry}")
    private String industry;

    @Value("${customer.dict.level}")
    private String level;

    @RequestMapping("/list")
    public String list(QueryVo vo, Model model) throws Exception {
        List<BaseDict> fromList = customerService.findDictByCode(source);
        List<BaseDict> industryList = customerService.findDictByCode(industry);
        List<BaseDict> levelList = customerService.findDictByCode(level);

        model.addAttribute("fromType", fromList);
        model.addAttribute("industryType", industryList);
        model.addAttribute("levelType", levelList);

        model.addAttribute("custName", vo.getCustName());
        model.addAttribute("custSource", vo.getCustSource());
        model.addAttribute("custIndustry", vo.getCustIndustry());
        model.addAttribute("custLevel", vo.getCustLevel());

        //分页查询
        vo.setStart((vo.getPage() - 1) * vo.getSize());

        List<Customer> customerList = customerService.findCustomerByVo(vo);
        Integer count = customerService.findCustomerCountByVo(vo);

        Page<Customer> page = new Page<>();
        page.setTotal(count);
        page.setPage(vo.getPage());
        page.setSize(vo.getSize());
        page.setRows(customerList);

        model.addAttribute("page", page);
        return "customer";
    }

//    @Autowired
//    private SchedulerFactoryBean schedulerFactoryBean;

    @RequestMapping("/mail")
    @ResponseBody
    public String test() throws SchedulerException, MessagingException {
        //0 0/2 * 1/1 * ? *
        new StdSchedulerFactory();
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        Scheduler scheduler = schedulerFactoryBean.getScheduler();

        JobDetail job = JobBuilder.newJob(ScheduleEmailJob.class).
                withIdentity("testEmailJob", "test").build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("testEmailJob", "test").
                withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

        scheduler.scheduleJob(job, trigger);
        scheduler.start();
//        System.out.println(customerService.findAllHotels());
//        MailUtils.sendMail("guojian0808@126.com", "这是一封测试邮件！！！");
        return "";
    }
}

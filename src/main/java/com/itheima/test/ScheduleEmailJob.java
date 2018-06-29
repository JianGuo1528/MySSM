package com.itheima.test;

import com.itheima.service.CustomerService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ScheduleEmailJob extends ScheduleJob {

    @Autowired
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        super.execute(jobExecutionContext);
        System.out.println("This is a test: " + new Date().getTime());
        System.out.println(customerService.findAllHotels());
//            MailUtils.sendMail("guojian0808@126.com", "这是一封测试邮件！！！");

    }
}

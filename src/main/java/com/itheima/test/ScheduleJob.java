package com.itheima.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import java.util.List;
import java.util.logging.Logger;

public abstract class ScheduleJob implements Job {
    protected static final Logger log = Logger.getLogger(ScheduleEmailJob.class.getName());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        try {
            List<JobExecutionContext> jobs = jobExecutionContext.getScheduler().getCurrentlyExecutingJobs();
            if (jobs != null && !jobs.isEmpty()) {
                for (JobExecutionContext job : jobs) {
                    if (job.getTrigger().equals(jobExecutionContext.getTrigger()) && !job.getJobInstance().equals(this)) {
                        log.info("There's another instance running, : " + this);
                        return;
                    }
                }
            }
        } catch (SchedulerException e) {
            System.out.println(e.getCause());
        }
    }
}

package com.aimir.scheduler.controller;

import com.aimir.scheduler.entity.JobRequest;
import com.aimir.scheduler.job.CronJob;
import com.aimir.scheduler.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import static org.junit.Assert.*;

public class ScheduleControllerTest {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    private String jobName = "TestJobName";
    private String groupName = "TestGroupName";

    @org.junit.Test
    public void addScheduleJob() {
//        JobRequest jobRequest = new JobRequest();
//        jobRequest.setCronExpression("0/10 * * ? * *");
//        jobRequest.setJobName(jobName);
//        jobRequest.setJobGroup(groupName);
//
//        when(schedulerFactoryBean.getScheduler()).thenReturn(scheduler);
//
//        boolean result = scheduleService.addJob(jobRequest, CronJob.class);
//        assertThat(result).isTrue();
//
//        verify(schedulerFactoryBean).getScheduler();
    }


    @org.junit.Test
    public void deleteScheduleJob() {
    }

    @org.junit.Test
    public void getAllJobs() {
    }

    @org.junit.Test
    public void pauseJob() {
    }

    @org.junit.Test
    public void resumeJob() {
    }
}
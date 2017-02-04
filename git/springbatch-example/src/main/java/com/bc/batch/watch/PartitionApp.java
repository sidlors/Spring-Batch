package com.bc.batch.watch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bc.batch.watch.util.WatchBatchHelper;

public class PartitionApp {

	public static void main(String[] args) {
		PartitionApp obj = new PartitionApp();
		obj.runTest();
	}
	private void runTest() {

		String[] springConfig = { 
								  "spring/batch/jobs/job-hits.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		WatchBatchHelper.TOTAL=70000;
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("partitionJob");

		try {
			JobParameters param = new JobParametersBuilder().
					addString("requestId", "3866").
					addString("criterionId", "2792").toJobParameters();
			
			JobExecution execution = jobLauncher.run(job, param);
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Exit Status : " + execution.getAllFailureExceptions());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}
}
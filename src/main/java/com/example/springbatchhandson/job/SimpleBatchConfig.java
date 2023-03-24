//package com.example.springbatchhandson.job;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.JobScope;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Slf4j
//@RequiredArgsConstructor
//@Configuration
//public class SimpleBatchConfig {
//
//    private final JobRepository jobRepository;
//    private final PlatformTransactionManager platformTransactionManager;
//
//    @Bean
//    public Job simpleJob() {
//        return new JobBuilder("simpleJob", jobRepository)
//                .start(simpleStep1(null))
//                .build();
//    }
//
//    @Bean
//    @JobScope
//    public Step simpleStep1(@Value("#{jobParameters[requestDate]}") String requestDate) {
//        return new StepBuilder("simpleStep", jobRepository)
//                .tasklet((contribution, chunkContext) -> {
//                            log.info(">>>>> This is Step1");
//                            log.info(">>>>> requestDate = {}", requestDate);
//                            return RepeatStatus.FINISHED;
//                        }, platformTransactionManager
//                )
//                .build();
//    }
//}

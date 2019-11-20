package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@SpringBootApplication
@EnableScheduling
public class Application implements SchedulingConfigurer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(() -> System.out.println("działa"),
                triggerContext -> Date.from(LocalDateTime.now().plusSeconds(2).toInstant(ZoneOffset.ofHours(1))));
    }
}

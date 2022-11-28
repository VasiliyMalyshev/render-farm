package ru.malyshev.renderfarm;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.malyshev.renderfarm.service.TaskService;
import ru.malyshev.renderfarm.service.TaskServiceImpl;

@SpringBootApplication
@EnableScheduling
public class RenderFarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenderFarmApplication.class, args);

    }
}

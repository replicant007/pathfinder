package com.example.pathfinder;

import com.example.pathfinder.web.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.example.pathfinder.web"})
public class PathfinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PathfinderApplication.class, args);
    }

}

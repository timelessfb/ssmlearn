package edu.uestc.spring.webmvc.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "edu.uestc.spring.webmvc")
public class RootConfig {
}

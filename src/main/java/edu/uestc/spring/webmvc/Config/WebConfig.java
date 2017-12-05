package edu.uestc.spring.webmvc.Config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages = "")
public class WebConfig {

}

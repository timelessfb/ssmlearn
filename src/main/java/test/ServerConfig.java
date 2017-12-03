package test;

import edu.uestc.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "edu.uestc.service")
public class ServerConfig {
//    @Bean
//    public UserServiceImpl ss(){
//        UserServiceImpl userService = new UserServiceImpl();
//        return  userService;
//    }
    @Bean
    public CompactDisc CD(){
        SgtPeppers sgtPeppers = new SgtPeppers();
        sgtPeppers.setAge(18);
        return sgtPeppers;
    }

    @Bean
    public CDPlayer CDP(){
        CDPlayer cdPlayer = new CDPlayer(new SgtPeppers());
        return cdPlayer;
    }
}

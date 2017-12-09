package edu.uestc.spring.webmvc.bean.web;

import edu.uestc.mybatis.po.User;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {
    @ModelAttribute("us")
    public String model(@RequestParam("username") String usern){
        return usern;
    }


    @RequestMapping(value = "/{Form}", method = RequestMethod.GET)
    public String home(@PathVariable String Form) {
        return Form;
    }

    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    public String logining(Model model) {
        System.out.println(model.containsAttribute("us"));
    }
}

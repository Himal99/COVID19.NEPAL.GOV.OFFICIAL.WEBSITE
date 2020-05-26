package com.cibt.app.mailsender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    

    @GetMapping
    public String index(){
        return "home/index";
    }


  
}
package com.qoobico.remindme.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/remind")
public class ReminderController {

    public String getReminder(){
        return "My reminder";
    }
}

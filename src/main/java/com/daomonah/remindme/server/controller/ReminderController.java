package com.daomonah.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/remind")
public class ReminderController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public @ResponseBody String getReminder() {
        return "My Reminder";
    }
}

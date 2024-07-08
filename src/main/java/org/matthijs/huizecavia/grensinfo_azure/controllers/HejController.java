package org.matthijs.huizecavia.grensinfo_azure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HejController {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "hej";
    }
}

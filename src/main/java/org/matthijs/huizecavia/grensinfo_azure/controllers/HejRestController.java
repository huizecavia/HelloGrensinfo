package org.matthijs.huizecavia.grensinfo_azure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HejRestController {

    @GetMapping("/hej")
    public String getHej() {
        return "Hej! Välkommen till Gränsinfo";
    }
}

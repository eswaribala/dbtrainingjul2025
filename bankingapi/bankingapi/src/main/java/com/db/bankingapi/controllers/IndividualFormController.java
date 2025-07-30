package com.db.bankingapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userforms")
public class IndividualFormController {

    @GetMapping("/v1.0")
    public String loadIndexPage() {
        return "index.html";
    }
}

package com.db.bankingapi.controllers;

import com.db.bankingapi.dto.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndividualFormController {

    @GetMapping("forms/v1.0")
    public String loadIndexPage(Model model) {
        Setting setting=new Setting();
        setting.setTitle("Individual Form");
        model.addAttribute("setting",setting);
        return "index";
    }
}

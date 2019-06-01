package com.example.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MyController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public RedirectView adddata(@ModelAttribute Register register) {
        RegisterController.lst.add(register);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/");
        return redirectView;
    }
}

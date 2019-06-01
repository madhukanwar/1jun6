package com.example.Validation;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {

    public static List<Register> lst= new ArrayList<Register>();

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("lst", lst);
        model.addAttribute("name","htmlPage");
        return "index.html";
    }

    @RequestMapping("/register")
    public String register(Register register){
        return "register.html";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String add(@Valid Register register,
                      BindingResult result, Model model){
        if(result.hasErrors()){
            return "register";
        }
        lst.add(register);
        model.addAttribute("data",register);
        return "suceess";
    }

}

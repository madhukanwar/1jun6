package com.example.Pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SchoolController {

    public List<Schooldemo> lst= new ArrayList<Schooldemo>();

    @Autowired
    public SchoolDao schoolDao;

    @PostConstruct
    public void add(){
        Schooldemo school1 =new Schooldemo(1,"java","1000");
        schoolDao.save(school1);
        Schooldemo school2 =new Schooldemo(2,"java","2000");
        lst.add(school2);
        schoolDao.saveAll(lst);

    }

    @RequestMapping("/")
    public String index(@PageableDefault(size = 10) Pageable pageable
    ,Model model){
        Page<Schooldemo> page = schoolDao.findAll(pageable);
        model.addAttribute("page", page);
        return "index";
    }

}

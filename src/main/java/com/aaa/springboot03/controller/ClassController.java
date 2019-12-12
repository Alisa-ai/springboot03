package com.aaa.springboot03.controller;

import com.aaa.springboot03.entity.Class;
import com.aaa.springboot03.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("class")
public class ClassController {
    @Resource
    ClassService service;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Class>list=service.findAll();
        model.addAttribute("list",list);
        return "showClass";
    }
    @RequestMapping("delete")
    @ResponseBody
    public boolean delete(int classid){
        return service.delete(classid);
    }
}

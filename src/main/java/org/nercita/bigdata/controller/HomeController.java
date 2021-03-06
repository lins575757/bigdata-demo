package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/home")
public class HomeController extends BaseController {

    @Override
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("首页");
        return list;
    }

    @GetMapping(path = {"/", "/index"})
    public String home() {
        return "/home/index";
    }
}

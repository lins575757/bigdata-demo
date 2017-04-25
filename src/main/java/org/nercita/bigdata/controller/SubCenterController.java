package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 大数据分中心控制器
 * Created by lins on 2017/4/21.
 */

@Controller
@RequestMapping(value = "/subcenter")
public class SubCenterController extends BaseController {

    @Override
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("大数据分中心");
        return list;
    }

    @GetMapping("/index")
    public String index() {
        return "/subcenter/index";
    }

}

package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 大数据云服务控制器
 * Created by lins on 2017/4/19.
 */

@Controller
@RequestMapping(value = "/cloudservice")
public class CloudServiceController extends BaseController {

    @Override
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("大数据云服务");
        return list;
    }

    @GetMapping("/index")
    public String index() {
        return "/cloudservice/index";
    }

}

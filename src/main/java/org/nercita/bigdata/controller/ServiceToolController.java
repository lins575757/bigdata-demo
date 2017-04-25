package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务工具控制类
 * Created by lins on 2017/4/19.
 */

@Controller
@RequestMapping(value = "/servicetool")
public class ServiceToolController extends BaseController {

    @Override
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("数据服务工具");
        return list;
    }

    @GetMapping("/index")
    public String index() {
        return "/servicetool/index";
    }

}

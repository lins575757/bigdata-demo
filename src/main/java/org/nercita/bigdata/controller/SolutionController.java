package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 解决方案控制器
 * Created by lins on 2017/4/18.
 */

@Controller
@RequestMapping(value = "/solution")
public class SolutionController extends BaseController {

    @Override
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("解决方案");
        return list;
    }

    @GetMapping("/index")
    public String index() {
        return "/solution/index";
    }

}

package org.nercita.bigdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 基础Controller，封装通用逻辑，无业务相关
 */
public class BaseController {

    public static final String REQUEST_MESSAGE = "message";
    public static String UPLOAD_PATH = File.separator + "resources"
            + File.separator + "uploads" + File.separator;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 注入HttpServletRequest方便调用
     */
    @Autowired
    protected HttpServletRequest request;

    /**
     * 菜单项
     *
     * @return 分级菜单数组
     */
    @ModelAttribute("menu")
    public List<String> menu() {
        List<String> list = new ArrayList<>();
        list.add("首页");
        return list;
    }


}
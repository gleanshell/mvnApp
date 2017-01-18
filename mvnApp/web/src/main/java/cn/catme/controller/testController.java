package cn.catme.controller;

import cn.catme.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xx on 2017/1/12.
 */
@Controller
public class testController {
    @Autowired
    private TestService service;
    @RequestMapping(value = "/index")
    public void testIndex(HttpServletRequest request, HttpServletResponse response){
        try {
            String data=request.getParameter("data");
            System.out.println("data:"+data);

            service.addOne("小明");
            response.getWriter().write("oh my god!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return "hello world!";
    }
}

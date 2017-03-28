package com.example.web;
import com.example.domain.MyException;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/3/12.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    public String index2() throws Exception {
        throw new Exception("mmmmmm");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}

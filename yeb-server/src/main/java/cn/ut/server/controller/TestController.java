package cn.ut.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PuTongjiao
 * @date 2022/7/9 23:18
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "123";
    }
}

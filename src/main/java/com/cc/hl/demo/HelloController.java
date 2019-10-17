package com.cc.hl.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("hello2")
public class HelloController {

       @RequestMapping("")

       public String hello() {
    	   System.out.println(66688888);

              return "helloworld2";

       }

}

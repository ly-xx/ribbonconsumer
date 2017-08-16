package com.example.demo.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-16
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        long beginTime = System.currentTimeMillis();
        String body = restTemplate.getForEntity("http://hello-service/index",
                String.class).getBody();
        long endTime = System.currentTimeMillis();
        System.out.println("Spend Time : " + (endTime - beginTime));
        return body;
    }

    public String helloFallback() {
        return "error";
    }
}

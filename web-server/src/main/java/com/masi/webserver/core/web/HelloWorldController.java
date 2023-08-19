package com.masi.webserver.core.web;

import com.masi.webserver.ApplicationV1Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController extends ApplicationV1Controller {

  @GetMapping(value = "/hello")
  public String hello(){
    return "Hello";
  }
}

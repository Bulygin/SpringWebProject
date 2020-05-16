package example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/main")
  public String sayHello() {
    return "hello_world";
  }
}

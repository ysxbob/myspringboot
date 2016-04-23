package org.alllstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
class Application  {
  @RequestMapping("/")
  String home() {
    return "hello";
  }
  public static void main(String[] args) {
	SpringApplication.run(Application.class,args);
}
}
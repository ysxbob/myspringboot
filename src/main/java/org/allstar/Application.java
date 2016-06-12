package org.allstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
class Application  {
  public static void main(String[] args) {
	SpringApplication.run(Application.class,args);
}
}
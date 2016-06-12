package org.allstar.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 */
@RestController
@EnableAutoConfiguration
class MyController {
	
	@Value("${local.server.port}")
	private int port;

	@RequestMapping("/1")
	String home() {
		return "hello1234567890111111:::"+port;
	}
}
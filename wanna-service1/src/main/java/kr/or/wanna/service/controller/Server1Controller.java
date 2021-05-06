package kr.or.wanna.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class Server1Controller {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello server1";
	}
}

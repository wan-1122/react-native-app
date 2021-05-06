package kr.or.wanna.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import kr.or.wanna.client.feign.Server1Feign;
import kr.or.wanna.client.feign.Server2Feign;

@RestController
@RequestMapping("/client")
public class ServerController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Server1Feign server1Feign;

	@Autowired
	private Server2Feign server2Feign;

	@RequestMapping("/hello1")
	public String server1_hello() {
		return server1Feign.hello();
	}

	@RequestMapping("/hello2")
	public String server2_hello() {
		return server2Feign.hello();
	}
}

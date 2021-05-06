package kr.or.wanna.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="HELLO-SERVER2")
public interface Server2Feign {

	@GetMapping("/server/hello")
	String hello();
}

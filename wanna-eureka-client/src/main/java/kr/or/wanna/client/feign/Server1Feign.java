package kr.or.wanna.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="HELLO-SERVER1")
public interface Server1Feign {

	@GetMapping("/server/hello")
	String hello();
}

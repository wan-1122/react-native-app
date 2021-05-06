package kr.or.wanna.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.wanna.zuul.filter.ErrorFilter;
import kr.or.wanna.zuul.filter.PostFilter;
import kr.or.wanna.zuul.filter.PreFilter;
import kr.or.wanna.zuul.filter.RouteFilter;

@Configuration
public class FilterConfig {
	@Bean public PreFilter preFilter() { return new PreFilter(); }
	@Bean public PostFilter postFilter() { return new PostFilter(); }
	@Bean public ErrorFilter errorFilter() { return new ErrorFilter(); }
	@Bean public RouteFilter routeFilter() { return new RouteFilter(); }
}

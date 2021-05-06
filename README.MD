# spring-cloud-netflix

Spring cloud netflix
 
## 기본 구성

wanna-eureka-server
wanna-service1
wanna-service2
wanna-eureka-client
wanna-zuul

## 동작 순서

wanna-eureka-server -> wanna-service1 -> wanna-service2 -> wanna-eureka-client -> wanna-zuul 끝~  

wanna-eureka-server: http://localhost:8070/

wanna-eureka-client: http://localhost:8072/

client -> service1: http://localhost:8072/client/hello1

client -> service2: http://localhost:8072/client/hello2

wanna-zuul: http://localhost:8073/client/hello2

## 주절주절

최신 버전으로 하지 않음

필요하면 바꿔서 쓰면 될 듯 

oauth 인증 등은 빠져있음


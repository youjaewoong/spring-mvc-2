# 예외 처리와 오류 페이지

## hello.exception
- ExceptionApplication : main
- WebConfig : implements WebMvcConfigurer 
	- addInterceptors : 로그 인터셉터 등록
	- extendHandlerExceptionResolvers : ExceptionResolvers 등록
	- logFilter : 로그 필터 등록
		- setDispatcherTypes 설정으로 로그 필터를 범위 지정
- WebServerCustomizer
	- Error 코드에 따라 ErrorPageController로 보낸다.
	- WebServerFactoryCustomizer implements 한다.

## api
- ApiExceptionController
	 - getMember : excepiton 별 정의
	 - responseStatusEx1 : 
	 	- BadRequestException (ResponseStatusException) 로 처리
	 	- 상태코드 정의
	 - responseStatusEx2 : 
	 	- ResponseStatusException (ResponseStatusException) 로 처리
	 	- 상태코드, 메시지 정의 가능
	 - defaultException
	 	- DefaultHandlerExceptionResolver 스프링 exception 발생시킨다.
- ApiExceptionV2Controller
	- @ExceptionHandler 구성된 처리
- ApiExceptionV3Controller
	- @ExceptionHandler 구성된 처리
	-  AOP와 동일하게 에러일 경우 ExControllerAdvice 로 맵핑하여 처리한다.
	
## exception
- BadRequestException
	- @ResponseStatus 상태코드를 변경하여 exception 처리한다.
	- ResponseStatusExceptionResolver 스캔한다.
- UserException
	- RuntimeException 매개변수를 참조하는 객체를 추가하였다.

## exhandler
- ErrorResult : Response 처리할때 쓰이는 객체
- ExControllerAdvice
	- @RestControllerAdvice 선언하면 AOP와 동일한 비슷한동작을 하며, exception을 catch한다.
	- illegalExHandler : IllegalArgumentException 일 경우
	- userExHandler : UserException 일 경우
	- exHandler : 그외 exception 일 경우

## filter
- LogFilter : 로그 필터 정의

## interceptor
- LogInterceptor : 로그 인터셉터 정의

## resolver
- MyHandlerExceptionResolver
	- HandlerExceptionResolver 이용한 exception handler
- UserHandlerExceptionResolver
	- HandlerExceptionResolver 이용한 exception handler 개선

## servlet
- ErrorPageController
	 - errorPage404 : 404 페이지 이동
	 - errorPage500 : 500 페이지 이동
	 - printErrorInfo : Error 발생 시 Error 정보
	 - errorPage500Api : json 포맷으로 에러 노출
- ServletExController : http상태 코드에 대한 Error 처리


## 설정
- server.error.whitelabel.enabled=false : error page 기본 기능을 off 한다.
- server.error.include-exception=true
- server.error.include-message=always
- server.error.include-stacktrace=on_param
- server.error.include-binding-errors=on_param
	- never : 사용하지 않음
	- always :항상 사용
	- on_param : 파라미터가 있을 때 사용

## Error 템플릿
- springBoot에서 error 발생 시 아래 경로의 템플릿으로 자동 맵핑해준다.
- resources/templates/error/500.html
	- 404.html
	- 4xx.html
	- 500.html

	
## 테스트
- http://localhost:8080/error-404 -> 404.html
- http://localhost:8080/error-400 -> 4xx.html - (400 오류 페이지가 없지만 4xx가 있음)
- http://localhost:8080/error-500 -> 500.html
- http://localhost:8080/error-ex -> 500.html (예외는 500으로 처리)

# 예외 처리와 오류 페이지
## 설정
- server.error.whitelabel.enabled=false : error page 기본 기능을 off 한다.
- server.error.include-exception=true
- server.error.include-message=always
- server.error.include-stacktrace=on_param
- server.error.include-binding-errors=on_param
	- never : 사용하지 않음
	- always :항상 사용
	- on_param : 파라미터가 있을 때 사용
	
## Error
- ServletExController : http상태 코드에 대한 Error 처리
- ErrorPageController
	 - errorPage404 : 404 페이지 이동
	 - errorPage500 : 500 페이지 이동
	 - printErrorInfo : Error 발생 시 Error 정보
	 - errorPage500Api : json 포맷으로 에러 노출
- WebServerCustomizer : Error 코드에 따라 ErrorPageController로 보낸다.

## resolver
- MyHandlerExceptionResolver : HandlerExceptionResolver 이용한 exception handler

## WebConfig
- logFilter : 로그 필터 등록
	- setDispatcherTypes 설정으로 로그 필터를 범위 지정
- addInterceptors : 로그 인터셉터 등록
- extendHandlerExceptionResolvers : ExceptionResolvers 등록
	
## Filter
- LogFilter : 로그 필터 정의

## Interceptor
- LogInterceptor : 로그 필터 정의

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

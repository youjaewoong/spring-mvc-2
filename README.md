# spring-mvc-2

### exception
로깅 기능, 예외 처리, 오류류 페이지 기능이 정의된 프로젝트 입니다.
- [ApiExceptionController exception 테스트](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/api/ApiExceptionController.java)
- [LogInterceptor 공통 로그처리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/interceptor/LogInterceptor.java)
- [ExControllerAdvice 공통 exception 처리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/exhandler/ExControllerAdvice.java)
- [springBoot 가 해당경로의 error html은 자동으로 지원해준다.](https://github.com/youjaewoong/spring-mvc-2/tree/main/exception/src/main/resources/templates/error)
  - error
    - 4xx.html
    - 404.html
    - 500.html

### form (thymeleaf)
thymeleaf 의 form 태그의 여러 기능이  정의된 프로젝트 입니다.
- [thymeleaf 의 특수기능을 사용하여 form 기능의 다양한 처리](https://github.com/youjaewoong/spring-mvc-2/tree/main/form/src/main/resources/templates/form)

### login (로그인,상품관리)
세션기반의 회원가입, 로그인, 상품등록 수정 등이 포함된 프로젝트 입니다.
- [SessionManager 세션관리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/session/SessionManager.java)
- [SessionInfoController 세션정보 호출](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/session/SessionInfoController.java)
- [LoginCheckInterceptor API 실행시 마다 로그인 체크 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/interceptor/LogInterceptor.java)
- [LogFilter API 싫행시 마다 log 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/filter/LogFilter.java)
- [LoginMemberArgumentResolver @Loign 어노테이션이 실행되는 곳에서 컨트롤러 호출전에 실행되면서 세션체크하는 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/argumentresolver/LoginMemberArgumentResolver.java)

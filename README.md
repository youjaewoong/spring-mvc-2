# spring-mvc-2

### [exception](https://github.com/youjaewoong/spring-mvc-2/tree/main/exception)
로깅 기능, 예외 처리, 오류 페이지 기능이 정의된 프로젝트 입니다.
- [ApiExceptionController exception 테스트](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/api/ApiExceptionController.java)
- [LogInterceptor 공통 로그처리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/interceptor/LogInterceptor.java)
- [ExControllerAdvice 공통 exception 처리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/exception/src/main/java/hello/exception/exhandler/ExControllerAdvice.java)
- [springBoot 가 해당경로의 error html은 자동으로 지원해준다.](https://github.com/youjaewoong/spring-mvc-2/tree/main/exception/src/main/resources/templates/error)
  - error
    - 4xx.html
    - 404.html
    - 500.html

### [form (thymeleaf)](https://github.com/youjaewoong/spring-mvc-2/tree/main/form)
thymeleaf 의 form 태그의 여러 기능이  정의된 프로젝트 입니다.
- [thymeleaf 의 특수기능을 사용하여 form 기능의 다양한 처리](https://github.com/youjaewoong/spring-mvc-2/tree/main/form/src/main/resources/templates/form)

### [login (로그인,상품관리)](https://github.com/youjaewoong/spring-mvc-2/tree/main/login)
세션기반의 회원가입, 로그인, 상품등록 수정 등이 포함된 프로젝트 입니다.
- [SessionManager 세션관리 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/session/SessionManager.java)
- [SessionInfoController 세션정보 호출](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/session/SessionInfoController.java)
- [LoginCheckInterceptor API 실행시 마다 로그인 체크 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/interceptor/LogInterceptor.java)
- [LogFilter API 싫행시 마다 log 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/filter/LogFilter.java)
- [LoginMemberArgumentResolver @Loign 어노테이션이 실행되는 곳에서 컨트롤러 호출전에 실행되면서 세션체크하는 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/login/src/main/java/hello/login/web/argumentresolver/LoginMemberArgumentResolver.java)

### [messages](https://github.com/youjaewoong/spring-mvc-2/tree/main/message)
메시지 국제화 설정이 중정되어 있는 프로젝트 입니다.
- [message.properties 한글 메시지 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/message/src/main/resources/messages.properties)
- [messages_en.properties 영문 메시지 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/message/src/main/resources/messages_en.properties)
- [item.html 적용된 메시지값 출력](https://github.com/youjaewoong/spring-mvc-2/blob/main/message/src/main/resources/templates/message/item.html)
- [application.properties 메시지 설정](https://github.com/youjaewoong/spring-mvc-2/blob/main/message/src/main/resources/application.properties)

### [thymeleaf-basic](https://github.com/youjaewoong/spring-mvc-2/tree/main/thymeleaf-basic)
thymeleaf 기능들을 전반적으로 sample 형식으로 구현한 프로젝트입니다.
- [공통 레이아웃 표현 처리](https://github.com/youjaewoong/spring-mvc-2/tree/main/thymeleaf-basic/src/main/resources/templates/template)

### [typeconverter](https://github.com/youjaewoong/spring-mvc-2/tree/main/typeconverter)
convert 기능을 사용해서 여러가지 convert 처리를 구현한 프로젝트 입니다.
- [ConversionServiceTest converter를 등록하고 test하는 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/typeconverter/src/test/java/hello/typeconverter/converter/ConversionServiceTest.java)
- [WebConfig Conver 기능 등록](https://github.com/youjaewoong/spring-mvc-2/blob/main/typeconverter/src/main/java/hello/typeconverter/WebConfig.java)
- [converter package 여러기능의 converter 정의](https://github.com/youjaewoong/spring-mvc-2/tree/main/typeconverter/src/main/java/hello/typeconverter/converter)
- [FormatterController 객체의 포맷 처리 후 호출](https://github.com/youjaewoong/spring-mvc-2/blob/main/typeconverter/src/main/java/hello/typeconverter/controller/FormatterController.java)
- [ConverterController 객체의 convert 기능이 추가된 후 호출](https://github.com/youjaewoong/spring-mvc-2/blob/main/typeconverter/src/main/java/hello/typeconverter/controller/ConverterController.java)

### [upload](https://github.com/youjaewoong/spring-mvc-2/tree/main/upload)
파일업로드 기능 처리된 프로젝트 입니다.
- [FileStore 파일 저장 기능](https://github.com/youjaewoong/spring-mvc-2/blob/main/upload/src/main/java/hello/upload/file/FileStore.java)
- [ItemController 파일 저장 컨트롤러](https://github.com/youjaewoong/spring-mvc-2/blob/main/upload/src/main/java/hello/upload/controller/ItemController.java)

### [validation)]([https://github.com/youjaewoong/spring-mvc-2/tree/main/upload](https://github.com/youjaewoong/spring-mvc-2/tree/main/validation))
validation 검증에 대한 프로젝트입니다.
- [BeanValidationTest 객체에 선언된 validation 검증](https://github.com/youjaewoong/spring-mvc-2/blob/main/validation/src/test/java/hello/itemservice/validation/BeanValidationTest.java)
- [MessageCodesResolverTest 선언된 메시지값들이 유효한지 검증](https://github.com/youjaewoong/spring-mvc-2/blob/main/validation/src/test/java/hello/itemservice/validation/MessageCodesResolverTest.java)
- [editForm fields.globalErrors() 기능 처리](https://github.com/youjaewoong/spring-mvc-2/blob/main/validation/src/main/resources/templates/validation/v4/editForm.html)
- [ValidationItemControllerV4 메시지에 등록된 값 기준 error 로직 처리](https://github.com/youjaewoong/spring-mvc-2/blob/main/validation/src/main/java/hello/itemservice/web/validation/ValidationItemControllerV4.java)
- [MessageSourceTest message에 정의되어 있는 값 테스트](https://github.com/youjaewoong/spring-mvc-2/blob/main/validation/src/test/java/hello/itemservice/message/MessageSourceTest.java)


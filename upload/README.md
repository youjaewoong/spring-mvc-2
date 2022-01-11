# 파일 업로드

## hello.upload
-

## controller
- ServletUploadControllerV1
	- newFile : upload-form view 화면으로 반환한다.
	- saveFileV1 : Part로 넘어온 파일정보를 확인 할수 있다.
- ServletUploadControllerV2
	- newFile : upload-form view 화면으로 반환한다.
	- saveFileV1 : Part로 넘어온 파일정보를 저장한다.
- SpringUploadController
	- newFile : upload-form view 화면으로 반환한다.
	- saveFile : MultipartFile 로 파일 저장
- ItemForm : html에서 처리되는 다중 업로드를 위한 객체
- ItemController
	- newItem : item-form view 화면으로 반환한다.
	- saveItem : ItemForm 에서 전송된 데이터 및 파일을 저장한다.
	- items : 데이터를 찾는다.
	- downloadImage : 이미지를 다운로드 한다.
	- downloadAttach : 파일을 다운로드 한다.

## domain
- Item : file 관련 객체
- ItemRepository : Item 저장, id 찾기
- UploadFile : 파일이름 중복 제거를 위한 객체

## file
- FileStore
	- getFullPath : full path 정의
	- storeFile : file 저장
		- 서버에 저장하는 UUID 정의
		- 오리지날 파일, UUID 파일 명 return
	- storeFiles : 여러개의 file 저장

## templates
- upload-form : ServletUploadControllerV1 newFile 메소드를 반환한다.
- item-form : 상품명, 첨부파일, 이미지 파일들을 등록한다.
- item-view : 등록된 상품명, 첨부파일 다운로드, 이미지 파일들을 볼수 있다.

## application.properties
- logging.level.org.apache.coyote.http11=debug : request 로그를 확인할 수 있다.
- spring.servlet.multipart.enabled=false : false로 하게되면 multipart 기능을 off 한다.
- file.dir=D:/file/ : 파일 path

## 테스트
- 서블릿 파일 업로드1
	- localhost:8080/servlet/v1/upload
- 서블릿 파일 업로드2
	- localhost:8080/servlet/v2/upload
- 스프링 파일 업로드
	- localhost:8080/spring/upload
- 상품 - 파일, 이미지 업로드
	- localhost:8080/items/new
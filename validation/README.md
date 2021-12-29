# validation

- ValidationItemControllerV1 : map으로 error 처리

- ValidationItemControllerV2
 - addItemV1 : BindingResult FieldError error 기본 처리
 - addItemV2 : BindingResult FieldError error 값 나타나도록 처리
 - addItemV3 : errors.properties 값 적용
 - addItemV4 : rejectValue, reject 적용
 - addItemV5 : ItemValidator Validator 적용 및 repectoring
 - addItemV6 : @InitBinder @Validated 적용하여 validator check

- ValidationItemControllerV2
 - addItem : global 에러검증 처리
 
- ValidationItemControllerV3
	- addItemV2 : SaveCheck validation groups 적용
  - editV2 : UpdateCheck validation groups 적용
  
- ValidationItemControllerV4
	- addItem : ItemSaveForm 객체 적용
  - edit : ItemUpdateForm 객체 적용

- ValidationItemApiController : @RestController 처리
 
- MessageCodesResolverTest
  - messageCodesResolverObject : object message lv2 단계 까지 가져오기
  - messageCodesResolverField : field message lv4 단계 까지 가져오기
 
- BeanValidationTest : bean 객체 검증기 테스트 방법
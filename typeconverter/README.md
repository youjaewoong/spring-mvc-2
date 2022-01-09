# 스프링 타입 컨버터

## hello.typeconverter
- WebConfig
	- addFormatters
		- addConverter 통한 converter 등록
		- addConverter 통한 formatter 등록

## controller
- HelloController
	- helloV1 : reuqest Integer 타입변환
	- helloV2 : @Request Integer 타입변환
- ConverterController
	- converterView : 숫자와, IpPort객체를 converter-view에 반환한다.
	- converterForm : IpPort String 으로 converter-form에 반환한다.
	- converterEdit : converter-view에 반환한다.
		- @ModelAttribute 를 사용해서 String IpPort 로 변환된다.
		- @ModelAttribute 내부에서 Convert가 처리된다.
- FormatterController
	- formatterForm : @NumberFormat 선언된 객체를 formatter-form에 반환한다.
	- formatterEdit : @ModelAttribute에서 포맷팅하여 formatter-view에 반환한다.

## converter
- StringToIntegerConverter : String을 Integer로 변환한다.
- IntegerToStringConverter : Integer를 String으로 변환한다.
- StringToIpPortConverter : String을 IpPort객체로 변환한다.
- IpPortToStringConverter : IpPort객체를 String으로 변환한다.

## formatter
- MyNumberFormatter
	- parse : "1,000" -> 1000 formatting
	- print : object -> String formatting

## junit
- ConverterTest
	- stringToInteger : StringToIntegerConverter.class test
	- IntegerToString : IntegerToStringConverter.class test
	- stringToIpPort : IpPortToStringConverter.class test
	- ipPortToString : StringToIpPortConverter.class test
- ConversionServiceTest : converter 등록 및 사용 Test
- MyNumberFormatterTest
	- parse : String -> Long foramtting Test
	- print : 숫자타입 -> String foramtting Test
- FormattingConversionServiceTest
	- 컨버터, 포맷터 등록 Test
	- 컨버터, 포맷터 사용 Test

## templates
- converter-view : ConverterController converterView 메소드를 반환한다.
- converter-form

## 테스트
- localhost:8080/hello-v1?data=10
- localhost:8080/hello-v2?data=10
- localhost:8080/ip-port?ipPort=127.0.0.1:8080
- localhost:8080/converter-view
- localhost:8080/converter/edit
- localhost:8080/formatter/edit

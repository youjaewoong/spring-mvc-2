# login
- HomeController : 홈화면 추가
	- home : 홈화면 이동
	- homeLogin : 로그인 시 로그인 홈 화면 이동
	- homeLoginV2 : 로그인 시 커스텀 세션 체크 후 로그인 홈 화면 이동
	- homeLoginV3 : 로그인 시 세션 체크 후 로그인 홈 화면 이동
	- homeLoginV3Spring : 로그인 시 @SessionAttribute 적용하여 로그인 홈 화면 이동

# 회원가입
- Member
- MemberRepository : 회원가입 로직 처리
- MemberController
	- save : 회원가입 로직
- TestDataInit
	- 테스트 회원가입 셋팅

# 로그인
- LoginController
	- login : 로그인 및 쿠키 처리
	- loginV2 : 로그인 및 커스텀 세션 처리
	- loginV3 : 로그인 및 세션 처리
	- logout : 쿠키 소멸 및 로그아웃
	- logoutV2 : 커스텀 세션 소멸 및 로그아웃
- LoginService
	- login : 로그인 로직 처리
- LoginForm : html request 전송 form

# 세션정보
- SessionInfoController
	- sessionInfo : 세션정보를 호출한다.

# 공통
- SessionManager : 커스텀 세션 생성, 조회, 만료 처리
- SessionConst : 세션 상수

# 템플릿
- loginHome : 로그인 홈 화면
- loginForm : 로그인 화면
- addMemberForm : 회원가입 화면

# TEST
- SessionManagerTest : 커스텀 세션 TEST

# 설정
- server.servlet.session.tracking-modes=cookie : JsessionId가 url에 나타나지 않는다.
- server.servlet.session.timeout=60 : 세션유지 시간을 설정한다.
- logging.level.org.apache.coyote.http11=debug : 요청 로그를 전부 볼수 있다.
- spring.messages.basename=messages,errors : 메시지 프로퍼티를 설정한다.

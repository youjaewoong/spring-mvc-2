### 타임리프 - 스프링 통합과 폼

- 입력폼 처리
  - model.addAttribute("item", new Item());
  - text th:object="${item}"

- 체크박스 - 단일1
  -  th:field="${item.open}

- 체크박스 - 멀티
  - @ModelAttribute("regions")
  - th:each="region : ${regions}"
  - th:for="${#ids.prev('regions')}"

- 라디오 버튼
  - @ModelAttribute("itemTypes") ENUM 사용

- 셀렉트 박스
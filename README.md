# spring-batch-hands-on
- jojoldu님의 스프링 배치 가이드를 따라가면 실습해 보는 저장소
- https://jojoldu.tistory.com/

### 버전
- java 17
- springboot 3.0.4

## 버전 업으로 인한 변경 점

### `@EnableBatchProcessing` 제거
- 이제 필요하지 않음
  - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0.0-M5-Release-Notes#enablebatchprocessing-no-longer-required
- 배치가 실행되지 않아서 의아했는데 어노테이션을 제거하자 정상으로 동작

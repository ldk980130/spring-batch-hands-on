# spring-batch-hands-on
- jojoldu님의 스프링 배치 가이드를 따라가면 실습해 보는 저장소
- https://jojoldu.tistory.com/

### 버전
- java 17
- springboot 3.0.4

## 버전 업으로 인한 변경 점

### JobBuilder, StepBuilder 사용
- `jobBuilderFactory.get(...)` -> `new JobBuilder(...)`
- `stepBuilderFactory.get(...)` -> `new StepBuilder(...)`

### `@EnableBatchProcessing` 제거
- 이제 필요하지 않음
  - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0.0-M5-Release-Notes#enablebatchprocessing-no-longer-required
- 배치가 실행되지 않아서 의아했는데 어노테이션을 제거하자 정상으로 동작

### 여러 Job이 있는 경우
- `job name must be specified in case of multiple jobs` 예외가 발생하며 Job이 실행되지 않음
  - https://github.com/spring-projects/spring-boot/issues/25373
  - 여러 Job을 동시에 실행하는 건 이제 지원되지 않는듯 함
- 블로그에 있는 대로 `spring.batch.job.names`를 써보려 했지만 `names`는 사라지고 `name`만 남은 상태.
- `name`을 지정해도 예외가 사라지지 않음
- 예외를 해결할 수 없어 일단 이전에 학습한 `JobConfig` 클래스르 주석 처리하기로 함

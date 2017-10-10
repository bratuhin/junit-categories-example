# junit-com.github.bratuhin.categories-example
junit, com.github.bratuhin.categories

Команды для запуска тестов:

Все тесты: `mvn clean test` либо `mvn clean test -Dtest=AllTestSuite`

Только быстрые тесты: `mvn clean test -Dtest=FastTestSuite`

Только медленные тесты: `mvn clean test -Dtest=SlowTestSuite`

Все API тесты: `mvn clean test -Dtest=ApiTest`

Все UI тесты: `mvn clean test -Dtest=UITest`
package transactionslocksapp;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

@Testcontainers
class TCTest {

//    @Container
//    private static PostgreSQLContainer<?> POSTGRESQL_CONTAINER = new PostgreSQLContainer<>("postgres")
//        .withDatabaseName("database")
////            .withInitScript("postgres/init.sql")
//        .withUsername("postgres")
//        .withPassword("password");

    @Container
    private PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
        .withDatabaseName("foo")
        .withUsername("foo")
        .withPassword("secret");

    @Test
    void test() {
        assertThat(postgresqlContainer.isRunning()).isTrue();
//        assertThat(POSTGRESQL_CONTAINER.isRunning()).isTrue();
    }
}

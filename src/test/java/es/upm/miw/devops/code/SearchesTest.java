package es.upm.miw.devops.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchesTest {
    @Test
    void testFindUserIdBySomeProperFraction() {
        assertThat(new Searches().findUserIdBySomeProperFraction().toList())
                .containsExactly("1", "2", "3", "5");
    }
}
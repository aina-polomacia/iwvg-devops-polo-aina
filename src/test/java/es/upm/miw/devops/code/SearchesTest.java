package es.upm.miw.devops.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchesTest {
    @Test
    void testFindFractionSubtractionByUserName() {
        Fraction result = new Searches().findFractionSubtractionByUserName("Ana");
        assertThat(result.getNumerator()).isEqualTo(22);
        assertThat(result.getDenominator()).isEqualTo(60);
    }
}

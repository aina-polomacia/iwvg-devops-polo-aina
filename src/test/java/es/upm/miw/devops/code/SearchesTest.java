package es.upm.miw.devops.code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchesTest {
    @Test
    void testFindUserIdBySomeProperFraction() {
        assertThat(new Searches().findUserIdBySomeProperFraction().toList())
                .containsExactly("1", "2", "3", "5");
    }

    @Test
    void testFindFirstDecimalFractionByUserName() {
        assertThat(new Searches().findFirstDecimalFractionByUserName("Oscar"))
                .isEqualTo(0.0);
        assertThat(new Searches().findFirstDecimalFractionByUserName("Paula"))
                .isEqualTo(1.0);
    }

    @Test
    void testFindFractionSubtractionByUserName() {
        Fraction result = new Searches().findFractionSubtractionByUserName("Ana");
        assertThat(result.getNumerator()).isEqualTo(22);
        assertThat(result.getDenominator()).isEqualTo(60);
    }
}
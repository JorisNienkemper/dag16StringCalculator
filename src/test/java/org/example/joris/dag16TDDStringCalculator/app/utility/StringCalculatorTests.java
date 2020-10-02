package org.example.joris.dag16TDDStringCalculator.app.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTests {

    //De A van Arrange
    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
        // wanneer we sum aanroepen met een bepaalde string dan verwacht ik een bepaalde uitkomst
    void whenSumIsCalledWithANullValueThenTheNumberZeroShouldBeReturned() {

        int sum = stringCalculator.sum(null);

        assertThat(sum).isEqualTo(0);
    }

    @Test
    void whenSumIsCalledWithEmptyStringThenTheNumberZeroShouldBeReturned() {

        int sum = stringCalculator.sum("");

        assertThat(sum).isEqualTo(0);
    }

    @Test //Lastig om dit beter te omschrijven t.b.c.
    void whenSumIsCalledWithStringOneThenTheNumberOneShouldBeReturned() {

        int sum = stringCalculator.sum("1");

        assertThat(sum).isEqualTo(1);
    }


    @Test
    void whenSumIsCalledWithStringReprestingTwoNumbersSeparatedByACommaOneThenTheNumberOneShouldBeReturned() {

        int sum = stringCalculator.sum("1,2");

        assertThat(sum).isEqualTo(1);
    }

    @Test
    void exploratieveTest() {
        String s1 = "5,4";

        int length = s1.length();
        assertThat(length).isEqualTo(2);

        boolean bevatStringMeerdereGetallen = s1.contains(",");
    }

    @AfterEach
    void cleanUp() {
        stringCalculator = null;
    }
}

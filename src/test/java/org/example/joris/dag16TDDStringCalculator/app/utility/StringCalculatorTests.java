package org.example.joris.dag16TDDStringCalculator.app.utility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTests {

    @Test
    // wanneer we sum aanroepen met een bepaalde string dan verwacht ik een bepaalde uitkomst
    void whenSumIsCalledWithANullValueThenTheNumberZeroShouldBeReturned() {
        //De 3 A's
        //De A van Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //De A is van Act
        int sum = stringCalculator.sum(null);
        //De 3de A is A van Assert
        assertThat(sum).isEqualTo(0);
    }

    @Test
    void whenSumIsCalledWithEmptyStringThenTheNumberZeroShouldBeReturned() {
        //De 3 A's
        //De A van Arrange
        StringCalculator stringCalculator = new StringCalculator();
        //De A is van Act
        int sum = stringCalculator.sum("");
        //De 3de A is A van Assert
        assertThat(sum).isEqualTo(0);
    }
}

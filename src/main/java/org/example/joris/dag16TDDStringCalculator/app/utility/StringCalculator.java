package org.example.joris.dag16TDDStringCalculator.app.utility;

public class StringCalculator {

    public int sum(String input) {
        if(input == null || input.isEmpty()){
            return 0;
        }

        boolean bevatStringMeerdereGetallen = input.contains(",");
        if(!bevatStringMeerdereGetallen) {
            return Integer.parseInt(input);
        }
        throw new NotYetImplementedException("You hit new functionality, time to build new production code");
    }
}

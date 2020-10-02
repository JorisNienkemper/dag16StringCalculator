package org.example.joris.dag16TDDStringCalculator.app.utility;

public class StringCalculator {

    public int sum(String input) {
        if(input == null){
            return 0;
        }
        throw new NotYetImplementedException("You hit new functionality, time to build new production code");
    }
}

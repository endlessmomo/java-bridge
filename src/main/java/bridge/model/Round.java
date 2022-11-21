package bridge.model;

import java.util.List;

public enum Round {
    CLEAR("O"),
    FAIL("X"),
    BLANK(" ")
    ;
    private final String round;

    Round(String round){
        this.round = round;
    }

    public static List <String> makeRoundPrinter(String moveControl, Boolean isSuccess){
        String footPrint = chooseRoundPrint(isSuccess);
        return chooseStep(footPrint, moveControl);
    }

    private static String chooseRoundPrint(Boolean isSuccess){
        if(isSuccess){
            return CLEAR.round;
        }
        return FAIL.round;
    }

    private static List<String> chooseStep(String round, String moveControl){
        if(moveControl.equals("U")){
            return List.of(round, BLANK.round);
        }

        return List.of(BLANK.round, round);
    }
}

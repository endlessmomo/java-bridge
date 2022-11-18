package bridge.model;

import bridge.constance.CustomErrorMessage;

import java.util.Arrays;
import java.util.List;

public enum Command {
    RETRY("R"),
    CLOSE("Q");

    private final String choose;

    Command(String choose) {
        this.choose = choose;
    }

    public static boolean isReplay(String choose) {
        validate(choose);

        return choose.equals(RETRY.choose);
    }

    private static void validate(String choose) {
        checkUppercase(choose);
        checkCorrectInput(choose);
    }

    private static void checkUppercase(String choose) {
        if (!choose.equals(choose.toUpperCase())) {
            throw new IllegalArgumentException(CustomErrorMessage.IS_NOT_UPPERCASE.getMessage());
        }
    }

    private static void checkCorrectInput(String choose) {
        if (!(choose.equals(RETRY.choose)
                || choose.equals(CLOSE.choose))) {
            throw new IllegalArgumentException();
        }
    }

    public String getChoose() {
        return this.choose;
    }
}

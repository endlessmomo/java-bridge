package bridge.model;

/* 움직임을 담당하는 기능 */

public enum MoveControl {
    MOVE_UP("U", 1),
    MOVE_DOWN("D", 0);

    private final String inputMoveKey;
    private final int inputMove;

    MoveControl(String inputMoveKey, int inputMove) {
        this.inputMoveKey = inputMoveKey;
        this.inputMove = inputMove;
    }

    public static String of(int fromNumberGenerator) {
        if (fromNumberGenerator == MOVE_DOWN.inputMove) {
            return MOVE_DOWN.inputMoveKey;
        }

        return MOVE_UP.inputMoveKey;
    }

    public static String of(String input) {
        validate(input);
        return input;
    }

    private static void validate(String input) {
        checkUpperCase(input);
        checkCorrectInput(input);
    }

    private static void checkUpperCase(String input) {
        if (!input.equals(input.toUpperCase())) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkCorrectInput(String input) {
        if(!(input.equals(MOVE_UP.inputMoveKey)
                || input.equals(MOVE_DOWN.inputMoveKey))){
            throw new IllegalArgumentException();
        }
    }
}


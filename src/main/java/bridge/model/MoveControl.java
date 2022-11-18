package bridge.model;

/* 움직임을 담당하는 기능 */

import bridge.constance.CustomErrorMessage;

import java.util.Arrays;
import java.util.List;

public enum MoveControl {
    MOVE_UP("U", 1),
    MOVE_DOWN("D", 0);

    private final String inputMoveKey;
    private final int inputMove;

    MoveControl(String inputMoveKey, int inputMove) {
        this.inputMoveKey = inputMoveKey;
        this.inputMove = inputMove;
    }


}


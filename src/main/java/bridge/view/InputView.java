package bridge.view;

import bridge.constance.Text;
import bridge.model.BridgeSize;
import bridge.model.Command;
import bridge.model.MoveControl;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(Text.INPUT_BRIDGE_LENGTH);
        try {
            return Integer.parseInt(readLine());
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println(Text.MOVE_TO_WHERE);
        return readLine();
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println(Text.RETRY_OR_CLOSE);
        return readLine();
    }
}

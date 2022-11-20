package bridge.controller;

import bridge.model.BridgeSize;
import bridge.model.Command;
import bridge.model.MoveControl;
import bridge.view.InputView;

public class InputController {
    private static final InputView inputView = new InputView();

    public static int getBridgeSize(){
        try{
            return new BridgeSize(inputView.readBridgeSize()).getBridgeSize();
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public static String getMoveControl(){
        try {
            return MoveControl.of(inputView.readMoving());
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public static String getCommand() {
        try {
            return Command.isReplay(inputView.readGameCommand()).getChoose();
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }


}

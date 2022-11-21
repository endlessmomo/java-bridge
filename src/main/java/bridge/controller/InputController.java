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
            throw new IllegalArgumentException("");
        }
    }

    public static String getMoveControl(){
        try {
            return MoveControl.of(inputView.readMoving());
        } catch (Exception e){
            throw new IllegalArgumentException("");
        }
    }

    public static Command getCommand() {
        try {
            return Command.of(inputView.readGameCommand());
        } catch (Exception e){
            throw new IllegalArgumentException("");
        }
    }


}

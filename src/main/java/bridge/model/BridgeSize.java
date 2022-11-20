package bridge.model;

public class BridgeSize {
    private final int bridgeSize;

    public BridgeSize(int bridgeSize){
        checkRange(bridgeSize);
        this.bridgeSize = bridgeSize;
    }

    private void checkRange(int inputSize){
        if(inputSize < 3 || inputSize > 20){
            throw new IllegalArgumentException();
        }
    }

    public int getBridgeSize(){
        return bridgeSize;
    }
}

package bridge.model;

public class BridgeSize {
    private final int bridgeSize;

    public BridgeSize(String bridgeSize){
        int value = convertToInt(bridgeSize);
        checkRange(value);
        this.bridgeSize = value;
    }

    private int convertToInt(String inputSize){
        try{
            return Integer.parseInt(inputSize);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }

    private void checkRange(int inputSize){
        if(inputSize < 3 || inputSize > 20){
            throw new IllegalArgumentException();
        }
    }

    public int getBridgeSize(){
        return this.bridgeSize;
    }
}

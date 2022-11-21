package bridge.model;

import java.util.List;

public class Map {
    public final StringBuilder upBridge;
    public final StringBuilder downBridge;

    public Map() {
        this.upBridge = new StringBuilder();
        this.downBridge = new StringBuilder();
    }

    public void draw(List <String> round) {
        downBridge.append(round.get(0));
        upBridge.append(round.get(1));
    }

    public String getDownBridge() {
        String value = downBridge.toString();
        return value.substring(0, value.length() - 1);
    }

    public String getUpBridge() {
        String value = upBridge.toString();
        return value.substring(0, value.length() - 1);
    }

}

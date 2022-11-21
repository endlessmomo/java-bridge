package bridge.model;

public class Result {
    private String result;
    private int attempt;

    public Result(){
        this.result = "성공";
        this.attempt = 0;
    }

    public void increaseAttempt(){
        this.attempt += 1;
    }

    public void changeResult(){
        this.result = "실패";
    }

    public String getResult() {
        return result;
    }

    public int getAttempt() {
        return attempt;
    }

}

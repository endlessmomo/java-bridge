package bridge.constance;

public enum CustomErrorMessage {
    IS_NOT_UPPERCASE("대문자만 입력 가능합니다."),
    INCORRECT_INPUT_DATA("U와 D만 입력이 가능합니다."),
    ;

    private final String message;

    CustomErrorMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return ERROR + message;
    }

    public static final String ERROR = "[ERROR] : ";
}

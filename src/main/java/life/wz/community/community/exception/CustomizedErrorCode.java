package life.wz.community.community.exception;

public enum CustomizedErrorCode implements ICustomizedErrorCode {

    QUESTION_NOT_FOUND("你找的问题不存在，更换重试？");
    @Override
    public String getMessage() {
        return message;
    }
    private String message;

    CustomizedErrorCode(String message) {
        this.message = message;
    }


}

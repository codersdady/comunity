package life.wz.community.community.exception;

public class CustomizeException extends RuntimeException {
    private String message;

    public CustomizeException(String message) {
        this.message=message;

    }
    public CustomizeException(ICustomizedErrorCode errorCode) {
        this.message=errorCode.getMessage();

    }

    @Override
    public String getMessage() {
        return message;
    }
}

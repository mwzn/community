package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001, "question not found"),
    TARGET_PARAM_NOT_FOUND(2002, "target param not found"),
    NOT_LOGIN(2003,"not login"),
    SYS_ERROR(2004,"system error"),
    TYPE_PARAM_NOT_FOUND(2005, "type param not found"),
    COMMENT_NOT_FOUND(2006, "comment not found");
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

package com.lj.adminserver.exception;

/**
 * 非运行期异常基类，所有自定义非运行时异常继承该类
 */
public class BaseUncheckedException extends RuntimeException implements BaseException {
    private static final long serialVersionUID = -778887391066124051L;

    protected String message;
    protected int code;

    public BaseUncheckedException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getCode() {
        return code;
    }
}

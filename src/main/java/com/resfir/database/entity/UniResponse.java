package com.resfir.database.entity;

import java.io.Serializable;

import static com.resfir.database.entity.DefaultStatus.SUCCESS;

public final class UniResponse<T> implements Serializable {

    private static final long serialVersionUID = 3886133510113334083L;

    private StatusCode code;
    private String message;
    private T data;

    //无参构造方法中将响应码置为DefaultStatus中的SUCCESS
    public UniResponse() {
        this.setCode(SUCCESS);
        this.message = SUCCESS.message();
    }

    public UniResponse(T data) {
        this();
        this.data = data;
    }

    public StatusCode getCode() {
        return code;
    }

    public UniResponse<T> setCode(StatusCode code) {
        this.code = code;
        this.message = code.message();
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UniResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public UniResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static <T> UniResponse<T> with(StatusCode code) {
        UniResponse<T> response = new UniResponse<>();
        response.code = code;
        response.message = code.message();
        return response;
    }

    public static <T> UniResponse<T> with(StatusCode code, String message) {
        UniResponse<T> response = new UniResponse<>();
        response.code = code;
        response.message = message;
        return response;
    }

    public static <T> UniResponse<T> with(StatusCode code, T data) {
        UniResponse<T> response = new UniResponse<>();
        response.code = code;
        response.message = code.message();
        response.data = data;
        return response;
    }

    public static <T> UniResponse<T> with(StatusCode code, String message, T data) {
        UniResponse<T> response = new UniResponse<>();
        response.code = code;
        response.message = message;
        response.data = data;
        return response;
    }

    @Override
    public String toString() {
        return "UniResponse{" +
                "code=" + code.code() +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

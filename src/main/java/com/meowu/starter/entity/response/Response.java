package com.meowu.starter.entity.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T>{

    private Integer code;
    private String message;
    private T data;

    public Response(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> of(Integer code){
        return new Response<T>(code, null, null);
    }

    public static <T> Response<T> of(Integer code, String message){
        return new Response<T>(code, message, null);
    }

    public static <T> Response<T> of(Integer code, T data){
        return new Response<T>(code, null, data);
    }

    public static <T> Response<T> of(Integer code, String message, T data){
        return new Response<T>(code, message, data);
    }

    public static <T> Response<T> success(T data){
        return new Response<T>(ResponseCode.SUCCESS, null, data);
    }

    public static <T> Response<T> success(String message, T data){
        return new Response<T>(ResponseCode.SUCCESS, message, data);
    }

    public static <T> Response<T> fail(String message){
        return new Response<T>(ResponseCode.FAIL, message, null);
    }
}

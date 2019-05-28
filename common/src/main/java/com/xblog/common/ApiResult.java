package com.xblog.common;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class ApiResult<T> implements java.io.Serializable {

    @JsonIgnore
    private ApiCode apiCode;

    private String code;

    private String msg;

    private T body;

    public ApiResult() {
    }

    public ApiResult(ApiCode code, String msg, T body) {
        this.apiCode = code;
        this.msg = msg;
        this.body = body;
    }

    public ApiResult(ApiCode code, String msg) {
        this.apiCode = code;
        this.msg = msg;
    }

    public String getCode(){
        if(code == null) {
            return apiCode.code();
        }
        return code;
    }

    public ApiCode getApiCode() {
        return apiCode;
    }

    public void setApiCode(ApiCode apiCode) {
        this.apiCode = apiCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setError(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}

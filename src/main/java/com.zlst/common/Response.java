package com.zlst.common;

/**
 * @Author Songcj
 */
public class Response {

    private String resultCode;
    private String msg;
    private String tip;

    public Response(String resultCode,String msg,String tip){
        this.resultCode = resultCode;
        this.msg = msg;
        this.tip = tip;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}

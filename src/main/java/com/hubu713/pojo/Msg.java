package com.hubu713.pojo;

import java.util.HashMap;
import java.util.Map;


public class Msg {
    private int code;

    private String msg;

    private Map<String,Object> extend=new HashMap<String,Object>();

    public static Msg success(){
        Msg resultMsg=new Msg();
        resultMsg.setCode(100);
        resultMsg.setMsg("处理成功");
        return resultMsg;
    }

    public static Msg fail()
    {
        Msg resultMsg=new Msg();
        resultMsg.setCode(200);
        return resultMsg;
    }

    public Msg addFailMessage(String failMsg)
    {
        this.setMsg(failMsg);
        return this;
    }

    public Msg add(String key,Object value)
    {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}

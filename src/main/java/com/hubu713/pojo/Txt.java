package com.hubu713.pojo;


public class Txt {
    //文章标识id
    private int id;

    //判断文章是否删除
    private boolean isDelete;

    public int gettTxtId() {
        return id;
    }

    public void settTxtId(int tTxtId) {
        this.id = tTxtId;
    }

    public boolean istTxtIsDelete() {
        return isDelete;
    }

    public void settTxtIsDelete(boolean tTxtIsDelete) {
        this.isDelete = tTxtIsDelete;
    }
}

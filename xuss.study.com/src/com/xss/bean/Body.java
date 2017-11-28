package com.xss.bean;

import java.util.List;

/**
 * Created by Holiday on 2017/11/28.
 */
public class Body {
    private String totalNum;
    private List<Data> dataList;

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}

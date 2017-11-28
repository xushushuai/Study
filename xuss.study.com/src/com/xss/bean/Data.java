package com.xss.bean;

import java.util.List;

/**
 * Created by Holiday on 2017/11/28.
 */
public class Data {
    private long cudtomerId;
    private String customerName;
    private String taxNo;
    private String areaCode;
    private long createDate;
    private List<TaxTypeData> taxTypeDataDtos;


    public long getCudtomerId() {
        return cudtomerId;
    }

    public void setCudtomerId(long cudtomerId) {
        this.cudtomerId = cudtomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public List<TaxTypeData> getTaxTypeDataDtos() {
        return taxTypeDataDtos;
    }

    public void setTaxTypeDataDtos(List<TaxTypeData> taxTypeDataDtos) {
        this.taxTypeDataDtos = taxTypeDataDtos;
    }
}

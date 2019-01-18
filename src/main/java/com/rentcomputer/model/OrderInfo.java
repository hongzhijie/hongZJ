package com.rentcomputer.model;

import java.math.BigDecimal;
import java.util.Date;

/*
 * @Author hzj
 * @ClassName OrderInfo
 * @Description 订单信息实体
 * @Date 15:42 2019/1/18
 * @Param 
 * @return 
 **/

public class OrderInfo {
    private Integer id;

    private Integer goodsId;

    private Integer goodsNum;

    private BigDecimal unitPrice;

    private BigDecimal countPrice;

    private BigDecimal discountsPrice;

    private BigDecimal actualPrice;

    private String discountsId;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(BigDecimal countPrice) {
        this.countPrice = countPrice;
    }

    public BigDecimal getDiscountsPrice() {
        return discountsPrice;
    }

    public void setDiscountsPrice(BigDecimal discountsPrice) {
        this.discountsPrice = discountsPrice;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getDiscountsId() {
        return discountsId;
    }

    public void setDiscountsId(String discountsId) {
        this.discountsId = discountsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
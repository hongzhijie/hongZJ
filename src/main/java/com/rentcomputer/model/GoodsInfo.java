package com.rentcomputer.model;

import java.math.BigDecimal;

/*
 * @Author hzj
 * @ClassName GoodsInfo
 * @Description 商品实体
 * @Date 15:42 2019/1/18
 * @Param 
 * @return 
 **/

public class GoodsInfo {
    private Integer id;

    private String goodsName;

    private Byte goodsUnit;

    private BigDecimal goodsPrice;

    private BigDecimal goodsVipPrice;

    private Byte isDiscount;

    private BigDecimal discountPrice;

    private String goodsImg;

    private Byte isExemptionFreight;

    private BigDecimal freightPrice;

    private Byte status;

    private String goodsDetails;

    private String leaseDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Byte getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(Byte goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsVipPrice() {
        return goodsVipPrice;
    }

    public void setGoodsVipPrice(BigDecimal goodsVipPrice) {
        this.goodsVipPrice = goodsVipPrice;
    }

    public Byte getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Byte isDiscount) {
        this.isDiscount = isDiscount;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Byte getIsExemptionFreight() {
        return isExemptionFreight;
    }

    public void setIsExemptionFreight(Byte isExemptionFreight) {
        this.isExemptionFreight = isExemptionFreight;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getLeaseDetails() {
        return leaseDetails;
    }

    public void setLeaseDetails(String leaseDetails) {
        this.leaseDetails = leaseDetails;
    }
}
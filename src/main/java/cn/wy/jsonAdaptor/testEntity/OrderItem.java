package cn.wy.jsonAdaptor.testEntity;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:28
 **/
public class OrderItem extends BaseEntity {


    private Long orderId;

    private String orderItemName;

    private String unit;

    private Double price;

    private Integer quantity;

    private List<Company> salerCompanyList;

    private List<Company> buyerCompanyList;

    public List<Company> getSalerCompanyList() {
        return salerCompanyList;
    }

    public void setSalerCompanyList(List<Company> salerCompanyList) {
        this.salerCompanyList = salerCompanyList;
    }

    public List<Company> getBuyerCompanyList() {
        return buyerCompanyList;
    }

    public void setBuyerCompanyList(List<Company> buyerCompanyList) {
        this.buyerCompanyList = buyerCompanyList;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

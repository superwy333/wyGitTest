package cn.wy.jsonAdaptor.testEntity;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:20
 **/
public class Order extends BaseEntity {


    private String name;

    private Date orderDate;

    private List<OrderItem> orderItemList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}

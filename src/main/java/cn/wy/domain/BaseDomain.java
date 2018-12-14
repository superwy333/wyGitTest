package cn.wy.domain;

import java.io.Serializable;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:11
 **/
public class BaseDomain implements Serializable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package cn.wy.domain;

import cn.wy.jsonAdaptor.testEntity.BaseEntity;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-17 11:15
 **/
public class Node extends BaseEntity{

    private String nodeName;

    private int step;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}

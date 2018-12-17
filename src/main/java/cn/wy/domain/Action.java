package cn.wy.domain;

import cn.wy.jsonAdaptor.testEntity.BaseEntity;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-17 11:15
 **/
public class Action extends BaseEntity {

    private int nodeId;

    private String actionName;

    private int step;

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}

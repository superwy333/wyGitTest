package cn.wy.domain;

import javax.persistence.Column;

public class Action extends BaseDomain {
    @Column(name = "node_id")
    private Long nodeId;

    @Column(name = "action_name")
    private String actionName;

    private Integer step;

    /**
     * @return node_id
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * @param nodeId
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * @return action_name
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * @param actionName
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    /**
     * @param step
     */
    public void setStep(Integer step) {
        this.step = step;
    }
}
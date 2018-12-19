package cn.wy.domain;

import javax.persistence.Column;

public class Node extends BaseDomain {
    @Column(name = "node_name")
    private String nodeName;

    @Column(name = "workflow_id")
    private Long workflowId;

    private Integer step;

    /**
     * @return node_name
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * @param nodeName
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * @return workflow_id
     */
    public Long getWorkflowId() {
        return workflowId;
    }

    /**
     * @param workflowId
     */
    public void setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
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
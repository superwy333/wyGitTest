package cn.wy.domain;

import javax.persistence.Column;

public class WorkFlow extends BaseDomain {
    @Column(name = "workflow_name")
    private String workflowName;

    /**
     * @return workflow_name
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * @param workflowName
     */
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName == null ? null : workflowName.trim();
    }
}
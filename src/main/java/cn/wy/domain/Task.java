package cn.wy.domain;

import javax.persistence.Column;

public class Task extends BaseDomain {
    @Column(name = "workflow_id")
    private Long workflowId;

    @Column(name = "task_name")
    private String taskName;

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
     * @return task_name
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }
}
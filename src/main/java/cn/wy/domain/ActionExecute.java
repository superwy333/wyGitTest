package cn.wy.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "action_execute")
public class ActionExecute extends BaseDomain {
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "action_id")
    private Long actionId;

    @Column(name = "is_proceed")
    private Integer isProceed;

    /**
     * @return task_id
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * @return action_id
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * @param actionId
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * @return is_proceed
     */
    public Integer getIsProceed() {
        return isProceed;
    }

    /**
     * @param isProceed
     */
    public void setIsProceed(Integer isProceed) {
        this.isProceed = isProceed;
    }
}
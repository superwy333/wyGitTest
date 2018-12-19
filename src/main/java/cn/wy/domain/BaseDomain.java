package cn.wy.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:11
 **/
public class BaseDomain implements Serializable {

    private Long id;

    private Date createDate;

    private String creator;

    private Integer deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}

package cn.wy.jsonAdaptor.testEntity;

import java.util.Date;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:24
 **/
public class BaseEntity {

    private Long id;

    private Date createDate;

    private String creator;

    private int deleted;

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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}

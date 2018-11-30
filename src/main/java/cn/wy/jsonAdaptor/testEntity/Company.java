package cn.wy.jsonAdaptor.testEntity;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:23
 **/
public class Company extends BaseEntity {

    private String companyName;

    private String companyCode;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}

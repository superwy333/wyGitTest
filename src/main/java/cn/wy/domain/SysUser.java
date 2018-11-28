package cn.wy.domain;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:13
 **/
public class SysUser extends BaseDomain {

    private int age;

    private String name;

    private int deptId;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}

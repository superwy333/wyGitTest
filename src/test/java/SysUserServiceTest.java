import cn.wy.domain.SysUser;
import cn.wy.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 13:21
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class SysUserServiceTest {

    @Autowired
    private SysUserService sysUserService;


    @Test
    public void test() {
        List<SysUser> sysUserList = sysUserService.queryAll();
        System.out.println(sysUserList.size());
        System.out.println(sysUserList.get(0).getName());

    }


}

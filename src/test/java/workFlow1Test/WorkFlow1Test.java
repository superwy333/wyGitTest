package workFlow1Test;

import cn.wy.domain.Action;
import cn.wy.domain.Node;
import cn.wy.service.WorkFlow1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-17 13:28
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class WorkFlow1Test {

    private final static Logger LOGGER = LoggerFactory.getLogger(WorkFlow1Test.class);

    @Autowired
    private WorkFlow1Service workFlow1Service;


    @Test
    public void test() {
        try {
            List<Node> allNode = workFlow1Service.queryAllNode();
            List<Action> allAction = workFlow1Service.queryAllAction();
            System.out.println(allNode.size());
            System.out.println(allAction.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

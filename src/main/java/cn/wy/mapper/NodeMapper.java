package cn.wy.mapper;


import cn.wy.domain.Node;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:16
 **/
@Repository
public interface NodeMapper {

    List<Node> queryAll();

}

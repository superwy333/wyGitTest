package cn.wy.service;


import cn.wy.domain.Action;
import cn.wy.domain.Node;
import cn.wy.mapper.ActionMapper;
import cn.wy.mapper.NodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-17 13:29
 **/
@Service
public class WorkFlow1Service {

    @Autowired
    private ActionMapper actionMapper;
    @Autowired
    private NodeMapper nodeMapper;


    public List<Node> queryAllNode() {
        return nodeMapper.queryAll();
    }

    public List<Action> queryAllAction() {
        return actionMapper.queryAll();
    }




}

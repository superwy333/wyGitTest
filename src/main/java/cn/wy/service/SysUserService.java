package cn.wy.service;

import cn.wy.domain.SysUser;
import cn.wy.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:15
 **/
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    public List<SysUser> queryAll() {
        List<SysUser> sysUserList = new ArrayList<SysUser>();
        try {
             sysUserList =  sysUserMapper.queryAll();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return sysUserList;
    }



}

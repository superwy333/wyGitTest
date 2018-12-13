package cn.wy.service;

import cn.wy.domain.SysUser;
import cn.wy.mapper.SysUserMapper;
import cn.wy.redis.RedisDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

    private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private RedisDao redisDao;


    public List<SysUser> queryAll() {
        List<SysUser> sysUserList = new ArrayList<SysUser>();
        try {
             sysUserList =  sysUserMapper.queryAll();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return sysUserList;
    }

    public SysUser getUserById(int id) {
        String userJson = redisDao.get("sysUser_" + id);
        SysUser sysUser = null;
        if (userJson==null) {
            sysUser = sysUserMapper.queryAll().get(0);
            redisDao.set("sysUser_" + id,GSON.toJson(sysUser));
        }else {
            sysUser = GSON.fromJson(userJson,SysUser.class);
        }
        return sysUser;

    }



}

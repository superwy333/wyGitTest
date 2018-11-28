package cn.wy.mapper;

import cn.wy.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-07 11:16
 **/
@Repository
public interface SysUserMapper {

    List<SysUser> queryAll();



}

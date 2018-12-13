package cn.wy.redis.impl;

import cn.wy.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisPool;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-12 11:07
 **/
@Repository(value = "redisDao")
public class RedisDaoImpl implements RedisDao {

    @Autowired
    private JedisPool jedisPool;

    public String get(String key) {
        return null;
    }

    public String set(String key, String value) {
        return jedisPool.getResource().set(key,value);
    }

    public String hget(String hkey, String key) {
        return jedisPool.getResource().hget(hkey, key);
    }

    public long hset(String hkey, String key, String value) {
        return jedisPool.getResource().hset(hkey, key,value);
    }



}

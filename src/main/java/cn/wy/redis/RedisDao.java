package cn.wy.redis;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-12 11:07
 **/
public interface RedisDao {


    String get(String key);

    String set(String key, String value);

    String hget(String hkey, String key);

    long hset(String hkey, String key, String value);


}

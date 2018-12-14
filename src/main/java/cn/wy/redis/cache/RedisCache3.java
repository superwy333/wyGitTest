package cn.wy.redis.cache;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.ibatis.cache.Cache;
import redis.clients.jedis.Jedis;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-14 14:07
 **/
public class RedisCache3 implements Cache {

    // Gson
    private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();

    // 初始化Jedis
    private Jedis jedis = new Jedis("192.168.11.232", 6379);

    // nameSpace唯一标识
    private String cacheId;

    public RedisCache3(String cacheId) {
        this.cacheId = cacheId;
    }

    @Override
    public String getId() {
        return cacheId;
    }

    @Override
    public void putObject(Object o, Object o1) {
        try {
            jedis.set(GSON.toJson(o),GSON.toJson(o1));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getObject(Object o) {
        try {
            return jedis.get(GSON.toJson(o));
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}

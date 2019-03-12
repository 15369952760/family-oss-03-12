package com.family.oss.repository;

/**
 * @Author: yuandh
 * @Description:
 * @Date: Created in 15:31 2019/3/12
 * @Modified By:
 */
public interface JedisClient {

    String get(String key);
    String set(String key, String value);
    String hget(String hkey, String key);
    long hset(String hkey, String key, String value);
    long del(String key);
    long hdel(String hkey, String key);
    long expire(String key, int second);

}

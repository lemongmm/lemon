package com.fh.shop.api.util;

import redis.clients.jedis.Jedis;

public class RedisUtil {

    public static void del(String key) {
        Jedis respuert = null;
        try {
            respuert = JedisUtil.getRespuert();
            respuert.del(key);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (respuert != null) {
                respuert.close();
                respuert = null;
            }
        }
    }


    public static void expire(String key, int seconds) {
        Jedis respuert = null;
        try {
            respuert = JedisUtil.getRespuert();
            respuert.expire(key, seconds);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (respuert != null) {
                respuert.close();
                respuert = null;
            }
        }
    }


    public static void set(String key, String value) {
        Jedis respuert = null;
        try {
            respuert = JedisUtil.getRespuert();
            respuert.set(key, value);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (respuert != null) {
                respuert.close();
                respuert = null;
            }
        }
    }

    public static String get(String key) {
        Jedis respuert = null;
        String ment = null;
        try {
            respuert = JedisUtil.getRespuert();
            ment = respuert.get(key);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ment;
        } finally {
            if (respuert != null) {
                respuert.close();
                respuert = null;
            }
        }
        return ment;
    }

}
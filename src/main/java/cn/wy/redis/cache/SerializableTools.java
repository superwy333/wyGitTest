package cn.wy.redis.cache;

import java.io.*;

public class SerializableTools {

    /**
     * 反序列化
     *
     * @param bt
     * @return
     * @throws IOException
     * @throws Exception
     */

    public static Object byteArrayToObj(byte[] bt) throws Exception {

        ByteArrayInputStream bais = new ByteArrayInputStream(bt);

        ObjectInputStream ois = new ObjectInputStream(bais);

        return ois.readObject();

    }


    /**
     * 对象序列化
     *
     * @param obj
     * @return
     * @throws IOException
     */

    public static byte[] ObjToByteArray(Object obj) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(obj);

        return bos.toByteArray();

    }

}


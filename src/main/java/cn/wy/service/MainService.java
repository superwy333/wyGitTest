package cn.wy.service;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-12 17:32
 **/
public class MainService {


    public static void main(String[] args) throws Exception{

        CommonService commonService = getService("cn.wy.service.BService");


    }





    public static CommonService getService(String servicePath) throws Exception{
        Class c = Class.forName(servicePath);
        return (CommonService) c.newInstance();

    }


















}

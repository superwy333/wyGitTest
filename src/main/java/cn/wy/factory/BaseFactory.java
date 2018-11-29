package cn.wy.factory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-29 16:59
 **/
@Component
public class BaseFactory {


    public BaseFactory() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>BaseFactory init>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }


}

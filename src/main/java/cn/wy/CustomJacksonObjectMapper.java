package cn.wy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * 自定义的Jackson的ObjectMapper
 *
 * @Author：zhitong.cao
 * @Date：Created in 2018/01/26 11:16
 */
public class CustomJacksonObjectMapper extends ObjectMapper {

    public CustomJacksonObjectMapper() {
        // 使用默认属性
        super();

//        /** 将对象序列化为带根节点的Json数据
//         *  --> 被序列化对象必须配置@JsonRootName
//         */
//        this.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
//
//        /** 支持带根节点的Json数据反序列化
//         *  --> 1. 需要反序列化的对象必须配置@JsonRootName
//         *  --> 2. @JsonRootName的value属性必须与Json数据的根节点一致
//         */
//        this.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);

        // 为null字段时不显示
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 配置时区
        this.setTimeZone(TimeZone.getTimeZone("GMT+8"));

        // 日期类型的默认格式化方式, 如需自定义时间格式, 可通过在需要序列化对象中使用@JsonFormat覆盖该属性
        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    }
}

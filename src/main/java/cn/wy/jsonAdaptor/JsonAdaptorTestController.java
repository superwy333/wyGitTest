package cn.wy.jsonAdaptor;

import cn.wy.jsonAdaptor.testEntity.RestReqVO;
import cn.wy.jsonAdaptor.testEntity.RestRespVo;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:17
 **/
@Controller
public class JsonAdaptorTestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonAdaptorTestController.class);

    private static final Gson GSON = new Gson();



    @RequestMapping(value = "/testMap", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> testMap(@RequestBody Map<String,Object> map) {
        Map<String,Object> resp = new HashMap<String,Object>();
        try {
            LOGGER.info("testMap() received request-{}",map.toString());
            resp.put("code","000");
            resp.put("msg","");
            resp.put("success",true);
        }catch (Exception e) {
            LOGGER.error("testMap() execute EXCEPTION-{}",e);
            resp.put("code","001");
            resp.put("msg","testMap() execute failed");
            resp.put("success",false);
        }
        return resp;
    }

    @RequestMapping(value = "/testEntity", method = RequestMethod.POST)
    @ResponseBody
    public RestRespVo testEntity(@RequestBody RestReqVO restReqVO) {
        RestRespVo resp = new RestRespVo();
        try {
            LOGGER.info("testMap() received request-{}",GSON.toJson(restReqVO));
            resp.setCode("000");
            resp.setMsg("");
            resp.setSuccess(true);
        }catch (Exception e) {
            LOGGER.error("testMap() execute EXCEPTION-{}",e);
            resp.setCode("001");
            resp.setMsg("testEntity() execute failed");
            resp.setSuccess(false);
        }
        return resp;
    }



}

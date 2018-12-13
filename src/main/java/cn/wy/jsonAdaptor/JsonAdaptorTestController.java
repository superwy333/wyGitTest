package cn.wy.jsonAdaptor;

import cn.wy.jsonAdaptor.testEntity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 10:17
 **/
@Controller
public class JsonAdaptorTestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonAdaptorTestController.class);

    private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();



    @RequestMapping(value = "/testMap", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> testMap(@RequestBody Map<String,Object> map) {
        Map<String,Object> resp = new HashMap<String,Object>();
        try {
            LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>testMap() received request-{}",GSON.toJson(map));
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
    public String testEntity(@RequestBody RestReqVO restReqVO) {
        RestRespVo resp = new RestRespVo();
        try {
            LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>testEntity() received request-{}",GSON.toJson(restReqVO));
            Order order = (Order) createTestData();
            resp.setResult(order);
            resp.setCode("000");
            resp.setMsg("");
            resp.setSuccess(true);
        }catch (Exception e) {
            LOGGER.error("testMap() execute EXCEPTION-{}",e);
            resp.setCode("001");
            resp.setMsg("testEntity() execute failed");
            resp.setSuccess(false);
        }
        //resp = null;
        LOGGER.info(">>>>>>>>>>>>>>>>>>>>>GSON.toJson(resp)<<<<<<<<<<<<<<<<<<<:{}",GSON.toJson(resp));
        return GSON.toJson(resp);
    }

    private static Object createTestData() {
        Company companyA = new Company();
        Company companyB = new Company();
        companyA.setCompanyCode("AS001");
        companyB.setCompanyCode("AS002");
        companyA.setCompanyName("昆山XXXAAA公司");
        companyB.setCompanyName("昆山XXXBBB公司");

        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(1L);
        orderItem.setOrderItemName("AAA");
        orderItem.setPrice(19.28);
        orderItem.setQuantity(29);
        orderItem.setUnit("个");
        List<Company> buyCompanyList = new ArrayList<Company>();
        buyCompanyList.add(companyA);
        List<Company> saleComoanyList = new ArrayList<Company>();
        saleComoanyList.add(companyB);
        orderItem.setBuyerCompanyList(buyCompanyList);
        orderItem.setSalerCompanyList(saleComoanyList);
        Order order = new Order();
        order.setName("XXXBBAB订单");
        order.setOrderDate(new Date());
        List<OrderItem> orderItemList = new ArrayList<OrderItem>();
        orderItemList.add(orderItem);
        order.setOrderItemList(orderItemList);
        return order;

    }



}

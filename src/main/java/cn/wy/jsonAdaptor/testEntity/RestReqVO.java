package cn.wy.jsonAdaptor.testEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 16:12
 **/
public class RestReqVO {

    @JsonProperty(value = "a")
    private String req1;
    @JsonProperty(value = "b")
    private String req2;

    public String getReq1() {
        return req1;
    }

    public void setReq1(String req1) {
        this.req1 = req1;
    }

    public String getReq2() {
        return req2;
    }

    public void setReq2(String req2) {
        this.req2 = req2;
    }


}

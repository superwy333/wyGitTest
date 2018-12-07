package cn.wy.jsonAdaptor.testEntity;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-30 16:14
 **/
public class RestRespVo {


    private String code;

    private String msg;

    private boolean success;

    private Object result;

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

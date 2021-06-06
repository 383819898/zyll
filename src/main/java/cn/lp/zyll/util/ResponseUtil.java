package cn.lp.zyll.util;

import cn.lp.zyll.config.status.HttpStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: 李鹏
 * @Description: TODO 返回值工具类
 * @Date: 2021/6/7 01:41
 * @Version: v1.0
 */
@Getter
@Setter
public class ResponseUtil<T> {


    /**
     * 1.status状态值：代表本次请求response的状态结果。
     */
    @ApiModelProperty("状态码")
    private Integer status;
    /**
     * 2.response描述：对本次状态码的描述。
     */
    @ApiModelProperty("描述")
    private String msg;
    /**
     * 3.data数据：本次返回的数据。
     */
    @ApiModelProperty("数据")
    private T data;



    public static ResponseUtil success(){
        ResponseUtil response = new ResponseUtil();
        response.setHttpStatus(HttpStatus.SUCCESS);
        return response;

    }

    public static ResponseUtil success(Object data){
        ResponseUtil response = new ResponseUtil();
        response.setHttpStatus(HttpStatus.SUCCESS);
        response.setData(data);

        return response;

    }


    public static ResponseUtil fail(){
        ResponseUtil response = new ResponseUtil();
        response.setHttpStatus(HttpStatus.SERVE_ERROR);
        return response;
    }


    public static ResponseUtil fail(HttpStatus httpStatus){
        ResponseUtil response = new ResponseUtil();
        response.setHttpStatus(httpStatus);
        return response;
    }


    public static ResponseUtil fail(int status,String msg){
        ResponseUtil response = new ResponseUtil();
        response.setStatus(status);
        response.setMsg(msg);
        return response;
    }


    private void setHttpStatus(HttpStatus status) {
        this.status = status.status();
        this.msg = status.msg();
    }
}


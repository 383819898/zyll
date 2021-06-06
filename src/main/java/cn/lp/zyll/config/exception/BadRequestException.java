package cn.lp.zyll.config.exception;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @Auther: 李鹏
 * @Description: TODO 错误请求
 * @Date: 2021/6/6 23:42
 * @Version: v1.0
 */
public class BadRequestException extends RuntimeException{


    private Integer status = BAD_REQUEST.value();

    public BadRequestException(String msg){
        super(msg);
    }

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}

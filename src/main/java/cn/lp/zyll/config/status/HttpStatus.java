package cn.lp.zyll.config.status;

public enum HttpStatus {


    /* 成功状态码 */
    SUCCESS(200, "成功"),
    SERVE_ERROR(404, "资源，服务未找到"),



    AUTHORITY_ERROR(-1, "请求访问：{}，认证失败，无法访问系统资源");




    private int status;
    private String msg;


    HttpStatus(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int status() {
        return status;
    }


    public String msg() {
        return msg;
    }

}

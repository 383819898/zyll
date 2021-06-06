package cn.lp.zyll.app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Auther: 李鹏
 * @Description: TODO 用户信息
 * @Date: 2021/6/7 00:40
 * @Version: v1.0
 */

@Data
public class User {


    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String realName;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "性别：0 女，1 男")
    private Integer sex;

    @ApiModelProperty(value = "个人介绍")
    private String introduce;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "密码")
    private String passwd;

    @ApiModelProperty(value = "状态")
    private Integer status;


    @ApiModelProperty(value = "系统用户id")
    private String sysId;
}

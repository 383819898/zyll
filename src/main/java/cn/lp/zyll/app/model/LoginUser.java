package cn.lp.zyll.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 登录用户身份权限
 * 
 * @author quyang
 */
@ApiModel("LoginUser")
public class LoginUser implements UserDetails
{
    private static final long serialVersionUID = 1L;

    /**
     * 用户唯一标识
     */
    @ApiModelProperty(name = "token", value = "用户唯一标识")
    private String token;

    /**
     * 登录时间
     */
    @ApiModelProperty(name = "loginTime", value = "登录时间")
    private Long loginTime;

    /**
     * 过期时间
     */
    @ApiModelProperty(name = "expireTime", value = "过期时间")
    private Long expireTime;

    /**
     * 登录IP地址
     */
    @ApiModelProperty(name = "ipaddr", value = "登录IP地址")
    private String ipaddr;

    /**
     * 登录地点
     */
    @ApiModelProperty(name = "loginLocation", value = "登录地点")
    private String loginLocation;

    @ApiModelProperty(name = "firstLogin", value = "是否第一次登陆")
    private boolean firstLogin;

    /**
     * 用户信息
     */
    @ApiModelProperty(name = "Users", value = "用户信息")
    private User user;

    public String getToken() {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public LoginUser() {
    }

    public LoginUser(User user) {
        this.user = user;
    }

    @JsonIgnore
    @Override
    public String getPassword()
    {
        return user.getPasswd();
    }

    @Override
    public String getUsername()
    {
        return user.getSysId();
    }

    /**
     * 账户是否未过期,过期无法验证
     */
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    /**
     * 指定用户是否解锁,锁定的用户无法进行身份验证
     * 
     * @return
     */
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    /**
     * 指示是否已过期的用户的凭据(密码),过期的凭据防止认证
     * 
     * @return
     */
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    /**
     * 是否可用 ,禁用的用户不能身份验证
     * 
     * @return
     */
    @JsonIgnore
    @Override
    public boolean isEnabled()
    {
        return true;
    }

    public Long getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(Long loginTime)
    {
        this.loginTime = loginTime;
    }

    public String getIpaddr()
    {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr)
    {
        this.ipaddr = ipaddr;
    }

    public String getLoginLocation()
    {
        return loginLocation;
    }

    public void setLoginLocation(String loginLocation)
    {
        this.loginLocation = loginLocation;
    }

    public Long getExpireTime()
    {
        return expireTime;
    }

    public void setExpireTime(Long expireTime)
    {
        this.expireTime = expireTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
}

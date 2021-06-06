package cn.lp.zyll.security.token;

import cn.lp.zyll.config.status.HttpStatus;
import cn.lp.zyll.util.ResponseUtil;
import cn.lp.zyll.util.ServletUtils;
import com.google.gson.Gson;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * 认证失败处理类 返回未授权
 * 
 * @author quyang
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable
{
    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
            throws IOException
    {

        ServletUtils.renderString(response, new Gson().toJson(ResponseUtil.fail(HttpStatus.AUTHORITY_ERROR)));
    }

}

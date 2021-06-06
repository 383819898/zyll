package cn.lp.zyll.security;

import cn.lp.zyll.app.model.LoginUser;
import cn.lp.zyll.app.model.User;
import cn.lp.zyll.util.StringUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * 用户验证处理
 *
 * @author quyang
 */
@Service("userNameUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        User user = new User();
        if (StringUtils.isNull(user)) {
            throw new UsernameNotFoundException("报错");
        }
        return createLoginUser(user);
    }

    private UserDetails createLoginUser(User user) {

        return new LoginUser(user);
    }


}

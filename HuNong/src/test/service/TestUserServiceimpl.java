package test.service;

import com.geowind.hunong.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jiang on 2016/7/21.
 */
public class TestUserServiceimpl {
    @Test
    public void testLoginTrue(){
        UserServiceImpl usi = new UserServiceImpl();
        String result = usi.login("zhangsan","123456");
        Assert.assertEquals(true,result.equals("登录成功"));
    }

}

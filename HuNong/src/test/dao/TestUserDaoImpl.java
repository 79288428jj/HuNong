package test.dao;

import com.geowind.hunong.dao.impl.UserDaoImpl;
import junit.framework.Assert;
import org.junit.Test;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/23.
 */
public class TestUserDaoImpl {
    @Test
    public void testUserDaoImpl(){
        boolean real = false;
        UserDaoImpl udi = new UserDaoImpl();
        Map<String,Object> result = udi.selectAccounts("zhangsan","123456");
        if(result != null){
            real = true;
        }
        Assert.assertEquals(true,real);
    }
}

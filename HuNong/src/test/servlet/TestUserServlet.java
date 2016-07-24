package test.servlet;

import com.geowind.hunong.servlet.UserServlet;
import com.sun.net.httpserver.HttpServer;
import org.apache.cactus.WebRequest;
import org.junit.Test;
import org.apache.cactus.ServletTestCase;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/7/22.
 */
public class TestUserServlet extends ServletTestCase{

    public void BeginAddUser(WebRequest request){
        request.addParameter("Uname","zhangsan");
        request.addParameter("Upassword","123456");
    }

    public void testUserServlet() throws ServletException, IOException {
        UserServlet ser = new UserServlet();
        ser.doPost(request,response);

    }

}

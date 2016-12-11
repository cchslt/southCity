import com.stone.test.MyInvocationHandle;
import com.stone.test.UserService;
import com.stone.test.UserServiceImpl;

/**
 * Created by chenchen on 2016/6/27.
 */
public class testInvocation {

    @org.junit.Test
    public void test() throws Throwable{
        UserService userService = new UserServiceImpl();

        MyInvocationHandle myInvocationHandle = new MyInvocationHandle(userService);

        UserService proxy = (UserService)myInvocationHandle.getProxy();

        proxy.add();
    }
}

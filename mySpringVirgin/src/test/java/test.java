import com.stone.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenchen on 2016/4/23.
 */
@SuppressWarnings("deprecation")
public class test {

    @org.junit.Test
    public void test(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/Application-beans.xml"));
        Test test = (Test)beanFactory.getBean("test");
        System.out.println(test.getTestss());
    }
}

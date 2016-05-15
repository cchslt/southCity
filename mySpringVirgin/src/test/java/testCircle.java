import com.stone.Test;
import com.stone.circle.TestA;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenchen on 2016/4/23.
 */
@SuppressWarnings("deprecation")
public class testCircle {

    @org.junit.Test(expected = BeanCurrentlyInCreationException.class)
   public void test() throws Throwable {
       try{
           ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("spring/Application-circle.xml");
           System.out.println(context.getBean("testA"));
       }catch (Exception e){
           Throwable throwable = e.getCause().getCause().getCause();
           throw  throwable;
       }
   }
}

import main.com.stone.southcity.patterns.observer.HanFeiZi;
import main.com.stone.southcity.patterns.observer.IHanFeiZi;
import main.com.stone.southcity.patterns.observer.Lisi;
import main.com.stone.southcity.patterns.observer.Observer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenchen on 2016/3/20.
 */
public class test {
    @Test
    public void tt(){
        System.out.println("测试");
    }

    @Test
    public void testObserver(){
        List<Observer> list = new ArrayList<Observer>();
        for (int i = 0 ; i < 100000; i++){
            Lisi lisi = new Lisi();
            list.add(lisi);
        }

        HanFeiZi hanFeiZi = new HanFeiZi();
        for (Observer observer : list){
            hanFeiZi.addObserver(observer);
        }
        hanFeiZi.breakFeast();
        hanFeiZi.fun();
    }
}

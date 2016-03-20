package main.com.stone.southcity.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenchen on 2016/3/20.
 */
public class HanFeiZi implements IHanFeiZi, IObserverable {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        if (null != observer){
            observerList.add(observer);
        }
    }

    public void deleteObserver(Observer observer) {
        if (observer != null){
            observerList.remove(observer);
        }
    }

    public void notifyObserver(String context) {
        if (observerList == null || observerList.size() == 0){
            return;
        }
        for (Observer observer : observerList){   //只可用用于观察者比较少的情景下
            observer.update(context);
        }
    }

    public void breakFeast() {
        System.out.println("韩非子：老子要吃饭了...");
        notifyObserver("韩非子在吃饭！");
    }

    public void fun() {
        System.out.println("韩非子：老子去耍了");
        this.notifyObserver("韩非子去耍了");
    }
}

package main.com.stone.southcity.patterns.observer;

/**
 * Created by chenchen on 2016/3/20.
 *
 * 观察者模式，也称订阅发布者模式
 * 定义对象间一对多的依赖关系，被观察者对象改变状态时，则所有依赖它的对象都会得到通知并被自动更新
 */
public interface IObserverable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObserver(String context);
}

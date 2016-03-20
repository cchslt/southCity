package main.com.stone.southcity.patterns.observer;

/**
 * Created by chenchen on 2016/3/20.
 */
public class Lisi implements Observer {
    public void update(String context) {
        System.out.println("李斯：韩非子有活动，赶快报告...");
        this.reportToQin(context);
        System.out.println("李斯：一通知到");
    }

    private void reportToQin(String context) {
        System.out.println("李斯：报告，妃子有活动。。。。" + context);
    }
}

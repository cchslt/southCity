package main.com.stone.southcity.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by chenchen on 2016/3/21.
 *
 * http://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=403162786&idx=2&sn=f9dc02c57229333e8e99259f748818d3&scene=1&srcid=032000QjKPPDDy4fmHVXxmq7#wechat_redirect
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));

        for (int i = 0; i < 15; i++){
            MyTask task =new MyTask(i);
            executor.execute(task);
            System.out.println("线程池中线程数量为：" +
                        executor.getPoolSize() + ", 队列中等待的线程数：" +
                        executor.getQueue().size() + ", 已经执行的任务数量为:" + executor.getCompletedTaskCount());
        }
    }
}

class MyTask implements Runnable{
    private int tashNum;

    public MyTask(int num){
        this.tashNum = num;
    }

    public void run() {
        System.out.println("正在执行task :" + tashNum);
        try{
            Thread.currentThread().sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task:" +  tashNum + " 执行完成");
    }

}

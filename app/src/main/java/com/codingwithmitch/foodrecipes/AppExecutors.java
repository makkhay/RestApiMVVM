package com.codingwithmitch.foodrecipes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Executor is a thing that is used to execute runnable task, you can do it in background thread, main thread..
 *
 * Executor is a very cool way to have automatic load balancing and submit runnable task in background thread.
 *
 *
 */
public class AppExecutors {

    private static AppExecutors instance;

    public static AppExecutors getInstance(){
        if(instance == null){
            instance = new AppExecutors();
        }
        return instance;
    }

    // it can scheduled commands to run after a delay.
    private final ScheduledExecutorService mNetworkIO = Executors.newScheduledThreadPool(3);

    /**
     *   // you can have multiple threads
     *  private Executor mBackgroundExecutor = Executors.newFixedThreadPool(2);
     *
     *     public AppExecutors(){
     *         mBackgroundExecutor.execute(new Runnable() {
     *             @Override
     *             public void run() {
     *
     *             }
     *         });
     *
     *          mBackgroundExecutor.execute(new Runnable() {
     *      *             @Override
     *      *             public void run() {
     *      *
     *      *             }
     *      *         });
     *     }
     *
     */
    public ScheduledExecutorService networkIO(){
        return mNetworkIO;
    }
}

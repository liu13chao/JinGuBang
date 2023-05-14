package com.bagen.mykoom;

import android.app.Application;

import com.kwai.koom.base.DefaultInitTask;
import com.kwai.koom.javaoom.monitor.OOMMonitor;


public class KoomManager {

    public static void run(Application application) {
        DefaultInitTask.INSTANCE.init(application);
        /*
         * Init OOMMonitor
         */
        OOMMonitorInitTask.INSTANCE.init(application);
        OOMMonitor.INSTANCE.startLoop(true, false,5_000L);
    }
}

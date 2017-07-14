package com.taobao.demo;

import android.app.Application;






/**
 * @author 李阳
 * @创建时间 2017/4/21 - 上午11:43
 * @描述
 * @ 当前版本:
 */

public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
       // ShareSDK.initSDK(this,ShareSDKAPPID);

        //第一：默认初始化

        //Bmob.initialize(this, BmobAPPID);

        //CrashReport.initCrashReport(this,BuglyAPPID,true);

    }
}

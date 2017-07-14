package com.taobao.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by liyang on 2017/7/14.
 */

public class MainActivity extends Activity {

    Button btn_one,btn_two;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);

        btn_one= (Button) findViewById(R.id.btn_one);
        btn_two= (Button) findViewById(R.id.btn_two);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToActivity("one","com.zoom.firstbundle.firstBundleActivity");
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToActivity("two","com.zoom.secondbundle.secondBundleActivity");
            }
        });
    }


    public void switchToActivity(String key,String activityName){
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(),activityName);
        startActivity(intent);
    }
}

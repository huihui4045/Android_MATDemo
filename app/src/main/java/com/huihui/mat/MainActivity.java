package com.huihui.mat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeakThread mLeakThread=new LeakThread();

        mLeakThread.start();


    }

    private class LeakThread extends Thread {

        @Override
        public void run() {
            super.run();

            try {
                Thread.sleep(10000* 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

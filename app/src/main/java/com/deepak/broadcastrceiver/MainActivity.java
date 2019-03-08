package com.deepak.broadcastrceiver;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver br;
//    BroadcastReceiver receiver = new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            String action = intent.getAction();
//            if(action.equalsIgnoreCase(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
//                Log.i("Deepak","airplane mode");
//            }
//
//            if(action.equalsIgnoreCase(Intent.ACTION_HEADSET_PLUG)) {
//
//                Log.i("Deepak","plug unplug");
//            }
//
//
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BroadcastReceiver br = new MyBroadCastReceiver();
//        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
//        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//        filter.addAction(Intent.ACTION_HEADSET_PLUG);
//        this.registerReceiver(br, filter);
//
//        Intent i = getIntent();
//        String log = i.getStringExtra("broadcastLog");
//        TextView tv = findViewById(R.id.broadcastLog);
//        if(log!=null){
//            tv.setText(log);
//        }
    }

    @Override
    protected void onStart() {
        super.onStart();
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG);
//        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
//        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //unregisterReceiver(receiver);
        unregisterReceiver(br);
    }

    @Override
    protected void onResume() {
        super.onResume();
        br = new MyBroadCastReceiver();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        filter.addAction(Intent.ACTION_HEADSET_PLUG);
        this.registerReceiver(br, filter);
    }
}

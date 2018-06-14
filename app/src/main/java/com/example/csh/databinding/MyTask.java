package com.example.csh.databinding;

import android.content.Context;
import android.widget.Toast;

public class MyTask implements Runnable {
      
        private Context mContext;
      
        public MyTask(Context context) {  
            mContext = context;  
        }  
      
        @Override  
        public void run() {  
            Toast.makeText(mContext, "执行任务", Toast.LENGTH_SHORT).show();
        }  
    }  
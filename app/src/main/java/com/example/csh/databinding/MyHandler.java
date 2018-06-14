package com.example.csh.databinding;

import android.view.View;
import android.widget.Toast;

public class MyHandler {
      
        public void showTost(View view) {
            Toast.makeText(view.getContext(), "展示吐司", Toast.LENGTH_SHORT).show();
        }
      
        public void onEventListenerExecute(MyTask task) {
            task.run();
        }
      
    }  
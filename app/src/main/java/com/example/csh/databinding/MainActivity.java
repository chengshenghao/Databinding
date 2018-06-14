package com.example.csh.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.csh.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 初始化数据
        User user = new User();
        user.firstName = "Victor";
        user.lastName = "Fang";
        user.phone = "13333333333";
        user.isShowPhone = true;
        // 绑定数据
        binding.setUser(user);
        // 绑定方法和监听
        MyHandler handler = new MyHandler();
        MyTask task = new MyTask(this);
        binding.setHandler(handler);
        binding.setTask(task);

    }
}

package com.example.csh.databinding;

import android.text.TextUtils;

public class User {
      
        public String firstName;  
        public String lastName;  
        public String phone; // 电话  
        public boolean isShowPhone;  
      
        /** 
         * 获取全名 
         * @param firstName 
         * @param lastName 
         * @return 
         */  
        public String getFullName(String firstName, String lastName) {  
            StringBuilder sb = new StringBuilder();  
            sb.append("全名：");  
            if (!TextUtils.isEmpty(firstName)) {
                sb.append(firstName);  
            }  
            if (!TextUtils.isEmpty(lastName)) {  
                sb.append("." + lastName);  
            }  
            return sb.toString();  
        }  
    }  
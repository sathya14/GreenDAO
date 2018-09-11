package com.example.sathya.junitexample;

import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;

import java.util.regex.Pattern;

public class LoginUtils {
    private String emailId;
    private String password;

    public LoginUtils(String emailId) {
        this.emailId = emailId;
    }

    public boolean isValidateEmail() {
        boolean flag = emailId.indexOf("@") > -1;
        return flag;
    }

    public boolean isValid(String emailId){
        return Patterns.EMAIL_ADDRESS.matcher(emailId).matches();
    }
   }

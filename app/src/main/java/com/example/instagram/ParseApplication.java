package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vSG3opUepoGaxCYTB4W7M3xv48pxO0ZBPqLJoLme")
                .clientKey("nLD5axmR2weaqbhycoFfkED65rrnFuNfJ3iTaGP1")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}


package com.konna.testhistory.objects;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Konna on 14.11.2017.
 */

public class User {

    Context context;

    String username;

    SharedPreferences sharedPreferences;

    SharedPreferences.Editor editor;

    public User(Context context, String username){
        this.context = context;
        this.username = username;
        sharedPreferences = context.getSharedPreferences("APP", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.commit();
    }

    public User(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("APP", Context.MODE_PRIVATE);
        this.username = sharedPreferences.getString("username", " ");
    }

    public String getUsername() {
        return username;
    }
}

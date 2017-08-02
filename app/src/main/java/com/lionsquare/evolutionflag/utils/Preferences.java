package com.lionsquare.evolutionflag.utils;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by EDGAR ARANA on 18/07/2017.
 */

public class Preferences {

    private Context context;

    public Preferences(Context context) {
        this.context = context;
    }


    public boolean setProfil(int typeLogin) {
        try {
            SharedPreferences sessionUser = context.getSharedPreferences("catergory", MODE_PRIVATE);
            SharedPreferences.Editor editor = sessionUser.edit();
            editor.putInt("typeLogin", typeLogin);
            editor.apply();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public int getTypeLogin() {
        SharedPreferences recuperarToken = context.getSharedPreferences("catergory", MODE_PRIVATE);
        return recuperarToken.getInt("typeLogin", 0);
    }

    public void clearPreference() {
        SharedPreferences sessionUser = context.getSharedPreferences("catergory", MODE_PRIVATE);
        SharedPreferences.Editor editor = sessionUser.edit();
        editor.clear();
        editor.apply();
    }


}

package com.lionsquare.evolutionflag;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.lionsquare.evolutionflag.utils.font.Fonty;

/**
 * Created by EDGAR ARANA on 01/08/2017.
 */

public class EvolutionFlag extends Application {
    private static final String TAG = EvolutionFlag.class.getSimpleName();


    @Override
    public void onCreate() {
        super.onCreate();
        //Aramis-Italic.ttf
        //Capture_it.ttf
        //Exo-Regular.ttf
        Fonty.context(this)
                .regularTypeface("Exo-Regular.ttf")
                .italicTypeface("Exo-Regular.ttf")
                .boldTypeface("Exo-Regular.ttf")
                .done();
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e("termino", "app");
    }
}
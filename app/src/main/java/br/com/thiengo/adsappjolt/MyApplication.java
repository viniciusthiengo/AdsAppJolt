package br.com.thiengo.adsappjolt;

import android.app.Application;
import com.appjolt.sdk.Appjolt;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Appjolt.init( this );
    }
}

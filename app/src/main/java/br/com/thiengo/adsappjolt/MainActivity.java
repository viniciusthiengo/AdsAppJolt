package br.com.thiengo.adsappjolt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.appjolt.sdk.Appjolt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Appjolt - Show EULA only in Google Play Installs (and Debug mode)
        // Please make sure this is added to the Activity onCreate and not Application like the init() method.
        if (Appjolt.isGooglePlayInstall(this))
        {
            Appjolt.showEULA(this);
        }

        Appjolt.addUserSegment(this, "Buyer");
    }
}

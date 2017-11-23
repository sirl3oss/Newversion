package com.developer.tanawutl3.newversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.javiersantos.appupdater.AppUpdater;
import com.github.javiersantos.appupdater.enums.UpdateFrom;

public class MainActivity extends AppCompatActivity {

    String TAG = "updating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String myapk_link = "http://10.135.70.57/bosstestota/app-release.apk";
//        //http://10.135.70.57/bosstestota/app-release.apk
//
//        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(myapk_link));
//        startActivity(intent);

        AppUpdater appUpdater = new AppUpdater(this)
                .setUpdateFrom(UpdateFrom.GITHUB)
                .setGitHubUserAndRepo("sirl3oss", "Newversion");
        appUpdater.start();
    }
}

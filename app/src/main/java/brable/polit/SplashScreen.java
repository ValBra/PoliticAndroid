package brable.polit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by BRABLE on 23/04/2017.
 */

public class SplashScreen extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 4000;
    MediaPlayer splash;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        splash = MediaPlayer.create(this,R.raw.brabley_jingle);
        setContentView(R.layout.splash);
        splash.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                splash.stop();
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

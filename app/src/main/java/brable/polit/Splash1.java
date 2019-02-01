package brable.polit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by BRABLE on 24/04/2017.
 */

public class Splash1 extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash1.this,SplashScreen.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

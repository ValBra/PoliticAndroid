package brable.polit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer marseillaise;
    MediaPlayer bouton;
    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.menu);

        marseillaise = MediaPlayer.create(this, R.raw.marseillaise);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        marseillaise.setLooping(true);


        Button boutonx2 = (Button) findViewById(R.id.buttonx2);
        boutonx2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                bouton.start();
                Intent intent2 = new Intent(MainActivity.this, Apropos.class);
                startActivity(intent2);
            }
        });

        Button boutonx1 = (Button) findViewById(R.id.buttonx1);
        boutonx1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                bouton.start();
                Intent intent1 = new Intent(MainActivity.this, Sommaire.class);
                startActivity(intent1);
            }
        });

        Button boutonx3 = (Button) findViewById(R.id.buttonx3);
        boutonx3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                bouton.start();
                Intent intent1 = new Intent(MainActivity.this, Credits.class);
                startActivity(intent1);
            }
        });

        Button boutonx4 = (Button) findViewById(R.id.buttonx4);
        boutonx4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=brable.polit");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton imb = (ImageButton) findViewById(R.id.imageButton);
        imb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri url = Uri.parse("https://www.facebook.com/BrableyApps/");
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);
            }
        });


    }

    protected void onPause(){
        super.onPause();
        marseillaise.stop();
    }

    protected void onResume(){
        super.onResume();
        marseillaise.start();
    }
}

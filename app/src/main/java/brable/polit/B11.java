package brable.polit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BRABLE on 21/04/2017.
 */

public class B11 extends AppCompatActivity {
    MediaPlayer bouton2;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.b11);
        bouton2 = MediaPlayer.create(this,R.raw.sbouton);
        Button bouton = (Button) findViewById(R.id.button);
        bouton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                bouton2.start();
                Intent intent2 = new Intent(B11.this, Politic1.class);
                startActivity(intent2);
                finish();
            }
        });
    }


    public void onPause(){
        super.onPause();
        onStop();
    }
    public void onStop(){
        super.onStop();
    }
}

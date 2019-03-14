package brable.polit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static brable.polit.Politic1.PREFS;
import static brable.polit.Politic1.pref1;
import static brable.polit.Politic2.PREFS2;
import static brable.polit.Politic2.pref2;
import static brable.polit.Politic3.PREFS3;
import static brable.polit.Politic3.pref3;
import static brable.polit.Politic4.PREFS4;
import static brable.polit.Politic4.pref4;
import static brable.polit.Politic5.PREFS5;
import static brable.polit.Politic5.pref5;
import static brable.polit.Politic6.PREFS6;
import static brable.polit.Politic6.pref6;
import static brable.polit.Politic7.PREFS7;
import static brable.polit.Politic7.pref7;

/**
 * Created by BRABLE on 21/04/2017.
 */

public class Sommaire extends AppCompatActivity {
    MediaPlayer bouton;
    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sommaire);
        bouton = MediaPlayer.create(this,R.raw.sbouton);

        pref1 = getBaseContext().getSharedPreferences(PREFS,MODE_PRIVATE);
        boolean comp1 = pref1.getBoolean(getString(R.string.comp1),false);
        pref2 = getBaseContext().getSharedPreferences(PREFS2,MODE_PRIVATE);
        boolean comp2 = pref2.getBoolean(getString(R.string.comp2),false);
        pref3 = getBaseContext().getSharedPreferences(PREFS3,MODE_PRIVATE);
        boolean comp3 = pref3.getBoolean(getString(R.string.comp3),false);
        pref4 = getBaseContext().getSharedPreferences(PREFS4,MODE_PRIVATE);
        boolean comp4 = pref4.getBoolean(getString(R.string.comp4),false);
        pref5 = getBaseContext().getSharedPreferences(PREFS5,MODE_PRIVATE);
        boolean comp5 = pref5.getBoolean(getString(R.string.comp5),false);
        pref6 = getBaseContext().getSharedPreferences(PREFS6,MODE_PRIVATE);
        boolean comp6 = pref6.getBoolean(getString(R.string.comp6),false);
        pref7 = getBaseContext().getSharedPreferences(PREFS7,MODE_PRIVATE);
        boolean comp7 = pref7.getBoolean(getString(R.string.comp7),false);

        Button bouton1 = (Button) findViewById(R.id.button);
        Button bouton2 = (Button) findViewById(R.id.button2);
        Button bouton3 = (Button) findViewById(R.id.button3);
        Button bouton4 = (Button) findViewById(R.id.button4);
        Button bouton5 = (Button) findViewById(R.id.button5);
        Button bouton6 = (Button) findViewById(R.id.button6);
        Button bouton7 = (Button) findViewById(R.id.button7);
        Button bouton8 = (Button) findViewById(R.id.button8);

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent intent2 = new Intent(Sommaire.this, Politic1.class);
                startActivity(intent2);
                finish();
            }
        });

        if(comp1 == true) {
            bouton2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, Politic2.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp2==true) {
            bouton3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B13.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp3==true) {
            bouton4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B14.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp4==true) {
            bouton5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B15.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp5==true) {
            bouton6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B16.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp6==true) {
            bouton7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B17.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

        if(comp7==true) {
            bouton8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent2 = new Intent(Sommaire.this, B18.class);
                    startActivity(intent2);
                    finish();
                }
            });
        }

    }

}

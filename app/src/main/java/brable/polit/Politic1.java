package brable.polit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by BRABLE on 21/04/2017.
 */

public class Politic1 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol1;
    MediaPlayer applause;
    MediaPlayer sonnerie;
    MediaPlayer end;
    public static final String PREFS = "comp1";
    public static SharedPreferences pref1;
    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref1 = getBaseContext().getSharedPreferences(PREFS,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol1 = MediaPlayer.create(this,R.raw.politic1);
        applause = MediaPlayer.create(this,R.raw.applause);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        sonnerie = MediaPlayer.create(this,R.raw.sonnerie);
        pol1.setLooping(true);
        setContentView(R.layout.activity_main);

        final ViewFlipper viewFlipper =   (ViewFlipper)findViewById(R.id.flipp);

        Button bouton1 = (Button) findViewById(R.id.button1);
        Button bouton2 = (Button) findViewById(R.id.button2);
        Button bouton3 = (Button) findViewById(R.id.button3);
        Button bouton4 = (Button) findViewById(R.id.button4);
        Button bouton5 = (Button) findViewById(R.id.button5);
        Button boutonr3 = (Button) findViewById(R.id.buttonr3);
        Button bouton6 = (Button) findViewById(R.id.button6);
        Button bouton7 = (Button) findViewById(R.id.button7);
        Button bouton8 = (Button) findViewById(R.id.button8);
        Button bouton9 = (Button) findViewById(R.id.button9);
        Button bouton10 = (Button) findViewById(R.id.button10);
        Button bouton11 = (Button) findViewById(R.id.button11);
        Button bouton12 = (Button) findViewById(R.id.button12);
        Button bouton13 = (Button) findViewById(R.id.button13);
        Button bouton14 = (Button) findViewById(R.id.button14);
        Button bouton15 = (Button) findViewById(R.id.button15);
        Button bouton16 = (Button) findViewById(R.id.button16);
        Button bouton17 = (Button) findViewById(R.id.button17);
        Button bouton18 = (Button) findViewById(R.id.button18);

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                setContentView(R.layout.fail1);

                Button bouton51 = (Button) findViewById(R.id.button51);
                Button bouton52 = (Button) findViewById(R.id.button52);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                setContentView(R.layout.fail3);

                Button bouton51 = (Button) findViewById(R.id.button55);
                Button bouton52 = (Button) findViewById(R.id.button56);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        boutonr3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                setContentView(R.layout.fail2);

                Button bouton51 = (Button) findViewById(R.id.button53);
                Button bouton52 = (Button) findViewById(R.id.button54);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                setContentView(R.layout.fail4);

                Button bouton51 = (Button) findViewById(R.id.button57);
                Button bouton52 = (Button) findViewById(R.id.button58);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                setContentView(R.layout.fail5);

                Button bouton51 = (Button) findViewById(R.id.button59);
                Button bouton52 = (Button) findViewById(R.id.button60);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                sonnerie.start();
                viewFlipper.showNext();
            }
        });

        bouton10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                pol1.stop();
                sonnerie.stop();
                setContentView(R.layout.fail5);

                Button bouton51 = (Button) findViewById(R.id.button59);
                Button bouton52 = (Button) findViewById(R.id.button60);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                sonnerie.stop();
                viewFlipper.showNext();
            }
        });

        bouton12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol1.stop();
                end.start();
                setContentView(R.layout.fail6);

                Button bouton51 = (Button) findViewById(R.id.button61);
                Button bouton52 = (Button) findViewById(R.id.button62);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol1.stop();
                end.start();
                setContentView(R.layout.fail7);

                Button bouton51 = (Button) findViewById(R.id.button63);
                Button bouton52 = (Button) findViewById(R.id.button64);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol1.stop();
                applause.start();
                viewFlipper.showNext();
            }
        });

        bouton17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol1.stop();
                end.start();
                setContentView(R.layout.fail8);

                Button bouton51 = (Button) findViewById(R.id.button65);
                Button bouton52 = (Button) findViewById(R.id.button66);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,Politic1.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic1.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        //Ici, à priori, c'est OK
        bouton18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref1.edit();
                editor.putBoolean(getString(R.string.comp1),true);
                editor.apply();
                Intent intent = new Intent(Politic1.this,B12.class);
                startActivity(intent);
                finish();
            }
        });

    }

    protected void onPause(){
        super.onPause();
        pol1.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol1.start();
    }


}

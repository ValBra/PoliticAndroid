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

public class Politic6 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer applause;
    MediaPlayer pol6;
    MediaPlayer end;
    private static final String TAG = "MainActivity";
    public static final String PREFS6 = "comp6";
    public static SharedPreferences pref6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref6 = getBaseContext().getSharedPreferences(PREFS6,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.activity_main6);
        applause = MediaPlayer.create(this,R.raw.applause);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        pol6 = MediaPlayer.create(this,R.raw.politic6);
        pol6.setLooping(true);

        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.flipp);

        Button bouton1 = (Button) findViewById(R.id.button1);
        Button bouton2 = (Button) findViewById(R.id.button2);
        Button bouton3 = (Button) findViewById(R.id.button3);
        Button bouton4 = (Button) findViewById(R.id.button4);
        Button bouton5 = (Button) findViewById(R.id.button5);
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
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail55);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
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
                pol6.stop();
                end.start();
                setContentView(R.layout.fail56);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
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
                viewFlipper.showNext();
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail57);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail58);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener(){
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
                pol6.stop();
                end.start();
                setContentView(R.layout.fail59);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail60);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail61);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if (rand>=0.5){
                    applause.start();
                    bouton.start();
                    pol6.stop();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    setContentView(R.layout.fail80);
                    pol6.stop();
                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic6.this,Politic6.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic6.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol6.stop();
                end.start();
                setContentView(R.layout.fail53);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,Politic6.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic6.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                SharedPreferences.Editor editor = pref6.edit();
                editor.putBoolean(getString(R.string.comp6),true);
                editor.apply();
                Intent intent = new Intent(Politic6.this,B17.class);
                startActivity(intent);
                finish();
            }
        });
    }

    protected void onPause(){
        super.onPause();
        pol6.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol6.start();
    }
}

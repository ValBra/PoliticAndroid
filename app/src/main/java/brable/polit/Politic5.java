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

public class Politic5 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol5;
    MediaPlayer end;
    MediaPlayer applause;
    private static final String TAG = "MainActivity";
    public static final String PREFS5 = "comp5";
    public static SharedPreferences pref5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref5 = getBaseContext().getSharedPreferences(PREFS5,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.activity_main5);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        applause = MediaPlayer.create(this,R.raw.applause);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol5 = MediaPlayer.create(this,R.raw.politic5);
        pol5.setLooping(true);

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

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail49);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail50);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                applause.start();
                viewFlipper.showNext();
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail51);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if(rand>=0.33){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    pol5.stop();
                    setContentView(R.layout.fail59);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,Politic5.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail51);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if(rand>=0.33){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    pol5.stop();
                    setContentView(R.layout.fail32);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,Politic5.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail51);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
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
                viewFlipper.showNext();
            }
        });

        bouton12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                end.start();
                setContentView(R.layout.fail52);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                end.start();
                bouton.start();
                pol5.stop();
                setContentView(R.layout.fail54);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,Politic5.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic5.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol5.stop();
                double rand = Math.random();
                if(rand>=0.33){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    setContentView(R.layout.fail80);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,Politic5.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic5.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                SharedPreferences.Editor editor = pref5.edit();
                editor.putBoolean(getString(R.string.comp5),true);
                editor.apply();
                Intent intent = new Intent(Politic5.this,B16.class);
                startActivity(intent);
                finish();
            }
        });

    }

    protected void onPause(){
        super.onPause();
        pol5.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol5.start();
    }
}


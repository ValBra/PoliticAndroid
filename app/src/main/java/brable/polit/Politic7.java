package brable.polit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
/**
 * Created by BRABLE on 21/04/2017.
 */

public class Politic7 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol7;
    MediaPlayer applause;
    MediaPlayer mech;
    MediaPlayer end;
    MediaPlayer suspens;
    private static final String TAG = "MainActivity";
    public static final String PREFS7 = "comp7";
    public static SharedPreferences pref7;

    int indice = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref7 = getBaseContext().getSharedPreferences(PREFS7,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.activity_main7);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        applause = MediaPlayer.create(this,R.raw.applause);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        mech = MediaPlayer.create(this,R.raw.mechant);
        suspens = MediaPlayer.create(this,R.raw.suspens);
        pol7 = MediaPlayer.create(this,R.raw.politic7);
        pol7.setLooping(true);

        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.flipp);

        final LinearLayout ll1 = (LinearLayout)findViewById(R.id.ll10);
        final LinearLayout ll2 = (LinearLayout)findViewById(R.id.ll11);
        final LinearLayout ll3 = (LinearLayout)findViewById(R.id.ll12);
        final LinearLayout ll4 = (LinearLayout)findViewById(R.id.ll13);

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
                pol7.stop();
                end.stop();
                setContentView(R.layout.fail62);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,Politic7.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,MainActivity.class);
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
                double rand = Math.random();
                if (rand>=0.33){
                    viewFlipper.showNext();
                }else{
                    pol7.stop();
                    end.start();
                    setContentView(R.layout.fail63);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,Politic7.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if (rand>=0.33){
                    viewFlipper.showNext();
                }else{
                    pol7.stop();
                    end.start();
                    setContentView(R.layout.fail63);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,Politic7.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if (rand>=0.25){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    pol7.stop();
                    setContentView(R.layout.fail64);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,Politic7.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if (rand>=0.25){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    pol7.stop();
                    setContentView(R.layout.fail64);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,Politic7.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,MainActivity.class);
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
                double rand = Math.random();
                if (rand>=0.20){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    pol7.stop();
                    setContentView(R.layout.fail63);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,Politic7.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic7.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol7.stop();
                end.start();
                setContentView(R.layout.fail63);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,Politic7.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol7.stop();
                end.start();
                setContentView(R.layout.fail64);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,Politic7.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic7.this,MainActivity.class);
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
                viewFlipper.showNext();
            }
        });

        bouton13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                int indice = 1;
                viewFlipper.showNext();
            }
        });

        bouton14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol7.stop();
                double rand = Math.random();
                if (indice == 1) {
                    if (rand >= 0.66) {
                        applause.start();
                        viewFlipper.showNext();
                    } else {
                        end.start();
                        setContentView(R.layout.fail65);

                        Button bouton1 = (Button) findViewById(R.id.button1);
                        Button bouton2 = (Button) findViewById(R.id.button2);
                        bouton1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(Politic7.this, Politic7.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                        bouton2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(Politic7.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                    }
                }else{
                    if (rand >= 0.50) {
                        applause.start();
                        viewFlipper.showNext();
                    } else {
                        end.start();
                        setContentView(R.layout.fail65);

                        Button bouton1 = (Button) findViewById(R.id.button1);
                        Button bouton2 = (Button) findViewById(R.id.button2);
                        bouton1.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(Politic7.this, Politic7.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                        bouton2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                Intent intent = new Intent(Politic7.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                    }
                }
            }
        });

        bouton15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                applause.stop();
                viewFlipper.showNext();
            }
        });

        ll1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        ll2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                suspens.start();
                viewFlipper.showNext();
            }
        });

        ll3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                mech.start();
                viewFlipper.showNext();
            }
        });

        ll4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                SharedPreferences.Editor editor = pref7.edit();
                editor.putBoolean(getString(R.string.comp7),true);
                editor.apply();
                Intent intent = new Intent(Politic7.this, B18.class);
                startActivity(intent);
                finish();
            }
        });
    }
    protected void onPause(){
        super.onPause();
        pol7.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol7.start();
    }
}

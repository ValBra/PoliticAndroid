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

public class Politic3 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol3;
    MediaPlayer applause;
    MediaPlayer table;
    MediaPlayer boom;
    MediaPlayer end;
    private static final String TAG = "MainActivity";
    public static final String PREFS3 = "comp3";
    public static SharedPreferences pref3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref3 = getBaseContext().getSharedPreferences(PREFS3,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol3 = MediaPlayer.create(this,R.raw.politic3);
        applause = MediaPlayer.create(this,R.raw.applause);
        table = MediaPlayer.create(this,R.raw.table);
        boom = MediaPlayer.create(this,R.raw.boom);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        setContentView(R.layout.activity_main3);
        pol3.setLooping(true);

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
        Button bouton19 = (Button) findViewById(R.id.button19);
        Button bouton20 = (Button) findViewById(R.id.button20);
        Button bouton21 = (Button) findViewById(R.id.button21);
        Button bouton22 = (Button) findViewById(R.id.button22);
        Button bouton23 = (Button) findViewById(R.id.button23);
        Button bouton24 = (Button) findViewById(R.id.button24);
        Button bouton25 = (Button) findViewById(R.id.button25);
        Button bouton26 = (Button) findViewById(R.id.button26);
        Button bouton27 = (Button) findViewById(R.id.button27);
        Button bouton28 = (Button) findViewById(R.id.button28);
        Button bouton29 = (Button) findViewById(R.id.button29);
        Button bouton30 = (Button) findViewById(R.id.button30);
        Button bouton31 = (Button) findViewById(R.id.button31);
        Button bouton32 = (Button) findViewById(R.id.button32);
        Button bouton33 = (Button) findViewById(R.id.button33);
        Button bouton34 = (Button) findViewById(R.id.button34);
        Button bouton35 = (Button) findViewById(R.id.button35);
        Button bouton36 = (Button) findViewById(R.id.button36);
        Button bouton37 = (Button) findViewById(R.id.button37);
        Button bouton38 = (Button) findViewById(R.id.button38);
        Button bouton39 = (Button) findViewById(R.id.button39);
        Button bouton40 = (Button) findViewById(R.id.button40);

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail18);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
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
                pol3.stop();
                end.start();
                setContentView(R.layout.fail19);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
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
                pol3.stop();
                end.start();
                setContentView(R.layout.fail20);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail21);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
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
                if(rand>=0.4){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    pol3.stop();
                    setContentView(R.layout.fail37);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,Politic3.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,MainActivity.class);
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
                applause.stop();
                end.start();
                pol3.stop();
                setContentView(R.layout.fail22);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                applause.stop();
                end.start();
                pol3.stop();
                setContentView(R.layout.fail23);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
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
                pol3.stop();
                end.start();
                setContentView(R.layout.fail24);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                table.start();
                viewFlipper.showNext();
            }
        });

        bouton15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                boom.start();
                setContentView(R.layout.fail25);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        boom.stop();
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        boom.stop();
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
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

        bouton17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail27);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton19.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                boom.start();
                setContentView(R.layout.fail26);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        boom.start();
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        boom.start();
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                viewFlipper.showNext();
            }
        });

        bouton21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail28);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail29);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail30);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton26.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton27.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail31);
                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton28.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton29.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail32);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail33);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail34);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton34.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail35);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton35.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if(rand>=0.33){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    pol3.stop();
                    end.start();
                    setContentView(R.layout.fail35);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,Politic3.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton36.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                end.start();
                setContentView(R.layout.fail36);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,Politic3.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic3.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton37.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton38.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                double rand = Math.random();
                if(rand>=0.5){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    setContentView(R.layout.fail79);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,Politic3.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton39.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol3.stop();
                double rand = Math.random();
                if(rand>=0.66){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    applause.stop();
                    setContentView(R.layout.fail37);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,Politic3.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic3.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton40.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref3.edit();
                editor.putBoolean(getString(R.string.comp3),true);
                editor.apply();
                Intent intent = new Intent(Politic3.this,B14.class);
                startActivity(intent);
                finish();
            }
        });

    }

    protected void onPause(){
        super.onPause();
        pol3.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol3.start();
    }
}

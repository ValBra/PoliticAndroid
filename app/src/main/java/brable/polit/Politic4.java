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

public class Politic4 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol4;
    MediaPlayer applause;
    MediaPlayer end;
    MediaPlayer mitraille;
    MediaPlayer nelson;
    private static final String TAG = "MainActivity";
    public static final String PREFS4 = "comp4";
    public static SharedPreferences pref4;

    int indice = 0;
    boolean jul = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref4 = getBaseContext().getSharedPreferences(PREFS4,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.activity_main4);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        applause = MediaPlayer.create(this,R.raw.applause);
        mitraille = MediaPlayer.create(this,R.raw.mitraillette);
        pol4 = MediaPlayer.create(this,R.raw.pol4);
        nelson = MediaPlayer.create(this,R.raw.ahah);
        pol4.setLooping(true);

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

        bouton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                indice+=1;
                viewFlipper.showNext();
            }
        });

        bouton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                jul = true;
                viewFlipper.showNext();
            }
        });

        bouton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                indice+=1;
                viewFlipper.showNext();
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
                indice+=1;
                if (indice<2 && jul==true){
                    pol4.stop();
                    end.start();
                    setContentView(R.layout.fail38);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,Politic4.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }else if(indice<2 && jul==false){
                    pol4.stop();
                    end.start();
                    setContentView(R.layout.fail39);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,Politic4.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }else {
                    viewFlipper.showNext();
                }
            }
        });

        bouton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                if (indice<2 && jul==true){
                    pol4.stop();
                    end.start();
                    setContentView(R.layout.fail38);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,Politic4.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }else if(indice<2 && jul==false){
                    pol4.stop();
                    end.start();
                    setContentView(R.layout.fail39);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,Politic4.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }else {
                    viewFlipper.showNext();
                }
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                end.start();
                setContentView(R.layout.fail40);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                end.start();
                setContentView(R.layout.fail41);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                nelson.start();
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
                pol4.stop();
                end.start();
                setContentView(R.layout.fail42);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
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
                pol4.stop();
                end.start();
                setContentView(R.layout.fail43);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
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
                pol4.stop();
                end.start();
                setContentView(R.layout.fail43);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton19.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                end.start();
                setContentView(R.layout.fail43);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                end.start();
                setContentView(R.layout.fail44);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
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
                viewFlipper.showNext();
            }
        });

        bouton24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                end.start();
                setContentView(R.layout.fail46);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand = Math.random();
                if (rand>=0.33){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    setContentView(R.layout.fail45);

                    pol4.stop();
                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,Politic4.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic4.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
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
                pol4.stop();
                end.start();
                setContentView(R.layout.fail47);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
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
                pol4.stop();
                end.start();
                setContentView(R.layout.fail48);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,Politic4.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic4.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                mitraille.start();
                pol4.stop();
                viewFlipper.showNext();
            }
        });

        bouton31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                applause.start();
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol4.stop();
                SharedPreferences.Editor editor = pref4.edit();
                editor.putBoolean(getString(R.string.comp4),true);
                editor.apply();
                Intent intent = new Intent(Politic4.this,B15.class);
                startActivity(intent);
                finish();
            }
        });
    }

    protected void onPause(){
        super.onPause();
        pol4.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol4.start();
    }
}

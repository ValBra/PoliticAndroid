package brable.polit;

import android.content.Intent;
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

public class Politic8 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol8;
    MediaPlayer coeur;
    MediaPlayer win;
    MediaPlayer epic;
    MediaPlayer end;
    MediaPlayer epic2;
    MediaPlayer applause;
    MediaPlayer suspens;
    private static final String TAG = "MainActivity";

    int indice = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        setContentView(R.layout.activity_main8);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol8 = MediaPlayer.create(this,R.raw.politic8);
        coeur = MediaPlayer.create(this,R.raw.coeur);
        epic = MediaPlayer.create(this,R.raw.epic);
        epic2 = MediaPlayer.create(this,R.raw.epic2);
        applause = MediaPlayer.create(this,R.raw.applause);
        win = MediaPlayer.create(this,R.raw.win);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        suspens = MediaPlayer.create(this,R.raw.suspens);
        pol8.setLooping(true);

        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.flipp);
        LinearLayout ll1 = (LinearLayout) findViewById(R.id.ll17);
        LinearLayout ll2 = (LinearLayout) findViewById(R.id.ll18);

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
                pol8.stop();
                end.start();
                setContentView(R.layout.fail66);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                pol8.stop();
                end.start();
                setContentView(R.layout.fail67);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                end.start();
                pol8.stop();
                setContentView(R.layout.fail68);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol8.stop();
                end.start();
                setContentView(R.layout.fail69);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                if (rand>=0.4){
                    viewFlipper.showNext();
                }else{
                    end.start();
                    pol8.stop();
                    setContentView(R.layout.fail70);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,Politic8.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                pol8.stop();
                end.start();
                setContentView(R.layout.fail71);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                pol8.stop();
                end.start();
                setContentView(R.layout.fail72);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
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
                pol8.stop();
                end.start();
                setContentView(R.layout.fail73);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                indice +=1;
                viewFlipper.showNext();
            }
        });

        bouton17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                indice +=2;
                viewFlipper.showNext();
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
                indice+=1;
                viewFlipper.showNext();
            }
        });

        bouton20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                indice+=2;
                viewFlipper.showNext();
            }
        });

        bouton21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                double rand2 = Math.random();
                if (indice == 3 && rand2>=0.5){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    pol8.stop();
                    setContentView(R.layout.fail37);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,Politic8.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol8.stop();
                end.start();
                setContentView(R.layout.fail74);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                epic.setLooping(true);
                bouton.start();
                pol8.stop();
                viewFlipper.showNext();
            }
        });

        bouton26.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol8.stop();
                end.start();
                setContentView(R.layout.fail75);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton27.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                epic.stop();
                epic2.start();
                viewFlipper.showNext();
            }
        });

        bouton28.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                epic2.stop();
                setContentView(R.layout.fail76);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton29.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                coeur.start();
                viewFlipper.showNext();
            }
        });

        bouton30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                end.start();
                setContentView(R.layout.fail77);

                Button bouton1 = (Button) findViewById(R.id.button1);
                Button bouton2 = (Button) findViewById(R.id.button2);
                bouton1.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,Politic8.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic8.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                epic2.stop();
                coeur.stop();
                double rand3 = Math.random();
                if(rand3>=0.5){
                    win.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    setContentView(R.layout.fail78);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,Politic8.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        bouton32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                coeur.stop();
                double rand3 = Math.random();
                if(rand3>=0.5){
                    win.start();
                    viewFlipper.showNext();
                }else{
                    end.start();
                    setContentView(R.layout.fail78);

                    Button bouton1 = (Button) findViewById(R.id.button1);
                    Button bouton2 = (Button) findViewById(R.id.button2);
                    bouton1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,Politic8.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic8.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            }
        });

        ll1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                suspens.start();
                win.stop();
                viewFlipper.showNext();
            }
        });

        ll2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                Intent intent = new Intent(Politic8.this, Politic1.class);
                startActivity(intent);
                finish();
            }
        });
    }
    protected void onPause(){
        super.onPause();
        pol8.stop();
        win.stop();
        coeur.stop();
        epic.stop();
        epic2.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol8.start();
    }
}

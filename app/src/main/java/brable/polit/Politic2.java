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

public class Politic2 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol2;
    MediaPlayer applause;
    MediaPlayer end;
    MediaPlayer police;
    private static final String TAG = "MainActivity";
    public static final String PREFS2 = "comp2";
    public static SharedPreferences pref2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref2 = getBaseContext().getSharedPreferences(PREFS2,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        applause = MediaPlayer.create(this,R.raw.applause);
        pol2 = MediaPlayer.create(this,R.raw.politic2);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        police = MediaPlayer.create(this,R.raw.police);
        setContentView(R.layout.activity_main2);
        pol2.setLooping(true);

        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.flipp);

        Button bouton19 = (Button) findViewById(R.id.button19);
        Button bouton20 = (Button) findViewById(R.id.button20);
        Button bouton21 = (Button) findViewById(R.id.button21);
        Button bouton22 = (Button) findViewById(R.id.button22);
        Button bouton23 = (Button) findViewById(R.id.button23);
        Button bouton24 = (Button) findViewById(R.id.button24);
        Button bouton25 = (Button) findViewById(R.id.button25);
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
        Button bouton41 = (Button) findViewById(R.id.button41);
        Button bouton42 = (Button) findViewById(R.id.button42);
        Button bouton43 = (Button) findViewById(R.id.button43);
        Button bouton44 = (Button) findViewById(R.id.button44);
        Button bouton45 = (Button) findViewById(R.id.button45);
        Button bouton46 = (Button) findViewById(R.id.button46);
        Button bouton47 = (Button) findViewById(R.id.button47);
        Button bouton48 = (Button) findViewById(R.id.button48);
        Button bouton49 = (Button) findViewById(R.id.button49);
        Button bouton50 = (Button) findViewById(R.id.button50);

        bouton19.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail9);

                Button bouton51 = (Button) findViewById(R.id.button65);
                Button bouton52 = (Button) findViewById(R.id.button66);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {

                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
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
                pol2.stop();
                end.start();
                setContentView(R.layout.fail10);

                Button bouton51 = (Button) findViewById(R.id.button68);
                Button bouton52 = (Button) findViewById(R.id.button69);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail10);

                Button bouton51 = (Button) findViewById(R.id.button68);
                Button bouton52 = (Button) findViewById(R.id.button69);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail10);

                Button bouton51 = (Button) findViewById(R.id.button68);
                Button bouton52 = (Button) findViewById(R.id.button69);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton28.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail10);

                Button bouton51 = (Button) findViewById(R.id.button68);
                Button bouton52 = (Button) findViewById(R.id.button69);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton29.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                police.start();
                viewFlipper.showNext();
            }
        });

        bouton30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                police.stop();
                viewFlipper.showNext();
            }
        });

        bouton31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail11);

                Button bouton51 = (Button) findViewById(R.id.button70);
                Button bouton52 = (Button) findViewById(R.id.button71);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
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
                pol2.stop();
                end.start();
                setContentView(R.layout.fail12);

                Button bouton51 = (Button) findViewById(R.id.button72);
                Button bouton52 = (Button) findViewById(R.id.button73);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton35.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton36.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
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
                pol2.stop();
                end.start();
                setContentView(R.layout.fail13);

                Button bouton51 = (Button) findViewById(R.id.button74);
                Button bouton52 = (Button) findViewById(R.id.button75);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton39.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail14);

                Button bouton51 = (Button) findViewById(R.id.button76);
                Button bouton52 = (Button) findViewById(R.id.button77);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton40.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton41.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail15);

                Button bouton51 = (Button) findViewById(R.id.button78);
                Button bouton52 = (Button) findViewById(R.id.button79);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton42.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                double rand = Math.random();
                if(rand>=0.33){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    pol2.stop();
                    end.start();
                    setContentView(R.layout.fail37);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic2.this,Politic2.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic2.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton43.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail17);

                Button bouton51 = (Button) findViewById(R.id.button1);
                Button bouton52 = (Button) findViewById(R.id.button2);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton44.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail17);
                Button bouton51 = (Button) findViewById(R.id.button1);
                Button bouton52 = (Button) findViewById(R.id.button2);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton47.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton45.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail17);

                Button bouton51 = (Button) findViewById(R.id.button1);
                Button bouton52 = (Button) findViewById(R.id.button2);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton46.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                viewFlipper.showNext();
            }
        });

        bouton48.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                double rand = Math.random();
                if(rand>=0.5){
                    applause.start();
                    viewFlipper.showNext();
                }else{
                    pol2.stop();
                    end.start();
                    setContentView(R.layout.fail79);

                    Button bouton51 = (Button) findViewById(R.id.button1);
                    Button bouton52 = (Button) findViewById(R.id.button2);
                    bouton51.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic2.this,Politic2.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bouton52.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v) {
                            Intent intent = new Intent(Politic2.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });

        bouton49.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                bouton.start();
                pol2.stop();
                end.start();
                setContentView(R.layout.fail16);

                Button bouton51 = (Button) findViewById(R.id.button80);
                Button bouton52 = (Button) findViewById(R.id.button81);
                bouton51.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,Politic2.class);
                        startActivity(intent);
                        finish();
                    }
                });
                bouton52.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        Intent intent = new Intent(Politic2.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        bouton50.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref2.edit();
                editor.putBoolean(getString(R.string.comp2),true);
                editor.apply();
                Intent intent2 = new Intent(Politic2.this, B13.class);
                startActivity(intent2);
                finish();
            }
        });
    }

    protected void onPause(){
        super.onPause();
        pol2.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol2.start();
    }

}

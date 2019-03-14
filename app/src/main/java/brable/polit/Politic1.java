package brable.polit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BRABLE on 21/04/2017.
 */

public class Politic1 extends AppCompatActivity {
    MediaPlayer bouton;
    MediaPlayer pol1;
    MediaPlayer applause;
    MediaPlayer sonnerie;
    MediaPlayer end;

    Button button1, button2, button3, buttonRejouer, buttonMenu;
    ImageView image, imageFail;
    TextView text,textFail, textTitle;

    public static final String PREFS = "comp1";
    public static SharedPreferences pref1;
    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref1 = getBaseContext().getSharedPreferences(PREFS,MODE_PRIVATE);

        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol1 = MediaPlayer.create(this,R.raw.politic1);
        applause = MediaPlayer.create(this,R.raw.applause);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        sonnerie = MediaPlayer.create(this,R.raw.sonnerie);
        pol1.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.photo);
        textTitle.setText(R.string.chap1_titre);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                demarrer();
            }
        });
    }

    public void demarrer() {
        setContentView(R.layout.presentation_personnage);
        Button buttonDemarrer = (Button) findViewById(R.id.button_demarrer);

        buttonDemarrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                setContentView(R.layout.question_layout);
                image = (ImageView) findViewById(R.id.image_question);
                textTitle = (TextView) findViewById(R.id.textTitle);
                text = (TextView) findViewById(R.id.text_question);
                button1 = (Button) findViewById(R.id.button1);
                button2 = (Button) findViewById(R.id.button2);
                button3 = (Button) findViewById(R.id.button3);

                image.setImageResource(R.drawable.calendrier_vacances);
                text.setText(R.string.vacances);
                button1.setText(R.string.rester);
                button2.setText(R.string.partir_usa);
                button3.setVisibility(View.GONE);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bouton.start();
                        success1();
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bouton.start();
                        fail1();
                    }
                });
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol1.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic1.this, Politic1.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic1.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail1() {
        initializeFail();
        imageFail.setImageResource(R.drawable.fusillade);
        textFail.setText(R.string.fusillade);
    }

    public void fail2() {
        initializeFail();
        imageFail.setImageResource(R.drawable.alc);
        textFail.setText(R.string.alcool);
    }

    public void fail3() {
        initializeFail();
        imageFail.setImageResource(R.drawable.sapin);
        textFail.setText(R.string.sapin);
    }

    public void fail4() {
        initializeFail();
        imageFail.setImageResource(R.drawable.projx);
        textFail.setText(R.string.projx);
    }

    public void fail5() {
        initializeFail();
        imageFail.setImageResource(R.drawable.foule);
        textFail.setText(R.string.prix_excessif);
    }

    public void fail6() {
        initializeFail();
        imageFail.setImageResource(R.drawable.desinsc);
        textFail.setText(R.string.caissier);
    }

    public void fail7() {
        initializeFail();
        imageFail.setImageResource(R.drawable.meeting);
        textFail.setText(R.string.fail_intello);
    }

    public void fail8() {
        initializeFail();
        imageFail.setImageResource(R.drawable.fouledelire);
        textFail.setText(R.string.enleve_lunettes);
    }

    public void success1() {
        textTitle.setVisibility(View.GONE);
        image.setImageResource(R.drawable.question);
        text.setText(R.string.que_faites_vous);
        button1.setText(R.string.grosse_fete);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.grosse_fete_alcool);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.vosges);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail3();
            }
        });
    }

    public void success2() {
        text.setText(R.string.prix_entree);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success3();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail4();
            }
        });
    }

    public void success3() {
        text.setText(R.string.question_prix_entree);
        button1.setText(R.string.euros);
        button2.setText(R.string.promesse_vote);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.dm_maths);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail5();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success4();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail5();
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.rentre);
        text.setText(R.string.rentree);
        button1.setText(R.string.ploucs_camarades);
        button2.setText(R.string.secher_cours);
        button3.setVisibility(View.GONE);

        sonnerie.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                sonnerie.stop();
                success5();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                sonnerie.stop();
                fail6();
            }
        });
    }

    public void success5() {
        image.setImageResource(R.drawable.suppleant);
        text.setText(R.string.suppleant);
        button1.setText(R.string.intello);
        button2.setText(R.string.brute);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail7();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success6();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.ambulance);
        text.setText(R.string.accident_sport);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success7();
            }
        });
    }

    public void success7() {
        image.setImageResource(R.drawable.debat);
        text.setText(R.string.dernier_debat);
        button1.setText(R.string.prenom_nul);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.lunettes);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success8();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail8();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.jm_pleure);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        applause.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                pol1.stop();
                SharedPreferences.Editor editor = pref1.edit();
                editor.putBoolean(getString(R.string.comp1),true);
                editor.apply();

                Intent intent = new Intent(Politic1.this,Politic2.class);
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

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
import android.widget.ViewFlipper;

/**
 * Created by BRABLE on 21/04/2017.
 */

public class Politic6 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
    MediaPlayer bouton;
    MediaPlayer applause;
    MediaPlayer pol6;
    MediaPlayer end;
    public static final String PREFS6 = "comp6";
    public static SharedPreferences pref6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref6 = getBaseContext().getSharedPreferences(PREFS6,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        applause = MediaPlayer.create(this,R.raw.applause);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        pol6 = MediaPlayer.create(this,R.raw.politic6);
        pol6.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.stars);
        textTitle.setText(R.string.chap6_titre);
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
        textTitle.setVisibility(View.GONE);
        image.setImageResource(R.drawable.system);
        text.setText(R.string.maitre_systeme_solaire);
        button1.setText(R.string.jupiter);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.pluton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail55();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success1();
            }
        });
    }

    public void success1() {
        image.setImageResource(R.drawable.pluton);
        text.setText(R.string.colonisez_pluton);
        button1.setText(R.string.construire_vaisseau);
        button2.setText(R.string.ne_rien_faire);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail56();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success2();
            }
        });
    }

    public void success2() {
        image.setImageResource(R.drawable.pluton);
        text.setText(R.string.quete_spirituelle);
        button1.setText(R.string.construire_vaisseau);
        button2.setText(R.string.taxer_habitants);

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
                fail57();
            }
        });
    }

    public void success3() {
        image.setImageResource(R.drawable.pluton);
        text.setText(R.string.caillou);
        button1.setText(R.string.conquerir_autres_systemes);
        button2.setText(R.string.militariser_pluton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail58();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success4();
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.pluton);
        text.setText(R.string.pluton_army);
        button1.setText(R.string.conquerir_autres_systemes);
        button2.setText(R.string.partir_vacances);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success5();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail59();
            }
        });
    }

    public void success5() {
        image.setImageResource(R.drawable.ovni);
        text.setText(R.string.population_extraterrestres);
        button1.setText(R.string.exterminer);
        button2.setText(R.string.reduire_en_esclavage);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail60();
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
        image.setImageResource(R.drawable.mine);
        text.setText(R.string.nouvelles_ressources);
        button1.setText(R.string.continuer_conquetes);
        button2.setText(R.string.s_arreter);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail61();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success7();
            }
        });
    }

    public void success7() {
        image.setImageResource(R.drawable.iss);
        text.setText(R.string.station_spatiale);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success8();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.planete);
        text.setText(R.string.une_planete_a_conquerir);
        button1.setText(R.string.conquerir_derniere_planete);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.aller_chercher_renforts);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if (rand >= 0.4) {
                    applause.start();
                    bouton.start();
                    pol6.stop();
                    success9();
                } else {
                    fail80();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail53();
            }
        });
    }

    public void success9() {
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.maitre_voie_lactee);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                SharedPreferences.Editor editor = pref6.edit();
                editor.putBoolean(getString(R.string.comp6),true);
                editor.apply();
                Intent intent = new Intent(Politic6.this,Politic7.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol6.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic6.this, Politic6.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic6.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail53() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo2);
        textFail.setText(R.string.autodestruction_vaisseau);
    }

    public void fail55() {
        initializeFail();
        imageFail.setImageResource(R.drawable.jupiter);
        textFail.setText(R.string.fail_jupiter);
    }

    public void fail56() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo2);
        textFail.setText(R.string.allumettes);
    }

    public void fail57() {
        initializeFail();
        imageFail.setImageResource(R.drawable.pluton);
        textFail.setText(R.string.personne_sur_pluton);
    }

    public void fail58() {
        initializeFail();
        imageFail.setImageResource(R.drawable.lam);
        textFail.setText(R.string.planete_lama);
    }

    public void fail59() {
        initializeFail();
        imageFail.setImageResource(R.drawable.malaisi);
        textFail.setText(R.string.malaysia_airlines);
    }

    public void fail60() {
        initializeFail();
        imageFail.setImageResource(R.drawable.revolution);
        textFail.setText(R.string.rescapes_genocide);
    }

    public void fail61() {
        initializeFail();
        imageFail.setImageResource(R.drawable.vaisseau2);
        textFail.setText(R.string.derive);
    }

    public void fail80() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo2);
        textFail.setText(R.string.pour_impressionner);
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

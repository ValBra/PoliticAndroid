package brable.polit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * Created by BRABLE on 21/04/2017.
 */

public class Politic7 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
    LinearLayout linearLayout;
    MediaPlayer bouton;
    MediaPlayer pol7;
    MediaPlayer applause;
    MediaPlayer mech;
    MediaPlayer end;
    MediaPlayer suspens;
    public static final String PREFS7 = "comp7";
    public static SharedPreferences pref7;

    int indice = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref7 = getBaseContext().getSharedPreferences(PREFS7,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        applause = MediaPlayer.create(this,R.raw.applause);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        mech = MediaPlayer.create(this,R.raw.mechant);
        suspens = MediaPlayer.create(this,R.raw.suspens);
        pol7 = MediaPlayer.create(this,R.raw.politic7);
        pol7.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        linearLayout = (LinearLayout) findViewById(R.id.ll);

        image.setImageResource(R.drawable.alea);
        textTitle.setText(R.string.chap7_titre);
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
        image.setImageResource(R.drawable.voielac);
        text.setText(R.string.maitre_voie_lactee);
        button1.setText(R.string.casser_voitures);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.aller_plus_haut);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail62();
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
        image.setImageResource(R.drawable.question);
        text.setText(R.string.quelle_planete);
        button1.setText(R.string.nomhrandome);
        button2.setText(R.string.tapéçurleklavié);

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
                fail63();
            }
        });
    }

    public void success2() {
        image.setImageResource(R.drawable.planete);
        text.setText(R.string.mode_operatoire);
        button1.setText(R.string.envahir);
        button2.setText(R.string.infiltrer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail64();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success3();
            }
        });
    }

    public void success3() {
        image.setImageResource(R.drawable.planete);
        text.setText(R.string.pris_possession);
        button1.setText(R.string.aller_ailleurs);
        button2.setText(R.string.rester_ici);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success4();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail63();
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.extrat);
        text.setText(R.string.planete_accueillante);
        button1.setText(R.string.les_tuer);
        button2.setText(R.string.sympathiser);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail64();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success5();
            }
        });
    }

    public void success5() {
        image.setImageResource(R.drawable.hollan2);
        text.setText(R.string.homme_politique_reconnu);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success6();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.discours);
        text.setText(R.string.discours_campagne);
        button1.setText(R.string.tuerai_tous);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.rendrai_riche);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success7();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice=1;
                success7();
            }
        });
    }

    public void success7() {
        image.setImageResource(R.drawable.elec);
        text.setText(R.string.soir_election);
        button1.setText(R.string.voir_resultats);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                if(indice==1) {
                    fail65();
                } else {
                    success8();
                }
            }
        });
    }

    public void success8() {
        applause.start();
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.elu_univers);
        button1.setText(R.string.continuer);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                pol7.stop();
                success9();
            }
        });
    }

    public void success9() {
        image.setImageResource(R.drawable.wait);
        text.setText(R.string.attendez);
        button1.setVisibility(View.GONE);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success10();
            }
        });
    }

    public void success10() {
        image.setImageResource(R.drawable.extrat2);
        text.setText(R.string.dernier_mot);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                suspens.start();
                success11();
            }
        });
    }

    public void success11() {
        image.setImageResource(R.drawable.jm);
        text.setVisibility(View.GONE);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                mech.start();
                success12();
            }
        });
    }

    public void success12() {
        text.setVisibility(View.VISIBLE);
        text.setText(R.string.jm_is_back);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success13();
            }
        });
    }

    public void success13() {
        image.setImageResource(R.drawable.funes);
        text.setText(R.string.jm_encore_en_jeu);
        button1.setVisibility(View.VISIBLE);
        button1.setText(R.string.continuer);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                SharedPreferences.Editor editor = pref7.edit();
                editor.putBoolean(getString(R.string.comp7),true);
                editor.apply();
                Intent intent = new Intent(Politic7.this, Politic8.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol7.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic7.this, Politic7.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic7.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail62() {
        initializeFail();
        imageFail.setImageResource(R.drawable.fou);
        textFail.setText(R.string.asile);
    }

    public void fail63() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.mort_sans_savoir);
    }

    public void fail64() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.echec);
    }

    public void fail65() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.retraite);
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

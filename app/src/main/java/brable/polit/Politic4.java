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

public class Politic4 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
    MediaPlayer bouton;
    MediaPlayer pol4;
    MediaPlayer applause;
    MediaPlayer end;
    MediaPlayer mitraille;
    MediaPlayer nelson;
    public static final String PREFS4 = "comp4";
    public static SharedPreferences pref4;

    int indice = 0;
    boolean jul = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref4 = getBaseContext().getSharedPreferences(PREFS4,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        applause = MediaPlayer.create(this,R.raw.applause);
        mitraille = MediaPlayer.create(this,R.raw.mitraillette);
        pol4 = MediaPlayer.create(this,R.raw.pol4);
        nelson = MediaPlayer.create(this,R.raw.ahah);
        pol4.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.ww3);
        textTitle.setText(R.string.chap4_titre);
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

    public void demarrer(){
        textTitle.setVisibility(View.GONE);
        image.setImageResource(R.drawable.barbec);
        text.setText(R.string.premiere_mesure);
        button1.setText(R.string.annuler_14_juillet);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.remplacer_hymne);

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
                jul=true;
                indice+=1;
                success1();
            }
        });
    }

    public void success1() {
        image.setImageResource(R.drawable.cdf);
        text.setText(R.string.coupe_de_france);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=1;
                success2();
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
        image.setImageResource(R.drawable.agric);
        text.setText(R.string.salon_agriculture);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=1;
                determineFail();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                determineFail();
            }
        });
    }

    public void determineFail() {
        if(indice<2 && jul) {
            fail38();
        } else if (indice<2) {
            fail39();
        } else {
            success3();
        }
    }

    public void success3() {
        image.setImageResource(R.drawable.trump2);
        text.setText(R.string.invitation_trump);
        button1.setText(R.string.y_aller);
        button2.setText(R.string.refuser_invitation);

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
                fail40();
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.conf);
        text.setText(R.string.conference);
        button1.setText(R.string.tank);
        button2.setText(R.string.tanc);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail41();
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
        nelson.start();
        image.setImageResource(R.drawable.nelson);
        text.setText(R.string.amelioration_relations_usa);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                nelson.stop();
                success6();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.juillet);
        text.setText(R.string.fete_nat);
        button1.setText(R.string.comme_d_hab);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.festivites_annulees);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail42();
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
        image.setImageResource(R.drawable.question);
        text.setText(R.string.vous_etes_sur);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

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
                fail43();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.vraiment);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success9();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail43();
            }
        });
    }

    public void success9() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.preuve);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success10();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail43();
            }
        });
    }

    public void success10() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.laisse_passer);
        button1.setText(R.string.pas_trop_tot);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success11();
            }
        });
    }

    public void success11() {
        image.setImageResource(R.drawable.chomage);
        text.setText(R.string.chomage);
        button1.setText(R.string.mesure_emploi);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.supprimer_pole_emploi);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail44();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success12();
            }
        });
    }

    public void success12() {
        image.setImageResource(R.drawable.pole);
        text.setText(R.string.pole_emploi);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success13();
            }
        });
    }

    public void success13() {
        image.setImageResource(R.drawable.money);
        text.setText(R.string.economies);
        button1.setText(R.string.depenaliser_cannabis);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.envahir_allemagne);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail46();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if (rand>=0.25){
                    success14();
                } else {
                    fail45();
                }
            }
        });
    }

    public void success14() {
        image.setImageResource(R.drawable.alle);
        text.setText(R.string.invasion_succes);
        button1.setText(R.string.imiter_merkel);
        button2.setText(R.string.envahir_scandinavie);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success15();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail47();
            }
        });
    }

    public void success15() {
        image.setImageResource(R.drawable.m18);
        text.setText(R.string.strip_tease);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success16();
            }
        });
    }

    public void success16() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.vacances_que_faites_vous);
        button1.setText(R.string.inviter_poutine);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.s_inviter_chez_poutine);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail48();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success17();
            }
        });
    }

    public void success17() {
        mitraille.start();
        image.setImageResource(R.drawable.helico);
        text.setText(R.string.mitraillette);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success18();
            }
        });
    }

    public void success18() {
        pol4.stop();
        applause.start();
        image.setImageResource(R.drawable.conrad);
        text.setText(R.string.maitre_du_monde);
        button1.setText(R.string.continuer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref4.edit();
                editor.putBoolean(getString(R.string.comp4),true);
                editor.apply();
                Intent intent = new Intent(Politic4.this,Politic5.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail(){
        setContentView(R.layout.fail_layout);
        pol4.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic4.this, Politic4.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic4.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail38(){
        initializeFail();
        imageFail.setImageResource(R.drawable.selfie);
        textFail.setText(R.string.revolte_selfie);
    }

    public void fail39(){
        initializeFail();
        imageFail.setImageResource(R.drawable.guillotine);
        textFail.setText(R.string.guillotine);
    }

    public void fail40(){
        initializeFail();
        imageFail.setImageResource(R.drawable.trump3);
        textFail.setText(R.string.trump3);
    }

    public void fail41(){
        initializeFail();
        imageFail.setImageResource(R.drawable.gliss);
        textFail.setText(R.string.glissade);
    }

    public void fail42(){
        initializeFail();
        imageFail.setImageResource(R.drawable.attent);
        textFail.setText(R.string.attentat);
    }

    public void fail43(){
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.perdu);
    }

    public void fail44(){
        initializeFail();
        imageFail.setImageResource(R.drawable.chom);
        textFail.setText(R.string.chomage_augmente);
    }

    public void fail45(){
        initializeFail();
        imageFail.setImageResource(R.drawable.merkel);
        textFail.setText(R.string.merkel);
    }

    public void fail46(){
        initializeFail();
        imageFail.setImageResource(R.drawable.cannabis);
        textFail.setText(R.string.population_drogue);
    }

    public void fail47(){
        initializeFail();
        imageFail.setImageResource(R.drawable.neige);
        textFail.setText(R.string.invasion_danemark);
    }

    public void fail48(){
        initializeFail();
        imageFail.setImageResource(R.drawable.poutin);
        textFail.setText(R.string.poutine);
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

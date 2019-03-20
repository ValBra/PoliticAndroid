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

public class Politic3 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
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
        pol3.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.ass);
        textTitle.setText(R.string.chap3_titre);
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
        image.setImageResource(R.drawable.maire);
        textTitle.setVisibility(View.GONE);
        text.setText(R.string.nouveau_maire);
        button1.setText(R.string.legislatives);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.reparer_egouts);

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
                fail18();
            }
        });
    }

    public void success1() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.que_faites_vous);
        button1.setText(R.string.petits_fours);
        button2.setText(R.string.salle_des_fetes);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail19();
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

    public void success2(){
        image.setImageResource(R.drawable.salle_des_fetes);
        text.setText(R.string.succes_reunion);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);

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
                fail20();
            }
        });
    }

    public void success3() {
        image.setImageResource(R.drawable.debat2);
        text.setText(R.string.adversaire_agressif);
        button1.setText(R.string.monopole_du_coeur);
        button2.setText(R.string.casse_toi);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail21();
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

    public void success4(){
        applause.start();

        image.setImageResource(R.drawable.assemble);
        text.setText(R.string.elu_depute);
        button1.setText(R.string.grosse_loi);
        button2.setText(R.string.grosse_bouffe);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.grosse_fete);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                fail22();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                fail23();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                success5();
            }
        });
    }

    public void success5() {
        image.setImageResource(R.drawable.lama);
        text.setText(R.string.lama);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success6();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.assemble);
        text.setText(R.string.que_faites_vous_maintenant);
        button1.setText(R.string.grosse_loi);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.grosse_bouffe);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.grosse_fete);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail24();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success7();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                boom.start();
                fail25();
                end.stop();
            }
        });
    }

    public void success7() {
        table.start();

        image.setImageResource(R.drawable.banquet);
        text.setText(R.string.cuisinier);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                table.stop();
                success8();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.assemble);
        text.setText(R.string.que_faites_vous_maintenant);
        button1.setText(R.string.grosse_loi);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.grosse_bouffe);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.grosse_fete);

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
                fail27();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                boom.start();
                fail26();
                end.stop();
            }
        });
    }

    public void success9() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.vous_etes_sur);
        button1.setText(R.string.oui);
        button2.setText(R.string.non);
        button3.setVisibility(View.GONE);

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
                fail28();
            }
        });
    }

    public void success10() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.loi_votee);
        button1.setText(R.string.inviter_hollande);
        button2.setText(R.string.ecrire_nouvelle_loi);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success11();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail29();
            }
        });
    }

    public void success11() {
        image.setImageResource(R.drawable.gouv);
        text.setText(R.string.ministre_budget);
        button1.setText(R.string.etre_exemplaire);
        button2.setText(R.string.se_servir);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail30();
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
        image.setImageResource(R.drawable.corrup);
        text.setText(R.string.premier_ministre);
        button1.setText(R.string.faire_semblant);
        button2.setText(R.string.se_presenter_presidentielles);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success13();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail31();
            }
        });
    }

    public void success13() {
        image.setImageResource(R.drawable.graph);
        text.setText(R.string.fin_crise);
        button1.setText(R.string.refaire_semblant);
        button2.setText(R.string.se_presenter_presidentielles);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success14();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail32();
            }
        });
    }

    public void success14() {
        image.setImageResource(R.drawable.graph);
        text.setText(R.string.puissance_mondiale);
        button1.setText(R.string.refaire_semblant);
        button2.setText(R.string.se_presenter_presidentielles);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail33();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success15();
            }
        });
    }

    public void success15() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.pour_votre_campagne_que_faites_vous);
        button1.setText(R.string.petits_fours);
        button2.setText(R.string.bar_tabac);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail34();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success16();
            }
        });
    }

    public void success16() {
        image.setImageResource(R.drawable.cope);
        text.setText(R.string.proximite_peuple);
        button1.setText(R.string.allez_les_bleus);
        button2.setText(R.string.luc_pere);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.centimes);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail35();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success17();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail36();
            }
        });
    }

    public void success17() {
        image.setImageResource(R.drawable.result3);
        text.setText(R.string.second_tour);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success18();
            }
        });
    }

    public void success18() {
        image.setImageResource(R.drawable.debatpres);
        text.setText(R.string.debat_entre_deux_tours);
        button1.setText(R.string.depenaliserons_cannabis);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.envahirons_allemagne);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success19();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail37();
            }
        });
    }

    public void success19() {
        applause.start();
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.victoire_presidentielle);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref3.edit();
                editor.putBoolean(getString(R.string.comp3),true);
                editor.apply();
                Intent intent = new Intent(Politic3.this,Politic4.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol3.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boom.stop();
                bouton.start();
                Intent intent = new Intent(Politic3.this, Politic3.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boom.stop();
                bouton.start();
                Intent intent = new Intent(Politic3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail18() {
        initializeFail();
        imageFail.setImageResource(R.drawable.egouts);
        textFail.setText(R.string.egouts_fail);
    }

    public void fail19() {
        initializeFail();
        imageFail.setImageResource(R.drawable.bercy);
        textFail.setText(R.string.bercy_fail);
    }

    public void fail20() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.absence_debat);
    }

    public void fail21() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.style_vieillot);
    }

    public void fail22() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.inconnu);
    }

    public void fail23() {
        initializeFail();
        imageFail.setImageResource(R.drawable.charcut);
        textFail.setText(R.string.charcuterie);
    }

    public void fail24() {
        initializeFail();
        imageFail.setImageResource(R.drawable.assemb);
        textFail.setText(R.string.apres_fiesta);
    }

    public void fail25() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo1);
        textFail.setText(R.string.soiree_degenere);
    }

    public void fail26() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo2);
        textFail.setText(R.string.soiree_degenere2);
    }

    public void fail27() {
        initializeFail();
        imageFail.setImageResource(R.drawable.canard);
        textFail.setText(R.string.canard);
    }

    public void fail28() {
        initializeFail();
        imageFail.setImageResource(R.drawable.oppos);
        textFail.setText(R.string.opposition);
    }

    public void fail29() {
        initializeFail();
        imageFail.setImageResource(R.drawable.oppos);
        textFail.setText(R.string.post_it);
    }

    public void fail30() {
        initializeFail();
        imageFail.setImageResource(R.drawable.trump);
        textFail.setText(R.string.remaniment_suivant);
    }

    public void fail31() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.fail_parrainnages);
    }

    public void fail32() {
        initializeFail();
        imageFail.setImageResource(R.drawable.evasio);
        textFail.setText(R.string.evasion_fiscale);
    }

    public void fail33() {
        initializeFail();
        imageFail.setImageResource(R.drawable.coupdetat);
        textFail.setText(R.string.france_tiers_monde);
    }

    public void fail34() {
        initializeFail();
        imageFail.setImageResource(R.drawable.result1);
        textFail.setText(R.string.derriere_bayrou);
    }

    public void fail35() {
        initializeFail();
        imageFail.setImageResource(R.drawable.result2);
        textFail.setText(R.string.hors_sujet);
    }

    public void fail36() {
        initializeFail();
        imageFail.setImageResource(R.drawable.result1);
        textFail.setText(R.string.jfcope);
    }

    public void fail37() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.defaite_presidentielle);
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

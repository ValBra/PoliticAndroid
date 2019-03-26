package brable.polit;

import android.content.Intent;
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

public class Politic8 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
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

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.explo3);
        textTitle.setText(R.string.chap8_titre);
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
        image.setImageResource(R.drawable.master);
        text.setText(R.string.maitre_univers);
        button1.setText(R.string.voler_velo);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.continuer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail66();
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
        image.setImageResource(R.drawable.multiv);
        text.setText(R.string.univers_vous_appartient);
        button1.setText(R.string.sortir_univers);
        button2.setText(R.string.rester_univers);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail67();
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
        image.setImageResource(R.drawable.vaisseau);
        text.setText(R.string.vaisseau_protege);
        button1.setText(R.string.sortir_univers);
        button2.setText(R.string.rester_univers);

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
                fail68();
            }
        });
    }

    public void success3() {
        image.setImageResource(R.drawable.multiv);
        text.setText(R.string.univers_voisin);
        button1.setText(R.string.conquerir_planetes);
        button2.setText(R.string.se_balader);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail69();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if (rand>=0.3){
                    success4();
                } else {
                    fail70();
                }
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.zombi);
        text.setText(R.string.planete_zombies_gentils);
        button1.setText(R.string.une_autochtone);
        button2.setText(R.string.un_autochtone);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail71();
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
        image.setImageResource(R.drawable.zombie);
        text.setText(R.string.jean_goitre);
        button1.setText(R.string.faire_enfants);
        button2.setText(R.string.divorcer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success6();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail72();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.enfant);
        text.setText(R.string.pere);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success7();
            }
        });
    }

    public void success7() {
        image.setImageResource(R.drawable.poli);
        text.setText(R.string.politique_universelle);
        button1.setText(R.string.se_porter_candidat);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.putsch);

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
                fail73();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.poli);
        text.setText(R.string.promesses_campagne);
        button1.setText(R.string.tuons_jm);
        button2.setText(R.string.tuons_zombis_mechants);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.tuons_heteros);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=1;
                success9();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=2;
                success9();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success9();
            }
        });
    }

    public void success9() {
        text.setText(R.string.nouvelles_promesses);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=1;
                success10();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                indice+=2;
                success10();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success10();
            }
        });
    }

    public void success10() {
        image.setImageResource(R.drawable.elec);
        text.setText(R.string.soir_election);
        button1.setText(R.string.voir_resultats);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                if(indice==3){
                    applause.start();
                    success11();
                } else {
                    fail79();
                }
            }
        });
    }

    public void success11() {
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.premiere_mesure_2);
        button1.setText(R.string.tuer_jm);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.tuer_zombies_mechants);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                fail74();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                success12();
            }
        });
    }

    public void success12() {
        image.setImageResource(R.drawable.paix);
        text.setText(R.string.paix);
        button1.setText(R.string.tuer_jm);
        button2.setText(R.string.faire_semblant);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                pol8.stop();
                epic.start();
                success13();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail75();
            }
        });
    }

    public void success13() {
        image.setImageResource(R.drawable.voy);
        text.setText(R.string.localise_jm);
        button1.setText(R.string.envahir);
        button2.setText(R.string.infiltrer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                epic.stop();
                epic2.start();
                success14();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                epic.stop();
                fail76();
            }
        });
    }

    public void success14() {
        image.setImageResource(R.drawable.guerregal);
        text.setText(R.string.bataille_rage);
        button1.setText(R.string.appeler_pluton);
        button2.setText(R.string.appeler_jupiter);

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
                epic2.stop();
                fail77();
            }
        });
    }

    public void success15() {
        image.setImageResource(R.drawable.jm);
        text.setText(R.string.face_a_face_jm);
        button1.setText(R.string.attaquer);
        button2.setText(R.string.attaquer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                epic2.stop();
                double rand = Math.random();
                if (rand>=0.5){
                    success16();
                } else {
                    fail78();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                epic2.stop();
                double rand = Math.random();
                if (rand>=0.5){
                    success16();
                } else {
                    fail78();
                }
            }
        });
    }

    public void success16() {
        win.start();
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.maitre_multivers);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success17();
            }
        });
    }

    public void success17() {
        win.stop();
        suspens.start();
        image.setImageResource(R.drawable.wait);
        text.setText(R.string.que_pasa);
        button1.setText(R.string.nooon);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic8.this, Politic1.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol8.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic8.this, Politic8.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic8.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail66() {
        initializeFail();
        imageFail.setImageResource(R.drawable.velo);
        textFail.setText(R.string.ecrase_voiture);
    }

    public void fail67() {
        initializeFail();
        imageFail.setImageResource(R.drawable.vaisseau2);
        textFail.setText(R.string.changement_physique);
    }

    public void fail68() {
        initializeFail();
        imageFail.setImageResource(R.drawable.revolution);
        textFail.setText(R.string.univers_revolte);
    }

    public void fail69() {
        initializeFail();
        imageFail.setImageResource(R.drawable.jm);
        textFail.setText(R.string.mort_planete_jm);
    }

    public void fail70() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.larves_nucleaires);
    }

    public void fail71() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.indecence);
    }

    public void fail72() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.divorce_interdit);
    }

    public void fail73() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.putsch_reprime);
    }

    public void fail74() {
        initializeFail();
        imageFail.setImageResource(R.drawable.banane);
        textFail.setText(R.string.banane);
    }

    public void fail75() {
        initializeFail();
        imageFail.setImageResource(R.drawable.revolution);
        textFail.setText(R.string.revolte_inaction);
    }

    public void fail76() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.atroces_souffrances);
    }

    public void fail77() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.andouille);
    }

    public void fail78() {
        initializeFail();
        imageFail.setImageResource(R.drawable.tombe);
        textFail.setText(R.string.jm_esquive);
    }

    public void fail79() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.quitte_vie_politique);
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

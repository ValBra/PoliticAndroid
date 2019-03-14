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

public class Politic2 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
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
        pol2.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.jm);
        textTitle.setText(R.string.chap2_titre);
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
        image.setImageResource(R.drawable.mairie);
        textTitle.setVisibility(View.GONE);
        text.setText(R.string.few_years_later);
        button1.setText(R.string.sympathiser_avec_un_candidat);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.partir_loin);

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
                fail9();
            }
        });
    }

    public void success1() {
        image.setImageResource(R.drawable.serrage);
        text.setText(R.string.vous_devenez_conseiller);
        button1.setText(R.string.organisons_un_discours);
        button2.setText(R.string.organisons_un_d_bat);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.attendons_epuisent);

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
                fail10();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail10();
            }
        });
    }

    public void success2() {
        image.setImageResource(R.drawable.discours);
        text.setText(R.string.discours_succes);
        button1.setText(R.string.organisons_un_d_bat);
        button2.setText(R.string.attendons_epuisent);
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
                fail10();
            }
        });
    }

    public void success3() {
        image.setImageResource(R.drawable.elections);
        text.setText(R.string.debat_succes);
        button1.setText(R.string.voir_resultats);
        button2.setText(R.string.appeler_police);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail10();
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
        image.setImageResource(R.drawable.police);
        text.setText(R.string.prostituees_mineures);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        police.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                police.stop();
                success5();
            }
        });
    }

    public void success5() {
        image.setImageResource(R.drawable.quimby);
        text.setText(R.string.conseiller_maire);
        button1.setText(R.string.construire_ecole);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.construire_piscine);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail11();
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
        image.setImageResource(R.drawable.piscine);
        text.setText(R.string.piscine_regain_interet);
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
        image.setImageResource(R.drawable.sport);
        text.setText(R.string.position_investissement);
        button1.setText(R.string.investir_foot);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.investir_rugby);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail12();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success8();
            }
        });
    }

    public void success8() {
        image.setImageResource(R.drawable.rugby);
        text.setText(R.string.rugby_champion);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success9();
            }
        });
    }

    public void success9() {
        image.setImageResource(R.drawable.elec);
        text.setText(R.string.temps_passe);
        button1.setText(R.string.marre_sous_fifre);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.fidele_candidat);

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
                fail13();
            }
        });
    }

    public void success10() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.pour_votre_campagne_que_faites_vous);
        button1.setText(R.string.discours);
        button2.setText(R.string.debat);
        button3.setVisibility(View.VISIBLE);
        button3.setText(R.string.soiree_paillarde);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail14();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                success11();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail15();
            }
        });
    }

    public void success11() {
        image.setImageResource(R.drawable.accus);
        text.setText(R.string.accusation);
        button1.setText(R.string.connard);
        button2.setText(R.string.enfoir);
        button3.setText(R.string.alcoolique);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if(rand>=0.33){
                    success12();
                } else {
                    fail17();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail17();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail17();
            }
        });
    }

    public void success12() {
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.debat_succes2);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);

        applause.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                success13();
            }
        });
    }

    public void success13() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.sondage_perdant);
        button1.setText(R.string.discours);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.soiree_paillarde);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail14();
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
        image.setImageResource(R.drawable.elections);
        text.setText(R.string.soir_election_municipale);
        button1.setText(R.string.voir_resultats);
        button2.setText(R.string.renoncer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if(rand>=0.33){
                    success16();
                } else {
                    fail79();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail16();
            }
        });
    }

    public void success16() {
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.felicitations_maire);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        applause.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                pol2.stop();

                SharedPreferences.Editor editor = pref2.edit();
                editor.putBoolean(getString(R.string.comp2),true);
                editor.apply();

                Intent intent = new Intent(Politic2.this,Politic3.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol2.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic2.this, Politic2.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail9() {
        initializeFail();
        imageFail.setImageResource(R.drawable.passeport);
        textFail.setText(R.string.complexe_demarches);
    }

    public void fail10() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.vingt_et_un);
    }

    public void fail11() {
        initializeFail();
        imageFail.setImageResource(R.drawable.inond);
        textFail.setText(R.string.inondation_ecole);
    }

    public void fail12() {
        initializeFail();
        imageFail.setImageResource(R.drawable.poing);
        textFail.setText(R.string.coup_de_poing);
    }

    public void fail13() {
        initializeFail();
        imageFail.setImageResource(R.drawable.trump);
        textFail.setText(R.string.licenciement);
    }

    public void fail14() {
        initializeFail();
        imageFail.setImageResource(R.drawable.disc2);
        textFail.setText(R.string.charisme_arrosoir);
    }

    public void fail15() {
        initializeFail();
        imageFail.setImageResource(R.drawable.m18);
        textFail.setText(R.string.choque_paillarde);
    }

    public void fail16() {
        initializeFail();
        imageFail.setImageResource(R.drawable.jm);
        textFail.setText(R.string.renoncement);
    }

    public void fail17() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.electeurs_peu_convaincus);
    }

    public void fail79() {
        initializeFail();
        imageFail.setImageResource(R.drawable.looser);
        textFail.setText(R.string.perdez_election);
    }

    /*protected void onCreate(Bundle savedInstanceState) {
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
    }*/

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

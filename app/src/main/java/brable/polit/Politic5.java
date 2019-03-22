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

public class Politic5 extends AppCompatActivity {
    ImageView image, imageFail;
    TextView textTitle,text, textFail;
    Button button1,button2,button3, buttonRejouer,buttonMenu;
    MediaPlayer bouton;
    MediaPlayer pol5;
    MediaPlayer end;
    MediaPlayer applause;
    private static final String TAG = "MainActivity";
    public static final String PREFS5 = "comp5";
    public static SharedPreferences pref5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pref5 = getBaseContext().getSharedPreferences(PREFS5,MODE_PRIVATE);

        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
        end = MediaPlayer.create(this,R.raw.endofthegame);
        applause = MediaPlayer.create(this,R.raw.applause);
        bouton = MediaPlayer.create(this,R.raw.sbouton);
        pol5 = MediaPlayer.create(this,R.raw.politic5);
        pol5.setLooping(true);

        setContentView(R.layout.question_layout);
        image = (ImageView) findViewById(R.id.image_question);
        textTitle = (TextView) findViewById(R.id.textTitle);
        text = (TextView) findViewById(R.id.text_question);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        image.setImageResource(R.drawable.lune);
        textTitle.setText(R.string.chap5_titre);
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
        image.setImageResource(R.drawable.question);
        text.setText(R.string.maintenant_que_maitre_du_monde);
        button1.setText(R.string.eliminer_opposants_politiques);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.partir_espace);

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
                fail49();
            }
        });
    }

    public void success1() {
        image.setImageResource(R.drawable.question);
        text.setText(R.string.tranquille);
        button1.setText(R.string.devenir_dictateur);
        button2.setText(R.string.reprendre_etudes);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail50();
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
        image.setImageResource(R.drawable.diplom);
        text.setText(R.string.doctorat);
        button1.setText(R.string.lancer_programme_spatial);
        button2.setText(R.string.partir_vacances);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail51();
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
        image.setImageResource(R.drawable.danse);
        text.setText(R.string.danse_club);
        button1.setText(R.string.lancer_programme_spatial);
        button2.setText(R.string.augmenter_impots);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail51();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if(rand>=0.3){
                    success4();
                } else {
                    fail32();
                }
            }
        });
    }

    public void success4() {
        image.setImageResource(R.drawable.money);
        text.setText(R.string.plusieurs_milliards);
        button1.setText(R.string.lancer_programme_spatial);
        button2.setText(R.string.acheter_apple);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail51();
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
        image.setImageResource(R.drawable.money);
        text.setText(R.string.bon_invest);
        button1.setText(R.string.lancer_programme_spatial);
        button2.setText(R.string.regarder_mars_attack);

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
                fail52();
            }
        });
    }

    public void success6() {
        image.setImageResource(R.drawable.ariane);
        text.setText(R.string.vous_lancez_prog_spatial);
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
        image.setImageResource(R.drawable.mars);
        text.setText(R.string.arrivee_mars);
        button1.setText(R.string.ouvrir_canal_diplomatique);
        button2.setVisibility(View.VISIBLE);
        button2.setText(R.string.envahir_mars);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                fail54();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                double rand = Math.random();
                if(rand>=0.3){
                    success8();
                } else {
                    fail53();
                }
            }
        });
    }

    public void success8() {
        applause.start();
        image.setImageResource(R.drawable.hollande);
        text.setText(R.string.eliminer_martiens);
        button1.setText(R.string.continuer);
        button2.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                applause.stop();
                SharedPreferences.Editor editor = pref5.edit();
                editor.putBoolean(getString(R.string.comp5),true);
                editor.apply();
                Intent intent = new Intent(Politic5.this,Politic6.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void initializeFail() {
        setContentView(R.layout.fail_layout);

        pol5.stop();
        end.start();

        imageFail = (ImageView) findViewById(R.id.image_fail);
        textFail = (TextView) findViewById(R.id.text_fail);
        buttonRejouer = (Button) findViewById(R.id.button_rejouer);
        buttonMenu = (Button) findViewById(R.id.button_menu);

        buttonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic5.this, Politic5.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bouton.start();
                Intent intent = new Intent(Politic5.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void fail32() {
        initializeFail();
        imageFail.setImageResource(R.drawable.evasio);
        textFail.setText(R.string.evasion_fiscale);
    }

    public void fail49() {
        initializeFail();
        imageFail.setImageResource(R.drawable.vaisseau);
        textFail.setText(R.string.vaisseau_foireux);
    }

    public void fail50() {
        initializeFail();
        imageFail.setImageResource(R.drawable.dictat);
        textFail.setText(R.string.prise_de_conscience);
    }

    public void fail51() {
        initializeFail();
        imageFail.setImageResource(R.drawable.nomoney);
        textFail.setText(R.string.no_money);
    }

    public void fail52() {
        initializeFail();
        imageFail.setImageResource(R.drawable.fou);
        textFail.setText(R.string.paranoia);
    }

    public void fail53() {
        initializeFail();
        imageFail.setImageResource(R.drawable.explo2);
        textFail.setText(R.string.autodestruction_vaisseau);
    }

    public void fail54() {
        initializeFail();
        imageFail.setImageResource(R.drawable.media);
        textFail.setText(R.string.represailles);
    }

    protected void onPause(){
        super.onPause();
        pol5.stop();
        applause.stop();
    }

    protected void onResume(){
        super.onResume();
        pol5.start();
    }
}

package brable.polit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by BRABLE on 19/04/2017.
 */

public class Apropos extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apropos);
        Button boutonx22 = (Button) findViewById(R.id.buttonx22);
        boutonx22.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {

                Intent intent2 = new Intent(Apropos.this, MainActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}

package passwordmanager.myapp.yacine.passwordmanager.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.UUID;

import passwordmanager.myapp.yacine.passwordmanager.R;
import passwordmanager.myapp.yacine.passwordmanager.utils.RandomToken;

/**
 * Created by Yacine on 31/07/16.
 */
public class FirstStepActivity extends AppCompatActivity {

    private EditText token;
    private Button nextstep;
    private Button generateToken;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_one);
        token = (EditText) findViewById(R.id.token);
        nextstep = (Button) findViewById(R.id.next_step);
        generateToken = (Button) findViewById(R.id.gentoken);
        clear = (Button) findViewById(R.id.clear);


        generateToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("First Step",token.getText().toString());
                String uuid = UUID.randomUUID().toString();
                 token.setText(uuid);
            }
        });
        nextstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(token.getText().length()==0 || token.getText().length()<10){
                   Toast.makeText(getApplicationContext(),"Veuillez saisir un token (de plus de 10 caractères)",Toast.LENGTH_SHORT).show();
               }
                else {
                   //next step
               }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                token.setText("");
            }
        });



    }
}

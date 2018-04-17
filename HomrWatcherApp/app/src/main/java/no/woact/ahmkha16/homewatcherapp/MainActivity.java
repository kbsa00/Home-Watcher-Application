package no.woact.ahmkha16.homewatcherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import io.particle.android.sdk.cloud.ParticleCloudSDK;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEdittext, passordEdittext;
    private Button logInBtn;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ParticleCloudSDK.init(this);

        userNameEdittext = findViewById(R.id.usernameedittxt);
        passordEdittext = findViewById(R.id.passwordedittext);
        logInBtn = findViewById(R.id.logginbtn);


        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!userNameEdittext.getText().toString().isEmpty() && !passordEdittext.getText().toString().isEmpty()){

                    UserInformation userInformation = new UserInformation(userNameEdittext.getText().toString(),
                            passordEdittext.getText().toString());
                    Controller controller = new Controller(userInformation, getApplicationContext());
                    controller.execute();

                }


            }
        });

    }

}

package no.woact.ahmkha16.homewatcherapp;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import io.particle.android.sdk.cloud.ParticleCloudException;
import io.particle.android.sdk.cloud.ParticleCloudSDK;

/**
 * Created by Eier on 4/17/2018.
 */

public class Controller extends AsyncTask<Void, Void, String> {

    private UserInformation userInformation;
    private Context context;

    public Controller(UserInformation user, Context context){
        userInformation = user;
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... voids) {

        try {
            ParticleCloudSDK.getCloud().logIn(userInformation.getUsername(), userInformation.getPassword());
            return "LOGGED IN";
        } catch (ParticleCloudException e) {
            e.printStackTrace();
            return "ERROR LOGGING INN";
        }

    }


    protected void onPostExecute(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}

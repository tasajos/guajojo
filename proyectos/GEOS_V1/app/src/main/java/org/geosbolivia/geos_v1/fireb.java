package org.geosbolivia.geos_v1;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import  com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by Carlos Azcarraga on 29/1/2018.
 */

public class fireb extends FirebaseInstanceIdService {

    String TAG = "prueba";
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken);
    }
}

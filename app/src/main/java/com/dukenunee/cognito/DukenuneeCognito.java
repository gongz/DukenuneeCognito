package com.dukenunee.cognito;

import android.content.Context;

import com.dukenunee.cognito.Model.DCError;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

/**
 * Created by Archer Zhang on 4/7/15.
 */

public class DukenuneeCognito {
    private final static DukenuneeCognito mInstance = new DukenuneeCognito();
    private Context mAppContext;
    private DukenuneeCognito(){

    }

    public static DukenuneeCognito getInstance(){
        return mInstance;
    }

    public void initAppContext(Context context) throws DCError {
        if(context==null){
            throw new DCError("context should not be null");
        }
        mAppContext = context.getApplicationContext();
    }

    public CognitoCachingCredentialsProvider getCognitoProvider(Context context){
        CognitoCachingCredentialsProvider cognitoProvider = new CognitoCachingCredentialsProvider(
                context,    // get the context for the current activity
                "COGNITO_IDENTITY_POOL",    /* Identity Pool ID */
                Regions.US_EAST_1           /* Region */
        );
        return cognitoProvider;
    }


}


package com.customerio.javasample;

import android.app.Application;

import com.google.firebase.FirebaseApp;

import io.customer.messagingpush.ModuleMessagingPushFCM;
import io.customer.sdk.CustomerIO;
import io.customer.sdk.util.CioLogLevel;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        CustomerIO.Builder builder = new CustomerIO.Builder(
                "site-id",
                "api-key",
                this
        );
        builder.addCustomerIOModule(new ModuleMessagingPushFCM());
        builder.setLogLevel(CioLogLevel.DEBUG);
        builder.build();
    }
}

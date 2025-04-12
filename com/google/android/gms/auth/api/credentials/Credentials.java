/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.auth.api.credentials.CredentialsOptions;

public class Credentials {
    public static CredentialsClient getClient(Activity activity) {
        CredentialsOptions credentialsOptions = CredentialsOptions.DEFAULT;
        CredentialsClient credentialsClient = new CredentialsClient(activity, (Auth$AuthCredentialsOptions)credentialsOptions);
        return credentialsClient;
    }

    public static CredentialsClient getClient(Activity activity, CredentialsOptions credentialsOptions) {
        CredentialsClient credentialsClient = new CredentialsClient(activity, (Auth$AuthCredentialsOptions)credentialsOptions);
        return credentialsClient;
    }

    public static CredentialsClient getClient(Context context) {
        CredentialsOptions credentialsOptions = CredentialsOptions.DEFAULT;
        CredentialsClient credentialsClient = new CredentialsClient(context, (Auth$AuthCredentialsOptions)credentialsOptions);
        return credentialsClient;
    }

    public static CredentialsClient getClient(Context context, CredentialsOptions credentialsOptions) {
        CredentialsClient credentialsClient = new CredentialsClient(context, (Auth$AuthCredentialsOptions)credentialsOptions);
        return credentialsClient;
    }
}


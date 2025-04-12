/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.identity.AuthorizationClient;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.zbb;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.auth.api.identity.zbh;
import com.google.android.gms.auth.api.identity.zbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbaq;
import com.google.android.gms.internal.auth-api.zbaw;
import com.google.android.gms.internal.auth-api.zbbg;

public final class Identity {
    private Identity() {
    }

    public static AuthorizationClient getAuthorizationClient(Activity activity) {
        activity = (Activity)Preconditions.checkNotNull(activity);
        Object object = new zbb(null);
        object = ((zbb)object).zbb();
        zbaq zbaq2 = new zbaq(activity, (zbc)object);
        return zbaq2;
    }

    public static AuthorizationClient getAuthorizationClient(Context context) {
        context = (Context)Preconditions.checkNotNull(context);
        Object object = new zbb(null);
        object = ((zbb)object).zbb();
        zbaq zbaq2 = new zbaq(context, (zbc)object);
        return zbaq2;
    }

    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        activity = (Activity)Preconditions.checkNotNull(activity);
        zbh zbh2 = new zbh();
        zbaw zbaw2 = new zbaw(activity, zbh2);
        return zbaw2;
    }

    public static CredentialSavingClient getCredentialSavingClient(Context context) {
        context = (Context)Preconditions.checkNotNull(context);
        zbh zbh2 = new zbh();
        zbaw zbaw2 = new zbaw(context, zbh2);
        return zbaw2;
    }

    public static SignInClient getSignInClient(Activity activity) {
        activity = (Activity)Preconditions.checkNotNull(activity);
        zbu zbu2 = new zbu();
        zbbg zbbg2 = new zbbg(activity, zbu2);
        return zbbg2;
    }

    public static SignInClient getSignInClient(Context context) {
        context = (Context)Preconditions.checkNotNull(context);
        zbu zbu2 = new zbu();
        zbbg zbbg2 = new zbbg(context, zbu2);
        return zbbg2;
    }
}


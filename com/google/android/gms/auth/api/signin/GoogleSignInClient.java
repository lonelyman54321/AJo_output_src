/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.auth.api.signin.zbb;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

public class GoogleSignInClient
extends GoogleApi {
    static int zba;
    private static final zbb zbb;

    static {
        zbb zbb2;
        zbb = zbb2 = new zbb(null);
        zba = 1;
    }

    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        Api api = Auth.GOOGLE_SIGN_IN_API;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(activity, api, (Api$ApiOptions)googleSignInOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        Api api = Auth.GOOGLE_SIGN_IN_API;
        Object object = new GoogleApi$Settings$Builder();
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        object = ((GoogleApi$Settings$Builder)object).setMapper(apiExceptionMapper).build();
        super(context, api, (Api$ApiOptions)googleSignInOptions, (GoogleApi$Settings)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int zba() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                int n3;
                try {
                    n3 = zba;
                    int n4 = 1;
                    if (n3 == n4) {
                        Context context = this.getApplicationContext();
                        Object object = GoogleApiAvailability.getInstance();
                        int n7 = 12451000;
                        zba = (n7 = ((GoogleApiAvailability)object).isGooglePlayServicesAvailable(context, n7)) == 0 ? (n3 = 4) : ((object = ((GoogleApiAvailability)object).getErrorResolutionIntent(context, n7, null)) == null && (n3 = DynamiteModule.getLocalVersion(context, (String)(object = "com.google.android.gms.auth.api.fallback"))) != 0 ? (n3 = 3) : (n3 = 2));
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return n3;
            }
            throw throwable2;
        }
    }

    public Intent getSignInIntent() {
        Context context = this.getApplicationContext();
        int n3 = this.zba();
        int n4 = n3 + -1;
        if (n3 != 0) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)this.getApiOptions();
                    return zbm.zbb(context, googleSignInOptions);
                }
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)this.getApiOptions();
                return zbm.zbc(context, googleSignInOptions);
            }
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)this.getApiOptions();
            return zbm.zba(context, googleSignInOptions);
        }
        throw null;
    }

    public Task revokeAccess() {
        int n3;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        Context context = this.getApplicationContext();
        int n4 = this.zba();
        n4 = n4 == (n3 = 3) ? 1 : 0;
        return PendingResultUtil.toVoidTask(zbm.zbf(googleApiClient, context, n4 != 0));
    }

    public Task signOut() {
        int n3;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        Context context = this.getApplicationContext();
        int n4 = this.zba();
        n4 = n4 == (n3 = 3) ? 1 : 0;
        return PendingResultUtil.toVoidTask(zbm.zbg(googleApiClient, context, n4 != 0));
    }

    public Task silentSignIn() {
        int n3;
        Object object = this.asGoogleApiClient();
        Object object2 = this.getApplicationContext();
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)this.getApiOptions();
        int n4 = this.zba();
        n4 = n4 == (n3 = 3) ? 1 : 0;
        object = zbm.zbe((GoogleApiClient)object, object2, googleSignInOptions, n4 != 0);
        object2 = zbb;
        return PendingResultUtil.toTask((PendingResult)object, (PendingResultUtil$ResultConverter)object2);
    }
}


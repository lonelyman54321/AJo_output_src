/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zacq;
import com.google.android.gms.common.api.internal.zacr;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

public final class zact
extends zac
implements GoogleApiClient$ConnectionCallbacks,
GoogleApiClient$OnConnectionFailedListener {
    private static final Api$AbstractClientBuilder zaa = com.google.android.gms.signin.zad.zac;
    private final Context zab;
    private final Handler zac;
    private final Api$AbstractClientBuilder zad;
    private final Set zae;
    private final ClientSettings zaf;
    private zae zag;
    private zacs zah;

    public zact(Context object, Handler handler, ClientSettings clientSettings) {
        Api$AbstractClientBuilder api$AbstractClientBuilder = zaa;
        this.zab = object;
        this.zac = handler;
        object = (ClientSettings)Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zaf = object;
        object = clientSettings.getRequiredScopes();
        this.zae = object;
        this.zad = api$AbstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ zacs zac(zact zact2) {
        return zact2.zah;
    }

    public static /* bridge */ /* synthetic */ void zad(zact zact2, zak object) {
        Object object2 = ((zak)object).zaa();
        boolean bl2 = ((ConnectionResult)object2).isSuccess();
        if (bl2) {
            object2 = ((zav)(object = (zav)Preconditions.checkNotNull(((zak)object).zab()))).zaa();
            bl2 = ((ConnectionResult)object2).isSuccess();
            if (!bl2) {
                object = String.valueOf(object2);
                Exception exception = new Exception();
                object = "Sign-in succeeded with resolve account failure: ".concat((String)object);
                Log.wtf((String)"SignInCoordinator", (String)object, (Throwable)exception);
                zact2.zah.zae((ConnectionResult)object2);
                zact2.zag.disconnect();
                return;
            }
            object2 = zact2.zah;
            object = ((zav)object).zab();
            Set set = zact2.zae;
            object2.zaf((IAccountAccessor)object, set);
        } else {
            object = zact2.zah;
            object.zae((ConnectionResult)object2);
        }
        zact2.zag.disconnect();
    }

    public final void onConnected(Bundle bundle) {
        this.zag.zad(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    public final void onConnectionSuspended(int n3) {
        this.zah.zag(n3);
    }

    public final void zab(zak zak2) {
        zacr zacr2 = new zacr(this, zak2);
        this.zac.post((Runnable)zacr2);
    }

    public final void zae(zacs object) {
        boolean bl2;
        Object object2 = this.zag;
        if (object2 != null) {
            object2.disconnect();
        }
        object2 = this.zaf;
        int n3 = System.identityHashCode(this);
        Integer n4 = n3;
        ((ClientSettings)object2).zae(n4);
        Api$AbstractClientBuilder api$AbstractClientBuilder = this.zad;
        Context context = this.zab;
        object2 = this.zac;
        ClientSettings clientSettings = this.zaf;
        Looper looper = object2.getLooper();
        SignInOptions signInOptions = clientSettings.zaa();
        this.zag = object2 = api$AbstractClientBuilder.buildClient(context, looper, clientSettings, (Object)signInOptions, this, this);
        this.zah = object;
        object = this.zae;
        if (object != null && !(bl2 = object.isEmpty())) {
            this.zag.zab();
            return;
        }
        object = this.zac;
        object2 = new zacq(this);
        object.post((Runnable)object2);
    }

    public final void zaf() {
        zae zae2 = this.zag;
        if (zae2 != null) {
            zae2.disconnect();
        }
    }
}


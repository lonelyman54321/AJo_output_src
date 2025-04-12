/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabt;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

final class zabu
implements BaseGmsClient$ConnectionProgressReportCallbacks,
zacs {
    final /* synthetic */ GoogleApiManager zaa;
    private final Api$Client zab;
    private final ApiKey zac;
    private IAccountAccessor zad = null;
    private Set zae = null;
    private boolean zaf = false;

    public zabu(GoogleApiManager googleApiManager, Api$Client api$Client, ApiKey apiKey) {
        this.zaa = googleApiManager;
        this.zab = api$Client;
        this.zac = apiKey;
    }

    public static /* bridge */ /* synthetic */ Api$Client zaa(zabu zabu2) {
        return zabu2.zab;
    }

    public static /* bridge */ /* synthetic */ ApiKey zab(zabu zabu2) {
        return zabu2.zac;
    }

    public static /* bridge */ /* synthetic */ void zac(zabu zabu2, boolean bl2) {
        zabu2.zaf = true;
    }

    public static /* bridge */ /* synthetic */ void zad(zabu zabu2) {
        zabu2.zah();
    }

    private final void zah() {
        IAccountAccessor iAccountAccessor;
        boolean bl2 = this.zaf;
        if (bl2 && (iAccountAccessor = this.zad) != null) {
            Api$Client api$Client = this.zab;
            Set set = this.zae;
            api$Client.getRemoteService(iAccountAccessor, set);
        }
    }

    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        Handler handler = GoogleApiManager.zad(this.zaa);
        zabt zabt2 = new zabt(this, connectionResult);
        handler.post((Runnable)zabt2);
    }

    public final void zae(ConnectionResult connectionResult) {
        Object object = GoogleApiManager.zar(this.zaa);
        ApiKey apiKey = this.zac;
        if ((object = (zabq)object.get(apiKey)) != null) {
            ((zabq)object).zas(connectionResult);
        }
    }

    public final void zaf(IAccountAccessor object, Set set) {
        if (object != null && set != null) {
            this.zad = object;
            this.zae = set;
            this.zah();
            return;
        }
        object = new Exception();
        Log.wtf((String)"GoogleApiManager", (String)"Received null response from onSignInSuccess", (Throwable)object);
        object = new ConnectionResult(4);
        this.zae((ConnectionResult)object);
    }

    public final void zag(int n3) {
        Object object = GoogleApiManager.zar(this.zaa);
        ApiKey apiKey = this.zac;
        if ((object = (zabq)object.get(apiKey)) != null) {
            boolean bl2 = zabq.zax((zabq)object);
            if (bl2) {
                ConnectionResult connectionResult = new ConnectionResult(17);
                ((zabq)object).zas(connectionResult);
                return;
            }
            ((zabq)object).onConnectionSuspended(n3);
        }
    }
}


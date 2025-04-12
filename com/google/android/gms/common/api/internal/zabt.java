/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabu;
import java.util.Set;

final class zabt
implements Runnable {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zabu zab;

    public zabt(zabu zabu2, ConnectionResult connectionResult) {
        this.zab = zabu2;
        this.zaa = connectionResult;
    }

    public final void run() {
        Object object = this.zab;
        Object object2 = GoogleApiManager.zar(((zabu)object).zaa);
        object = zabu.zab((zabu)object);
        if ((object = (zabq)object2.get(object)) == null) {
            return;
        }
        object2 = this.zaa;
        boolean bl2 = ((ConnectionResult)object2).isSuccess();
        if (bl2) {
            object2 = this.zab;
            boolean bl3 = true;
            zabu.zac((zabu)object2, bl3);
            object2 = zabu.zaa(this.zab);
            bl2 = object2.requiresSignIn();
            if (bl2) {
                zabu.zad(this.zab);
                return;
            }
            try {
                object2 = this.zab;
            }
            catch (SecurityException securityException) {
                zabu.zaa(this.zab).disconnect("Failed to get service from broker.");
                object2 = new ConnectionResult(10);
                ((zabq)object).zar((ConnectionResult)object2, null);
                return;
            }
            Api$Client api$Client = zabu.zaa((zabu)object2);
            object2 = zabu.zaa((zabu)object2);
            object2 = object2.getScopesForConnectionlessNonSignIn();
            api$Client.getRemoteService(null, (Set)object2);
            return;
        }
        object2 = this.zaa;
        ((zabq)object).zar((ConnectionResult)object2, null);
    }
}


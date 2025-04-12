/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.DeadObjectException
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.zaah;
import com.google.android.gms.common.api.internal.zaai;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabg;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zadc;
import com.google.android.gms.common.internal.Preconditions;

public final class zaaj
implements zabf {
    private final zabi zaa;
    private boolean zab = false;

    public zaaj(zabi zabi2) {
        this.zaa = zabi2;
    }

    public static /* bridge */ /* synthetic */ zabi zac(zaaj zaaj2) {
        return zaaj2.zaa;
    }

    public final BaseImplementation$ApiMethodImpl zaa(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zab(baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public final BaseImplementation$ApiMethodImpl zab(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        Object object;
        Object object2;
        block19: {
            object2 = this.zaa;
            object2 = ((zabi)object2).zag;
            object2 = ((zabe)object2).zai;
            ((zadc)object2).zaa(baseImplementation$ApiMethodImpl);
            object2 = this.zaa;
            object2 = ((zabi)object2).zag;
            object = baseImplementation$ApiMethodImpl.getClientKey();
            object2 = ((zabe)object2).zac;
            object2 = object2.get(object);
            object2 = (Api$Client)object2;
            object = "Appropriate Api was not requested.";
            Preconditions.checkNotNull(object2, object);
            int n3 = object2.isConnected();
            if (n3 != 0) break block19;
            object = this.zaa;
            object = ((zabi)object).zab;
            Api$AnyClientKey api$AnyClientKey = baseImplementation$ApiMethodImpl.getClientKey();
            n3 = object.containsKey(api$AnyClientKey);
            if (n3 == 0) break block19;
            n3 = 17;
            object2 = new Status(n3);
            baseImplementation$ApiMethodImpl.setFailedResult((Status)object2);
        }
        try {
            baseImplementation$ApiMethodImpl.run((Api$AnyClient)object2);
        }
        catch (DeadObjectException deadObjectException) {
            object2 = this.zaa;
            object = new zaah(this, this);
            ((zabi)object2).zal((zabg)object);
        }
        return baseImplementation$ApiMethodImpl;
    }

    public final void zad() {
    }

    public final void zae() {
        boolean bl2 = this.zab;
        if (bl2) {
            bl2 = false;
            this.zab = false;
            zabi zabi2 = this.zaa;
            zaai zaai2 = new zaai(this, this);
            zabi2.zal(zaai2);
        }
    }

    public final void zaf() {
        boolean bl2 = this.zab;
        if (bl2) {
            bl2 = false;
            this.zab = false;
            zadc zadc2 = this.zaa.zag.zai;
            zadc2.zab();
            this.zaj();
        }
    }

    public final void zag(Bundle bundle) {
    }

    public final void zah(ConnectionResult connectionResult, Api api, boolean bl2) {
    }

    public final void zai(int n3) {
        this.zaa.zak(null);
        boolean bl2 = this.zab;
        this.zaa.zah.zac(n3, bl2);
    }

    public final boolean zaj() {
        boolean bl2;
        boolean bl3 = this.zab;
        if (!bl3) {
            boolean bl4;
            Object object = this.zaa.zag.zah;
            bl2 = true;
            if (object != null && !(bl4 = object.isEmpty())) {
                this.zab = bl2;
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    zada zada2 = (zada)object.next();
                    zada2.zah();
                }
            }
        } else {
            return false;
        }
        this.zaa.zak(null);
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabi;
import java.util.Collections;

public final class zaax
implements zabf {
    private final zabi zaa;

    public zaax(zabi zabi2) {
        this.zaa = zabi2;
    }

    public final BaseImplementation$ApiMethodImpl zaa(BaseImplementation$ApiMethodImpl baseImplementation$ApiMethodImpl) {
        this.zaa.zag.zaa.add(baseImplementation$ApiMethodImpl);
        return baseImplementation$ApiMethodImpl;
    }

    public final BaseImplementation$ApiMethodImpl zab(BaseImplementation$ApiMethodImpl object) {
        object = new IllegalStateException("GoogleApiClient is not connected yet.");
        throw object;
    }

    public final void zad() {
        Object object;
        boolean bl2;
        Object object2 = this.zaa.zaa.values().iterator();
        while (bl2 = object2.hasNext()) {
            object = (Api$Client)object2.next();
            object.disconnect();
        }
        object2 = this.zaa.zag;
        ((zabe)object2).zad = object = Collections.emptySet();
    }

    public final void zae() {
        this.zaa.zaj();
    }

    public final void zag(Bundle bundle) {
    }

    public final void zah(ConnectionResult connectionResult, Api api, boolean bl2) {
    }

    public final void zai(int n3) {
    }

    public final boolean zaj() {
        return true;
    }
}


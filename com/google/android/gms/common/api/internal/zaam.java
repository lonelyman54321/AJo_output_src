/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaao;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabg;

final class zaam
extends zabg {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zaao zab;

    public zaam(zaao zaao2, zabf zabf2, ConnectionResult connectionResult) {
        this.zab = zaao2;
        this.zaa = connectionResult;
        super(zabf2);
    }

    public final void zaa() {
        zaaw zaaw2 = this.zab.zaa;
        ConnectionResult connectionResult = this.zaa;
        zaaw.zas(zaaw2, connectionResult);
    }
}


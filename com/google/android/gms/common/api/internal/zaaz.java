/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zaaz
implements GoogleApiClient$ConnectionCallbacks {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ StatusPendingResult zab;
    final /* synthetic */ zabe zac;

    public zaaz(zabe zabe2, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zac = zabe2;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }

    public final void onConnected(Bundle object) {
        object = (GoogleApiClient)Preconditions.checkNotNull((GoogleApiClient)this.zaa.get());
        StatusPendingResult statusPendingResult = this.zab;
        zabe.zah(this.zac, (GoogleApiClient)object, statusPendingResult, true);
    }

    public final void onConnectionSuspended(int n3) {
    }
}


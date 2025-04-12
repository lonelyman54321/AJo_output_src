/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zak;

final class zaj
implements GoogleApiClient$OnConnectionFailedListener {
    public final int zaa;
    public final GoogleApiClient zab;
    public final GoogleApiClient$OnConnectionFailedListener zac;
    final /* synthetic */ zak zad;

    public zaj(zak zak2, int n3, GoogleApiClient googleApiClient, GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zad = zak2;
        this.zaa = n3;
        this.zab = googleApiClient;
        this.zac = googleApiClient$OnConnectionFailedListener;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String string2 = String.valueOf(connectionResult);
        "beginFailureResolution for ".concat(string2);
        int n3 = this.zaa;
        this.zad.zah(connectionResult, n3);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

final class zabb
implements ResultCallback {
    final /* synthetic */ StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ GoogleApiClient zac;
    final /* synthetic */ zabe zad;

    public zabb(zabe zabe2, StatusPendingResult statusPendingResult, boolean bl2, GoogleApiClient googleApiClient) {
        this.zad = zabe2;
        this.zaa = statusPendingResult;
        this.zab = bl2;
        this.zac = googleApiClient;
    }
}


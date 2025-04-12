/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

final class zaba
implements GoogleApiClient$OnConnectionFailedListener {
    final /* synthetic */ StatusPendingResult zaa;

    public zaba(zabe zabe2, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    public final void onConnectionFailed(ConnectionResult abstractSafeParcelable) {
        abstractSafeParcelable = new Status(8);
        this.zaa.setResult((Result)((Object)abstractSafeParcelable));
    }
}


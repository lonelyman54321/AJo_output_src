/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;

final class zai
implements BaseGmsClient$BaseOnConnectionFailedListener {
    final /* synthetic */ OnConnectionFailedListener zaa;

    public zai(OnConnectionFailedListener onConnectionFailedListener) {
        this.zaa = onConnectionFailedListener;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zaa.onConnectionFailed(connectionResult);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.api.internal.zact;

final class zacq
implements Runnable {
    final /* synthetic */ zact zaa;

    public zacq(zact zact2) {
        this.zaa = zact2;
    }

    public final void run() {
        zacs zacs2 = zact.zac(this.zaa);
        ConnectionResult connectionResult = new ConnectionResult(4);
        zacs2.zae(connectionResult);
    }
}


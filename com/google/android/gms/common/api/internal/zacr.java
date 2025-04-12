/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.signin.internal.zak;

final class zacr
implements Runnable {
    final /* synthetic */ zak zaa;
    final /* synthetic */ zact zab;

    public zacr(zact zact2, zak zak2) {
        this.zab = zact2;
        this.zaa = zak2;
    }

    public final void run() {
        zact zact2 = this.zab;
        zak zak2 = this.zaa;
        zact.zad(zact2, zak2);
    }
}


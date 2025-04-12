/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zabq;

final class zabn
implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    public zabn(zabq zabq2, int n3) {
        this.zab = zabq2;
        this.zaa = n3;
    }

    public final void run() {
        zabq zabq2 = this.zab;
        int n3 = this.zaa;
        zabq.zak(zabq2, n3);
    }
}


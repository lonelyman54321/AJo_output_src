/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbc;
import com.google.android.gms.internal.clearcut.zzbi;
import com.google.android.gms.internal.clearcut.zzbn;

final class zzbg {
    private final byte[] buffer;
    private final zzbn zzfo;

    private zzbg(int n3) {
        Object object = new byte[n3];
        this.buffer = object;
        object = zzbn.zzc(object);
        this.zzfo = object;
    }

    public /* synthetic */ zzbg(int n3, zzbc zzbc2) {
        this(n3);
    }

    public final zzbb zzad() {
        Object object = this.zzfo;
        int n3 = ((zzbn)object).zzag();
        if (n3 == 0) {
            byte[] byArray = this.buffer;
            object = new zzbi(byArray);
            return object;
        }
        object = new IllegalStateException("Did not write as much data as expected.");
        throw object;
    }

    public final zzbn zzae() {
        return this.zzfo;
    }
}


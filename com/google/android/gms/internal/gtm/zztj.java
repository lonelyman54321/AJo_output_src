/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztf;
import com.google.android.gms.internal.gtm.zztl;

final class zztj
extends zztf {
    private final zztl zza;

    public zztj(zztl zztl2, int n3) {
        int n4 = zztl2.size();
        super(n4, n3);
        this.zza = zztl2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}


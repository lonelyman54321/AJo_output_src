/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwt;
import com.google.android.gms.internal.ads.zzfwu;

final class zzfwa
extends zzfwt {
    private String zza;
    private String zzb;

    public final zzfwt zza(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzfwt zzb(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzfwu zzc() {
        String string2 = this.zza;
        String string3 = this.zzb;
        zzfwc zzfwc2 = new zzfwc(string2, string3, null);
        return zzfwc2;
    }
}


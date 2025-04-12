/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzfwe;

final class zzfvr
extends zzfwd {
    private String zza;
    private String zzb;

    public final zzfwd zza(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzfwd zzb(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzfwe zzc() {
        String string2 = this.zza;
        String string3 = this.zzb;
        zzfvt zzfvt2 = new zzfvt(string2, string3, null);
        return zzfvt2;
    }
}


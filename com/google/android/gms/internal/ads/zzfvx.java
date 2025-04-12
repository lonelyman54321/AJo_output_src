/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvz;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwr;

final class zzfvx
extends zzfwq {
    private int zza;
    private String zzb;
    private byte zzc;

    public final zzfwq zza(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzfwq zzb(int n3) {
        this.zza = n3;
        this.zzc = 1;
        return this;
    }

    public final zzfwr zzc() {
        int n3 = this.zzc;
        int n4 = 1;
        if (n3 == n4) {
            n4 = this.zza;
            String string2 = this.zzb;
            zzfvz zzfvz2 = new zzfvz(n4, string2, null);
            return zzfvz2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Missing required properties: statusCode");
        throw illegalStateException;
    }
}


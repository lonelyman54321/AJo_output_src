/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzft;
import com.google.android.gms.internal.auth.zzfw;

final class zzgg
implements zzft {
    private final zzfw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzgg(zzfw object, String string2, Object[] objectArray) {
        int n3;
        this.zza = object;
        this.zzb = object = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        this.zzc = objectArray;
        int n4 = ((String)object).charAt(0);
        int n7 = 55296;
        if (n4 < n7) {
            this.zzd = n4;
            return;
        }
        n4 &= 0x1FFF;
        int n8 = 13;
        int n10 = 1;
        while (true) {
            int n14 = n10 + 1;
            if ((n10 = (int)((String)object).charAt(n10)) < n7) break;
            n10 = (n10 & 0x1FFF) << n8;
            n4 |= n10;
            n8 += 13;
            n10 = n14;
        }
        this.zzd = n3 = n10 << n8 | n4;
    }

    public final zzfw zza() {
        return this.zza;
    }

    public final boolean zzb() {
        int n3 = this.zzd;
        int n4 = 2;
        return (n3 &= n4) == n4;
    }

    public final int zzc() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) == n4) {
            return n4;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}


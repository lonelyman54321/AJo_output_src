/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

final class zzajt
implements zzajr {
    private final int zza;
    private final int zzb;
    private final zzfu zzc;

    public zzajt(zzajn object, zzan zzan2) {
        int n3;
        this.zzc = object = ((zzajn)object).zza;
        ((zzfu)object).zzK(12);
        int n4 = ((zzfu)object).zzp();
        CharSequence charSequence = zzan2.zzn;
        String string2 = "audio/raw";
        int n7 = string2.equals(charSequence);
        if (n7 != 0) {
            n7 = zzan2.zzC;
            int n8 = zzan2.zzA;
            n8 = zzgd.zzm(n7, n8);
            if (n4 == 0 || (n7 = n4 % n8) != 0) {
                super("Audio sample size mismatch. stsd sample size: ");
                ((StringBuilder)charSequence).append(n8);
                string2 = ", stsz sample size: ";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(n4);
                String string3 = ((StringBuilder)charSequence).toString();
                charSequence = "AtomParsers";
                zzfk.zzf((String)charSequence, string3);
                n4 = n8;
            }
        }
        if (n4 == 0) {
            n4 = -1;
        }
        this.zza = n4;
        this.zzb = n3 = ((zzfu)object).zzp();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int n3 = this.zza;
        int n4 = -1;
        if (n3 == n4) {
            zzfu zzfu2 = this.zzc;
            n3 = zzfu2.zzp();
        }
        return n3;
    }
}


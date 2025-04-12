/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.internal.ads.zzhy;
import com.google.android.gms.internal.ads.zzie;

public final class zzhk
implements zzha {
    private final zzhy zza;
    private zzie zzb;
    private String zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzhk() {
        int n3;
        zzhy zzhy2;
        this.zza = zzhy2 = new zzhy();
        this.zzd = n3 = 8000;
        this.zze = n3;
    }

    public final zzhk zzb(boolean bl2) {
        this.zzf = true;
        return this;
    }

    public final zzhk zzc(int n3) {
        this.zzd = n3;
        return this;
    }

    public final zzhk zzd(int n3) {
        this.zze = n3;
        return this;
    }

    public final zzhk zze(zzie zzie2) {
        this.zzb = zzie2;
        return this;
    }

    public final zzhk zzf(String string2) {
        this.zzc = string2;
        return this;
    }

    public final zzhp zzg() {
        zzhp zzhp2;
        String string2 = this.zzc;
        int n3 = this.zzd;
        int n4 = this.zze;
        boolean bl2 = this.zzf;
        zzhy zzhy2 = this.zza;
        Object object = zzhp2;
        zzhp2 = new zzhp(string2, n3, n4, bl2, zzhy2, null, false, null);
        object = this.zzb;
        if (object != null) {
            zzhp2.zzf((zzie)object);
        }
        return zzhp2;
    }
}


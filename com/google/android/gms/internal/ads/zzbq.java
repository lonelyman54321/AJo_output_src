/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;

public final class zzbq {
    public static final zzbq zza;
    public static final zzn zzb;
    private static final String zzf;
    private static final String zzg;
    private static final String zzh;
    public final Uri zzc = null;
    public final String zzd;
    public final Bundle zze = null;

    static {
        zzbq zzbq2;
        Object object = new zzbp();
        zza = zzbq2 = new zzbq((zzbp)object);
        int n3 = 36;
        zzf = Integer.toString(0, n3);
        zzg = Integer.toString(1, n3);
        zzh = Integer.toString(2, n3);
        zzb = object = new zzbo();
    }

    private zzbq(zzbp zzbp2) {
        this.zzd = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof zzbq;
        if (!bl3) {
            return false;
        }
        object = ((zzbq)object).zzc;
        boolean bl4 = false;
        object = null;
        bl3 = zzgd.zzG(null, null);
        if (bl3 && (bl4 = zzgd.zzG(null, null))) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}


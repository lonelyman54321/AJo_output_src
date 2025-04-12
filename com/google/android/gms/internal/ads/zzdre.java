/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzfgt;

public final class zzdre
implements zzbmg {
    private final zzdas zza;
    private final zzbyt zzb;
    private final String zzc;
    private final String zzd;

    public zzdre(zzdas object, zzfgt zzfgt2) {
        this.zza = object;
        this.zzb = object = zzfgt2.zzm;
        this.zzc = object = zzfgt2.zzk;
        this.zzd = object = zzfgt2.zzl;
    }

    public final void zza(zzbyt object) {
        int n3;
        Object object2 = this.zzb;
        if (object2 != null) {
            object = object2;
        }
        if (object != null) {
            object2 = ((zzbyt)object).zza;
            n3 = ((zzbyt)object).zzb;
        } else {
            n3 = 1;
            object2 = "";
        }
        zzbye zzbye2 = new zzbye((String)object2, n3);
        object = this.zza;
        object2 = this.zzc;
        String string2 = this.zzd;
        ((zzdas)object).zzd(zzbye2, (String)object2, string2);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}


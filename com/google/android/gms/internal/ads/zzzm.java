/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzmo;
import com.google.android.gms.internal.ads.zzmp;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzl;
import com.google.android.gms.internal.ads.zzzn;
import com.google.android.gms.internal.ads.zzzu;

public abstract class zzzm {
    private zzzl zza;
    private zzzu zzb;

    public zzmo zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzk zzk2) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzzn zzp(zzmp[] var1, zzxr var2, zzvo var3, zzdc var4);

    public abstract void zzq(Object var1);

    public final zzzu zzr() {
        zzzu zzzu2 = this.zzb;
        zzeq.zzb(zzzu2);
        return zzzu2;
    }

    public final void zzs(zzzl zzzl2, zzzu zzzu2) {
        this.zza = zzzl2;
        this.zzb = zzzu2;
    }

    public final void zzt() {
        zzzl zzzl2 = this.zza;
        if (zzzl2 != null) {
            zzzl2.zzj();
        }
    }
}


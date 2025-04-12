/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbka;

final class zzbjx
extends zzbiy {
    final /* synthetic */ zzbka zza;

    public /* synthetic */ zzbjx(zzbka zzbka2, zzbjw zzbjw2) {
        this.zza = zzbka2;
    }

    public final void zze(zzbip object, String string2) {
        zzbka zzbka2 = this.zza;
        zzf zzf2 = zzbka.zza(zzbka2);
        if (zzf2 == null) {
            return;
        }
        zzf2 = zzbka.zza(zzbka2);
        object = zzbka.zze(zzbka2, (zzbip)object);
        zzf2.zzb((zzbiq)object, string2);
    }
}


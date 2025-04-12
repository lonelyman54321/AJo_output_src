/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzboy;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzciu;
import java.util.ArrayList;

public final class zzbor
implements zzciu {
    public final /* synthetic */ zzbpc zza;

    public /* synthetic */ zzbor(zzbpc zzbpc2) {
        this.zza = zzbpc2;
    }

    public final void zza() {
        long l2 = zzu.zzB().currentTimeMillis();
        Object object = this.zza;
        long l3 = ((zzbpc)object).zzc;
        ArrayList arrayList = ((zzbpc)object).zzb;
        Object object2 = l2 -= l3;
        arrayList.add(object2);
        object2 = String.valueOf(arrayList.get(0));
        Object object3 = new StringBuilder("LoadNewJavascriptEngine(onEngLoaded) latency is ");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" ms.");
        zze.zza(((StringBuilder)object3).toString());
        object2 = zzt.zza;
        zzbpt zzbpt2 = ((zzbpc)object).zza;
        zzbps zzbps2 = ((zzbpc)object).zzd;
        zzboo zzboo2 = ((zzbpc)object).zze;
        object3 = new zzboy(zzbpt2, zzbps2, zzboo2, arrayList, l3);
        object = zzbep.zzc;
        long l4 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        object2.postDelayed((Runnable)object3, l4);
    }
}


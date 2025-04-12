/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdmd;
import java.util.ArrayList;

public final class zzdme {
    public static final zzdme zza;
    private final zzbiw zzb;
    private final zzbit zzc;
    private final zzbjj zzd;
    private final zzbjg zze;
    private final zzboi zzf;
    private final a53 zzg;
    private final a53 zzh;

    static {
        zzdme zzdme2;
        zzdmc zzdmc2 = new zzdmc();
        zza = zzdme2 = new zzdme(zzdmc2);
    }

    private zzdme(zzdmc object) {
        Object object2 = ((zzdmc)object).zza;
        this.zzb = object2;
        object2 = ((zzdmc)object).zzb;
        this.zzc = object2;
        object2 = ((zzdmc)object).zzc;
        this.zzd = object2;
        a53 a532 = ((zzdmc)object).zzf;
        this.zzg = object2 = new a53(a532);
        a532 = ((zzdmc)object).zzg;
        this.zzh = object2 = new a53(a532);
        this.zze = object2 = ((zzdmc)object).zzd;
        this.zzf = object = ((zzdmc)object).zze;
    }

    public /* synthetic */ zzdme(zzdmc zzdmc2, zzdmd zzdmd2) {
        this(zzdmc2);
    }

    public final zzbit zza() {
        return this.zzc;
    }

    public final zzbiw zzb() {
        return this.zzb;
    }

    public final zzbiz zzc(String string2) {
        return (zzbiz)this.zzh.get(string2);
    }

    public final zzbjc zzd(String string2) {
        return (zzbjc)this.zzg.get(string2);
    }

    public final zzbjg zze() {
        return this.zze;
    }

    public final zzbjj zzf() {
        return this.zzd;
    }

    public final zzboi zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        a53 a532 = this.zzg;
        int n3 = a532.c;
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        n3 = 0;
        a532 = null;
        while (true) {
            Object object = this.zzg;
            int n4 = ((a53)object).c;
            if (n3 >= n4) break;
            object = (String)((a53)object).h(n3);
            arrayList.add(object);
            ++n3;
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.zzd;
        if (object != null) {
            n3 = 6;
            object = Integer.toString(n3);
            arrayList.add(object);
        }
        if ((object = this.zzb) != null) {
            n3 = 1;
            object = Integer.toString(n3);
            arrayList.add(object);
        }
        if ((object = this.zzc) != null) {
            n3 = 2;
            object = Integer.toString(n3);
            arrayList.add(object);
        }
        if ((n3 = (int)(((a53)(object = this.zzg)).isEmpty() ? 1 : 0)) == 0) {
            n3 = 3;
            object = Integer.toString(n3);
            arrayList.add(object);
        }
        if ((object = this.zzf) != null) {
            n3 = 7;
            object = Integer.toString(n3);
            arrayList.add(object);
        }
        return arrayList;
    }
}


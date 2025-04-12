/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghj;
import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgql;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgos
implements zzghj {
    final String zza;
    final Class zzb;
    final zzgwg zzc;
    final zzhdm zzd;

    public zzgos(String string2, Class clazz, zzgwg zzgwg2, zzhdm zzhdm2) {
        this.zzd = zzhdm2;
        this.zza = string2;
        this.zzb = clazz;
        this.zzc = zzgwg2;
    }

    public static zzghj zzd(String string2, Class clazz, zzgwg zzgwg2, zzhdm zzhdm2) {
        zzgos zzgos2 = new zzgos(string2, clazz, zzgwg2, zzhdm2);
        return zzgos2;
    }

    public final zzgwh zza(zzhac object) {
        Object object2 = zzgwm.zza();
        Object object3 = this.zza;
        ((zzgwl)object2).zzb((String)object3);
        ((zzgwl)object2).zzc((zzhac)object);
        object = zzgxn.zzd;
        ((zzgwl)object2).zza((zzgxn)object);
        object = zzgqm.zza((zzgwm)((zzhbi)object2).zzbn());
        object = zzgpl.zzc().zzb((zzgqq)object);
        object = zzgpb.zzb().zza((zzghx)object, null);
        object2 = zzgpl.zzc();
        zzgic zzgic2 = zzghh.zza();
        object = ((zzgpl)object2).zzd((zzghi)object, zzgql.class, zzgic2);
        object2 = zzgwh.zza();
        object = (zzgql)object;
        object3 = ((zzgql)object).zzg();
        ((zzgwe)object2).zzb((String)object3);
        object3 = ((zzgql)object).zze();
        ((zzgwe)object2).zzc((zzhac)object3);
        object = ((zzgql)object).zzb();
        ((zzgwe)object2).zza((zzgwg)object);
        return (zzgwh)((zzhbi)object2).zzbn();
    }

    public final Class zzb() {
        return this.zzb;
    }

    public final Object zzc(zzhac object) {
        Object object2 = this.zzc;
        Object object3 = zzgxn.zzd;
        object = zzgql.zza(this.zza, (zzhac)object, (zzgwg)object2, (zzgxn)object3, null);
        object2 = zzgpl.zzc();
        object3 = zzghh.zza();
        object = ((zzgpl)object2).zza((zzgqq)object, (zzgic)object3);
        object2 = this.zzb;
        return zzgpi.zza().zzc((zzghi)object, (Class)object2);
    }
}


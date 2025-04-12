/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzb;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.analytics.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbu;

public class zza
extends zzk {
    private final zzbu zzb;
    private boolean zzc;

    public zza(zzbu zzbu2) {
        zzr zzr2 = zzbu2.zzd();
        Clock clock = zzbu2.zzr();
        super(zzr2, clock);
        this.zzb = zzbu2;
    }

    public final zzh zza() {
        Object object = this.zza;
        zzh zzh2 = new zzh((zzh)object);
        object = this.zzb.zzh().zza();
        zzh2.zzg((zzj)object);
        object = this.zzb.zzk().zza();
        zzh2.zzg((zzj)object);
        this.zzn(zzh2);
        return zzh2;
    }

    public final zzbu zzb() {
        return this.zzb;
    }

    public final void zzc(String string2) {
        Object object;
        boolean bl2;
        Preconditions.checkNotEmpty(string2);
        Object object2 = this.zza;
        Object object3 = com.google.android.gms.analytics.zzb.zza(string2);
        object2 = ((zzh)object2).zzf().listIterator();
        while (bl2 = object2.hasNext()) {
            object = ((zzt)object2.next()).zzb();
            bl2 = object3.equals(object);
            if (!bl2) continue;
            object2.remove();
        }
        object2 = this.zza;
        object3 = this.zzb;
        object2 = ((zzh)object2).zzf();
        object = new zzb((zzbu)object3, string2);
        object2.add(object);
    }

    public final void zzd(boolean bl2) {
        this.zzc = bl2;
    }

    public final void zze(zzh object) {
        Object object2 = ((zzbd)(object = (zzbd)((zzh)object).zzb(zzbd.class))).zze();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (bl2) {
            object2 = this.zzb.zzi().zzb();
            ((zzbd)object).zzj((String)object2);
        }
        if ((bl2 = this.zzc) && (bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((zzbd)object).zzd())))) {
            object2 = this.zzb.zze();
            String string2 = ((zzbh)object2).zza();
            ((zzbd)object).zzi(string2);
            bl2 = ((zzbh)object2).zzb();
            ((zzbd)object).zzh(bl2);
        }
    }
}


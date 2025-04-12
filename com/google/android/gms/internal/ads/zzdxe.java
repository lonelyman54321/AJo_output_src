/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdgh;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmq;

final class zzdxe
extends zzbnq {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzccn zze;
    final /* synthetic */ zzdxf zzf;

    public zzdxe(zzdxf zzdxf2, Object object, String string2, long l2, zzfmc zzfmc2, zzccn zzccn2) {
        this.zza = object;
        this.zzb = string2;
        this.zzc = l2;
        this.zzd = zzfmc2;
        this.zze = zzccn2;
        this.zzf = zzdxf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(String object) {
        Object object2 = this.zza;
        synchronized (object2) {
            Object object3 = this.zzf;
            Object object4 = this.zzb;
            Clock clock = zzu.zzB();
            long l2 = clock.elapsedRealtime();
            long l3 = this.zzc;
            int n3 = (int)(l2 -= l3);
            clock = null;
            zzdxf.zzk((zzdxf)object3, (String)object4, false, (String)object, n3);
            object3 = this.zzf;
            object3 = zzdxf.zzd((zzdxf)object3);
            object4 = this.zzb;
            String string2 = "error";
            ((zzdvm)object3).zzb((String)object4, string2);
            object3 = this.zzf;
            object3 = zzdxf.zzc((zzdxf)object3);
            object4 = this.zzb;
            string2 = "error";
            ((zzdgh)object3).zzb((String)object4, string2);
            object3 = this.zzf;
            object3 = zzdxf.zze((zzdxf)object3);
            object4 = this.zzd;
            object4.zzc((String)object);
            object4.zzh(false);
            object = object4.zzn();
            ((zzfmq)object3).zzb((zzfmg)object);
            object = this.zze;
            object3 = Boolean.FALSE;
            ((zzccn)object).zzc(object3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        Object object = this.zza;
        synchronized (object) {
            Object object2 = this.zzf;
            Object object3 = this.zzb;
            String string2 = "";
            Clock clock = zzu.zzB();
            long l2 = clock.elapsedRealtime();
            long l3 = this.zzc;
            int n3 = (int)(l2 -= l3);
            boolean bl2 = true;
            zzdxf.zzk((zzdxf)object2, (String)object3, bl2, string2, n3);
            object2 = this.zzf;
            object2 = zzdxf.zzd((zzdxf)object2);
            object3 = this.zzb;
            ((zzdvm)object2).zzd((String)object3);
            object2 = this.zzf;
            object2 = zzdxf.zzc((zzdxf)object2);
            object3 = this.zzb;
            ((zzdgh)object2).zzd((String)object3);
            object2 = this.zzf;
            object2 = zzdxf.zze((zzdxf)object2);
            object3 = this.zzd;
            object3.zzh(bl2);
            object3 = object3.zzn();
            ((zzfmq)object2).zzb((zzfmg)object3);
            object2 = this.zze;
            object3 = Boolean.TRUE;
            ((zzccn)object2).zzc(object3);
            return;
        }
    }
}


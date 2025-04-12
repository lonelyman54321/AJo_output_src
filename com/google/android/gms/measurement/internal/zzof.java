/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zznx;

final class zzof {
    final /* synthetic */ zznx zza;

    public zzof(zznx zznx2) {
        this.zza = zznx2;
    }

    private final void zzb(long l2, boolean bl2) {
        this.zza.zzv();
        Object object = this.zza.zzu;
        bl2 = ((zzic)object).zzae();
        if (!bl2) {
            return;
        }
        this.zza.zzk().zzk.zza(l2);
        long l3 = this.zza.zzb().elapsedRealtime();
        object = this.zza.zzj().zzq();
        Object object2 = l3;
        Object object3 = "Session started, time";
        ((zzgq)object).zza((String)object3, object2);
        l3 = l2 / 1000L;
        Object object4 = l3;
        this.zza.zzm().zza("auto", "_sid", object4, l2);
        this.zza.zzk().zzl.zza(l3);
        object = this.zza.zzk().zzg;
        String string2 = null;
        ((zzhd)object).zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", l3);
        Object object5 = this.zza.zzm();
        String string3 = "auto";
        object4 = "_s";
        ((zzju)object5).zza(string3, (String)object4, l2, bundle);
        object = this.zza.zzk().zzq.zza();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            object2 = "_ffr";
            Bundle bundle2 = E1.a((String)object2, (String)object);
            object = this.zza;
            object3 = ((zznx)object).zzm();
            string2 = "auto";
            object5 = "_ssr";
            ((zzju)object3).zza(string2, (String)object5, l2, bundle2);
        }
    }

    public final void zza() {
        this.zza.zzv();
        Object object = this.zza.zzk();
        Object object2 = this.zza.zzb();
        long l2 = object2.currentTimeMillis();
        boolean n3 = ((zzha)object).zza(l2);
        if (n3) {
            this.zza.zzk().zzg.zza(true);
            object = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)object);
            int n4 = ((ActivityManager.RunningAppProcessInfo)object).importance;
            int n7 = 100;
            if (n4 == n7) {
                object = this.zza.zzj().zzq();
                object2 = "Detected application was in foreground";
                ((zzgq)object).zza((String)object2);
                object = this.zza.zzb();
                long l3 = object.currentTimeMillis();
                this.zzb(l3, false);
            }
        }
    }

    public final void zza(long l2, boolean bl2) {
        this.zza.zzv();
        zznx.zzb(this.zza);
        Object object = this.zza.zzk();
        boolean bl3 = ((zzha)object).zza(l2);
        if (bl3) {
            object = this.zza.zzk().zzg;
            boolean bl4 = true;
            ((zzhd)object).zza(bl4);
            object = this.zza.zzg();
            ((zzgg)object).zzaj();
        }
        this.zza.zzk().zzk.zza(l2);
        object = this.zza.zzk().zzg;
        bl3 = ((zzhd)object).zza();
        if (bl3) {
            this.zzb(l2, bl2);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzji;

final class zzgr
implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzgo zzf;

    public zzgr(zzgo zzgo2, int n3, String string2, Object object, Object object2, Object object3) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = object;
        this.zzd = object2;
        this.zze = object3;
        this.zzf = zzgo2;
    }

    public final void run() {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        int n3;
        Object object = this.zzf.zzu.zzn();
        boolean c2 = ((zzji)object).zzag();
        if (!c2) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        Object object2 = this.zzf;
        char c3 = zzgo.zza((zzgo)object2);
        if (c3 == '\u0000') {
            object2 = this.zzf.zze();
            boolean bl2 = ((zzai)object2).zzaa();
            if (bl2) {
                object2 = this.zzf;
                n3 = 67;
                zzgo.zza((zzgo)object2, (char)n3);
            } else {
                object2 = this.zzf;
                n3 = 99;
                zzgo.zza((zzgo)object2, (char)n3);
            }
        }
        if ((l8 = (l7 = (l4 = zzgo.zzb((zzgo)(object2 = this.zzf))) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
            object2 = this.zzf;
            l2 = 114010L;
            zzgo.zza((zzgo)object2, l2);
        }
        n3 = this.zza;
        char c5 = "01VDIWEA?".charAt(n3);
        zzgo zzgo2 = this.zzf;
        n3 = zzgo.zza(zzgo2);
        zzgo zzgo3 = this.zzf;
        l3 = zzgo.zzb(zzgo3);
        String string2 = this.zzb;
        Object object3 = this.zzc;
        Object object4 = this.zzd;
        Object object5 = this.zze;
        boolean bl3 = true;
        string2 = zzgo.zza(bl3, string2, object3, object4, object5);
        object4 = "2";
        object3 = new StringBuilder((String)object4);
        ((StringBuilder)object3).append(c5);
        ((StringBuilder)object3).append((char)n3);
        ((StringBuilder)object3).append(l3);
        object2 = h30_0.a((StringBuilder)object3, ":", string2);
        n3 = ((String)object2).length();
        int n4 = 1024;
        if (n3 > n4) {
            object2 = this.zzb;
            n3 = 0;
            zzgo2 = null;
            object2 = ((String)object2).substring(0, n4);
        }
        if ((object = ((zzha)object).zzb) != null) {
            l2 = 1L;
            ((zzhe)object).zza((String)object2, l2);
        }
    }
}


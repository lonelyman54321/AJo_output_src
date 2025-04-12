/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.ArrayList;
import java.util.List;

final class zzou$zza
implements zzau {
    zzgf$zzk zza;
    List zzb;
    List zzc;
    private long zzd;
    private final /* synthetic */ zzou zze;

    private zzou$zza(zzou zzou2) {
        this.zze = zzou2;
    }

    public /* synthetic */ zzou$zza(zzou zzou2, zzpg zzpg2) {
        this(zzou2);
    }

    private static long zza(zzgf$zzf zzgf$zzf) {
        long l2 = zzgf$zzf.zzd() / 1000L;
        long l3 = 60;
        return l2 / l3 / l3;
    }

    public final void zza(zzgf$zzk zzgf$zzk) {
        Preconditions.checkNotNull(zzgf$zzk);
        this.zza = zzgf$zzk;
    }

    public final boolean zza(long l2, zzgf$zzf object) {
        long l3;
        long l4;
        long l7;
        int n3;
        Preconditions.checkNotNull(object);
        Object object2 = this.zzc;
        if (object2 == null) {
            object2 = new ArrayList();
            this.zzc = object2;
        }
        if ((object2 = this.zzb) == null) {
            object2 = new ArrayList();
            this.zzb = object2;
        }
        if ((n3 = (object2 = this.zzc).isEmpty()) == 0 && (n3 = (l7 = (l4 = zzou$zza.zza((zzgf$zzf)(object2 = (zzgf$zzf)this.zzc.get(0)))) - (l3 = zzou$zza.zza((zzgf$zzf)object))) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != 0) {
            return false;
        }
        l4 = this.zzd;
        l3 = ((zzkg)object).zzcf();
        l4 += l3;
        this.zze.zze();
        object2 = (Integer)zzbn.zzi.zza(null);
        n3 = (Integer)object2;
        long l8 = Math.max(0, n3);
        n3 = (int)(l4 == l8 ? 0 : (l4 < l8 ? -1 : 1));
        if (n3 >= 0) {
            return false;
        }
        this.zzd = l4;
        object2 = this.zzc;
        object2.add(object);
        object = this.zzb;
        Object object3 = l2;
        object.add(object3);
        object3 = this.zzc;
        int n4 = object3.size();
        this.zze.zze();
        Integer n7 = (Integer)zzbn.zzj.zza(null);
        int n8 = n7;
        boolean bl2 = true;
        n8 = Math.max((int)(bl2 ? 1 : 0), n8);
        if (n4 >= n8) {
            return false;
        }
        return bl2;
    }
}


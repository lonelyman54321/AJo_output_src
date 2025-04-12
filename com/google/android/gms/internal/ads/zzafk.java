/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafn;
import com.google.android.gms.internal.ads.zzafq;

final class zzafk
implements zzaet {
    final /* synthetic */ zzafn zza;
    private final long zzb;

    public zzafk(zzafn zzafn2, long l2) {
        this.zza = zzafn2;
        this.zzb = l2;
    }

    public final long zza() {
        return this.zzb;
    }

    public final zzaer zzg(long l2) {
        Object object;
        Object object2;
        int n3;
        Object object3 = zzafn.zza(this.zza)[0].zza(l2);
        for (int i3 = 1; i3 < (n3 = ((zzafq[])(object2 = zzafn.zza((zzafn)(object = this.zza)))).length); ++i3) {
            object = zzafn.zza((zzafn)object)[i3].zza(l2);
            object2 = ((zzaer)object).zza;
            zzaeu zzaeu2 = ((zzaer)object3).zza;
            long l3 = object2.zzc;
            long l4 = zzaeu2.zzc;
            long l7 = l3 - l4;
            Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 >= 0) continue;
            object3 = object;
        }
        return object3;
    }

    public final boolean zzh() {
        return true;
    }
}


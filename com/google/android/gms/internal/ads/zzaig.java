/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzgar;
import java.util.Comparator;

public final class zzaig
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (zzaii)object;
        object2 = (zzaii)object2;
        zzgar zzgar2 = zzgar.zzk();
        long l2 = ((zzaii)object).zzb;
        long l3 = ((zzaii)object2).zzb;
        zzgar2 = zzgar2.zzc(l2, l3);
        l2 = ((zzaii)object).zzc;
        l3 = ((zzaii)object2).zzc;
        zzgar2 = zzgar2.zzc(l2, l3);
        int n3 = ((zzaii)object).zzd;
        int n4 = ((zzaii)object2).zzd;
        return zzgar2.zzb(n3, n4).zza();
    }
}


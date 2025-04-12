/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgan;
import com.google.android.gms.internal.ads.zzgcl;
import com.google.android.gms.internal.ads.zzgcw;
import java.util.Comparator;

public abstract class zzgcn
implements Comparator {
    public static zzgcn zzb(Comparator comparator) {
        zzgan zzgan2 = new zzgan(comparator);
        return zzgan2;
    }

    public static zzgcn zzc() {
        return zzgcl.zza;
    }

    public abstract int compare(Object var1, Object var2);

    public zzgcn zza() {
        zzgcw zzgcw2 = new zzgcw(this);
        return zzgcw2;
    }
}


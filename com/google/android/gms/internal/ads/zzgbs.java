/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgbr;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class zzgbs {
    public static ArrayList zza(int n3) {
        zzfzz.zza(n3, "initialArraySize");
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }

    public static List zzb(List list, zzfxu zzfxu2) {
        boolean bl2 = list instanceof RandomAccess;
        AbstractList abstractList = bl2 ? new zzgbp(list, zzfxu2) : new zzgbr(list, zzfxu2);
        return abstractList;
    }
}


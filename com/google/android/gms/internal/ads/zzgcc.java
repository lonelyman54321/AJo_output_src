/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcg;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class zzgcc
extends zzgcg {
    final /* synthetic */ Comparator zza;

    public zzgcc(Comparator comparator) {
        this.zza = comparator;
    }

    public final Map zza() {
        Comparator comparator = this.zza;
        TreeMap treeMap = new TreeMap(comparator);
        return treeMap;
    }
}


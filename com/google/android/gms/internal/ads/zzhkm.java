/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzhkm {
    public static HashSet zza(int n3) {
        n3 = zzhkm.zzd(n3);
        HashSet hashSet = new HashSet(n3);
        return hashSet;
    }

    public static LinkedHashMap zzb(int n3) {
        n3 = zzhkm.zzd(n3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
        return linkedHashMap;
    }

    public static List zzc(int n3) {
        if (n3 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(n3);
        return arrayList;
    }

    private static int zzd(int n3) {
        int n4 = 3;
        if (n3 < n4) {
            return n3 + 1;
        }
        n4 = 0x40000000;
        if (n3 < n4) {
            return (int)((float)n3 / 0.75f + 1.0f);
        }
        return -1 >>> 1;
    }
}


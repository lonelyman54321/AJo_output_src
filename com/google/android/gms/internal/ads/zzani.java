/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class zzani {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzani(String string2, int n3, String string3, Set set) {
        this.zzb = n3;
        this.zza = string2;
        this.zzc = string3;
        this.zzd = set;
    }

    public static zzani zza(String object, int n3) {
        int n4;
        String string2;
        object = object.trim();
        int n7 = object.isEmpty();
        int n8 = 1;
        zzeq.zzd(n7 ^ n8);
        String string3 = " ";
        n7 = object.indexOf(string3);
        String string4 = null;
        int n10 = -1;
        if (n7 == n10) {
            string3 = "";
        } else {
            string2 = object.substring(n7).trim();
            object = object.substring(0, n7);
            string3 = string2;
        }
        int n14 = zzgd.zza;
        string2 = "\\.";
        object = object.split(string2, n10);
        string4 = object[0];
        HashSet<String> hashSet = new HashSet<String>();
        for (n14 = 1; n14 < (n4 = ((String[])object).length); n14 += n8) {
            String string5 = object[n14];
            hashSet.add(string5);
        }
        object = new zzani(string4, n3, string3, hashSet);
        return object;
    }

    public static zzani zzb() {
        Set set = Collections.emptySet();
        String string2 = "";
        zzani zzani2 = new zzani(string2, 0, string2, set);
        return zzani2;
    }
}


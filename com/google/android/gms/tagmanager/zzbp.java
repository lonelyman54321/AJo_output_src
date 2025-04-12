/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzbp {
    private final Set zzr;
    private final String zzs;

    public zzbp(String hashSet, String ... stringArray) {
        this.zzs = hashSet;
        int n3 = stringArray.length;
        this.zzr = hashSet = new HashSet(n3);
        hashSet = null;
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            String string2 = stringArray[i3];
            Set set = this.zzr;
            set.add(string2);
        }
    }

    public abstract zzap zza(Map var1);

    public abstract boolean zzb();

    public final String zze() {
        return this.zzs;
    }

    public final Set zzf() {
        return this.zzr;
    }

    public final boolean zzg(Set set) {
        Set set2 = this.zzr;
        return set.containsAll(set2);
    }
}


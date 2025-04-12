/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzapm {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzapm(int n3, String string2, int n4, List list, byte[] byArray) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = n4;
        List list2 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = list2;
        this.zze = byArray;
    }

    public final int zza() {
        int n3 = this.zzc;
        int n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzfk;

public final class zzzf {
    public final zzde zza;
    public final int[] zzb;

    public zzzf(zzde zzde2, int[] nArray, int n3) {
        n3 = nArray.length;
        if (n3 == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            String string2 = "ETSDefinition";
            String string3 = "Empty tracks are not allowed";
            zzfk.zzd(string2, string3, illegalArgumentException);
        }
        this.zza = zzde2;
        this.zzb = nArray;
    }
}


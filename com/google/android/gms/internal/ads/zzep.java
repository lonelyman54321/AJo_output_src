/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzep {
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
        int n3 = 36;
        zzd = Integer.toString(0, n3);
        zze = Integer.toString(1, n3);
        zzf = Integer.toString(2, n3);
    }

    public zzep(int n3, int n4, int n7) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        String string2 = zzd;
        int n3 = this.zza;
        bundle.putInt(string2, n3);
        string2 = zze;
        n3 = this.zzb;
        bundle.putInt(string2, n3);
        string2 = zzf;
        n3 = this.zzc;
        bundle.putInt(string2, n3);
        return bundle;
    }
}


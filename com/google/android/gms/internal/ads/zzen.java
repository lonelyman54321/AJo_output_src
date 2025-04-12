/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzen {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final int zzb;

    static {
        int n3 = 36;
        zzc = Integer.toString(0, n3);
        zzd = Integer.toString(1, n3);
    }

    public zzen(String string2, int n3) {
        this.zza = string2;
        this.zzb = n3;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        String string2 = zzc;
        String string3 = this.zza;
        bundle.putString(string2, string3);
        string2 = zzd;
        int n3 = this.zzb;
        bundle.putInt(string2, n3);
        return bundle;
    }
}


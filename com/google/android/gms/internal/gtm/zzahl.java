/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzahk;

public final class zzahl
extends Enum
implements zzach {
    public static final /* enum */ zzahl zza;
    public static final /* enum */ zzahl zzb;
    public static final /* enum */ zzahl zzc;
    private static final zzaci zzd;
    private static final /* synthetic */ zzahl[] zze;
    private final int zzf;

    static {
        zzahl zzahl2;
        zzahl zzahl3;
        Object object = new zzahl("TOMBSTONE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzahl3 = new zzahl("TOMBSTONE_RETAIN", n3, n3);
        int n4 = 2;
        zzc = zzahl2 = new zzahl("TOMBSTONE_DROP", n4, n4);
        zzahl[] zzahlArray = new zzahl[3];
        zzahlArray[0] = object;
        zzahlArray[n3] = zzahl3;
        zzahlArray[n4] = zzahl2;
        zze = zzahlArray;
        zzd = object = new zzahk();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzahl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzahl[] values() {
        return (zzahl[])zze.clone();
    }

    public static zzaci zzb() {
        return zzd;
    }

    public final String toString() {
        return Integer.toString(this.zzf);
    }

    public final int zza() {
        return this.zzf;
    }
}


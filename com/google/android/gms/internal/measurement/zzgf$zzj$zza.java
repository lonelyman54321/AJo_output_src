/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgf$zzj$zza
extends Enum
implements zzki {
    private static final /* enum */ zzgf$zzj$zza zza;
    private static final /* enum */ zzgf$zzj$zza zzb;
    private static final /* synthetic */ zzgf$zzj$zza[] zzc;
    private final int zzd;

    static {
        zzgf$zzj$zza zzgf$zzj$zza;
        zzgf$zzj$zza zzgf$zzj$zza2;
        zza = zzgf$zzj$zza2 = new zzgf$zzj$zza("SDK", 0, 0);
        int n3 = 1;
        zzb = zzgf$zzj$zza = new zzgf$zzj$zza("SGTM", n3, n3);
        zzgf$zzj$zza[] zzgf$zzj$zzaArray = new zzgf$zzj$zza[2];
        zzgf$zzj$zzaArray[0] = zzgf$zzj$zza2;
        zzgf$zzj$zzaArray[n3] = zzgf$zzj$zza;
        zzc = zzgf$zzj$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgf$zzj$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzd = var3_2;
    }

    public static zzgf$zzj$zza[] values() {
        return (zzgf$zzj$zza[])zzc.clone();
    }

    public static zzgf$zzj$zza zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return zzb;
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzgk.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgf$zzj$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzd;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzd;
    }
}


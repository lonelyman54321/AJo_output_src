/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzfw$zzd$zza
extends Enum
implements zzki {
    public static final /* enum */ zzfw$zzd$zza zza;
    public static final /* enum */ zzfw$zzd$zza zzb;
    public static final /* enum */ zzfw$zzd$zza zzc;
    public static final /* enum */ zzfw$zzd$zza zzd;
    public static final /* enum */ zzfw$zzd$zza zze;
    private static final /* synthetic */ zzfw$zzd$zza[] zzf;
    private final int zzg;

    static {
        zzfw$zzd$zza zzfw$zzd$zza;
        zzfw$zzd$zza zzfw$zzd$zza2;
        zzfw$zzd$zza zzfw$zzd$zza3;
        zzfw$zzd$zza zzfw$zzd$zza4;
        zzfw$zzd$zza zzfw$zzd$zza5;
        zza = zzfw$zzd$zza5 = new zzfw$zzd$zza("UNKNOWN_COMPARISON_TYPE", 0, 0);
        int n3 = 1;
        zzb = zzfw$zzd$zza4 = new zzfw$zzd$zza("LESS_THAN", n3, n3);
        int n4 = 2;
        zzc = zzfw$zzd$zza3 = new zzfw$zzd$zza("GREATER_THAN", n4, n4);
        int n7 = 3;
        zzd = zzfw$zzd$zza2 = new zzfw$zzd$zza("EQUAL", n7, n7);
        int n8 = 4;
        zze = zzfw$zzd$zza = new zzfw$zzd$zza("BETWEEN", n8, n8);
        zzfw$zzd$zza[] zzfw$zzd$zzaArray = new zzfw$zzd$zza[5];
        zzfw$zzd$zzaArray[0] = zzfw$zzd$zza5;
        zzfw$zzd$zzaArray[n3] = zzfw$zzd$zza4;
        zzfw$zzd$zzaArray[n4] = zzfw$zzd$zza3;
        zzfw$zzd$zzaArray[n7] = zzfw$zzd$zza2;
        zzfw$zzd$zzaArray[n8] = zzfw$zzd$zza;
        zzf = zzfw$zzd$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfw$zzd$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzfw$zzd$zza[] values() {
        return (zzfw$zzd$zza[])zzf.clone();
    }

    public static zzfw$zzd$zza zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
                        }
                        return zze;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzfy.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfw$zzd$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzg;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzg;
    }
}


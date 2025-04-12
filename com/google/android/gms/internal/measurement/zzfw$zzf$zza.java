/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzfw$zzf$zza
extends Enum
implements zzki {
    public static final /* enum */ zzfw$zzf$zza zza;
    public static final /* enum */ zzfw$zzf$zza zzb;
    public static final /* enum */ zzfw$zzf$zza zzc;
    public static final /* enum */ zzfw$zzf$zza zzd;
    public static final /* enum */ zzfw$zzf$zza zze;
    public static final /* enum */ zzfw$zzf$zza zzf;
    public static final /* enum */ zzfw$zzf$zza zzg;
    private static final /* synthetic */ zzfw$zzf$zza[] zzh;
    private final int zzi;

    static {
        zzfw$zzf$zza zzfw$zzf$zza;
        zzfw$zzf$zza zzfw$zzf$zza2;
        zzfw$zzf$zza zzfw$zzf$zza3;
        zzfw$zzf$zza zzfw$zzf$zza4;
        zzfw$zzf$zza zzfw$zzf$zza5;
        zzfw$zzf$zza zzfw$zzf$zza6;
        zzfw$zzf$zza zzfw$zzf$zza7;
        zza = zzfw$zzf$zza7 = new zzfw$zzf$zza("UNKNOWN_MATCH_TYPE", 0, 0);
        int n3 = 1;
        zzb = zzfw$zzf$zza6 = new zzfw$zzf$zza("REGEXP", n3, n3);
        int n4 = 2;
        zzc = zzfw$zzf$zza5 = new zzfw$zzf$zza("BEGINS_WITH", n4, n4);
        int n7 = 3;
        zzd = zzfw$zzf$zza4 = new zzfw$zzf$zza("ENDS_WITH", n7, n7);
        int n8 = 4;
        zze = zzfw$zzf$zza3 = new zzfw$zzf$zza("PARTIAL", n8, n8);
        int n10 = 5;
        zzf = zzfw$zzf$zza2 = new zzfw$zzf$zza("EXACT", n10, n10);
        int n14 = 6;
        zzg = zzfw$zzf$zza = new zzfw$zzf$zza("IN_LIST", n14, n14);
        zzfw$zzf$zza[] zzfw$zzf$zzaArray = new zzfw$zzf$zza[7];
        zzfw$zzf$zzaArray[0] = zzfw$zzf$zza7;
        zzfw$zzf$zzaArray[n3] = zzfw$zzf$zza6;
        zzfw$zzf$zzaArray[n4] = zzfw$zzf$zza5;
        zzfw$zzf$zzaArray[n7] = zzfw$zzf$zza4;
        zzfw$zzf$zzaArray[n8] = zzfw$zzf$zza3;
        zzfw$zzf$zzaArray[n10] = zzfw$zzf$zza2;
        zzfw$zzf$zzaArray[n14] = zzfw$zzf$zza;
        zzh = zzfw$zzf$zzaArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfw$zzf$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzfw$zzf$zza[] values() {
        return (zzfw$zzf$zza[])zzh.clone();
    }

    public static zzfw$zzf$zza zza(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzga.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfw$zzf$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzi;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzi;
    }
}


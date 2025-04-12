/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfo;
import com.google.android.gms.internal.vision.zzfp;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zzf$zza
extends Enum
implements zzje {
    private static final /* enum */ zzfi$zzf$zza zza;
    private static final /* enum */ zzfi$zzf$zza zzb;
    private static final /* enum */ zzfi$zzf$zza zzc;
    private static final /* enum */ zzfi$zzf$zza zzd;
    private static final zzjh zze;
    private static final /* synthetic */ zzfi$zzf$zza[] zzg;
    private final int zzf;

    static {
        zzfi$zzf$zza zzfi$zzf$zza;
        zzfi$zzf$zza zzfi$zzf$zza2;
        zzfi$zzf$zza zzfi$zzf$zza3;
        Object object = new zzfi$zzf$zza("RESULT_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfi$zzf$zza3 = new zzfi$zzf$zza("RESULT_SUCCESS", n3, n3);
        int n4 = 2;
        zzc = zzfi$zzf$zza2 = new zzfi$zzf$zza("RESULT_FAIL", n4, n4);
        int n7 = 3;
        zzd = zzfi$zzf$zza = new zzfi$zzf$zza("RESULT_SKIPPED", n7, n7);
        zzfi$zzf$zza[] zzfi$zzf$zzaArray = new zzfi$zzf$zza[4];
        zzfi$zzf$zzaArray[0] = object;
        zzfi$zzf$zzaArray[n3] = zzfi$zzf$zza3;
        zzfi$zzf$zzaArray[n4] = zzfi$zzf$zza2;
        zzfi$zzf$zzaArray[n7] = zzfi$zzf$zza;
        zzg = zzfi$zzf$zzaArray;
        zze = object = new zzfp();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zzf$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzfi$zzf$zza[] values() {
        return (zzfi$zzf$zza[])zzg.clone();
    }

    public static zzfi$zzf$zza zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzjg zzb() {
        return zzfo.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zzf$zza.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzf;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzf;
    }
}


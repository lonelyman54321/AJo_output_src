/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgr$zzd$zzb
extends Enum
implements zzki {
    public static final /* enum */ zzgr$zzd$zzb zza;
    public static final /* enum */ zzgr$zzd$zzb zzb;
    public static final /* enum */ zzgr$zzd$zzb zzc;
    public static final /* enum */ zzgr$zzd$zzb zzd;
    public static final /* enum */ zzgr$zzd$zzb zze;
    private static final /* synthetic */ zzgr$zzd$zzb[] zzf;
    private final int zzg;

    static {
        zzgr$zzd$zzb zzgr$zzd$zzb;
        zzgr$zzd$zzb zzgr$zzd$zzb2;
        zzgr$zzd$zzb zzgr$zzd$zzb3;
        zzgr$zzd$zzb zzgr$zzd$zzb4;
        zzgr$zzd$zzb zzgr$zzd$zzb5;
        zza = zzgr$zzd$zzb5 = new zzgr$zzd$zzb("UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzgr$zzd$zzb4 = new zzgr$zzd$zzb("STRING", n3, n3);
        int n4 = 2;
        zzc = zzgr$zzd$zzb3 = new zzgr$zzd$zzb("NUMBER", n4, n4);
        int n7 = 3;
        zzd = zzgr$zzd$zzb2 = new zzgr$zzd$zzb("BOOLEAN", n7, n7);
        int n8 = 4;
        zze = zzgr$zzd$zzb = new zzgr$zzd$zzb("STATEMENT", n8, n8);
        zzgr$zzd$zzb[] zzgr$zzd$zzbArray = new zzgr$zzd$zzb[5];
        zzgr$zzd$zzbArray[0] = zzgr$zzd$zzb5;
        zzgr$zzd$zzbArray[n3] = zzgr$zzd$zzb4;
        zzgr$zzd$zzbArray[n4] = zzgr$zzd$zzb3;
        zzgr$zzd$zzbArray[n7] = zzgr$zzd$zzb2;
        zzgr$zzd$zzbArray[n8] = zzgr$zzd$zzb;
        zzf = zzgr$zzd$zzbArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgr$zzd$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzgr$zzd$zzb[] values() {
        return (zzgr$zzd$zzb[])zzf.clone();
    }

    public static zzgr$zzd$zzb zza(int n3) {
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
        return zzgs.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgr$zzd$zzb.class.getName();
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


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgc$zza$zze
extends Enum
implements zzki {
    public static final /* enum */ zzgc$zza$zze zza;
    public static final /* enum */ zzgc$zza$zze zzb;
    public static final /* enum */ zzgc$zza$zze zzc;
    public static final /* enum */ zzgc$zza$zze zzd;
    public static final /* enum */ zzgc$zza$zze zze;
    private static final /* synthetic */ zzgc$zza$zze[] zzf;
    private final int zzg;

    static {
        zzgc$zza$zze zzgc$zza$zze;
        zzgc$zza$zze zzgc$zza$zze2;
        zzgc$zza$zze zzgc$zza$zze3;
        zzgc$zza$zze zzgc$zza$zze4;
        zzgc$zza$zze zzgc$zza$zze5;
        zza = zzgc$zza$zze5 = new zzgc$zza$zze("CONSENT_TYPE_UNSPECIFIED", 0, 0);
        int n3 = 1;
        zzb = zzgc$zza$zze4 = new zzgc$zza$zze("AD_STORAGE", n3, n3);
        int n4 = 2;
        zzc = zzgc$zza$zze3 = new zzgc$zza$zze("ANALYTICS_STORAGE", n4, n4);
        int n7 = 3;
        zzd = zzgc$zza$zze2 = new zzgc$zza$zze("AD_USER_DATA", n7, n7);
        int n8 = 4;
        zze = zzgc$zza$zze = new zzgc$zza$zze("AD_PERSONALIZATION", n8, n8);
        zzgc$zza$zze[] zzgc$zza$zzeArray = new zzgc$zza$zze[5];
        zzgc$zza$zzeArray[0] = zzgc$zza$zze5;
        zzgc$zza$zzeArray[n3] = zzgc$zza$zze4;
        zzgc$zza$zzeArray[n4] = zzgc$zza$zze3;
        zzgc$zza$zzeArray[n7] = zzgc$zza$zze2;
        zzgc$zza$zzeArray[n8] = zzgc$zza$zze;
        zzf = zzgc$zza$zzeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgc$zza$zze() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzgc$zza$zze[] values() {
        return (zzgc$zza$zze[])zzf.clone();
    }

    public static zzgc$zza$zze zza(int n3) {
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
        return zzge.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgc$zza$zze.class.getName();
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


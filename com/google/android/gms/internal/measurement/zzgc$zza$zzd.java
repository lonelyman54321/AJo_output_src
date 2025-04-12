/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgc$zza$zzd
extends Enum
implements zzki {
    public static final /* enum */ zzgc$zza$zzd zza;
    public static final /* enum */ zzgc$zza$zzd zzb;
    public static final /* enum */ zzgc$zza$zzd zzc;
    private static final /* synthetic */ zzgc$zza$zzd[] zzd;
    private final int zze;

    static {
        zzgc$zza$zzd zzgc$zza$zzd;
        zzgc$zza$zzd zzgc$zza$zzd2;
        zzgc$zza$zzd zzgc$zza$zzd3;
        zza = zzgc$zza$zzd3 = new zzgc$zza$zzd("CONSENT_STATUS_UNSPECIFIED", 0, 0);
        int n3 = 1;
        zzb = zzgc$zza$zzd2 = new zzgc$zza$zzd("GRANTED", n3, n3);
        int n4 = 2;
        zzc = zzgc$zza$zzd = new zzgc$zza$zzd("DENIED", n4, n4);
        zzgc$zza$zzd[] zzgc$zza$zzdArray = new zzgc$zza$zzd[3];
        zzgc$zza$zzdArray[0] = zzgc$zza$zzd3;
        zzgc$zza$zzdArray[n3] = zzgc$zza$zzd2;
        zzgc$zza$zzdArray[n4] = zzgc$zza$zzd;
        zzd = zzgc$zza$zzdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgc$zza$zzd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzgc$zza$zzd[] values() {
        return (zzgc$zza$zzd[])zzd.clone();
    }

    public static zzgc$zza$zzd zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzgd.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgc$zza$zzd.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zze;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zze;
    }
}


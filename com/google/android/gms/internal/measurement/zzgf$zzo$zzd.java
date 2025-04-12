/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgf$zzo$zzd
extends Enum
implements zzki {
    public static final /* enum */ zzgf$zzo$zzd zza;
    public static final /* enum */ zzgf$zzo$zzd zzb;
    public static final /* enum */ zzgf$zzo$zzd zzc;
    public static final /* enum */ zzgf$zzo$zzd zzd;
    private static final /* enum */ zzgf$zzo$zzd zze;
    private static final /* synthetic */ zzgf$zzo$zzd[] zzf;
    private final int zzg;

    static {
        zzgf$zzo$zzd zzgf$zzo$zzd;
        zzgf$zzo$zzd zzgf$zzo$zzd2;
        zzgf$zzo$zzd zzgf$zzo$zzd3;
        zzgf$zzo$zzd zzgf$zzo$zzd4;
        zzgf$zzo$zzd zzgf$zzo$zzd5;
        zza = zzgf$zzo$zzd5 = new zzgf$zzo$zzd("UPLOAD_TYPE_UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzgf$zzo$zzd4 = new zzgf$zzo$zzd("GA_UPLOAD", n3, n3);
        int n4 = 2;
        zzc = zzgf$zzo$zzd3 = new zzgf$zzo$zzd("SDK_CLIENT_UPLOAD", n4, n4);
        int n7 = 3;
        zze = zzgf$zzo$zzd2 = new zzgf$zzo$zzd("PACKAGE_SERVICE_UPLOAD", n7, n7);
        int n8 = 4;
        zzd = zzgf$zzo$zzd = new zzgf$zzo$zzd("SDK_SERVICE_UPLOAD", n8, n8);
        zzgf$zzo$zzd[] zzgf$zzo$zzdArray = new zzgf$zzo$zzd[5];
        zzgf$zzo$zzdArray[0] = zzgf$zzo$zzd5;
        zzgf$zzo$zzdArray[n3] = zzgf$zzo$zzd4;
        zzgf$zzo$zzdArray[n4] = zzgf$zzo$zzd3;
        zzgf$zzo$zzdArray[n7] = zzgf$zzo$zzd2;
        zzgf$zzo$zzdArray[n8] = zzgf$zzo$zzd;
        zzf = zzgf$zzo$zzdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgf$zzo$zzd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzgf$zzo$zzd[] values() {
        return (zzgf$zzo$zzd[])zzf.clone();
    }

    public static zzgf$zzo$zzd zza(int n3) {
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
                        return zzd;
                    }
                    return zze;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzkl zzb() {
        return zzgo.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgf$zzo$zzd.class.getName();
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


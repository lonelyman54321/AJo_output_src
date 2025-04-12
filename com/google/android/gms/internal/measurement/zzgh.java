/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgh
extends Enum
implements zzki {
    private static final /* enum */ zzgh zza;
    private static final /* enum */ zzgh zzb;
    private static final /* enum */ zzgh zzc;
    private static final /* enum */ zzgh zzd;
    private static final /* enum */ zzgh zze;
    private static final /* enum */ zzgh zzf;
    private static final /* synthetic */ zzgh[] zzg;
    private final int zzh;

    static {
        zzgh zzgh2;
        zzgh zzgh3;
        zzgh zzgh4;
        zzgh zzgh5;
        zzgh zzgh6;
        zzgh zzgh7;
        zza = zzgh7 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzgh6 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED", n3, n3);
        int n4 = 2;
        zzc = zzgh5 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED", n4, n4);
        int n7 = 3;
        zzd = zzgh4 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED", n7, n7);
        int n8 = 4;
        zze = zzgh3 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED", n8, n8);
        int n10 = 5;
        zzf = zzgh2 = new zzgh("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED", n10, n10);
        zzgh[] zzghArray = new zzgh[6];
        zzghArray[0] = zzgh7;
        zzghArray[n3] = zzgh6;
        zzghArray[n4] = zzgh5;
        zzghArray[n7] = zzgh4;
        zzghArray[n8] = zzgh3;
        zzghArray[n10] = zzgh2;
        zzg = zzghArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzgh[] values() {
        return (zzgh[])zzg.clone();
    }

    public static zzgh zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return zzf;
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
        return zzgj.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgh.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzh;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzh;
    }
}


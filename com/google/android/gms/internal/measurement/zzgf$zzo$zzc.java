/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkl;

public final class zzgf$zzo$zzc
extends Enum
implements zzki {
    public static final /* enum */ zzgf$zzo$zzc zza;
    public static final /* enum */ zzgf$zzo$zzc zzb;
    public static final /* enum */ zzgf$zzo$zzc zzc;
    public static final /* enum */ zzgf$zzo$zzc zzd;
    public static final /* enum */ zzgf$zzo$zzc zze;
    private static final /* enum */ zzgf$zzo$zzc zzf;
    private static final /* synthetic */ zzgf$zzo$zzc[] zzg;
    private final int zzh;

    static {
        zzgf$zzo$zzc zzgf$zzo$zzc;
        zzgf$zzo$zzc zzgf$zzo$zzc2;
        zzgf$zzo$zzc zzgf$zzo$zzc3;
        zzgf$zzo$zzc zzgf$zzo$zzc4;
        zzgf$zzo$zzc zzgf$zzo$zzc5;
        zzgf$zzo$zzc zzgf$zzo$zzc6;
        zza = zzgf$zzo$zzc6 = new zzgf$zzo$zzc("SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN", 0, 0);
        int n3 = 1;
        zzb = zzgf$zzo$zzc5 = new zzgf$zzo$zzc("SERVICE_UPLOAD_ELIGIBLE", n3, n3);
        int n4 = 2;
        zzc = zzgf$zzo$zzc4 = new zzgf$zzo$zzc("NOT_IN_ROLLOUT", n4, n4);
        int n7 = 3;
        zzd = zzgf$zzo$zzc3 = new zzgf$zzo$zzc("MISSING_SGTM_SETTINGS", n7, n7);
        int n8 = 4;
        zzf = zzgf$zzo$zzc2 = new zzgf$zzo$zzc("MISSING_SGTM_PROXY_INFO", n8, n8);
        int n10 = 5;
        zze = zzgf$zzo$zzc = new zzgf$zzo$zzc("NON_PLAY_MISSING_SGTM_SERVER_URL", n10, n10);
        zzgf$zzo$zzc[] zzgf$zzo$zzcArray = new zzgf$zzo$zzc[6];
        zzgf$zzo$zzcArray[0] = zzgf$zzo$zzc6;
        zzgf$zzo$zzcArray[n3] = zzgf$zzo$zzc5;
        zzgf$zzo$zzcArray[n4] = zzgf$zzo$zzc4;
        zzgf$zzo$zzcArray[n7] = zzgf$zzo$zzc3;
        zzgf$zzo$zzcArray[n8] = zzgf$zzo$zzc2;
        zzgf$zzo$zzcArray[n10] = zzgf$zzo$zzc;
        zzg = zzgf$zzo$zzcArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgf$zzo$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzgf$zzo$zzc[] values() {
        return (zzgf$zzo$zzc[])zzg.clone();
    }

    public static zzgf$zzo$zzc zza(int n3) {
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
                            return zze;
                        }
                        return zzf;
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
        return zzgn.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgf$zzo$zzc.class.getName();
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


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfu;
import com.google.android.gms.internal.vision.zzfv;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zzg$zzd
extends Enum
implements zzje {
    public static final /* enum */ zzfi$zzg$zzd zza;
    public static final /* enum */ zzfi$zzg$zzd zzb;
    public static final /* enum */ zzfi$zzg$zzd zzc;
    private static final /* enum */ zzfi$zzg$zzd zzd;
    private static final zzjh zze;
    private static final /* synthetic */ zzfi$zzg$zzd[] zzg;
    private final int zzf;

    static {
        zzfi$zzg$zzd zzfi$zzg$zzd;
        zzfi$zzg$zzd zzfi$zzg$zzd2;
        zzfi$zzg$zzd zzfi$zzg$zzd3;
        Object object = new zzfi$zzg$zzd("MODE_UNKNOWN", 0, 0);
        zzd = object;
        int n3 = 1;
        zza = zzfi$zzg$zzd3 = new zzfi$zzg$zzd("MODE_ACCURATE", n3, n3);
        int n4 = 2;
        zzb = zzfi$zzg$zzd2 = new zzfi$zzg$zzd("MODE_FAST", n4, n4);
        int n7 = 3;
        zzc = zzfi$zzg$zzd = new zzfi$zzg$zzd("MODE_SELFIE", n7, n7);
        zzfi$zzg$zzd[] zzfi$zzg$zzdArray = new zzfi$zzg$zzd[4];
        zzfi$zzg$zzdArray[0] = object;
        zzfi$zzg$zzdArray[n3] = zzfi$zzg$zzd3;
        zzfi$zzg$zzdArray[n4] = zzfi$zzg$zzd2;
        zzfi$zzg$zzdArray[n7] = zzfi$zzg$zzd;
        zzg = zzfi$zzg$zzdArray;
        zze = object = new zzfu();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zzg$zzd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzfi$zzg$zzd[] values() {
        return (zzfi$zzg$zzd[])zzg.clone();
    }

    public static zzfi$zzg$zzd zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return zzc;
                }
                return zzb;
            }
            return zza;
        }
        return zzd;
    }

    public static zzjg zzb() {
        return zzfv.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zzg$zzd.class.getName();
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


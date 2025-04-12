/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfq;
import com.google.android.gms.internal.vision.zzfr;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zzg$zzb
extends Enum
implements zzje {
    public static final /* enum */ zzfi$zzg$zzb zza;
    public static final /* enum */ zzfi$zzg$zzb zzb;
    private static final /* enum */ zzfi$zzg$zzb zzc;
    private static final zzjh zzd;
    private static final /* synthetic */ zzfi$zzg$zzb[] zzf;
    private final int zze;

    static {
        zzfi$zzg$zzb zzfi$zzg$zzb;
        zzfi$zzg$zzb zzfi$zzg$zzb2;
        Object object = new zzfi$zzg$zzb("CLASSIFICATION_UNKNOWN", 0, 0);
        zzc = object;
        int n3 = 1;
        zza = zzfi$zzg$zzb2 = new zzfi$zzg$zzb("CLASSIFICATION_NONE", n3, n3);
        int n4 = 2;
        zzb = zzfi$zzg$zzb = new zzfi$zzg$zzb("CLASSIFICATION_ALL", n4, n4);
        zzfi$zzg$zzb[] zzfi$zzg$zzbArray = new zzfi$zzg$zzb[3];
        zzfi$zzg$zzbArray[0] = object;
        zzfi$zzg$zzbArray[n3] = zzfi$zzg$zzb2;
        zzfi$zzg$zzbArray[n4] = zzfi$zzg$zzb;
        zzf = zzfi$zzg$zzbArray;
        zzd = object = new zzfq();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zzg$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfi$zzg$zzb[] values() {
        return (zzfi$zzg$zzb[])zzf.clone();
    }

    public static zzfi$zzg$zzb zza(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzb;
            }
            return zza;
        }
        return zzc;
    }

    public static zzjg zzb() {
        return zzfr.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zzg$zzb.class.getName();
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


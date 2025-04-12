/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfm;
import com.google.android.gms.internal.vision.zzfn;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zze$zzb
extends Enum
implements zzje {
    private static final /* enum */ zzfi$zze$zzb zza;
    private static final /* enum */ zzfi$zze$zzb zzb;
    private static final /* enum */ zzfi$zze$zzb zzc;
    private static final /* enum */ zzfi$zze$zzb zzd;
    private static final zzjh zze;
    private static final /* synthetic */ zzfi$zze$zzb[] zzg;
    private final int zzf;

    static {
        zzfi$zze$zzb zzfi$zze$zzb;
        zzfi$zze$zzb zzfi$zze$zzb2;
        zzfi$zze$zzb zzfi$zze$zzb3;
        Object object = new zzfi$zze$zzb("REASON_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfi$zze$zzb3 = new zzfi$zze$zzb("REASON_MISSING", n3, n3);
        int n4 = 2;
        zzc = zzfi$zze$zzb2 = new zzfi$zze$zzb("REASON_UPGRADE", n4, n4);
        int n7 = 3;
        zzd = zzfi$zze$zzb = new zzfi$zze$zzb("REASON_INVALID", n7, n7);
        zzfi$zze$zzb[] zzfi$zze$zzbArray = new zzfi$zze$zzb[4];
        zzfi$zze$zzbArray[0] = object;
        zzfi$zze$zzbArray[n3] = zzfi$zze$zzb3;
        zzfi$zze$zzbArray[n4] = zzfi$zze$zzb2;
        zzfi$zze$zzbArray[n7] = zzfi$zze$zzb;
        zzg = zzfi$zze$zzbArray;
        zze = object = new zzfm();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zze$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzfi$zze$zzb[] values() {
        return (zzfi$zze$zzb[])zzg.clone();
    }

    public static zzfi$zze$zzb zza(int n3) {
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
        return zzfn.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zze$zzb.class.getName();
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


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfs;
import com.google.android.gms.internal.vision.zzft;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zzg$zzc
extends Enum
implements zzje {
    public static final /* enum */ zzfi$zzg$zzc zza;
    public static final /* enum */ zzfi$zzg$zzc zzb;
    public static final /* enum */ zzfi$zzg$zzc zzc;
    private static final /* enum */ zzfi$zzg$zzc zzd;
    private static final zzjh zze;
    private static final /* synthetic */ zzfi$zzg$zzc[] zzg;
    private final int zzf;

    static {
        zzfi$zzg$zzc zzfi$zzg$zzc;
        zzfi$zzg$zzc zzfi$zzg$zzc2;
        zzfi$zzg$zzc zzfi$zzg$zzc3;
        Object object = new zzfi$zzg$zzc("LANDMARK_UNKNOWN", 0, 0);
        zzd = object;
        int n3 = 1;
        zza = zzfi$zzg$zzc3 = new zzfi$zzg$zzc("LANDMARK_NONE", n3, n3);
        int n4 = 2;
        zzb = zzfi$zzg$zzc2 = new zzfi$zzg$zzc("LANDMARK_ALL", n4, n4);
        int n7 = 3;
        zzc = zzfi$zzg$zzc = new zzfi$zzg$zzc("LANDMARK_CONTOUR", n7, n7);
        zzfi$zzg$zzc[] zzfi$zzg$zzcArray = new zzfi$zzg$zzc[4];
        zzfi$zzg$zzcArray[0] = object;
        zzfi$zzg$zzcArray[n3] = zzfi$zzg$zzc3;
        zzfi$zzg$zzcArray[n4] = zzfi$zzg$zzc2;
        zzfi$zzg$zzcArray[n7] = zzfi$zzg$zzc;
        zzg = zzfi$zzg$zzcArray;
        zze = object = new zzft();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zzg$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzfi$zzg$zzc[] values() {
        return (zzfi$zzg$zzc[])zzg.clone();
    }

    public static zzfi$zzg$zzc zza(int n3) {
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
        return zzfs.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zzg$zzc.class.getName();
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


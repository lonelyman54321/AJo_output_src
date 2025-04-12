/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfw;
import com.google.android.gms.internal.vision.zzfx;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzfi$zzj$zza
extends Enum
implements zzje {
    private static final /* enum */ zzfi$zzj$zza zza;
    private static final /* enum */ zzfi$zzj$zza zzb;
    private static final /* enum */ zzfi$zzj$zza zzc;
    private static final /* enum */ zzfi$zzj$zza zzd;
    private static final zzjh zze;
    private static final /* synthetic */ zzfi$zzj$zza[] zzg;
    private final int zzf;

    static {
        zzfi$zzj$zza zzfi$zzj$zza;
        zzfi$zzj$zza zzfi$zzj$zza2;
        zzfi$zzj$zza zzfi$zzj$zza3;
        Object object = new zzfi$zzj$zza("FORMAT_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfi$zzj$zza3 = new zzfi$zzj$zza("FORMAT_LUMINANCE", n3, n3);
        int n4 = 2;
        zzc = zzfi$zzj$zza2 = new zzfi$zzj$zza("FORMAT_RGB8", n4, n4);
        int n7 = 3;
        zzd = zzfi$zzj$zza = new zzfi$zzj$zza("FORMAT_MONOCHROME", n7, n7);
        zzfi$zzj$zza[] zzfi$zzj$zzaArray = new zzfi$zzj$zza[4];
        zzfi$zzj$zzaArray[0] = object;
        zzfi$zzj$zzaArray[n3] = zzfi$zzj$zza3;
        zzfi$zzj$zzaArray[n4] = zzfi$zzj$zza2;
        zzfi$zzj$zzaArray[n7] = zzfi$zzj$zza;
        zzg = zzfi$zzj$zzaArray;
        zze = object = new zzfx();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfi$zzj$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzfi$zzj$zza[] values() {
        return (zzfi$zzj$zza[])zzg.clone();
    }

    public static zzfi$zzj$zza zza(int n3) {
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
        return zzfw.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzfi$zzj$zza.class.getName();
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


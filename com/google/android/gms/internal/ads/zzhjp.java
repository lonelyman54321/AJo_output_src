/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhjn;

public final class zzhjp
extends Enum
implements zzhbs {
    public static final /* enum */ zzhjp zza;
    public static final /* enum */ zzhjp zzb;
    public static final /* enum */ zzhjp zzc;
    public static final /* enum */ zzhjp zzd;
    public static final /* enum */ zzhjp zze;
    public static final /* enum */ zzhjp zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzhjp[] zzh;
    private final int zzi;

    static {
        zzhjp zzhjp2;
        zzhjp zzhjp3;
        zzhjp zzhjp4;
        zzhjp zzhjp5;
        zzhjp zzhjp6;
        Object object = new zzhjp("UNDEFINED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhjp6 = new zzhjp("BROWSER_INITIATED", n3, n3);
        int n4 = 2;
        zzc = zzhjp5 = new zzhjp("RENDERER_INITIATED_WITHOUT_USER_GESTURE", n4, n4);
        int n7 = 3;
        zzd = zzhjp4 = new zzhjp("RENDERER_INITIATED_WITH_USER_GESTURE", n7, n7);
        int n8 = 4;
        zze = zzhjp3 = new zzhjp("COPY_PASTE_USER_INITIATED", n8, n8);
        int n10 = 5;
        zzf = zzhjp2 = new zzhjp("NOTIFICATION_INITIATED", n10, n10);
        zzhjp[] zzhjpArray = new zzhjp[6];
        zzhjpArray[0] = object;
        zzhjpArray[n3] = zzhjp6;
        zzhjpArray[n4] = zzhjp5;
        zzhjpArray[n7] = zzhjp4;
        zzhjpArray[n8] = zzhjp3;
        zzhjpArray[n10] = zzhjp2;
        zzh = zzhjpArray;
        zzg = object = new zzhjn();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhjp() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzhjp[] values() {
        return (zzhjp[])zzh.clone();
    }

    public static zzhjp zzb(int n3) {
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

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}


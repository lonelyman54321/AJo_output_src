/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgg;

public final class zzge$zze$zzb
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzge$zze$zzb zzuc;
    private static final /* enum */ zzge$zze$zzb zzud;
    private static final /* enum */ zzge$zze$zzb zzue;
    private static final /* enum */ zzge$zze$zzb zzuf;
    private static final /* enum */ zzge$zze$zzb zzug;
    private static final /* synthetic */ zzge$zze$zzb[] zzuh;
    private final int value;

    static {
        zzge$zze$zzb zzge$zze$zzb;
        zzge$zze$zzb zzge$zze$zzb2;
        zzge$zze$zzb zzge$zze$zzb3;
        zzge$zze$zzb zzge$zze$zzb4;
        Object object = new zzge$zze$zzb("CLIENT_UNKNOWN", 0, 0);
        zzuc = object;
        int n3 = 1;
        zzud = zzge$zze$zzb4 = new zzge$zze$zzb("CHIRP", n3, n3);
        int n4 = 2;
        zzue = zzge$zze$zzb3 = new zzge$zze$zzb("WAYMO", n4, n4);
        int n7 = 3;
        zzuf = zzge$zze$zzb2 = new zzge$zze$zzb("GV_ANDROID", n7, n7);
        int n8 = 4;
        zzug = zzge$zze$zzb = new zzge$zze$zzb("GV_IOS", n8, n8);
        zzge$zze$zzb[] zzge$zze$zzbArray = new zzge$zze$zzb[5];
        zzge$zze$zzbArray[0] = object;
        zzge$zze$zzbArray[n3] = zzge$zze$zzb4;
        zzge$zze$zzbArray[n4] = zzge$zze$zzb3;
        zzge$zze$zzbArray[n7] = zzge$zze$zzb2;
        zzge$zze$zzbArray[n8] = zzge$zze$zzb;
        zzuh = zzge$zze$zzbArray;
        zzbq = object = new zzgg();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zze$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zze$zzb[] values() {
        return (zzge$zze$zzb[])zzuh.clone();
    }

    public static zzge$zze$zzb zzar(int n3) {
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
                        return zzug;
                    }
                    return zzuf;
                }
                return zzue;
            }
            return zzud;
        }
        return zzuc;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


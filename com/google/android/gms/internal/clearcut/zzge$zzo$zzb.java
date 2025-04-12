/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgl;

public final class zzge$zzo$zzb
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzge$zzo$zzb zzyw;
    private static final /* enum */ zzge$zzo$zzb zzyx;
    private static final /* enum */ zzge$zzo$zzb zzyy;
    private static final /* synthetic */ zzge$zzo$zzb[] zzyz;
    private final int value;

    static {
        zzge$zzo$zzb zzge$zzo$zzb;
        zzge$zzo$zzb zzge$zzo$zzb2;
        Object object = new zzge$zzo$zzb("NONE", 0, 0);
        zzyw = object;
        int n3 = 1;
        zzyx = zzge$zzo$zzb2 = new zzge$zzo$zzb("WALL_CLOCK_SET", n3, n3);
        int n4 = 2;
        zzyy = zzge$zzo$zzb = new zzge$zzo$zzb("DEVICE_BOOT", n4, n4);
        zzge$zzo$zzb[] zzge$zzo$zzbArray = new zzge$zzo$zzb[3];
        zzge$zzo$zzbArray[0] = object;
        zzge$zzo$zzbArray[n3] = zzge$zzo$zzb2;
        zzge$zzo$zzbArray[n4] = zzge$zzo$zzb;
        zzyz = zzge$zzo$zzbArray;
        zzbq = object = new zzgl();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzo$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzo$zzb[] values() {
        return (zzge$zzo$zzb[])zzyz.clone();
    }

    public static zzge$zzo$zzb zzaw(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzyy;
            }
            return zzyx;
        }
        return zzyw;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


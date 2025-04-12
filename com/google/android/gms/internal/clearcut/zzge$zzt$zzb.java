/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgq;

public final class zzge$zzt$zzb
extends Enum
implements zzcj {
    private static final /* enum */ zzge$zzt$zzb zzbgy;
    private static final /* enum */ zzge$zzt$zzb zzbgz;
    private static final /* enum */ zzge$zzt$zzb zzbha;
    private static final /* enum */ zzge$zzt$zzb zzbhb;
    private static final /* enum */ zzge$zzt$zzb zzbhc;
    private static final /* enum */ zzge$zzt$zzb zzbhd;
    private static final /* enum */ zzge$zzt$zzb zzbhe;
    private static final /* synthetic */ zzge$zzt$zzb[] zzbhf;
    private static final zzck zzbq;
    private final int value;

    static {
        zzge$zzt$zzb zzge$zzt$zzb;
        zzge$zzt$zzb zzge$zzt$zzb2;
        zzge$zzt$zzb zzge$zzt$zzb3;
        zzge$zzt$zzb zzge$zzt$zzb4;
        zzge$zzt$zzb zzge$zzt$zzb5;
        zzge$zzt$zzb zzge$zzt$zzb6;
        Object object = new zzge$zzt$zzb("OS_TYPE_UNKNOWN", 0, 0);
        zzbgy = object;
        int n3 = 1;
        zzbgz = zzge$zzt$zzb6 = new zzge$zzt$zzb("OS_TYPE_MAC", n3, n3);
        int n4 = 2;
        zzbha = zzge$zzt$zzb5 = new zzge$zzt$zzb("OS_TYPE_WINDOWS", n4, n4);
        int n7 = 3;
        zzbhb = zzge$zzt$zzb4 = new zzge$zzt$zzb("OS_TYPE_ANDROID", n7, n7);
        int n8 = 4;
        zzbhc = zzge$zzt$zzb3 = new zzge$zzt$zzb("OS_TYPE_CROS", n8, n8);
        int n10 = 5;
        zzbhd = zzge$zzt$zzb2 = new zzge$zzt$zzb("OS_TYPE_LINUX", n10, n10);
        int n14 = 6;
        zzbhe = zzge$zzt$zzb = new zzge$zzt$zzb("OS_TYPE_OPENBSD", n14, n14);
        zzge$zzt$zzb[] zzge$zzt$zzbArray = new zzge$zzt$zzb[7];
        zzge$zzt$zzbArray[0] = object;
        zzge$zzt$zzbArray[n3] = zzge$zzt$zzb6;
        zzge$zzt$zzbArray[n4] = zzge$zzt$zzb5;
        zzge$zzt$zzbArray[n7] = zzge$zzt$zzb4;
        zzge$zzt$zzbArray[n8] = zzge$zzt$zzb3;
        zzge$zzt$zzbArray[n10] = zzge$zzt$zzb2;
        zzge$zzt$zzbArray[n14] = zzge$zzt$zzb;
        zzbhf = zzge$zzt$zzbArray;
        zzbq = object = new zzgq();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzt$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzt$zzb[] values() {
        return (zzge$zzt$zzb[])zzbhf.clone();
    }

    public static zzge$zzt$zzb zzbb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 6: {
                return zzbhe;
            }
            case 5: {
                return zzbhd;
            }
            case 4: {
                return zzbhc;
            }
            case 3: {
                return zzbhb;
            }
            case 2: {
                return zzbha;
            }
            case 1: {
                return zzbgz;
            }
            case 0: 
        }
        return zzbgy;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


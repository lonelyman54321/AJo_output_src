/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgs;

public final class zzge$zzw$zzb
extends Enum
implements zzcj {
    private static final /* enum */ zzge$zzw$zzb zzbhx;
    private static final /* enum */ zzge$zzw$zzb zzbhy;
    private static final /* enum */ zzge$zzw$zzb zzbhz;
    private static final /* enum */ zzge$zzw$zzb zzbia;
    private static final /* enum */ zzge$zzw$zzb zzbib;
    private static final /* enum */ zzge$zzw$zzb zzbic;
    private static final /* synthetic */ zzge$zzw$zzb[] zzbid;
    private static final zzck zzbq;
    private final int value;

    static {
        zzge$zzw$zzb zzge$zzw$zzb;
        zzge$zzw$zzb zzge$zzw$zzb2;
        zzge$zzw$zzb zzge$zzw$zzb3;
        zzge$zzw$zzb zzge$zzw$zzb4;
        zzge$zzw$zzb zzge$zzw$zzb5;
        Object object = new zzge$zzw$zzb("UNKNOWN", 0, 0);
        zzbhx = object;
        int n3 = 1;
        zzbhy = zzge$zzw$zzb5 = new zzge$zzw$zzb("ANDROID_CARDBOARD_SDK", n3, n3);
        int n4 = 2;
        zzbhz = zzge$zzw$zzb4 = new zzge$zzw$zzb("IOS_CARDBOARD_SDK", n4, n4);
        int n7 = 3;
        zzbia = zzge$zzw$zzb3 = new zzge$zzw$zzb("ANDROID_UNITY_SDK", n7, n7);
        int n8 = 4;
        zzbib = zzge$zzw$zzb2 = new zzge$zzw$zzb("IOS_UNITY_SDK", n8, n8);
        int n10 = 5;
        zzbic = zzge$zzw$zzb = new zzge$zzw$zzb("WINDOWS", n10, n10);
        zzge$zzw$zzb[] zzge$zzw$zzbArray = new zzge$zzw$zzb[6];
        zzge$zzw$zzbArray[0] = object;
        zzge$zzw$zzbArray[n3] = zzge$zzw$zzb5;
        zzge$zzw$zzbArray[n4] = zzge$zzw$zzb4;
        zzge$zzw$zzbArray[n7] = zzge$zzw$zzb3;
        zzge$zzw$zzbArray[n8] = zzge$zzw$zzb2;
        zzge$zzw$zzbArray[n10] = zzge$zzw$zzb;
        zzbid = zzge$zzw$zzbArray;
        zzbq = object = new zzgs();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzw$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzw$zzb[] values() {
        return (zzge$zzw$zzb[])zzbid.clone();
    }

    public static zzge$zzw$zzb zzbd(int n3) {
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
                            return zzbic;
                        }
                        return zzbib;
                    }
                    return zzbia;
                }
                return zzbhz;
            }
            return zzbhy;
        }
        return zzbhx;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


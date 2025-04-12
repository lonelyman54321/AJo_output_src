/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgj;

public final class zzge$zzn$zzb
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzge$zzn$zzb zzxf;
    private static final /* enum */ zzge$zzn$zzb zzxg;
    private static final /* enum */ zzge$zzn$zzb zzxh;
    private static final /* enum */ zzge$zzn$zzb zzxi;
    private static final /* enum */ zzge$zzn$zzb zzxj;
    private static final /* synthetic */ zzge$zzn$zzb[] zzxk;
    private final int value;

    static {
        zzge$zzn$zzb zzge$zzn$zzb;
        zzge$zzn$zzb zzge$zzn$zzb2;
        zzge$zzn$zzb zzge$zzn$zzb3;
        zzge$zzn$zzb zzge$zzn$zzb4;
        Object object = new zzge$zzn$zzb("UNKNOWN", 0, 0);
        zzxf = object;
        int n3 = 1;
        zzxg = zzge$zzn$zzb4 = new zzge$zzn$zzb("MOBILE", n3, n3);
        int n4 = 2;
        zzxh = zzge$zzn$zzb3 = new zzge$zzn$zzb("TABLET", n4, n4);
        int n7 = 3;
        zzxi = zzge$zzn$zzb2 = new zzge$zzn$zzb("DESKTOP", n7, n7);
        int n8 = 4;
        zzxj = zzge$zzn$zzb = new zzge$zzn$zzb("GOOGLE_HOME", n8, n8);
        zzge$zzn$zzb[] zzge$zzn$zzbArray = new zzge$zzn$zzb[5];
        zzge$zzn$zzbArray[0] = object;
        zzge$zzn$zzbArray[n3] = zzge$zzn$zzb4;
        zzge$zzn$zzbArray[n4] = zzge$zzn$zzb3;
        zzge$zzn$zzbArray[n7] = zzge$zzn$zzb2;
        zzge$zzn$zzbArray[n8] = zzge$zzn$zzb;
        zzxk = zzge$zzn$zzbArray;
        zzbq = object = new zzgj();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzn$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzn$zzb[] values() {
        return (zzge$zzn$zzb[])zzxk.clone();
    }

    public static zzge$zzn$zzb zzau(int n3) {
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
                        return zzxj;
                    }
                    return zzxi;
                }
                return zzxh;
            }
            return zzxg;
        }
        return zzxf;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


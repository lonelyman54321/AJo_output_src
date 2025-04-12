/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgk;

public final class zzge$zzn$zzc
extends Enum
implements zzcj {
    private static final zzck zzbq;
    private static final /* enum */ zzge$zzn$zzc zzxl;
    private static final /* enum */ zzge$zzn$zzc zzxm;
    private static final /* enum */ zzge$zzn$zzc zzxn;
    private static final /* enum */ zzge$zzn$zzc zzxo;
    private static final /* enum */ zzge$zzn$zzc zzxp;
    private static final /* enum */ zzge$zzn$zzc zzxq;
    private static final /* enum */ zzge$zzn$zzc zzxr;
    private static final /* enum */ zzge$zzn$zzc zzxs;
    private static final /* enum */ zzge$zzn$zzc zzxt;
    private static final /* enum */ zzge$zzn$zzc zzxu;
    private static final /* synthetic */ zzge$zzn$zzc[] zzxv;
    private final int value;

    static {
        zzge$zzn$zzc zzge$zzn$zzc;
        zzge$zzn$zzc zzge$zzn$zzc2;
        zzge$zzn$zzc zzge$zzn$zzc3;
        zzge$zzn$zzc zzge$zzn$zzc4;
        zzge$zzn$zzc zzge$zzn$zzc5;
        zzge$zzn$zzc zzge$zzn$zzc6;
        zzge$zzn$zzc zzge$zzn$zzc7;
        zzge$zzn$zzc zzge$zzn$zzc8;
        zzge$zzn$zzc zzge$zzn$zzc9;
        Object object = new zzge$zzn$zzc("OS_UNKNOWN", 0, 0);
        zzxl = object;
        int n3 = 1;
        zzxm = zzge$zzn$zzc9 = new zzge$zzn$zzc("MAC", n3, n3);
        int n4 = 2;
        zzxn = zzge$zzn$zzc8 = new zzge$zzn$zzc("WINDOWS", n4, n4);
        int n7 = 3;
        zzxo = zzge$zzn$zzc7 = new zzge$zzn$zzc("ANDROID", n7, n7);
        int n8 = 4;
        zzxp = zzge$zzn$zzc6 = new zzge$zzn$zzc("LINUX", n8, n8);
        int n10 = 5;
        zzxq = zzge$zzn$zzc5 = new zzge$zzn$zzc("CHROME_OS", n10, n10);
        int n14 = 6;
        zzxr = zzge$zzn$zzc4 = new zzge$zzn$zzc("IPAD", n14, n14);
        n14 = 7;
        zzxs = zzge$zzn$zzc3 = new zzge$zzn$zzc("IPHONE", n14, n14);
        n10 = 8;
        zzxt = zzge$zzn$zzc2 = new zzge$zzn$zzc("IPOD", n10, n10);
        n8 = 9;
        zzxu = zzge$zzn$zzc = new zzge$zzn$zzc("CHROMECAST", n8, n8);
        zzge$zzn$zzc[] zzge$zzn$zzcArray = new zzge$zzn$zzc[10];
        zzge$zzn$zzcArray[0] = object;
        zzge$zzn$zzcArray[n3] = zzge$zzn$zzc9;
        zzge$zzn$zzcArray[n4] = zzge$zzn$zzc8;
        zzge$zzn$zzcArray[n7] = zzge$zzn$zzc7;
        zzge$zzn$zzcArray[4] = zzge$zzn$zzc6;
        zzge$zzn$zzcArray[5] = zzge$zzn$zzc5;
        zzge$zzn$zzcArray[6] = zzge$zzn$zzc4;
        zzge$zzn$zzcArray[7] = zzge$zzn$zzc3;
        zzge$zzn$zzcArray[8] = zzge$zzn$zzc2;
        zzge$zzn$zzcArray[n8] = zzge$zzn$zzc;
        zzxv = zzge$zzn$zzcArray;
        zzbq = object = new zzgk();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzn$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzn$zzc[] values() {
        return (zzge$zzn$zzc[])zzxv.clone();
    }

    public static zzge$zzn$zzc zzav(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 9: {
                return zzxu;
            }
            case 8: {
                return zzxt;
            }
            case 7: {
                return zzxs;
            }
            case 6: {
                return zzxr;
            }
            case 5: {
                return zzxq;
            }
            case 4: {
                return zzxp;
            }
            case 3: {
                return zzxo;
            }
            case 2: {
                return zzxn;
            }
            case 1: {
                return zzxm;
            }
            case 0: 
        }
        return zzxl;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgn;

public final class zzge$zzq$zzc
extends Enum
implements zzcj {
    private static final /* enum */ zzge$zzq$zzc zzbes;
    private static final /* enum */ zzge$zzq$zzc zzbet;
    private static final /* enum */ zzge$zzq$zzc zzbeu;
    private static final /* enum */ zzge$zzq$zzc zzbev;
    private static final /* enum */ zzge$zzq$zzc zzbew;
    private static final /* enum */ zzge$zzq$zzc zzbex;
    private static final /* synthetic */ zzge$zzq$zzc[] zzbey;
    private static final zzck zzbq;
    private final int value;

    static {
        zzge$zzq$zzc zzge$zzq$zzc;
        zzge$zzq$zzc zzge$zzq$zzc2;
        zzge$zzq$zzc zzge$zzq$zzc3;
        zzge$zzq$zzc zzge$zzq$zzc4;
        zzge$zzq$zzc zzge$zzq$zzc5;
        Object object = new zzge$zzq$zzc("UNKNOWN_SCHEDULER", 0, 0);
        zzbes = object;
        int n3 = 1;
        zzbet = zzge$zzq$zzc5 = new zzge$zzq$zzc("ASAP", n3, n3);
        int n4 = 2;
        zzbeu = zzge$zzq$zzc4 = new zzge$zzq$zzc("DEFAULT_PERIODIC", n4, n4);
        int n7 = 3;
        zzbev = zzge$zzq$zzc3 = new zzge$zzq$zzc("QOS_FAST_ONEOFF", n7, n7);
        int n8 = 4;
        zzbew = zzge$zzq$zzc2 = new zzge$zzq$zzc("QOS_DEFAULT_PERIODIC", n8, n8);
        int n10 = 5;
        zzbex = zzge$zzq$zzc = new zzge$zzq$zzc("QOS_UNMETERED_PERIODIC", n10, n10);
        zzge$zzq$zzc[] zzge$zzq$zzcArray = new zzge$zzq$zzc[6];
        zzge$zzq$zzcArray[0] = object;
        zzge$zzq$zzcArray[n3] = zzge$zzq$zzc5;
        zzge$zzq$zzcArray[n4] = zzge$zzq$zzc4;
        zzge$zzq$zzcArray[n7] = zzge$zzq$zzc3;
        zzge$zzq$zzcArray[n8] = zzge$zzq$zzc2;
        zzge$zzq$zzcArray[n10] = zzge$zzq$zzc;
        zzbey = zzge$zzq$zzcArray;
        zzbq = object = new zzgn();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzq$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzq$zzc[] values() {
        return (zzge$zzq$zzc[])zzbey.clone();
    }

    public static zzge$zzq$zzc zzay(int n3) {
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
                            return zzbex;
                        }
                        return zzbew;
                    }
                    return zzbev;
                }
                return zzbeu;
            }
            return zzbet;
        }
        return zzbes;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


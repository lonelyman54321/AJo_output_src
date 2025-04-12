/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgr;

public final class zzge$zzv$zzb
extends Enum
implements zzcj {
    public static final /* enum */ zzge$zzv$zzb zzbhk;
    private static final /* enum */ zzge$zzv$zzb zzbhl;
    private static final /* enum */ zzge$zzv$zzb zzbhm;
    private static final /* enum */ zzge$zzv$zzb zzbhn;
    private static final /* enum */ zzge$zzv$zzb zzbho;
    private static final /* synthetic */ zzge$zzv$zzb[] zzbhp;
    private static final zzck zzbq;
    private final int value;

    static {
        zzge$zzv$zzb zzge$zzv$zzb;
        zzge$zzv$zzb zzge$zzv$zzb2;
        zzge$zzv$zzb zzge$zzv$zzb3;
        zzge$zzv$zzb zzge$zzv$zzb4;
        Object object = new zzge$zzv$zzb("DEFAULT", 0, 0);
        zzbhk = object;
        int n3 = 1;
        zzbhl = zzge$zzv$zzb4 = new zzge$zzv$zzb("UNMETERED_ONLY", n3, n3);
        int n4 = 2;
        zzbhm = zzge$zzv$zzb3 = new zzge$zzv$zzb("UNMETERED_OR_DAILY", n4, n4);
        int n7 = 3;
        zzbhn = zzge$zzv$zzb2 = new zzge$zzv$zzb("FAST_IF_RADIO_AWAKE", n7, n7);
        int n8 = 4;
        zzbho = zzge$zzv$zzb = new zzge$zzv$zzb("NEVER", n8, n8);
        zzge$zzv$zzb[] zzge$zzv$zzbArray = new zzge$zzv$zzb[5];
        zzge$zzv$zzbArray[0] = object;
        zzge$zzv$zzbArray[n3] = zzge$zzv$zzb4;
        zzge$zzv$zzbArray[n4] = zzge$zzv$zzb3;
        zzge$zzv$zzbArray[n7] = zzge$zzv$zzb2;
        zzge$zzv$zzbArray[n8] = zzge$zzv$zzb;
        zzbhp = zzge$zzv$zzbArray;
        zzbq = object = new zzgr();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzv$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzv$zzb[] values() {
        return (zzge$zzv$zzb[])zzbhp.clone();
    }

    public static zzge$zzv$zzb zzbc(int n3) {
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
                        return zzbho;
                    }
                    return zzbhn;
                }
                return zzbhm;
            }
            return zzbhl;
        }
        return zzbhk;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}


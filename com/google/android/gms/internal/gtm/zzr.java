/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzq;
import java.util.List;

public final class zzr
extends zzacf
implements zzadm {
    private static final zzr zza;
    private int zzd;
    private zzack zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private byte zzj = (byte)2;

    static {
        zzr zzr2;
        zza = zzr2 = new zzr();
        zzacf.zzao(zzr.class, zzr2);
    }

    private zzr() {
        zzack zzack2;
        this.zze = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzr zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n14) {
                if (n3 != n10) {
                    n10 = 0;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzj = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzq zzq2 = new zzq(null);
                    return zzq2;
                }
                zzr zzr2 = new zzr();
                return zzr2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[n4] = "zzi";
            objectArray[n14] = "zzf";
            objectArray[n10] = "zze";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            return zzacf.zzal(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001\u1007\u0003\u0002\u1504\u0000\u0003\u0016\u0004\u1004\u0001\u0006\u1007\u0002", objectArray);
        }
        return this.zzj;
    }

    public final List zzc() {
        return this.zze;
    }
}


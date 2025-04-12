/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzf;
import com.google.android.gms.internal.gtm.zzi;

public final class zzj
extends zzacf
implements zzadm {
    private static final zzj zza;
    private int zzd;
    private zzacn zze;
    private zzacn zzf;
    private zzacn zzg;
    private zzacn zzh;
    private zzacn zzi;
    private zzacn zzj;
    private zzap zzk;
    private byte zzl = (byte)2;

    static {
        zzj zzj2;
        zza = zzj2 = new zzj();
        zzacf.zzao(zzj.class, zzj2);
    }

    private zzj() {
        zzacn zzacn2;
        this.zze = zzacn2 = zzacf.zzai();
        this.zzf = zzacn2 = zzacf.zzai();
        this.zzg = zzacn2 = zzacf.zzai();
        this.zzh = zzacn2 = zzacf.zzai();
        this.zzi = zzacn2 = zzacf.zzai();
        this.zzj = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzj zza() {
        return zza;
    }

    public final Object zzb(int n3, Object clazz, Object object) {
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
                            if (clazz == null) {
                                n4 = 0;
                            }
                            this.zzl = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzi zzi2 = new zzi(null);
                    return zzi2;
                }
                zzj zzj2 = new zzj();
                return zzj2;
            }
            Object[] objectArray = new Object[14];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n14] = clazz = zzf.class;
            objectArray[n10] = "zzf";
            objectArray[n8] = clazz;
            objectArray[n7] = "zzg";
            objectArray[6] = clazz;
            objectArray[7] = "zzh";
            objectArray[8] = clazz;
            objectArray[9] = "zzi";
            objectArray[10] = clazz;
            objectArray[11] = "zzj";
            objectArray[12] = clazz;
            objectArray[13] = "zzk";
            return zzacf.zzal(zza, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001\u041b\u0002\u041b\u0003\u041b\u0004\u041b\u0005\u041b\u0006\u041b\u0007\u1409\u0000", objectArray);
        }
        return this.zzl;
    }
}


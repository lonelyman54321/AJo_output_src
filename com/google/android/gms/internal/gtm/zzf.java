/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zze;
import com.google.android.gms.internal.gtm.zzh;

public final class zzf
extends zzacf
implements zzadm {
    private static final zzf zza;
    private int zzd;
    private zzacn zze;
    private zzap zzf;
    private String zzg;
    private byte zzh = (byte)2;

    static {
        zzf zzf2;
        zza = zzf2 = new zzf();
        zzacf.zzao(zzf.class, zzf2);
    }

    private zzf() {
        zzacn zzacn2;
        this.zze = zzacn2 = zzacf.zzai();
        this.zzg = "";
    }

    public static /* bridge */ /* synthetic */ zzf zza() {
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
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zze zze2 = new zze(null);
                    return zze2;
                }
                zzf zzf2 = new zzf();
                return zzf2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n14] = zzh.class;
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u1008\u0001", objectArray);
        }
        return this.zzh;
    }
}


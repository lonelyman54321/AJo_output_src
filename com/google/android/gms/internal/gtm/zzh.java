/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzg;

public final class zzh
extends zzacf
implements zzadm {
    private static final zzh zza;
    private int zzd;
    private String zze = "";
    private zzap zzf;
    private byte zzg = (byte)2;

    static {
        zzh zzh2;
        zza = zzh2 = new zzh();
        zzacf.zzao(zzh.class, zzh2);
    }

    private zzh() {
    }

    public static /* bridge */ /* synthetic */ zzh zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n7 = 4;
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzg = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzg zzg2 = new zzg(null);
                    return zzg2;
                }
                zzh zzh2 = new zzh();
                return zzh2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", objectArray);
        }
        return this.zzg;
    }
}


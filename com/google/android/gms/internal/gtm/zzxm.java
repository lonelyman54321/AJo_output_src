/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzxl;
import com.google.android.gms.internal.gtm.zzxo;

public final class zzxm
extends zzacf
implements zzadm {
    private static final zzxm zza;
    private int zzd;
    private zzxo zze;
    private long zzf;
    private byte zzg = (byte)2;

    static {
        zzxm zzxm2;
        zza = zzxm2 = new zzxm();
        zzacf.zzao(zzxm.class, zzxm2);
    }

    private zzxm() {
    }

    public static /* bridge */ /* synthetic */ zzxm zza() {
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
                    zzxl zzxl2 = new zzxl(null);
                    return zzxl2;
                }
                zzxm zzxm2 = new zzxm();
                return zzxm2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", objectArray);
        }
        return this.zzg;
    }
}


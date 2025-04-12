/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzwq;
import com.google.android.gms.internal.gtm.zzxj;
import com.google.android.gms.internal.gtm.zzxm;
import com.google.android.gms.internal.gtm.zzxo;

public final class zzwr
extends zzacf
implements zzadm {
    private static final zzwr zza;
    private int zzd = 0;
    private Object zze;
    private int zzf = 0;
    private Object zzg;
    private byte zzh = (byte)2;

    static {
        zzwr zzwr2;
        zza = zzwr2 = new zzwr();
        zzacf.zzao(zzwr.class, zzwr2);
    }

    private zzwr() {
    }

    public static /* bridge */ /* synthetic */ zzwr zza() {
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
                    zzwq zzwq2 = new zzwq(null);
                    return zzwq2;
                }
                zzwr zzwr2 = new zzwr();
                return zzwr2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzd";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzf";
            objectArray[n8] = zzxo.class;
            objectArray[n7] = zzxj.class;
            objectArray[6] = zzxm.class;
            return zzacf.zzal(zza, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u043c\u0000\u0002\u043c\u0001\u0003\u043c\u0000\u0004;\u0000\u0005;\u0001", objectArray);
        }
        return this.zzh;
    }
}


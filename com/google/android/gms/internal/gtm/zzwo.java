/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzwn;
import com.google.android.gms.internal.gtm.zzwr;

public final class zzwo
extends zzacf
implements zzadm {
    private static final zzwo zza;
    private int zzd;
    private zzwr zze;
    private byte zzf = (byte)2;

    static {
        zzwo zzwo2;
        zza = zzwo2 = new zzwo();
        zzacf.zzao(zzwo.class, zzwo2);
    }

    private zzwo() {
    }

    public static /* bridge */ /* synthetic */ zzwo zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzf = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzwn zzwn2 = new zzwn(null);
                    return zzwn2;
                }
                zzwo zzwo2 = new zzwo();
                return zzwo2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", objectArray);
        }
        return this.zzf;
    }
}


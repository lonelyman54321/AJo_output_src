/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzsn;
import com.google.android.gms.internal.gtm.zzsp;

public final class zzsq
extends zzacf
implements zzadm {
    private static final zzsq zza;
    private zzacn zzd;

    static {
        zzsq zzsq2;
        zza = zzsq2 = new zzsq();
        zzacf.zzao(zzsq.class, zzsq2);
    }

    private zzsq() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzsq zza() {
        return zza;
    }

    public static zzsq zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzsn zzsn2 = new zzsn(null);
                    return zzsn2;
                }
                zzsq zzsq2 = new zzsq();
                return zzsq2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = zzsp.class;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objectArray);
        }
        return (byte)n4;
    }
}


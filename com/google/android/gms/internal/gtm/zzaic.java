/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahz;
import com.google.android.gms.internal.gtm.zzaia;

public final class zzaic
extends zzacf
implements zzadm {
    private static final zzaic zza;
    private int zzd;
    private zzahz zze;

    static {
        zzaic zzaic2;
        zza = zzaic2 = new zzaic();
        zzacf.zzao(zzaic.class, zzaic2);
    }

    private zzaic() {
    }

    public static /* bridge */ /* synthetic */ zzaic zzc() {
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
                    zzaia zzaia2 = new zzaia(null);
                    return zzaia2;
                }
                zzaic zzaic2 = new zzaic();
                return zzaic2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", objectArray);
        }
        return (byte)n4;
    }
}


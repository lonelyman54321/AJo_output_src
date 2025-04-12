/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahq;

public final class zzahr
extends zzacf
implements zzadm {
    private static final zzahr zza;
    private int zzd;
    private String zze = "";

    static {
        zzahr zzahr2;
        zza = zzahr2 = new zzahr();
        zzacf.zzao(zzahr.class, zzahr2);
    }

    private zzahr() {
    }

    public static /* bridge */ /* synthetic */ zzahr zzc() {
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
                    zzahq zzahq2 = new zzahq(null);
                    return zzahq2;
                }
                zzahr zzahr2 = new zzahr();
                return zzahr2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", objectArray);
        }
        return (byte)n4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzwx;
import com.google.android.gms.internal.gtm.zzxd;

public final class zzwy
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzwy zzd;

    static {
        zzwy zzwy2;
        zzd = zzwy2 = new zzwy();
        zzacf.zzao(zzwy.class, zzwy2);
        zzxd zzxd2 = zzxd.zzc();
        zzaex zzaex2 = zzaex.zze;
        zza = zzacf.zzab(zzxd2, null, null, 330, zzaex2, false, Integer.class);
    }

    private zzwy() {
    }

    public static /* bridge */ /* synthetic */ zzwy zza() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        if ((n3 += -1) != 0) {
            int n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zzd;
                        }
                        throw null;
                    }
                    zzwx zzwx2 = new zzwx(null);
                    return zzwx2;
                }
                zzwy zzwy2 = new zzwy();
                return zzwy2;
            }
            return zzacf.zzal(zzd, "\u0001\u0000", null);
        }
        return (byte)1;
    }
}


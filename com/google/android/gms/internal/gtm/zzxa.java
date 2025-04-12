/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzwz;
import com.google.android.gms.internal.gtm.zzxd;

public final class zzxa
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzxa zzd;

    static {
        zzxa zzxa2;
        zzd = zzxa2 = new zzxa();
        zzacf.zzao(zzxa.class, zzxa2);
        zzxd zzxd2 = zzxd.zzc();
        zzaex zzaex2 = zzaex.zzi;
        zza = zzacf.zzab(zzxd2, null, null, 260, zzaex2, false, String.class);
    }

    private zzxa() {
    }

    public static /* bridge */ /* synthetic */ zzxa zza() {
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
                    zzwz zzwz2 = new zzwz(null);
                    return zzwz2;
                }
                zzxa zzxa2 = new zzxa();
                return zzxa2;
            }
            return zzacf.zzal(zzd, "\u0001\u0000", null);
        }
        return (byte)1;
    }
}


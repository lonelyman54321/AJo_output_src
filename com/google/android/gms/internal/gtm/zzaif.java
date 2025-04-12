/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaic;
import com.google.android.gms.internal.gtm.zzaid;
import com.google.android.gms.internal.gtm.zzaii;

public final class zzaif
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzaif zzd;
    private int zze;
    private zzaic zzf;

    static {
        zzaif zzaif2;
        zzd = zzaif2 = new zzaif();
        zzacf.zzao(zzaif.class, zzaif2);
        zzaii zzaii2 = zzaii.zze();
        zzaex zzaex2 = zzaex.zzk;
        zza = zzacf.zzac(zzaii2, zzaif2, zzaif2, null, 525002763, zzaex2, zzaif.class);
    }

    private zzaif() {
    }

    public static /* bridge */ /* synthetic */ zzaif zzc() {
        return zzd;
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
                            return zzd;
                        }
                        throw null;
                    }
                    zzaid zzaid2 = new zzaid(null);
                    return zzaid2;
                }
                zzaif zzaif2 = new zzaif();
                return zzaif2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            return zzacf.zzal(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objectArray);
        }
        return (byte)n4;
    }
}


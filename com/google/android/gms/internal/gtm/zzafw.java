/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafq;
import com.google.android.gms.internal.gtm.zzafv;
import com.google.android.gms.internal.gtm.zzage;

public final class zzafw
extends zzacf
implements zzadm {
    private static final zzafw zza;
    private int zzd;
    private zzack zze;
    private zzafq zzf;
    private zzafq zzg;

    static {
        zzafw zzafw2;
        zza = zzafw2 = new zzafw();
        zzacf.zzao(zzafw.class, zzafw2);
    }

    private zzafw() {
        zzack zzack2;
        this.zze = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzafw zzc() {
        return zza;
    }

    public static zzafw zze() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    object = null;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzafv zzafv2 = new zzafv(null);
                    return zzafv2;
                }
                zzafw zzafw2 = new zzafw();
                return zzafw2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzage.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u081e\u0002\u1009\u0000\u0003\u1009\u0001", objectArray);
        }
        return by2;
    }
}


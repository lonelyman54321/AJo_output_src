/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaij;
import com.google.android.gms.internal.gtm.zzaik;

public final class zzaim
extends zzacf
implements zzadm {
    private static final zzaim zza;
    private zzack zzd;

    static {
        zzaim zzaim2;
        zza = zzaim2 = new zzaim();
        zzacf.zzao(zzaim.class, zzaim2);
    }

    private zzaim() {
        zzack zzack2;
        this.zzd = zzack2 = zzacf.zzah();
    }

    public static /* bridge */ /* synthetic */ zzaim zzc() {
        return zza;
    }

    public static zzaim zze() {
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
                    object2 = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaik zzaik2 = new zzaik(null);
                    return zzaik2;
                }
                zzaim zzaim2 = new zzaim();
                return zzaim2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = object2 = zzaij.zza;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u081e", objectArray);
        }
        return (byte)n4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzafd;
import com.google.android.gms.internal.gtm.zzafj;
import com.google.android.gms.internal.gtm.zzafk;

public final class zzafe
extends zzacf
implements zzadm {
    private static final zzafe zza;
    private zzacn zzd;
    private zzack zze;
    private zzack zzf;

    static {
        zzafe zzafe2;
        zza = zzafe2 = new zzafe();
        zzacf.zzao(zzafe.class, zzafe2);
    }

    private zzafe() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
        zzacn2 = zzacf.zzah();
        this.zze = zzacn2;
        zzacn2 = zzacf.zzah();
        this.zzf = zzacn2;
    }

    public static /* bridge */ /* synthetic */ zzafe zzc() {
        return zza;
    }

    public static zzafe zze() {
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
                    zzafd zzafd2 = new zzafd(null);
                    return zzafd2;
                }
                zzafe zzafe2 = new zzafe();
                return zzafe2;
            }
            Object[] objectArray = new Object[n4];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzafj.zza;
            objectArray[n8] = "zzf";
            objectArray[n7] = object = zzafk.zza;
            return zzacf.zzal(zza, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u081e\u0005\u082c", objectArray);
        }
        return by2;
    }
}


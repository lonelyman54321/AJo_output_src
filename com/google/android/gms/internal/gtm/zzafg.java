/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaff;
import com.google.android.gms.internal.gtm.zzafj;
import com.google.android.gms.internal.gtm.zzafk;

public final class zzafg
extends zzacf
implements zzadm {
    private static final zzafg zza;
    private zzacn zzd;
    private zzack zze;
    private zzack zzf;
    private zzack zzg;
    private zzacn zzh;

    static {
        zzafg zzafg2;
        zza = zzafg2 = new zzafg();
        zzacf.zzao(zzafg.class, zzafg2);
    }

    private zzafg() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
        zzacn2 = zzacf.zzah();
        this.zze = zzacn2;
        zzacn2 = zzacf.zzah();
        this.zzf = zzacn2;
        zzacn2 = zzacf.zzah();
        this.zzg = zzacn2;
        this.zzh = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzafg zzc() {
        return zza;
    }

    public static zzafg zze() {
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
                    zzaff zzaff2 = new zzaff(null);
                    return zzaff2;
                }
                zzafg zzafg2 = new zzafg();
                return zzafg2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzafj.zza;
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzf";
            objectArray[6] = object = zzafk.zza;
            return zzacf.zzal(zza, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001a\u0002\u081e\u0003\u0016\u0004\u001a\u0005\u082c", objectArray);
        }
        return by2;
    }
}


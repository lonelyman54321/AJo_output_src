/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzf;
import com.google.android.gms.internal.gtm.zzj;
import com.google.android.gms.internal.gtm.zzk;

public final class zzl
extends zzacf
implements zzadm {
    private static final zzl zza;
    private zzacn zzd;
    private zzacn zze;
    private byte zzf = (byte)2;

    static {
        zzl zzl2;
        zza = zzl2 = new zzl();
        zzacf.zzao(zzl.class, zzl2);
    }

    private zzl() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
        this.zze = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzl zza() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzf = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzk zzk2 = new zzk(null);
                    return zzk2;
                }
                zzl zzl2 = new zzl();
                return zzl2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = zzj.class;
            objectArray[n10] = "zze";
            objectArray[n8] = zzf.class;
            return zzacf.zzal(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001\u041b\u0002\u041b", objectArray);
        }
        return this.zzf;
    }
}


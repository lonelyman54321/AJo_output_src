/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzc;
import com.google.android.gms.internal.gtm.zzf;
import com.google.android.gms.internal.gtm.zzl;

public final class zzd
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzd zzd;
    private int zze;
    private zzl zzf;
    private zzf zzg;
    private byte zzh = (byte)2;

    static {
        zzd zzd2;
        zzd = zzd2 = new zzd();
        zzacf.zzao(zzd.class, zzd2);
        zzap zzap2 = zzap.zzi();
        zzaex zzaex2 = zzaex.zzk;
        zza = zzacf.zzac(zzap2, zzd2, zzd2, null, 47497405, zzaex2, zzd.class);
    }

    private zzd() {
    }

    public static /* bridge */ /* synthetic */ zzd zza() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n7 = 4;
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzc zzc2 = new zzc(null);
                    return zzc2;
                }
                zzd zzd2 = new zzd();
                return zzd2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n8] = "zzg";
            return zzacf.zzal(zzd, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", objectArray);
        }
        return this.zzh;
    }
}


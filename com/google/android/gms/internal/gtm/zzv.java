/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzt;
import com.google.android.gms.internal.gtm.zzu;
import java.util.List;

public final class zzv
extends zzacf
implements zzadm {
    private static final zzv zza;
    private zzacn zzd;
    private zzacn zze;
    private zzacn zzf;
    private byte zzg = (byte)2;

    static {
        zzv zzv2;
        zza = zzv2 = new zzv();
        zzacf.zzao(zzv.class, zzv2);
    }

    private zzv() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
        this.zze = zzacn2 = zzacf.zzai();
        this.zzf = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzv zza() {
        return zza;
    }

    public static zzv zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object clazz, Object object) {
        int n4 = 1;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n14) {
                if (n3 != n10) {
                    n10 = 0;
                    if (n3 != n8) {
                        if (n3 != n7) {
                            if (clazz == null) {
                                n4 = 0;
                            }
                            this.zzg = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzu zzu2 = new zzu(null);
                    return zzu2;
                }
                zzv zzv2 = new zzv();
                return zzv2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[n4] = clazz = zzap.class;
            objectArray[n14] = "zze";
            objectArray[n10] = clazz;
            objectArray[n8] = "zzf";
            objectArray[n7] = zzt.class;
            return zzacf.zzal(zza, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001\u041b\u0002\u041b\u0003\u001b", objectArray);
        }
        return this.zzg;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }
}


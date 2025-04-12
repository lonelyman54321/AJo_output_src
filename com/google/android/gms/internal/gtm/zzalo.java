/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalg;
import com.google.android.gms.internal.gtm.zzalk;
import com.google.android.gms.internal.gtm.zzalm;
import com.google.android.gms.internal.gtm.zzaln;

public final class zzalo
extends zzacf
implements zzadm {
    private static final zzalo zza;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private zzacn zzp;
    private zzacn zzq;
    private zzalk zzr;

    static {
        zzalo zzalo2;
        zza = zzalo2 = new zzalo();
        zzacf.zzao(zzalo.class, zzalo2);
    }

    private zzalo() {
        Object object = "";
        this.zzf = object;
        this.zzg = object;
        this.zzk = object;
        this.zzl = object;
        this.zzm = object;
        this.zzn = object;
        this.zzo = object;
        this.zzp = object = zzacf.zzai();
        this.zzq = object = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzalo zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object clazz, Object object) {
        byte by2 = 1;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    by2 = 0;
                    clazz = null;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaln zzaln2 = new zzaln(null);
                    return zzaln2;
                }
                zzalo zzalo2 = new zzalo();
                return zzalo2;
            }
            Object[] objectArray = new Object[18];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            clazz = zzalg.zza;
            objectArray[n10] = clazz;
            objectArray[n8] = "zzf";
            objectArray[n7] = "zzg";
            objectArray[n4] = "zzh";
            objectArray[6] = "zzi";
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            objectArray[9] = "zzl";
            objectArray[10] = "zzm";
            objectArray[11] = "zzn";
            objectArray[12] = "zzo";
            objectArray[13] = "zzp";
            objectArray[14] = clazz = zzalm.class;
            objectArray[15] = "zzq";
            objectArray[16] = clazz;
            objectArray[17] = "zzr";
            return zzacf.zzal(zza, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u1008\t\u000b\u1008\n\f\u001b\r\u001b\u000f\u1009\u000b", objectArray);
        }
        return by2;
    }
}


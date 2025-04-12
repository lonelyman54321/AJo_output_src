/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzamh;
import com.google.android.gms.internal.gtm.zzami;
import com.google.android.gms.internal.gtm.zzamj;
import com.google.android.gms.internal.gtm.zzaml;
import com.google.android.gms.internal.gtm.zzamm;

public final class zzamn
extends zzacf
implements zzadm {
    private static final zzamn zza;
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
    private String zzp;
    private zzacn zzq;
    private zzacn zzr;
    private boolean zzs;
    private zzamh zzt;
    private int zzu;

    static {
        zzamn zzamn2;
        zza = zzamn2 = new zzamn();
        zzacf.zzao(zzamn.class, zzamn2);
    }

    private zzamn() {
        Object object = "";
        this.zzf = object;
        this.zzg = object;
        this.zzk = object;
        this.zzl = object;
        this.zzm = object;
        this.zzn = object;
        this.zzo = object;
        this.zzp = object;
        this.zzq = object = zzacf.zzai();
        this.zzr = object = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzamn zzc() {
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
                    zzami zzami2 = new zzami(null);
                    return zzami2;
                }
                zzamn zzamn2 = new zzamn();
                return zzamn2;
            }
            Object[] objectArray = new Object[22];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzamj.zza;
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
            objectArray[14] = "zzq";
            object = zzaml.class;
            objectArray[15] = object;
            objectArray[16] = "zzr";
            objectArray[17] = object;
            objectArray[18] = "zzs";
            objectArray[19] = "zzt";
            objectArray[20] = "zzu";
            objectArray[21] = object = zzamm.zza;
            return zzacf.zzal(zza, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u1008\t\u000b\u1008\n\f\u1008\u000b\r\u001b\u000e\u001b\u000f\u1007\f\u0010\u1009\r\u0011\u180c\u000e", objectArray);
        }
        return by2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzalg;
import com.google.android.gms.internal.gtm.zzalh;
import com.google.android.gms.internal.gtm.zzalk;

public final class zzali
extends zzacf
implements zzadm {
    private static final zzali zza;
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
    private zzalk zzp;

    static {
        zzali zzali2;
        zza = zzali2 = new zzali();
        zzacf.zzao(zzali.class, zzali2);
    }

    private zzali() {
        String string2;
        this.zzf = string2 = "";
        this.zzg = string2;
        this.zzk = string2;
        this.zzl = string2;
        this.zzm = string2;
        this.zzn = string2;
        this.zzo = string2;
    }

    public static /* bridge */ /* synthetic */ zzali zzc() {
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
                    zzalh zzalh2 = new zzalh(null);
                    return zzalh2;
                }
                zzali zzali2 = new zzali();
                return zzali2;
            }
            Object[] objectArray = new Object[14];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = object = zzalg.zza;
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
            return zzacf.zzal(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1008\b\n\u1008\t\u000b\u1008\n\f\u1009\u000b", objectArray);
        }
        return by2;
    }
}


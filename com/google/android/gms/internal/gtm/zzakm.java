/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaek;
import com.google.android.gms.internal.gtm.zzakl;
import com.google.android.gms.internal.gtm.zzwv;

public final class zzakm
extends zzacf
implements zzadm {
    private static final zzakm zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private int zzo;
    private String zzp;
    private zzwv zzq;
    private zzaek zzr;

    static {
        zzakm zzakm2;
        zza = zzakm2 = new zzakm();
        zzacf.zzao(zzakm.class, zzakm2);
    }

    private zzakm() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzg = string2;
        this.zzh = string2;
        this.zzi = string2;
        this.zzj = string2;
        this.zzk = string2;
        this.zzl = string2;
        this.zzm = string2;
        this.zzp = string2;
    }

    public static /* bridge */ /* synthetic */ zzakm zzc() {
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
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzakl zzakl2 = new zzakl(null);
                    return zzakl2;
                }
                zzakm zzakm2 = new zzakm();
                return zzakm2;
            }
            Object[] objectArray = new Object[15];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            objectArray[6] = "zzk";
            objectArray[7] = "zzl";
            objectArray[8] = "zzm";
            objectArray[9] = "zzn";
            objectArray[10] = "zzo";
            objectArray[11] = "zzp";
            objectArray[12] = "zzj";
            objectArray[13] = "zzq";
            objectArray[14] = "zzr";
            return zzacf.zzal(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0006\u0007\u1008\u0007\b\u1008\b\t\u1002\t\n\u1004\n\u000b\u1008\u000b\f\u1008\u0005\r\u1009\f\u000e\u1009\r", objectArray);
        }
        return by2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacj;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaiq;
import com.google.android.gms.internal.gtm.zzaki;
import com.google.android.gms.internal.gtm.zzakj;
import com.google.android.gms.internal.gtm.zzsy;
import com.google.android.gms.internal.gtm.zzta;

public final class zzakk
extends zzacf
implements zzadm {
    private static final zzakk zza;
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
    private String zzn;
    private String zzo;
    private int zzp;
    private String zzq;
    private boolean zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private int zzv;
    private String zzw;
    private int zzx;

    static {
        zzakk zzakk2;
        zza = zzakk2 = new zzakk();
        zzacf.zzao(zzakk.class, zzakk2);
    }

    private zzakk() {
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
        this.zzn = string2;
        this.zzo = string2;
        this.zzq = string2;
        this.zzw = string2;
    }

    public static /* bridge */ /* synthetic */ zzakk zzc() {
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
                    zzakj zzakj2 = new zzakj(null);
                    return zzakj2;
                }
                zzakk zzakk2 = new zzakk();
                return zzakk2;
            }
            zzacj zzacj2 = zzsy.zza();
            zzacj zzacj3 = zzaiq.zza();
            zzacj zzacj4 = zzta.zza();
            zzacj zzacj5 = zzaiq.zza();
            Object[] objectArray = new Object[26];
            objectArray[0] = "zzd";
            objectArray[by2] = "zzf";
            objectArray[n10] = "zzg";
            objectArray[n8] = "zzk";
            objectArray[n7] = "zzl";
            objectArray[n4] = "zzm";
            objectArray[6] = "zzn";
            objectArray[7] = "zzo";
            objectArray[8] = "zzp";
            objectArray[9] = object = zzaki.zza;
            objectArray[10] = "zze";
            objectArray[11] = "zzq";
            objectArray[12] = "zzr";
            objectArray[13] = "zzs";
            objectArray[14] = zzacj2;
            objectArray[15] = "zzt";
            objectArray[16] = zzacj3;
            objectArray[17] = "zzu";
            objectArray[18] = "zzh";
            objectArray[19] = "zzj";
            objectArray[20] = "zzi";
            objectArray[21] = "zzv";
            objectArray[22] = zzacj4;
            objectArray[23] = "zzw";
            objectArray[24] = "zzx";
            objectArray[25] = zzacj5;
            return zzacf.zzal(zza, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001\u1008\u0001\u0002\u1008\u0002\u0003\u1008\u0006\u0004\u1008\u0007\u0005\u1008\b\u0006\u1008\t\u0007\u1008\n\b\u180c\u000b\t\u1008\u0000\u000b\u1008\f\f\u1007\r\r\u180c\u000e\u000e\u180c\u000f\u000f\u1007\u0010\u0010\u1008\u0003\u0011\u1008\u0005\u0012\u1008\u0004\u0013\u180c\u0011\u0014\u1008\u0012\u0015\u180c\u0013", objectArray);
        }
        return by2;
    }
}


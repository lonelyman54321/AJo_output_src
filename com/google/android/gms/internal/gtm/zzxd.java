/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahd;
import com.google.android.gms.internal.gtm.zzwo;
import com.google.android.gms.internal.gtm.zzxb;
import com.google.android.gms.internal.gtm.zzxc;

public final class zzxd
extends zzacc
implements zzadm {
    private static final zzxd zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzack zzh;
    private String zzi;
    private int zzj;
    private zzahd zzk;
    private int zzl;
    private String zzm;
    private boolean zzn;
    private int zzo;
    private zzwo zzp;
    private byte zzq = (byte)2;

    static {
        zzxd zzxd2;
        zzd = zzxd2 = new zzxd();
        zzacf.zzao(zzxd.class, zzxd2);
    }

    private zzxd() {
        int n3;
        this.zzg = n3 = -1;
        Object object = zzacf.zzah();
        this.zzh = object;
        this.zzi = object = "";
        this.zzm = object;
        this.zzo = n3;
    }

    public static /* bridge */ /* synthetic */ zzxd zza() {
        return zzd;
    }

    public static zzxd zzc() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
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
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzq = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzxb zzxb2 = new zzxb(null);
                    return zzxb2;
                }
                zzxd zzxd2 = new zzxd();
                return zzxd2;
            }
            Object[] objectArray = new Object[13];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = "zzl";
            objectArray[6] = object = zzxc.zza;
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            objectArray[9] = "zzm";
            objectArray[10] = "zzn";
            objectArray[11] = "zzo";
            objectArray[12] = "zzp";
            return zzacf.zzal(zzd, "\u0001\u000b\u0000\u0001\u0001\u00e8\u000b\u0000\u0001\u0002\u0001\u1004\u0000\u0003\u1004\u0001\u0004\u0016\u0005\u1008\u0002\u0006\u180c\u0005\u0007\u1004\u0003\u000b\u1409\u0004\u0011\u1008\u0006\u0082\u1007\u0007\u0095\u1004\b\u00e8\u1409\t", objectArray);
        }
        return this.zzq;
    }
}


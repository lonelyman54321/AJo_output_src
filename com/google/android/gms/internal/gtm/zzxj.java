/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaii;
import com.google.android.gms.internal.gtm.zzxg;
import com.google.android.gms.internal.gtm.zzxi;
import com.google.android.gms.internal.gtm.zzxm;

public final class zzxj
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzxj zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzxg zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private long zzp;
    private zzxm zzq;
    private int zzr;
    private byte zzs = (byte)2;

    static {
        zzxj zzxj2;
        zzd = zzxj2 = new zzxj();
        zzacf.zzao(zzxj.class, zzxj2);
        zzaii zzaii2 = zzaii.zze();
        zzaex zzaex2 = zzaex.zzk;
        zza = zzacf.zzac(zzaii2, zzxj2, zzxj2, null, 15872052, zzaex2, zzxj.class);
    }

    private zzxj() {
        int n3;
        this.zzf = n3 = -1;
        this.zzg = n3;
        this.zzk = n3;
        this.zzl = n3;
        this.zzn = n3;
        this.zzr = n3;
    }

    public static /* bridge */ /* synthetic */ zzxj zza() {
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
                            this.zzs = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzxi zzxi2 = new zzxi(null);
                    return zzxi2;
                }
                zzxj zzxj2 = new zzxj();
                return zzxj2;
            }
            Object[] objectArray = new Object[14];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzi";
            objectArray[n10] = "zzk";
            objectArray[n8] = "zzl";
            objectArray[n7] = "zzm";
            objectArray[6] = "zzj";
            objectArray[7] = "zzn";
            objectArray[8] = "zzo";
            objectArray[9] = "zzg";
            objectArray[10] = "zzp";
            objectArray[11] = "zzq";
            objectArray[12] = "zzr";
            objectArray[13] = "zzh";
            return zzacf.zzal(zzd, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0003\u0005\u1004\u0005\u0006\u1004\u0006\u0007\u1004\u0007\b\u1004\u0004\t\u1004\b\n\u1007\t\u000b\u1004\u0001\f\u1005\n\r\u1409\u000b\u000e\u1004\f\u000f\u1009\u0002", objectArray);
        }
        return this.zzs;
    }
}


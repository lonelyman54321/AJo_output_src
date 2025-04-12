/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaaa;
import com.google.android.gms.internal.gtm.zzaab;
import com.google.android.gms.internal.gtm.zzaac;
import com.google.android.gms.internal.gtm.zzaad;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzx;
import com.google.android.gms.internal.gtm.zzzy;
import com.google.android.gms.internal.gtm.zzzz;

public final class zzaae
extends zzacc
implements zzadm {
    private static final zzaae zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = (byte)2;

    static {
        zzaae zzaae2;
        zzd = zzaae2 = new zzaae();
        zzacf.zzao(zzaae.class, zzaae2);
    }

    private zzaae() {
    }

    public static /* bridge */ /* synthetic */ zzaae zzc() {
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
                                object2 = null;
                            }
                            this.zzl = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzzx zzzx2 = new zzzx(null);
                    return zzzx2;
                }
                zzaae zzaae2 = new zzaae();
                return zzaae2;
            }
            Object[] objectArray = new Object[13];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = object = zzzz.zza;
            objectArray[n10] = "zzg";
            objectArray[n8] = object = zzzy.zza;
            objectArray[n7] = "zzh";
            objectArray[6] = object = zzaac.zza;
            objectArray[7] = "zzi";
            objectArray[8] = object = zzaad.zza;
            objectArray[9] = "zzj";
            objectArray[10] = object = zzaab.zza;
            objectArray[11] = "zzk";
            objectArray[12] = object = zzaaa.zza;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001\u0003\u180c\u0002\u0004\u180c\u0003\u0005\u180c\u0004\u0006\u180c\u0005", objectArray);
            return object2;
        }
        return this.zzl;
    }
}


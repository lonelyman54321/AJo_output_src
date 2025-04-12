/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabi;
import com.google.android.gms.internal.gtm.zzabk;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzyx;

public final class zzabl
extends zzacf
implements zzadm {
    private static final zzabl zza;
    private int zzd;
    private zzacn zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private double zzi;
    private zzyx zzj;
    private String zzk;
    private byte zzl = (byte)2;

    static {
        zzabl zzabl2;
        zza = zzabl2 = new zzabl();
        zzacf.zzao(zzabl.class, zzabl2);
    }

    private zzabl() {
        zzyx zzyx2;
        Object object = zzadu.zze();
        this.zze = object;
        this.zzf = object = "";
        this.zzj = zzyx2 = zzyx.zzb;
        this.zzk = object;
    }

    public static /* bridge */ /* synthetic */ zzabl zzc() {
        return zza;
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
                        return zza;
                    }
                    zzabi zzabi2 = new zzabi(null);
                    return zzabi2;
                }
                zzabl zzabl2 = new zzabl();
                return zzabl2;
            }
            Object[] objectArray = new Object[9];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n14] = zzabk.class;
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[6] = "zzi";
            objectArray[7] = "zzj";
            objectArray[8] = "zzk";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002\u041b\u0003\u1008\u0000\u0004\u1003\u0001\u0005\u1002\u0002\u0006\u1000\u0003\u0007\u100a\u0004\b\u1008\u0005", objectArray);
            return object2;
        }
        return this.zzl;
    }
}


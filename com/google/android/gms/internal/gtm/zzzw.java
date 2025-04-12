/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzq;
import com.google.android.gms.internal.gtm.zzzs;
import com.google.android.gms.internal.gtm.zzzu;
import com.google.android.gms.internal.gtm.zzzv;

public final class zzzw
extends zzacc
implements zzadm {
    private static final zzzw zzd;
    private int zze;
    private zzacn zzf;
    private zzzu zzg;
    private zzacn zzh;
    private zzaae zzi;
    private int zzj;
    private byte zzk = (byte)2;

    static {
        zzzw zzzw2;
        zzd = zzzw2 = new zzzw();
        zzacf.zzao(zzzw.class, zzzw2);
    }

    private zzzw() {
        zzadu zzadu2 = zzadu.zze();
        this.zzf = zzadu2;
        zzadu2 = zzadu.zze();
        this.zzh = zzadu2;
        this.zzj = 1;
    }

    public static /* bridge */ /* synthetic */ zzzw zzc() {
        return zzd;
    }

    public static zzzw zze() {
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
                            this.zzk = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzzq zzzq2 = new zzzq(null);
                    return zzzq2;
                }
                zzzw zzzw2 = new zzzw();
                return zzzw2;
            }
            Object[] objectArray = new Object[9];
            objectArray[0] = "zze";
            objectArray[n4] = "zzg";
            objectArray[n14] = "zzh";
            objectArray[n10] = zzzs.class;
            objectArray[n8] = "zzj";
            objectArray[n7] = object = zzzv.zza;
            objectArray[6] = "zzi";
            objectArray[7] = "zzf";
            objectArray[8] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0002\u0002\u0001\u1009\u0000\u0002\u001b\u0003\u180c\u00022\u1409\u0001\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzk;
    }
}


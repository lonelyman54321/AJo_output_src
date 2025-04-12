/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzabg;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;

public final class zzabh
extends zzacc
implements zzadm {
    private static final zzabh zzd;
    private int zze;
    private boolean zzf;
    private double zzg = -1.0;
    private zzaae zzh;
    private boolean zzi;
    private zzacn zzj;
    private byte zzk = (byte)2;

    static {
        zzabh zzabh2;
        zzd = zzabh2 = new zzabh();
        zzacf.zzao(zzabh.class, zzabh2);
    }

    private zzabh() {
        zzadu zzadu2 = zzadu.zze();
        this.zzj = zzadu2;
    }

    public static /* bridge */ /* synthetic */ zzabh zzc() {
        return zzd;
    }

    public static zzabh zze() {
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
                    zzabg zzabg2 = new zzabg(null);
                    return zzabg2;
                }
                zzabh zzabh2 = new zzabh();
                return zzabh2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzg";
            objectArray[n14] = "zzf";
            objectArray[n10] = "zzi";
            objectArray[n8] = "zzh";
            objectArray[n7] = "zzj";
            objectArray[6] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0005\u0000\u0001\u0010\u03e7\u0005\u0000\u0001\u0002\u0010\u1000\u0001\u0014\u1007\u0000!\u1007\u0003\"\u1409\u0002\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzk;
    }
}


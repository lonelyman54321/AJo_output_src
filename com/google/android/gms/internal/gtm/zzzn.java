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
import com.google.android.gms.internal.gtm.zzzm;

public final class zzzn
extends zzacc
implements zzadm {
    private static final zzzn zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzaae zzj;
    private zzacn zzk;
    private byte zzl = (byte)2;

    static {
        zzzn zzzn2;
        zzd = zzzn2 = new zzzn();
        zzacf.zzao(zzzn.class, zzzn2);
    }

    private zzzn() {
        zzadu zzadu2 = zzadu.zze();
        this.zzk = zzadu2;
    }

    public static /* bridge */ /* synthetic */ zzzn zzc() {
        return zzd;
    }

    public static zzzn zze() {
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
                    zzzm zzzm2 = new zzzm(null);
                    return zzzm2;
                }
                zzzn zzzn2 = new zzzn();
                return zzzn2;
            }
            Object[] objectArray = new Object[8];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = "zzj";
            objectArray[6] = "zzk";
            objectArray[7] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0006\u0000\u0001\u0001\u03e7\u0006\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0006\u1007\u0003\u0007\u1409\u0004\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzl;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzaau;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;

public final class zzaav
extends zzacc
implements zzadm {
    private static final zzaav zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj = "";
    private boolean zzk;
    private zzaae zzl;
    private zzacn zzm;
    private byte zzn = (byte)2;

    static {
        zzaav zzaav2;
        zzd = zzaav2 = new zzaav();
        zzacf.zzao(zzaav.class, zzaav2);
    }

    private zzaav() {
        zzadu zzadu2 = zzadu.zze();
        this.zzm = zzadu2;
    }

    public static /* bridge */ /* synthetic */ zzaav zzc() {
        return zzd;
    }

    public static zzaav zze() {
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
                            this.zzn = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzaau zzaau2 = new zzaau(null);
                    return zzaau2;
                }
                zzaav zzaav2 = new zzaav();
                return zzaav2;
            }
            Object[] objectArray = new Object[10];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = "zzj";
            objectArray[6] = "zzk";
            objectArray[7] = "zzl";
            objectArray[8] = "zzm";
            objectArray[9] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\b\u0000\u0001\u0001\u03e7\b\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0007\u1007\u0003\n\u1008\u0004\u000b\u1007\u0005\f\u1409\u0006\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzn;
    }
}


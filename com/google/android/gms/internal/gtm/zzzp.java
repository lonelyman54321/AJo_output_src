/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzaak;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzzo;

public final class zzzp
extends zzacc
implements zzadm {
    private static final zzzp zzd;
    private int zze;
    private boolean zzf;
    private zzaae zzg;
    private boolean zzh;
    private zzaak zzi;
    private zzacn zzj;
    private byte zzk = (byte)2;

    static {
        zzzp zzzp2;
        zzd = zzzp2 = new zzzp();
        zzacf.zzao(zzzp.class, zzzp2);
    }

    private zzzp() {
        zzadu zzadu2 = zzadu.zze();
        this.zzj = zzadu2;
    }

    public static /* bridge */ /* synthetic */ zzzp zzc() {
        return zzd;
    }

    public static zzzp zze() {
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
                    zzzo zzzo2 = new zzzo(null);
                    return zzzo2;
                }
                zzzp zzzp2 = new zzzp();
                return zzzp2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzh";
            objectArray[n8] = "zzi";
            objectArray[n7] = "zzj";
            objectArray[6] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0005\u0000\u0001\u0001\u03e7\u0005\u0000\u0001\u0002\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0004\u1009\u0003\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzk;
    }
}


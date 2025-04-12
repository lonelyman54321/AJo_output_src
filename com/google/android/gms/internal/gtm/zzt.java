/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzs;

public final class zzt
extends zzacf
implements zzadm {
    private static final zzt zza;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg = Integer.MAX_VALUE;
    private boolean zzh;
    private long zzi;

    static {
        zzt zzt2;
        zza = zzt2 = new zzt();
        zzacf.zzao(zzt.class, zzt2);
    }

    private zzt() {
    }

    public static /* bridge */ /* synthetic */ zzt zze() {
        return zza;
    }

    public final long zza() {
        return this.zzi;
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
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzs zzs2 = new zzs(null);
                    return zzs2;
                }
                zzt zzt2 = new zzt();
                return zzt2;
            }
            Object[] objectArray = new Object[6];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzf";
            objectArray[n8] = "zzg";
            objectArray[n7] = "zzh";
            objectArray[n4] = "zzi";
            return zzacf.zzal(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1002\u0004", objectArray);
        }
        return by2;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        int n3 = this.zzd;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}


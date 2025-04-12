/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzw;

public final class zzx
extends zzacf
implements zzadm {
    private static final zzx zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = (byte)2;

    static {
        zzx zzx2;
        zza = zzx2 = new zzx();
        zzacf.zzao(zzx.class, zzx2);
    }

    private zzx() {
    }

    public static /* bridge */ /* synthetic */ zzx zzd() {
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n7 = 4;
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzg = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzw zzw2 = new zzw(null);
                    return zzw2;
                }
                zzx zzx2 = new zzx();
                return zzx2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1504\u0000\u0002\u1504\u0001", objectArray);
        }
        return this.zzg;
    }

    public final int zzc() {
        return this.zzf;
    }
}


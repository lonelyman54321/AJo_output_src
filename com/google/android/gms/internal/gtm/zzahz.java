/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahx;

public final class zzahz
extends zzacf
implements zzadm {
    private static final zzahz zza;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzahz zzahz2;
        zza = zzahz2 = new zzahz();
        zzacf.zzao(zzahz.class, zzahz2);
    }

    private zzahz() {
    }

    public static /* bridge */ /* synthetic */ zzahz zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n8) {
                if (n3 != n7) {
                    n4 = 4;
                    n7 = 0;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzahx zzahx2 = new zzahx(null);
                    return zzahx2;
                }
                zzahz zzahz2 = new zzahz();
                return zzahz2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\r\u0018\u0002\u0000\u0000\u0000\r\u1004\u0000\u0018\u1007\u0001", objectArray);
        }
        return (byte)n4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;
import com.google.android.gms.internal.gtm.zzaei;

public final class zzaek
extends zzacf
implements zzadm {
    private static final zzaek zza;
    private long zzd;
    private int zze;

    static {
        zzaek zzaek2;
        zza = zzaek2 = new zzaek();
        zzacf.zzao(zzaek.class, zzaek2);
    }

    private zzaek() {
    }

    public static /* bridge */ /* synthetic */ zzaek zzc() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    n7 = 0;
                    object2 = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaei zzaei2 = new zzaei(null);
                    return zzaei2;
                }
                zzaek zzaek2 = new zzaek();
                return zzaek2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", objectArray);
            return object2;
        }
        return (byte)n4;
    }
}


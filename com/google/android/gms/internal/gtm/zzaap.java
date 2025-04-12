/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaao;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;

public final class zzaap
extends zzacf
implements zzadm {
    private static final zzaap zza;
    private int zzd;
    private String zze;
    private String zzf;

    static {
        zzaap zzaap2;
        zza = zzaap2 = new zzaap();
        zzacf.zzao(zzaap.class, zzaap2);
    }

    private zzaap() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
    }

    public static /* bridge */ /* synthetic */ zzaap zzc() {
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
                    object2 = null;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzaao zzaao2 = new zzaao(null);
                    return zzaao2;
                }
                zzaap zzaap2 = new zzaap();
                return zzaap2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", objectArray);
            return object2;
        }
        return (byte)n4;
    }
}


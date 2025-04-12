/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzace;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaii;
import com.google.android.gms.internal.gtm.zzxn;

public final class zzxo
extends zzacf
implements zzadm {
    public static final zzace zza;
    private static final zzxo zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private byte zzi = (byte)2;

    static {
        zzxo zzxo2;
        zzd = zzxo2 = new zzxo();
        zzacf.zzao(zzxo.class, zzxo2);
        zzaii zzaii2 = zzaii.zze();
        zzaex zzaex2 = zzaex.zzk;
        zza = zzacf.zzac(zzaii2, zzxo2, zzxo2, null, 4156379, zzaex2, zzxo.class);
    }

    private zzxo() {
    }

    public static /* bridge */ /* synthetic */ zzxo zza() {
        return zzd;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n10) {
                if (n3 != n8) {
                    n8 = 0;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zzi = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzxn zzxn2 = new zzxn(null);
                    return zzxn2;
                }
                zzxo zzxo2 = new zzxo();
                return zzxo2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n10] = "zzg";
            objectArray[n8] = "zzh";
            return zzacf.zzal(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1502\u0000\u0002\u1506\u0001\u0003\u1506\u0002", objectArray);
        }
        return this.zzi;
    }
}


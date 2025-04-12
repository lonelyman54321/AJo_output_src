/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzajf;
import com.google.android.gms.internal.gtm.zzajg;
import com.google.android.gms.internal.gtm.zzajh;
import com.google.android.gms.internal.gtm.zzaji;
import com.google.android.gms.internal.gtm.zzajk;
import com.google.android.gms.internal.gtm.zzajm;
import com.google.android.gms.internal.gtm.zzajn;

public final class zzajo
extends zzacf
implements zzadm {
    private static final zzajo zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private int zzh;
    private zzajm zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzajk zzm;

    static {
        zzajo zzajo2;
        zza = zzajo2 = new zzajo();
        zzacf.zzao(zzajo.class, zzajo2);
    }

    private zzajo() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
        this.zzg = string2;
    }

    public static /* bridge */ /* synthetic */ zzajo zzc() {
        return zza;
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
                    object = null;
                    if (n3 != n7) {
                        if (n3 == n4) {
                            return zza;
                        }
                        throw null;
                    }
                    zzajh zzajh2 = new zzajh(null);
                    return zzajh2;
                }
                zzajo zzajo2 = new zzajo();
                return zzajo2;
            }
            Object[] objectArray = new Object[14];
            objectArray[0] = "zzd";
            objectArray[by2] = "zze";
            objectArray[n10] = "zzh";
            objectArray[n8] = object = zzajf.zza;
            objectArray[n7] = "zzi";
            objectArray[n4] = "zzf";
            objectArray[6] = "zzg";
            objectArray[7] = "zzj";
            objectArray[8] = object = zzajg.zza;
            objectArray[9] = "zzk";
            objectArray[10] = object = zzajn.zza;
            objectArray[11] = "zzl";
            objectArray[12] = object = zzaji.zza;
            objectArray[13] = "zzm";
            return zzacf.zzal(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u180c\u0003\u0003\u1009\u0004\u0004\u1008\u0001\u0005\u1008\u0002\u0006\u180c\u0005\u0007\u180c\u0006\b\u180c\u0007\t\u1009\b", objectArray);
        }
        return by2;
    }
}


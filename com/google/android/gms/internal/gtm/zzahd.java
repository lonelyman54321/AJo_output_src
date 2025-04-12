/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaha;
import com.google.android.gms.internal.gtm.zzahb;
import com.google.android.gms.internal.gtm.zzxm;
import com.google.android.gms.internal.gtm.zzxo;

public final class zzahd
extends zzacf
implements zzadm {
    private static final zzahd zza;
    private int zzd = 0;
    private Object zze;
    private int zzf = 0;
    private Object zzg;
    private byte zzh = (byte)2;

    static {
        zzahd zzahd2;
        zza = zzahd2 = new zzahd();
        zzacf.zzao(zzahd.class, zzahd2);
    }

    private zzahd() {
    }

    public static /* bridge */ /* synthetic */ zzahd zzc() {
        return zza;
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
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzahb zzahb2 = new zzahb(null);
                    return zzahb2;
                }
                zzahd zzahd2 = new zzahd();
                return zzahd2;
            }
            Object[] objectArray = new Object[7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzd";
            objectArray[n14] = "zzg";
            objectArray[n10] = "zzf";
            objectArray[n8] = zzxo.class;
            objectArray[n7] = zzxm.class;
            objectArray[6] = zzaha.class;
            return zzacf.zzal(zza, "\u0001\u0004\u0002\u0000\u0001\u0006\u0004\u0000\u0000\u0002\u0001\u043c\u0000\u0002\u043c\u0000\u00037\u0001\u0006<\u0001", objectArray);
        }
        return this.zzh;
    }
}


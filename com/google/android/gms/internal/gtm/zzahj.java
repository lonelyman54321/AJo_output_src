/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahg;
import com.google.android.gms.internal.gtm.zzahi;

public final class zzahj
extends zzacf
implements zzadm {
    private static final zzahj zza;
    private zzacn zzd;
    private byte zze = (byte)2;

    static {
        zzahj zzahj2;
        zza = zzahj2 = new zzahj();
        zzacf.zzao(zzahj.class, zzahj2);
    }

    private zzahj() {
        zzacn zzacn2;
        this.zzd = zzacn2 = zzacf.zzai();
    }

    public static /* bridge */ /* synthetic */ zzahj zzc() {
        return zza;
    }

    public static zzahj zze() {
        return zza;
    }

    public final Object zzb(int n3, Object object, Object object2) {
        int n4 = 1;
        int n7 = 2;
        if ((n3 += -1) != 0) {
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 != n7) {
                            if (object == null) {
                                n4 = 0;
                            }
                            this.zze = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzahg zzahg2 = new zzahg(null);
                    return zzahg2;
                }
                zzahj zzahj2 = new zzahj();
                return zzahj2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = zzahi.class;
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", objectArray);
        }
        return this.zze;
    }
}


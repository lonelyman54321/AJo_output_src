/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzaho;
import com.google.android.gms.internal.gtm.zzahr;

public final class zzahp
extends zzacc
implements zzadm {
    private static final zzahp zzd;
    private int zze;
    private zzahr zzf;
    private byte zzg = (byte)2;

    static {
        zzahp zzahp2;
        zzd = zzahp2 = new zzahp();
        zzacf.zzao(zzahp.class, zzahp2);
    }

    private zzahp() {
    }

    public static /* bridge */ /* synthetic */ zzahp zzc() {
        return zzd;
    }

    public static zzahp zze() {
        return zzd;
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
                            this.zzg = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzaho zzaho2 = new zzaho(null);
                    return zzaho2;
                }
                zzahp zzahp2 = new zzahp();
                return zzahp2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            return zzacf.zzal(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objectArray);
        }
        return this.zzg;
    }
}


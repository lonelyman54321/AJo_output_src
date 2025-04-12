/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzahh;

public final class zzahi
extends zzacf
implements zzadm {
    private static final zzahi zza;
    private int zzd;
    private String zze;
    private String zzf;
    private byte zzg = (byte)2;

    static {
        zzahi zzahi2;
        zza = zzahi2 = new zzahi();
        zzacf.zzao(zzahi.class, zzahi2);
    }

    private zzahi() {
        String string2;
        this.zze = string2 = "";
        this.zzf = string2;
    }

    public static /* bridge */ /* synthetic */ zzahi zzc() {
        return zza;
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
                    zzahh zzahh2 = new zzahh(null);
                    return zzahh2;
                }
                zzahi zzahi2 = new zzahi();
                return zzahi2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1508\u0001", objectArray);
        }
        return this.zzg;
    }
}


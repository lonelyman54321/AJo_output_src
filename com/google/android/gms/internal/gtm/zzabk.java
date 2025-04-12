/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabj;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadv;

public final class zzabk
extends zzacf
implements zzadm {
    private static final zzabk zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private byte zzg = (byte)2;

    static {
        zzabk zzabk2;
        zza = zzabk2 = new zzabk();
        zzacf.zzao(zzabk.class, zzabk2);
    }

    private zzabk() {
    }

    public static /* bridge */ /* synthetic */ zzabk zzc() {
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
                                object2 = null;
                            }
                            this.zzg = (byte)n4;
                            return null;
                        }
                        return zza;
                    }
                    zzabj zzabj2 = new zzabj(null);
                    return zzabj2;
                }
                zzabk zzabk2 = new zzabk();
                return zzabk2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zzd";
            objectArray[n4] = "zze";
            objectArray[n8] = "zzf";
            object = zza;
            object2 = new zzadv((zzadl)object, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1507\u0001", objectArray);
            return object2;
        }
        return this.zzg;
    }
}


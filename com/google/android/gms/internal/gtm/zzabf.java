/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaae;
import com.google.android.gms.internal.gtm.zzabe;
import com.google.android.gms.internal.gtm.zzabl;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadu;
import com.google.android.gms.internal.gtm.zzadv;

public final class zzabf
extends zzacc
implements zzadm {
    private static final zzabf zzd;
    private int zze;
    private zzaae zzf;
    private zzacn zzg;
    private byte zzh = (byte)2;

    static {
        zzabf zzabf2;
        zzd = zzabf2 = new zzabf();
        zzacf.zzao(zzabf.class, zzabf2);
    }

    private zzabf() {
        zzadu zzadu2 = zzadu.zze();
        this.zzg = zzadu2;
    }

    public static /* bridge */ /* synthetic */ zzabf zzc() {
        return zzd;
    }

    public static zzabf zze() {
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
                                object2 = null;
                            }
                            this.zzh = (byte)n4;
                            return null;
                        }
                        return zzd;
                    }
                    zzabe zzabe2 = new zzabe(null);
                    return zzabe2;
                }
                zzabf zzabf2 = new zzabf();
                return zzabf2;
            }
            Object[] objectArray = new Object[n7];
            objectArray[0] = "zze";
            objectArray[n4] = "zzf";
            objectArray[n10] = "zzg";
            objectArray[n8] = zzabl.class;
            object = zzd;
            object2 = new zzadv((zzadl)object, "\u0001\u0002\u0000\u0001\u0001\u03e7\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u03e7\u041b", objectArray);
            return object2;
        }
        return this.zzh;
    }
}


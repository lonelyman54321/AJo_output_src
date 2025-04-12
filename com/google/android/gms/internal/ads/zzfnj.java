/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnf;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfnj
extends zzhbo
implements zzhdf {
    private static final zzfnj zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzfnf zzd;

    static {
        zzfnj zzfnj2;
        zza = zzfnj2 = new zzfnj();
        zzhbo.zzca(zzfnj.class, zzfnj2);
    }

    private zzfnj() {
    }

    public static zzfni zza() {
        return (zzfni)zza.zzaZ();
    }

    public static /* synthetic */ zzfnj zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfnj zzfnj2, zzfnf zzfnf2) {
        int n3;
        zzfnf2.getClass();
        zzfnj2.zzd = zzfnf2;
        zzfnj2.zzc = n3 = zzfnj2.zzc | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = object.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzb;
                if (object != null) return object;
                clazz = zzfnj.class;
                synchronized (clazz) {
                    try {
                        object = zzb;
                        if (object != null) return object;
                        object2 = zza;
                        zzb = object = new zzhbj((zzhbo)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzfni(null);
            }
            case 3: {
                return new zzfnj();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006\u1009\u0000", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


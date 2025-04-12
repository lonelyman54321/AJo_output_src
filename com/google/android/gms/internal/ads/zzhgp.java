/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhgo;

public final class zzhgp
extends zzhbo
implements zzhdf {
    private static final zzhgp zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhgp zzhgp2;
        zza = zzhgp2 = new zzhgp();
        zzhbo.zzca(zzhgp.class, zzhgp2);
    }

    private zzhgp() {
    }

    public static zzhgo zzc() {
        return (zzhgo)zza.zzaZ();
    }

    public static /* synthetic */ zzhgp zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhgp zzhgp2, String string2) {
        int n3;
        zzhgp2.zzc = n3 = zzhgp2.zzc | 1;
        zzhgp2.zzd = string2;
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
                clazz = zzhgp.class;
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
                return new zzhgo(null);
            }
            case 3: {
                return new zzhgp();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


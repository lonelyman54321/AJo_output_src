/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxv;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxw
extends zzhbo
implements zzhdf {
    private static final zzgxw zza;
    private static volatile zzhdm zzb;
    private int zzc;

    static {
        zzgxw zzgxw2;
        zza = zzgxw2 = new zzgxw();
        zzhbo.zzca(zzgxw.class, zzgxw2);
    }

    private zzgxw() {
    }

    public static /* synthetic */ zzgxw zzc() {
        return zza;
    }

    public static zzgxw zzd() {
        return zza;
    }

    public static zzgxw zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxw)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public final int zza() {
        return this.zzc;
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
                clazz = zzgxw.class;
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
                return new zzgxv(null);
            }
            case 3: {
                return new zzgxw();
            }
            case 2: {
                object = new Object[by2];
                object[0] = "zzc";
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


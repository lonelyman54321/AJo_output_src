/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxs;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxt
extends zzhbo
implements zzhdf {
    private static final zzgxt zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;

    static {
        zzgxt zzgxt2;
        zza = zzgxt2 = new zzgxt();
        zzhbo.zzca(zzgxt.class, zzgxt2);
    }

    private zzgxt() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
    }

    public static zzgxs zzc() {
        return (zzgxs)zza.zzaZ();
    }

    public static /* synthetic */ zzgxt zzd() {
        return zza;
    }

    public static zzgxt zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxt)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgxt zzgxt2, zzhac zzhac2) {
        zzgxt2.zzd = zzhac2;
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
                clazz = zzgxt.class;
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
                return new zzgxs(null);
            }
            case 3: {
                return new zzgxt();
            }
            case 2: {
                object = new Object[2];
                object[0] = "zzc";
                object[by2] = "zzd";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzhac zzf() {
        return this.zzd;
    }
}


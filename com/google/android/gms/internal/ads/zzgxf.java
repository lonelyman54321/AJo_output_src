/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxe;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxf
extends zzhbo
implements zzhdf {
    private static final zzgxf zza;
    private static volatile zzhdm zzb;
    private String zzc = "";

    static {
        zzgxf zzgxf2;
        zza = zzgxf2 = new zzgxf();
        zzhbo.zzca(zzgxf.class, zzgxf2);
    }

    private zzgxf() {
    }

    public static zzgxe zza() {
        return (zzgxe)zza.zzaZ();
    }

    public static /* synthetic */ zzgxf zzc() {
        return zza;
    }

    public static zzgxf zzd() {
        return zza;
    }

    public static zzgxf zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxf)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzg(zzgxf zzgxf2, String string2) {
        string2.getClass();
        zzgxf2.zzc = string2;
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
                clazz = zzgxf.class;
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
                return new zzgxe(null);
            }
            case 3: {
                return new zzgxf();
            }
            case 2: {
                object = new Object[by2];
                object[0] = "zzc";
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final String zzf() {
        return this.zzc;
    }
}


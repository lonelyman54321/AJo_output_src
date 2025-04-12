/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvy;
import com.google.android.gms.internal.ads.zzgwc;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgvz
extends zzhbo
implements zzhdf {
    private static final zzgvz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgwc zzd;
    private int zze;
    private int zzf;

    static {
        zzgvz zzgvz2;
        zza = zzgvz2 = new zzgvz();
        zzhbo.zzca(zzgvz.class, zzgvz2);
    }

    private zzgvz() {
    }

    public static zzgvy zzd() {
        return (zzgvy)zza.zzaZ();
    }

    public static /* synthetic */ zzgvz zze() {
        return zza;
    }

    public static zzgvz zzf() {
        return zza;
    }

    public static zzgvz zzg(zzhac zzhac2, zzhay zzhay2) {
        return (zzgvz)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzi(zzgvz zzgvz2, zzgwc zzgwc2) {
        int n3;
        zzgwc2.getClass();
        zzgvz2.zzd = zzgwc2;
        zzgvz2.zzc = n3 = zzgvz2.zzc | 1;
    }

    public static /* synthetic */ void zzj(zzgvz zzgvz2, int n3) {
        zzgvz2.zze = n3;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                clazz = zzgvz.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzgvy(null);
            }
            case 3: {
                return new zzgvz();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b\u0003\u000b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgwc zzh() {
        zzgwc zzgwc2 = this.zzd;
        if (zzgwc2 == null) {
            zzgwc2 = zzgwc.zzf();
        }
        return zzgwc2;
    }
}


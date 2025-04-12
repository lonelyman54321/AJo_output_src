/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzguj;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzguk
extends zzhbo
implements zzhdf {
    private static final zzguk zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguq zze;
    private zzhac zzf;

    static {
        zzguk zzguk2;
        zza = zzguk2 = new zzguk();
        zzhbo.zzca(zzguk.class, zzguk2);
    }

    private zzguk() {
        zzhac zzhac2;
        this.zzf = zzhac2 = zzhac.zzb;
    }

    public static zzguj zzc() {
        return (zzguj)zza.zzaZ();
    }

    public static /* synthetic */ zzguk zzd() {
        return zza;
    }

    public static zzguk zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzguk zzguk2, zzguq zzguq2) {
        int n3;
        zzguq2.getClass();
        zzguk2.zze = zzguq2;
        zzguk2.zzc = n3 = zzguk2.zzc | 1;
    }

    public static /* synthetic */ void zzi(zzguk zzguk2, zzhac zzhac2) {
        zzguk2.zzf = zzhac2;
    }

    public final int zza() {
        return this.zzd;
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
                clazz = zzguk.class;
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
                return new zzguj(null);
            }
            case 3: {
                return new zzguk();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzguq zzf() {
        zzguq zzguq2 = this.zze;
        if (zzguq2 == null) {
            zzguq2 = zzguq.zze();
        }
        return zzguq2;
    }

    public final zzhac zzg() {
        return this.zzf;
    }
}


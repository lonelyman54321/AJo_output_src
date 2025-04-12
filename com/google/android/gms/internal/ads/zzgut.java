/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgut
extends zzhbo
implements zzhdf {
    private static final zzgut zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguz zze;
    private zzhac zzf;

    static {
        zzgut zzgut2;
        zza = zzgut2 = new zzgut();
        zzhbo.zzca(zzgut.class, zzgut2);
    }

    private zzgut() {
        zzhac zzhac2;
        this.zzf = zzhac2 = zzhac.zzb;
    }

    public static zzgus zzc() {
        return (zzgus)zza.zzaZ();
    }

    public static /* synthetic */ zzgut zzd() {
        return zza;
    }

    public static zzgut zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgut)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzi(zzgut zzgut2, zzguz zzguz2) {
        int n3;
        zzguz2.getClass();
        zzgut2.zze = zzguz2;
        zzgut2.zzc = n3 = zzgut2.zzc | 1;
    }

    public static /* synthetic */ void zzj(zzgut zzgut2, zzhac zzhac2) {
        zzgut2.zzf = zzhac2;
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
                clazz = zzgut.class;
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
                return new zzgus(null);
            }
            case 3: {
                return new zzgut();
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

    public final zzguz zzf() {
        zzguz zzguz2 = this.zze;
        if (zzguz2 == null) {
            zzguz2 = zzguz.zze();
        }
        return zzguz2;
    }

    public final zzhac zzg() {
        return this.zzf;
    }
}


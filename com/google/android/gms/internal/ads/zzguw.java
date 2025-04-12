/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzguv;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzguw
extends zzhbo
implements zzhdf {
    private static final zzguw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzguz zzd;
    private int zze;

    static {
        zzguw zzguw2;
        zza = zzguw2 = new zzguw();
        zzhbo.zzca(zzguw.class, zzguw2);
    }

    private zzguw() {
    }

    public static zzguv zzc() {
        return (zzguv)zza.zzaZ();
    }

    public static /* synthetic */ zzguw zzd() {
        return zza;
    }

    public static zzguw zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzguw)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzg(zzguw zzguw2, zzguz zzguz2) {
        int n3;
        zzguz2.getClass();
        zzguw2.zzd = zzguz2;
        zzguw2.zzc = n3 = zzguw2.zzc | 1;
    }

    public static /* synthetic */ void zzh(zzguw zzguw2, int n3) {
        zzguw2.zze = n3;
    }

    public final int zza() {
        return this.zze;
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
                clazz = zzguw.class;
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
                return new zzguv(null);
            }
            case 3: {
                return new zzguw();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzguz zzf() {
        zzguz zzguz2 = this.zzd;
        if (zzguz2 == null) {
            zzguz2 = zzguz.zze();
        }
        return zzguz2;
    }
}


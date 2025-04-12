/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtu;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgtv
extends zzhbo
implements zzhdf {
    private static final zzgtv zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhac zze;
    private zzgub zzf;

    static {
        zzgtv zzgtv2;
        zza = zzgtv2 = new zzgtv();
        zzhbo.zzca(zzgtv.class, zzgtv2);
    }

    private zzgtv() {
        zzhac zzhac2;
        this.zze = zzhac2 = zzhac.zzb;
    }

    public static zzgtu zzc() {
        return (zzgtu)zza.zzaZ();
    }

    public static /* synthetic */ zzgtv zzd() {
        return zza;
    }

    public static zzgtv zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgtv)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzi(zzgtv zzgtv2, zzhac zzhac2) {
        zzgtv2.zze = zzhac2;
    }

    public static /* synthetic */ void zzj(zzgtv zzgtv2, zzgub zzgub2) {
        int n3;
        zzgub2.getClass();
        zzgtv2.zzf = zzgub2;
        zzgtv2.zzc = n3 = zzgtv2.zzc | 1;
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
                clazz = zzgtv.class;
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
                return new zzgtu(null);
            }
            case 3: {
                return new zzgtv();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\u1009\u0000", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgub zzf() {
        zzgub zzgub2 = this.zzf;
        if (zzgub2 == null) {
            zzgub2 = zzgub.zze();
        }
        return zzgub2;
    }

    public final zzhac zzg() {
        return this.zze;
    }
}


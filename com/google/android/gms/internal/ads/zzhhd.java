/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhhc;

public final class zzhhd
extends zzhbo
implements zzhdf {
    private static final zzhhd zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd;
    private zzhac zze;
    private byte zzf = (byte)2;

    static {
        zzhhd zzhhd2;
        zza = zzhhd2 = new zzhhd();
        zzhbo.zzca(zzhhd.class, zzhhd2);
    }

    private zzhhd() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
        this.zze = zzhac2;
    }

    public static zzhhc zzc() {
        return (zzhhc)zza.zzaZ();
    }

    public static /* synthetic */ zzhhd zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhhd zzhhd2, zzhac zzhac2) {
        int n3;
        zzhhd2.zzc = n3 = zzhhd2.zzc | 1;
        zzhhd2.zzd = zzhac2;
    }

    public static /* synthetic */ void zzg(zzhhd zzhhd2, zzhac zzhac2) {
        int n3;
        zzhhd2.zzc = n3 = zzhhd2.zzc | 2;
        zzhhd2.zze = zzhac2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        int n3 = objectArray.ordinal();
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                clazz = zzhhd.class;
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
                return new zzhhc(null);
            }
            case 3: {
                return new zzhhd();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u150a\u0000\u0002\u100a\u0001", objectArray);
            }
            case 1: {
                if (clazz == null) {
                    by2 = 0;
                    object = null;
                }
                this.zzf = by2;
                return null;
            }
            case 0: 
        }
        return this.zzf;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzazz
extends zzhbo
implements zzhdf {
    private static final zzazz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzbac zzd;
    private zzhac zze;
    private zzhac zzf;

    static {
        zzazz zzazz2;
        zza = zzazz2 = new zzazz();
        zzhbo.zzca(zzazz.class, zzazz2);
    }

    private zzazz() {
        zzhac zzhac2;
        this.zze = zzhac2 = zzhac.zzb;
        this.zzf = zzhac2;
    }

    public static /* synthetic */ zzazz zza() {
        return zza;
    }

    public static zzazz zzc(zzhac zzhac2, zzhay zzhay2) {
        return (zzazz)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public final zzbac zzd() {
        zzbac zzbac2 = this.zzd;
        if (zzbac2 == null) {
            zzbac2 = zzbac.zzg();
        }
        return zzbac2;
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
                clazz = zzazz.class;
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
                return new zzazy(null);
            }
            case 3: {
                return new zzazz();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u100a\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzhac zze() {
        return this.zzf;
    }

    public final zzhac zzf() {
        return this.zze;
    }
}


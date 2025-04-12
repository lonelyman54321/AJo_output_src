/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvv;
import com.google.android.gms.internal.ads.zzgwc;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgvw
extends zzhbo
implements zzhdf {
    private static final zzgvw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgwc zze;
    private zzhac zzf;

    static {
        zzgvw zzgvw2;
        zza = zzgvw2 = new zzgvw();
        zzhbo.zzca(zzgvw.class, zzgvw2);
    }

    private zzgvw() {
        zzhac zzhac2;
        this.zzf = zzhac2 = zzhac.zzb;
    }

    public static zzgvv zzc() {
        return (zzgvv)zza.zzaZ();
    }

    public static /* synthetic */ zzgvw zzd() {
        return zza;
    }

    public static zzgvw zze() {
        return zza;
    }

    public static zzgvw zzf(zzhac zzhac2, zzhay zzhay2) {
        return (zzgvw)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzi() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzj(zzgvw zzgvw2, zzgwc zzgwc2) {
        int n3;
        zzgwc2.getClass();
        zzgvw2.zze = zzgwc2;
        zzgvw2.zzc = n3 = zzgvw2.zzc | 1;
    }

    public static /* synthetic */ void zzk(zzgvw zzgvw2, zzhac zzhac2) {
        zzgvw2.zzf = zzhac2;
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
                clazz = zzgvw.class;
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
                return new zzgvv(null);
            }
            case 3: {
                return new zzgvw();
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

    public final zzgwc zzg() {
        zzgwc zzgwc2 = this.zze;
        if (zzgwc2 == null) {
            zzgwc2 = zzgwc.zzf();
        }
        return zzgwc2;
    }

    public final zzhac zzh() {
        return this.zzf;
    }
}


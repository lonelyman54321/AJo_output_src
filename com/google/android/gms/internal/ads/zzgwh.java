/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwe;
import com.google.android.gms.internal.ads.zzgwg;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwh
extends zzhbo
implements zzhdf {
    private static final zzgwh zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhac zzd;
    private int zze;

    static {
        zzgwh zzgwh2;
        zza = zzgwh2 = new zzgwh();
        zzhbo.zzca(zzgwh.class, zzgwh2);
    }

    private zzgwh() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
    }

    public static zzgwe zza() {
        return (zzgwe)zza.zzaZ();
    }

    public static /* synthetic */ zzgwh zzd() {
        return zza;
    }

    public static zzgwh zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgwh zzgwh2, String string2) {
        string2.getClass();
        zzgwh2.zzc = string2;
    }

    public static /* synthetic */ void zzi(zzgwh zzgwh2, zzhac zzhac2) {
        zzhac2.getClass();
        zzgwh2.zzd = zzhac2;
    }

    public static /* synthetic */ void zzj(zzgwh zzgwh2, zzgwg zzgwg2) {
        int n3;
        zzgwh2.zze = n3 = zzgwg2.zza();
    }

    public final zzgwg zzc() {
        int n3 = this.zze;
        zzgwg zzgwg2 = zzgwg.zzb(n3);
        if (zzgwg2 == null) {
            zzgwg2 = zzgwg.zzf;
        }
        return zzgwg2;
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
                clazz = zzgwh.class;
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
                return new zzgwe(null);
            }
            case 3: {
                return new zzgwh();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", objectArray);
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

    public final String zzg() {
        return this.zzc;
    }
}


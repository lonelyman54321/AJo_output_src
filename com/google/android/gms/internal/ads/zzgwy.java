/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwj;
import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwy
extends zzhbo
implements zzhdf {
    private static final zzgwy zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgwy zzgwy2;
        zza = zzgwy2 = new zzgwy();
        zzhbo.zzca(zzgwy.class, zzgwy2);
    }

    private zzgwy() {
    }

    public static zzgwx zza() {
        return (zzgwx)zza.zzaZ();
    }

    public static /* synthetic */ zzgwy zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgwy zzgwy2, String string2) {
        string2.getClass();
        zzgwy2.zzc = string2;
    }

    public static /* synthetic */ void zze(zzgwy zzgwy2, zzgxn zzgxn2) {
        int n3;
        zzgwy2.zzf = n3 = zzgxn2.zza();
    }

    public static /* synthetic */ void zzf(zzgwy zzgwy2, zzgwj zzgwj2) {
        int n3;
        zzgwy2.zzd = n3 = zzgwj2.zza();
    }

    public static /* synthetic */ void zzg(zzgwy zzgwy2, int n3) {
        zzgwy2.zze = n3;
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
                clazz = zzgwy.class;
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
                return new zzgwx(null);
            }
            case 3: {
                return new zzgwy();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxh;
import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxi
extends zzhbo
implements zzhdf {
    private static final zzgxi zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgxl zze;

    static {
        zzgxi zzgxi2;
        zza = zzgxi2 = new zzgxi();
        zzhbo.zzca(zzgxi.class, zzgxi2);
    }

    private zzgxi() {
    }

    public static zzgxh zzc() {
        return (zzgxh)zza.zzaZ();
    }

    public static /* synthetic */ zzgxi zzd() {
        return zza;
    }

    public static zzgxi zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxi)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgxi zzgxi2, zzgxl zzgxl2) {
        int n3;
        zzgxl2.getClass();
        zzgxi2.zze = zzgxl2;
        zzgxi2.zzc = n3 = zzgxi2.zzc | 1;
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
                clazz = zzgxi.class;
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
                return new zzgxh(null);
            }
            case 3: {
                return new zzgxi();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgxl zzf() {
        zzgxl zzgxl2 = this.zze;
        if (zzgxl2 == null) {
            zzgxl2 = zzgxl.zze();
        }
        return zzgxl2;
    }
}


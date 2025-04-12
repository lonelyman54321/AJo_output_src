/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxk;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxl
extends zzhbo
implements zzhdf {
    private static final zzgxl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd = "";
    private zzgwm zze;

    static {
        zzgxl zzgxl2;
        zza = zzgxl2 = new zzgxl();
        zzhbo.zzca(zzgxl.class, zzgxl2);
    }

    private zzgxl() {
    }

    public static zzgxk zzc() {
        return (zzgxk)zza.zzaZ();
    }

    public static /* synthetic */ zzgxl zzd() {
        return zza;
    }

    public static zzgxl zze() {
        return zza;
    }

    public static zzgxl zzf(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxl)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzh(zzgxl zzgxl2, String string2) {
        string2.getClass();
        zzgxl2.zzd = string2;
    }

    public static /* synthetic */ void zzi(zzgxl zzgxl2, zzgwm zzgwm2) {
        int n3;
        zzgwm2.getClass();
        zzgxl2.zze = zzgwm2;
        zzgxl2.zzc = n3 = zzgxl2.zzc | 1;
    }

    public final zzgwm zza() {
        zzgwm zzgwm2 = this.zze;
        if (zzgwm2 == null) {
            zzgwm2 = zzgwm.zze();
        }
        return zzgwm2;
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
                clazz = zzgxl.class;
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
                return new zzgxk(null);
            }
            case 3: {
                return new zzgxl();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final String zzg() {
        return this.zzd;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwl;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwm
extends zzhbo
implements zzhdf {
    private static final zzgwm zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhac zzd;
    private int zze;

    static {
        zzgwm zzgwm2;
        zza = zzgwm2 = new zzgwm();
        zzhbo.zzca(zzgwm.class, zzgwm2);
    }

    private zzgwm() {
        zzhac zzhac2;
        this.zzd = zzhac2 = zzhac.zzb;
    }

    public static zzgwl zza() {
        return (zzgwl)zza.zzaZ();
    }

    public static zzgwl zzc(zzgwm zzgwm2) {
        return (zzgwl)zza.zzba(zzgwm2);
    }

    public static /* synthetic */ zzgwm zzd() {
        return zza;
    }

    public static zzgwm zze() {
        return zza;
    }

    public static zzgwm zzf(byte[] byArray, zzhay zzhay2) {
        return (zzgwm)zzhbo.zzbx(zza, byArray, zzhay2);
    }

    public static /* synthetic */ void zzj(zzgwm zzgwm2, String string2) {
        string2.getClass();
        zzgwm2.zzc = string2;
    }

    public static /* synthetic */ void zzk(zzgwm zzgwm2, zzhac zzhac2) {
        zzhac2.getClass();
        zzgwm2.zzd = zzhac2;
    }

    public static /* synthetic */ void zzl(zzgwm zzgwm2, zzgxn zzgxn2) {
        int n3;
        zzgwm2.zze = n3 = zzgxn2.zza();
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
                clazz = zzgwm.class;
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
                return new zzgwl(null);
            }
            case 3: {
                return new zzgwm();
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

    public final zzgxn zzg() {
        int n3 = this.zze;
        zzgxn zzgxn2 = zzgxn.zzb(n3);
        if (zzgxn2 == null) {
            zzgxn2 = zzgxn.zzf;
        }
        return zzgxn2;
    }

    public final zzhac zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}


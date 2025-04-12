/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwh;
import com.google.android.gms.internal.ads.zzgwj;
import com.google.android.gms.internal.ads.zzgws;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgwt
extends zzhbo
implements zzhdf {
    private static final zzgwt zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgwh zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgwt zzgwt2;
        zza = zzgwt2 = new zzgwt();
        zzhbo.zzca(zzgwt.class, zzgwt2);
    }

    private zzgwt() {
    }

    public static zzgws zze() {
        return (zzgws)zza.zzaZ();
    }

    public static /* synthetic */ zzgwt zzf() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgwt zzgwt2, zzgwh zzgwh2) {
        int n3;
        zzgwh2.getClass();
        zzgwt2.zzd = zzgwh2;
        zzgwt2.zzc = n3 = zzgwt2.zzc | 1;
    }

    public static /* synthetic */ void zzi(zzgwt zzgwt2, zzgxn zzgxn2) {
        int n3;
        zzgwt2.zzg = n3 = zzgxn2.zza();
    }

    public static /* synthetic */ void zzj(zzgwt zzgwt2, zzgwj zzgwj2) {
        int n3;
        zzgwt2.zze = n3 = zzgwj2.zza();
    }

    public static /* synthetic */ void zzk(zzgwt zzgwt2, int n3) {
        zzgwt2.zzf = n3;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgwh zzc() {
        zzgwh zzgwh2 = this.zzd;
        if (zzgwh2 == null) {
            zzgwh2 = zzgwh.zze();
        }
        return zzgwh2;
    }

    public final zzgwj zzd() {
        int n3 = this.zze;
        zzgwj zzgwj2 = zzgwj.zzb(n3);
        if (zzgwj2 == null) {
            zzgwj2 = zzgwj.zze;
        }
        return zzgwj2;
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
                clazz = zzgwt.class;
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
                return new zzgws(null);
            }
            case 3: {
                return new zzgwt();
            }
            case 2: {
                objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                return zzhbo.zzbR(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\f\u0003\u000b\u0004\f", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgxn zzg() {
        int n3 = this.zzg;
        zzgxn zzgxn2 = zzgxn.zzb(n3);
        if (zzgxn2 == null) {
            zzgxn2 = zzgxn.zzf;
        }
        return zzgxn2;
    }

    public final boolean zzl() {
        int n3 = this.zzc;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}


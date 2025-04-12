/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxb;
import com.google.android.gms.internal.ads.zzgxf;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgxc
extends zzhbo
implements zzhdf {
    private static final zzgxc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgxf zze;

    static {
        zzgxc zzgxc2;
        zza = zzgxc2 = new zzgxc();
        zzhbo.zzca(zzgxc.class, zzgxc2);
    }

    private zzgxc() {
    }

    public static zzgxb zzc() {
        return (zzgxb)zza.zzaZ();
    }

    public static /* synthetic */ zzgxc zzd() {
        return zza;
    }

    public static zzgxc zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgxc)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgxc zzgxc2, zzgxf zzgxf2) {
        int n3;
        zzgxf2.getClass();
        zzgxc2.zze = zzgxf2;
        zzgxc2.zzc = n3 = zzgxc2.zzc | 1;
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
                clazz = zzgxc.class;
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
                return new zzgxb(null);
            }
            case 3: {
                return new zzgxc();
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

    public final zzgxf zzf() {
        zzgxf zzgxf2 = this.zze;
        if (zzgxf2 == null) {
            zzgxf2 = zzgxf.zzd();
        }
        return zzgxf2;
    }
}


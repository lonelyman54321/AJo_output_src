/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgum;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgun
extends zzhbo
implements zzhdf {
    private static final zzgun zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzguq zzd;
    private int zze;

    static {
        zzgun zzgun2;
        zza = zzgun2 = new zzgun();
        zzhbo.zzca(zzgun.class, zzgun2);
    }

    private zzgun() {
    }

    public static zzgum zzc() {
        return (zzgum)zza.zzaZ();
    }

    public static /* synthetic */ zzgun zzd() {
        return zza;
    }

    public static zzgun zze() {
        return zza;
    }

    public static /* synthetic */ void zzg(zzgun zzgun2, zzguq zzguq2) {
        int n3;
        zzguq2.getClass();
        zzgun2.zzd = zzguq2;
        zzgun2.zzc = n3 = zzgun2.zzc | 1;
    }

    public static /* synthetic */ void zzh(zzgun zzgun2, int n3) {
        zzgun2.zze = n3;
    }

    public final int zza() {
        return this.zze;
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
                clazz = zzgun.class;
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
                return new zzgum(null);
            }
            case 3: {
                return new zzgun();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzguq zzf() {
        zzguq zzguq2 = this.zzd;
        if (zzguq2 == null) {
            zzguq2 = zzguq.zze();
        }
        return zzguq2;
    }
}


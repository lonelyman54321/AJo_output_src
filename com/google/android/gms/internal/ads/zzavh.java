/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzavh
extends zzhbo
implements zzhdf {
    private static final zzavh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzhac zzf;

    static {
        zzavh zzavh2;
        zza = zzavh2 = new zzavh();
        zzhbo.zzca(zzavh.class, zzavh2);
    }

    private zzavh() {
        zzhac zzhac2;
        this.zzf = zzhac2 = zzhac.zzb;
    }

    public static /* synthetic */ zzavh zzc() {
        return zza;
    }

    public static zzavh zzd() {
        return zza;
    }

    public final long zza() {
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
                clazz = zzavh.class;
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
                return new zzavg(null);
            }
            case 3: {
                return new zzavh();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1008\u0001\u0004\u100a\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final boolean zze() {
        int n3 = this.zzc;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }
}


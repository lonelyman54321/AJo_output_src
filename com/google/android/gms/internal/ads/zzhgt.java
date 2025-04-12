/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhgq;
import com.google.android.gms.internal.ads.zzhgs;

public final class zzhgt
extends zzhbo
implements zzhdf {
    private static final zzhgt zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private zzhgs zze;
    private long zzf;
    private String zzg;

    static {
        zzhgt zzhgt2;
        zza = zzhgt2 = new zzhgt();
        zzhbo.zzca(zzhgt.class, zzhgt2);
    }

    private zzhgt() {
        String string2;
        this.zzd = string2 = "";
        this.zzg = string2;
    }

    public static /* synthetic */ zzhgt zzc() {
        return zza;
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
                clazz = zzhgt.class;
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
                return new zzhgq(null);
            }
            case 3: {
                return new zzhgt();
            }
            case 2: {
                objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1002\u0002\u0004\u1008\u0003", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


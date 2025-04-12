/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzb$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzfl;
import com.google.android.gms.internal.vision.zzgz;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzji;
import com.google.android.gms.internal.vision.zzjj;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzb
extends zzjb
implements zzkm {
    private static final zzji zzd;
    private static final zzfi$zzb zze;
    private static volatile zzkx zzf;
    private zzjj zzc;

    static {
        Object object;
        zzd = object = new zzfl();
        zze = object = new zzfi$zzb();
        zzjb.zza(zzfi$zzb.class, (zzjb)object);
    }

    private zzfi$zzb() {
        zzjj zzjj2;
        this.zzc = zzjj2 = zzjb.zzn();
    }

    public static /* synthetic */ zzfi$zzb zza() {
        return zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzfk.zza;
        byte by2 = 1;
        object -= by2;
        object = objectArray[object];
        objectArray = null;
        switch (object) {
            default: {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                throw unsupportedOperationException;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                Object object3 = zzf;
                if (object3 != null) return object3;
                objectArray = zzfi$zzb.class;
                synchronized (objectArray) {
                    try {
                        object3 = zzf;
                        if (object3 != null) return object3;
                        object2 = zze;
                        zzf = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zze;
            }
            case 3: {
                zzjg zzjg2 = zzgz.zzb();
                objectArray = new Object[2];
                objectArray[0] = "zzc";
                objectArray[by2] = zzjg2;
                return zzjb.zza((zzkk)zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", objectArray);
            }
            case 2: {
                return new zzfi$zzb$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzb();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzc$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzgz;
import com.google.android.gms.internal.vision.zzha;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzc
extends zzjb
implements zzkm {
    private static final zzfi$zzc zzg;
    private static volatile zzkx zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzfi$zzc zzfi$zzc;
        zzg = zzfi$zzc = new zzfi$zzc();
        zzjb.zza(zzfi$zzc.class, zzfi$zzc);
    }

    private zzfi$zzc() {
    }

    public static /* synthetic */ zzfi$zzc zza() {
        return zzg;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzc>)zzfk.zza;
        byte by2 = 1;
        object -= by2;
        object = clazz[object];
        clazz = null;
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
                Object object3 = zzh;
                if (object3 != null) return object3;
                clazz = zzfi$zzc.class;
                synchronized (clazz) {
                    try {
                        object3 = zzh;
                        if (object3 != null) return object3;
                        object2 = zzg;
                        zzh = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzg;
            }
            case 3: {
                zzjg zzjg2 = zzgz.zzb();
                clazz = zzha.zzb();
                Object[] objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = zzjg2;
                objectArray[3] = "zze";
                objectArray[4] = clazz;
                objectArray[5] = "zzf";
                return zzjb.zza((zzkk)zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002", objectArray);
            }
            case 2: {
                return new zzfi$zzc$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzc();
    }
}


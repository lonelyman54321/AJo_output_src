/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzl$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzl
extends zzjb
implements zzkm {
    private static final zzfi$zzl zzf;
    private static volatile zzkx zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzfi$zzl zzfi$zzl;
        zzf = zzfi$zzl = new zzfi$zzl();
        zzjb.zza(zzfi$zzl.class, zzfi$zzl);
    }

    private zzfi$zzl() {
    }

    public static /* synthetic */ zzfi$zzl zza() {
        return zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzl>)zzfk.zza;
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
                Object object3 = zzg;
                if (object3 != null) return object3;
                clazz = zzfi$zzl.class;
                synchronized (clazz) {
                    try {
                        object3 = zzg;
                        if (object3 != null) return object3;
                        object2 = zzf;
                        zzg = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzf;
            }
            case 3: {
                Object[] objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzjb.zza((zzkk)zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", objectArray);
            }
            case 2: {
                return new zzfi$zzl$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzl();
    }
}


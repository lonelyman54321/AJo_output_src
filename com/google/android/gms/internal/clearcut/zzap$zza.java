/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzap$zza$zza;
import com.google.android.gms.internal.clearcut.zzap$zza$zzb;
import com.google.android.gms.internal.clearcut.zzaq;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;

public final class zzap$zza
extends zzcg
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzap$zza zzes;
    private int zzbb;
    private int zzel;
    private int zzem;
    private int zzen;
    private int zzeo;
    private int zzep;
    private int zzeq;
    private int zzer;

    static {
        zzap$zza zzap$zza;
        zzes = zzap$zza = new zzap$zza();
        zzcg.zza(zzap$zza.class, zzap$zza);
    }

    private zzap$zza() {
    }

    public static /* synthetic */ zzap$zza zzq() {
        return zzes;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzap$zza>)zzaq.zzba;
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
                Object object3 = zzbg;
                if (object3 != null) return object3;
                clazz = zzap$zza.class;
                synchronized (clazz) {
                    try {
                        object3 = zzbg;
                        if (object3 != null) return object3;
                        object2 = zzes;
                        zzbg = object3 = new zzcg$zzb((zzcg)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzes;
            }
            case 3: {
                zzck zzck2 = zzap$zza$zzb.zzd();
                clazz = zzap$zza$zzb.zzd();
                zzck zzck3 = zzap$zza$zzb.zzd();
                zzck zzck4 = zzap$zza$zzb.zzd();
                zzck zzck5 = zzap$zza$zzb.zzd();
                zzck zzck6 = zzap$zza$zzb.zzd();
                zzck zzck7 = zzap$zza$zzb.zzd();
                Object[] objectArray = new Object[15];
                objectArray[0] = "zzbb";
                objectArray[by2] = "zzel";
                objectArray[2] = zzck2;
                objectArray[3] = "zzem";
                objectArray[4] = clazz;
                objectArray[5] = "zzen";
                objectArray[6] = zzck3;
                objectArray[7] = "zzeo";
                objectArray[8] = zzck4;
                objectArray[9] = "zzep";
                objectArray[10] = zzck5;
                objectArray[11] = "zzeq";
                objectArray[12] = zzck6;
                objectArray[13] = "zzer";
                objectArray[14] = zzck7;
                return zzcg.zza(zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", objectArray);
            }
            case 2: {
                return new zzap$zza$zza(null);
            }
            case 1: 
        }
        return new zzap$zza();
    }
}


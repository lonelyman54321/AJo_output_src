/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzb;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzdz;
import com.google.android.gms.internal.clearcut.zzge$zzj$zza;
import com.google.android.gms.internal.clearcut.zzge$zzj$zzb;
import com.google.android.gms.internal.clearcut.zzgf;

public final class zzge$zzj
extends zzcg
implements zzdq {
    private static volatile zzdz zzbg;
    private static final zzge$zzj zzwj;
    private int zzbb;
    private boolean zzwf;
    private boolean zzwg;
    private int zzwh;
    private boolean zzwi;

    static {
        zzge$zzj zzge$zzj;
        zzwj = zzge$zzj = new zzge$zzj();
        zzcg.zza(zzge$zzj.class, zzge$zzj);
    }

    private zzge$zzj() {
    }

    public static /* synthetic */ zzge$zzj zzfc() {
        return zzwj;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object objectArray, Object object2) {
        objectArray = zzgf.zzba;
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
                Object object3 = zzbg;
                if (object3 != null) return object3;
                objectArray = zzge$zzj.class;
                synchronized (objectArray) {
                    try {
                        object3 = zzbg;
                        if (object3 != null) return object3;
                        object2 = zzwj;
                        zzbg = object3 = new zzcg$zzb((zzcg)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzwj;
            }
            case 3: {
                zzck zzck2 = zzge$zzj$zza.zzd();
                objectArray = new Object[6];
                objectArray[0] = "zzbb";
                objectArray[by2] = "zzwf";
                objectArray[2] = "zzwg";
                objectArray[3] = "zzwh";
                objectArray[4] = zzck2;
                objectArray[5] = "zzwi";
                return zzcg.zza(zzwj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0007\u0003", objectArray);
            }
            case 2: {
                return new zzge$zzj$zzb(null);
            }
            case 1: 
        }
        return new zzge$zzj();
    }
}


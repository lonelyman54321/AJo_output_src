/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzd$zza;
import com.google.android.gms.internal.vision.zzfi$zzm;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzd
extends zzjb
implements zzkm {
    private static final zzfi$zzd zzd;
    private static volatile zzkx zze;
    private zzjl zzc;

    static {
        zzfi$zzd zzfi$zzd;
        zzd = zzfi$zzd = new zzfi$zzd();
        zzjb.zza(zzfi$zzd.class, zzfi$zzd);
    }

    private zzfi$zzd() {
        zzjl zzjl2;
        this.zzc = zzjl2 = zzjb.zzo();
    }

    public static zzfi$zzd$zza zza() {
        return (zzfi$zzd$zza)zzd.zzj();
    }

    public static /* synthetic */ void zza(zzfi$zzd zzfi$zzd, zzfi$zzm zzfi$zzm) {
        zzfi$zzd.zza(zzfi$zzm);
    }

    private final void zza(zzfi$zzm zzfi$zzm) {
        zzfi$zzm.getClass();
        zzjl zzjl2 = this.zzc;
        boolean bl2 = zzjl2.zza();
        if (!bl2) {
            this.zzc = zzjl2 = zzjb.zza(zzjl2);
        }
        this.zzc.add(zzfi$zzm);
    }

    public static /* synthetic */ zzfi$zzd zzb() {
        return zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzd>)zzfk.zza;
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
                Object object3 = zze;
                if (object3 != null) return object3;
                clazz = zzfi$zzd.class;
                synchronized (clazz) {
                    try {
                        object3 = zze;
                        if (object3 != null) return object3;
                        object2 = zzd;
                        zze = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzd;
            }
            case 3: {
                Object[] objectArray = new Object[2];
                objectArray[0] = "zzc";
                objectArray[by2] = zzfi$zzm.class;
                return zzjb.zza((zzkk)zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objectArray);
            }
            case 2: {
                return new zzfi$zzd$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzd();
    }
}


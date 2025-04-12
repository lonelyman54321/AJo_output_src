/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzm$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzm
extends zzjb
implements zzkm {
    private static final zzfi$zzm zzf;
    private static volatile zzkx zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzfi$zzm zzfi$zzm;
        zzf = zzfi$zzm = new zzfi$zzm();
        zzjb.zza(zzfi$zzm.class, zzfi$zzm);
    }

    private zzfi$zzm() {
    }

    public static zzfi$zzm$zza zza() {
        return (zzfi$zzm$zza)zzf.zzj();
    }

    private final void zza(int n3) {
        int n4;
        this.zzc = n4 = this.zzc | 1;
        this.zzd = n3;
    }

    public static /* synthetic */ void zza(zzfi$zzm zzfi$zzm, int n3) {
        zzfi$zzm.zza(n3);
    }

    public static /* synthetic */ zzfi$zzm zzb() {
        return zzf;
    }

    public static /* synthetic */ void zzb(zzfi$zzm zzfi$zzm, int n3) {
        zzfi$zzm.zzc(n3);
    }

    private final void zzc(int n3) {
        int n4;
        this.zzc = n4 = this.zzc | 2;
        this.zze = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzm>)zzfk.zza;
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
                clazz = zzfi$zzm.class;
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
                return zzjb.zza((zzkk)zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", objectArray);
            }
            case 2: {
                return new zzfi$zzm$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzm();
    }
}


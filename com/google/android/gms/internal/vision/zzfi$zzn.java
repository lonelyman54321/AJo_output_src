/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzc;
import com.google.android.gms.internal.vision.zzfi$zzd;
import com.google.android.gms.internal.vision.zzfi$zzh;
import com.google.android.gms.internal.vision.zzfi$zzn$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzn
extends zzjb
implements zzkm {
    private static final zzfi$zzn zzh;
    private static volatile zzkx zzi;
    private int zzc;
    private zzfi$zzd zzd;
    private int zze;
    private zzfi$zzh zzf;
    private zzfi$zzc zzg;

    static {
        zzfi$zzn zzfi$zzn;
        zzh = zzfi$zzn = new zzfi$zzn();
        zzjb.zza(zzfi$zzn.class, zzfi$zzn);
    }

    private zzfi$zzn() {
    }

    public static zzfi$zzn$zza zza() {
        return (zzfi$zzn$zza)zzh.zzj();
    }

    private final void zza(int n3) {
        int n4;
        this.zzc = n4 = this.zzc | 2;
        this.zze = n3;
    }

    private final void zza(zzfi$zzd zzfi$zzd) {
        int n3;
        zzfi$zzd.getClass();
        this.zzd = zzfi$zzd;
        this.zzc = n3 = this.zzc | 1;
    }

    private final void zza(zzfi$zzh zzfi$zzh) {
        int n3;
        zzfi$zzh.getClass();
        this.zzf = zzfi$zzh;
        this.zzc = n3 = this.zzc | 4;
    }

    public static /* synthetic */ void zza(zzfi$zzn zzfi$zzn, int n3) {
        zzfi$zzn.zza(n3);
    }

    public static /* synthetic */ void zza(zzfi$zzn zzfi$zzn, zzfi$zzd zzfi$zzd) {
        zzfi$zzn.zza(zzfi$zzd);
    }

    public static /* synthetic */ void zza(zzfi$zzn zzfi$zzn, zzfi$zzh zzfi$zzh) {
        zzfi$zzn.zza(zzfi$zzh);
    }

    public static /* synthetic */ zzfi$zzn zzb() {
        return zzh;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzn>)zzfk.zza;
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
                Object object3 = zzi;
                if (object3 != null) return object3;
                clazz = zzfi$zzn.class;
                synchronized (clazz) {
                    try {
                        object3 = zzi;
                        if (object3 != null) return object3;
                        object2 = zzh;
                        zzi = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzh;
            }
            case 3: {
                Object[] objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                return zzjb.zza((zzkk)zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001\u0010\u1009\u0002\u0011\u1009\u0003", objectArray);
            }
            case 2: {
                return new zzfi$zzn$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzn();
    }
}


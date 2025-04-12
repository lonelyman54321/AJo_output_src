/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzh$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzh
extends zzjb
implements zzkm {
    private static final zzfi$zzh zzj;
    private static volatile zzkx zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    static {
        zzfi$zzh zzfi$zzh;
        zzj = zzfi$zzh = new zzfi$zzh();
        zzjb.zza(zzfi$zzh.class, zzfi$zzh);
    }

    private zzfi$zzh() {
    }

    public static zzfi$zzh$zza zza() {
        return (zzfi$zzh$zza)zzj.zzj();
    }

    private final void zza(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 1;
        this.zzd = f5;
    }

    public static /* synthetic */ void zza(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zza(f5);
    }

    public static /* synthetic */ zzfi$zzh zzb() {
        return zzj;
    }

    private final void zzb(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 2;
        this.zze = f5;
    }

    public static /* synthetic */ void zzb(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zzb(f5);
    }

    private final void zzc(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 4;
        this.zzf = f5;
    }

    public static /* synthetic */ void zzc(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zzc(f5);
    }

    private final void zzd(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 8;
        this.zzg = f5;
    }

    public static /* synthetic */ void zzd(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zzd(f5);
    }

    private final void zze(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 0x10;
        this.zzh = f5;
    }

    public static /* synthetic */ void zze(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zze(f5);
    }

    private final void zzf(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 0x20;
        this.zzi = f5;
    }

    public static /* synthetic */ void zzf(zzfi$zzh zzfi$zzh, float f5) {
        zzfi$zzh.zzf(f5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzh>)zzfk.zza;
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
                Object object3 = zzk;
                if (object3 != null) return object3;
                clazz = zzfi$zzh.class;
                synchronized (clazz) {
                    try {
                        object3 = zzk;
                        if (object3 != null) return object3;
                        object2 = zzj;
                        zzk = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzj;
            }
            case 3: {
                Object[] objectArray = new Object[7];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                return zzjb.zza((zzkk)zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005", objectArray);
            }
            case 2: {
                return new zzfi$zzh$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzh();
    }
}


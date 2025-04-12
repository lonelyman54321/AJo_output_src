/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzj$zza;
import com.google.android.gms.internal.vision.zzfi$zzj$zzb;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzj
extends zzjb
implements zzkm {
    private static final zzfi$zzj zzi;
    private static volatile zzkx zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzfi$zzj zzfi$zzj;
        zzi = zzfi$zzj = new zzfi$zzj();
        zzjb.zza(zzfi$zzj.class, zzfi$zzj);
    }

    private zzfi$zzj() {
    }

    public static zzfi$zzj$zzb zza() {
        return (zzfi$zzj$zzb)zzi.zzj();
    }

    private final void zza(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 2;
        this.zze = l2;
    }

    public static /* synthetic */ void zza(zzfi$zzj zzfi$zzj, long l2) {
        zzfi$zzj.zza(l2);
    }

    public static /* synthetic */ zzfi$zzj zzb() {
        return zzi;
    }

    private final void zzb(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 4;
        this.zzf = l2;
    }

    public static /* synthetic */ void zzb(zzfi$zzj zzfi$zzj, long l2) {
        zzfi$zzj.zzb(l2);
    }

    private final void zzc(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 8;
        this.zzg = l2;
    }

    public static /* synthetic */ void zzc(zzfi$zzj zzfi$zzj, long l2) {
        zzfi$zzj.zzc(l2);
    }

    private final void zzd(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 0x10;
        this.zzh = l2;
    }

    public static /* synthetic */ void zzd(zzfi$zzj zzfi$zzj, long l2) {
        zzfi$zzj.zzd(l2);
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
                Object object3 = zzj;
                if (object3 != null) return object3;
                objectArray = zzfi$zzj.class;
                synchronized (objectArray) {
                    try {
                        object3 = zzj;
                        if (object3 != null) return object3;
                        object2 = zzi;
                        zzj = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzi;
            }
            case 3: {
                zzjg zzjg2 = zzfi$zzj$zza.zzb();
                objectArray = new Object[7];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = zzjg2;
                objectArray[3] = "zze";
                objectArray[4] = "zzf";
                objectArray[5] = "zzh";
                objectArray[6] = "zzg";
                return zzjb.zza((zzkk)zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0004\u0005\u1002\u0003", objectArray);
            }
            case 2: {
                return new zzfi$zzj$zzb(null);
            }
            case 1: 
        }
        return new zzfi$zzj();
    }
}


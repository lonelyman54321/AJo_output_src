/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzg$zza;
import com.google.android.gms.internal.vision.zzfi$zzg$zzb;
import com.google.android.gms.internal.vision.zzfi$zzg$zzc;
import com.google.android.gms.internal.vision.zzfi$zzg$zzd;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzg
extends zzjb
implements zzkm {
    private static final zzfi$zzg zzj;
    private static volatile zzkx zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        zzfi$zzg zzfi$zzg;
        zzj = zzfi$zzg = new zzfi$zzg();
        zzjb.zza(zzfi$zzg.class, zzfi$zzg);
    }

    private zzfi$zzg() {
    }

    public static zzfi$zzg$zza zza() {
        return (zzfi$zzg$zza)zzj.zzj();
    }

    private final void zza(float f5) {
        int n3;
        this.zzc = n3 = this.zzc | 0x20;
        this.zzi = f5;
    }

    private final void zza(zzfi$zzg$zzb zzfi$zzg$zzb) {
        int n3;
        this.zzf = n3 = zzfi$zzg$zzb.zza();
        this.zzc = n3 = this.zzc | 4;
    }

    private final void zza(zzfi$zzg$zzc zzfi$zzg$zzc) {
        int n3;
        this.zze = n3 = zzfi$zzg$zzc.zza();
        this.zzc = n3 = this.zzc | 2;
    }

    private final void zza(zzfi$zzg$zzd zzfi$zzg$zzd) {
        int n3;
        this.zzd = n3 = zzfi$zzg$zzd.zza();
        this.zzc = n3 = this.zzc | 1;
    }

    public static /* synthetic */ void zza(zzfi$zzg zzfi$zzg, float f5) {
        zzfi$zzg.zza(f5);
    }

    public static /* synthetic */ void zza(zzfi$zzg zzfi$zzg, zzfi$zzg$zzb zzfi$zzg$zzb) {
        zzfi$zzg.zza(zzfi$zzg$zzb);
    }

    public static /* synthetic */ void zza(zzfi$zzg zzfi$zzg, zzfi$zzg$zzc zzfi$zzg$zzc) {
        zzfi$zzg.zza(zzfi$zzg$zzc);
    }

    public static /* synthetic */ void zza(zzfi$zzg zzfi$zzg, zzfi$zzg$zzd zzfi$zzg$zzd) {
        zzfi$zzg.zza(zzfi$zzg$zzd);
    }

    public static /* synthetic */ void zza(zzfi$zzg zzfi$zzg, boolean bl2) {
        zzfi$zzg.zza(bl2);
    }

    private final void zza(boolean bl2) {
        int n3;
        this.zzc = n3 = this.zzc | 8;
        this.zzg = bl2;
    }

    public static /* synthetic */ zzfi$zzg zzb() {
        return zzj;
    }

    public static /* synthetic */ void zzb(zzfi$zzg zzfi$zzg, boolean bl2) {
        zzfi$zzg.zzb(bl2);
    }

    private final void zzb(boolean bl2) {
        int n3;
        this.zzc = n3 = this.zzc | 0x10;
        this.zzh = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzg>)zzfk.zza;
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
                clazz = zzfi$zzg.class;
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
                zzjg zzjg2 = zzfi$zzg$zzd.zzb();
                clazz = zzfi$zzg$zzc.zzb();
                zzjg zzjg3 = zzfi$zzg$zzb.zzb();
                Object[] objectArray = new Object[10];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = zzjg2;
                objectArray[3] = "zze";
                objectArray[4] = clazz;
                objectArray[5] = "zzf";
                objectArray[6] = zzjg3;
                objectArray[7] = "zzg";
                objectArray[8] = "zzh";
                objectArray[9] = "zzi";
                return zzjb.zza((zzkk)zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1001\u0005", objectArray);
            }
            case 2: {
                return new zzfi$zzg$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzg();
    }
}


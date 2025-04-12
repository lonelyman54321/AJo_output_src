/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zze;
import com.google.android.gms.internal.vision.zzfi$zzi;
import com.google.android.gms.internal.vision.zzfi$zzk;
import com.google.android.gms.internal.vision.zzfi$zzo$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzo
extends zzjb
implements zzkm {
    private static final zzfi$zzo zzi;
    private static volatile zzkx zzj;
    private int zzc;
    private zzfi$zze zzd;
    private zzfi$zzk zze;
    private zzfi$zzi zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzfi$zzo zzfi$zzo;
        zzi = zzfi$zzo = new zzfi$zzo();
        zzjb.zza(zzfi$zzo.class, zzfi$zzo);
    }

    private zzfi$zzo() {
    }

    public static zzfi$zzo$zza zza() {
        return (zzfi$zzo$zza)zzi.zzj();
    }

    private final void zza(zzfi$zzi zzfi$zzi) {
        int n3;
        zzfi$zzi.getClass();
        this.zzf = zzfi$zzi;
        this.zzc = n3 = this.zzc | 4;
    }

    private final void zza(zzfi$zzk zzfi$zzk) {
        int n3;
        zzfi$zzk.getClass();
        this.zze = zzfi$zzk;
        this.zzc = n3 = this.zzc | 2;
    }

    public static /* synthetic */ void zza(zzfi$zzo zzfi$zzo, zzfi$zzi zzfi$zzi) {
        zzfi$zzo.zza(zzfi$zzi);
    }

    public static /* synthetic */ void zza(zzfi$zzo zzfi$zzo, zzfi$zzk zzfi$zzk) {
        zzfi$zzo.zza(zzfi$zzk);
    }

    public static /* synthetic */ void zza(zzfi$zzo zzfi$zzo, boolean bl2) {
        zzfi$zzo.zza(true);
    }

    private final void zza(boolean bl2) {
        int n3;
        this.zzc = n3 = this.zzc | 0x10;
        this.zzh = true;
    }

    public static /* synthetic */ zzfi$zzo zzb() {
        return zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzo>)zzfk.zza;
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
                Object object3 = zzj;
                if (object3 != null) return object3;
                clazz = zzfi$zzo.class;
                synchronized (clazz) {
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
                Object[] objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                return zzjb.zza((zzkk)zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1004\u0003\u0005\u1007\u0004", objectArray);
            }
            case 2: {
                return new zzfi$zzo$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzo();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzf;
import com.google.android.gms.internal.vision.zzfi$zzi$zza;
import com.google.android.gms.internal.vision.zzfi$zzj;
import com.google.android.gms.internal.vision.zzfi$zzl;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzi
extends zzjb
implements zzkm {
    private static final zzfi$zzi zzg;
    private static volatile zzkx zzh;
    private int zzc;
    private zzfi$zzj zzd;
    private zzfi.zzl zze;
    private zzjl zzf;

    static {
        zzfi$zzi zzfi$zzi;
        zzg = zzfi$zzi = new zzfi$zzi();
        zzjb.zza(zzfi$zzi.class, zzfi$zzi);
    }

    private zzfi$zzi() {
        zzjl zzjl2;
        this.zzf = zzjl2 = zzjb.zzo();
    }

    public static zzfi$zzi$zza zza() {
        return (zzfi$zzi$zza)zzg.zzj();
    }

    private final void zza(zzfi$zzf zzfi$zzf) {
        zzfi$zzf.getClass();
        this.zzc();
        this.zzf.add(zzfi$zzf);
    }

    public static /* synthetic */ void zza(zzfi$zzi zzfi$zzi, zzfi$zzf zzfi$zzf) {
        zzfi$zzi.zza(zzfi$zzf);
    }

    public static /* synthetic */ void zza(zzfi$zzi zzfi$zzi, zzfi$zzj zzfi$zzj) {
        zzfi$zzi.zza(zzfi$zzj);
    }

    public static /* synthetic */ void zza(zzfi$zzi zzfi$zzi, Iterable iterable) {
        zzfi$zzi.zza(iterable);
    }

    private final void zza(zzfi$zzj zzfi$zzj) {
        int n3;
        zzfi$zzj.getClass();
        this.zzd = zzfi$zzj;
        this.zzc = n3 = this.zzc | 1;
    }

    private final void zza(Iterable iterable) {
        this.zzc();
        zzjl zzjl2 = this.zzf;
        zzhf.zza(iterable, zzjl2);
    }

    public static /* synthetic */ zzfi$zzi zzb() {
        return zzg;
    }

    private final void zzc() {
        zzjl zzjl2 = this.zzf;
        boolean bl2 = zzjl2.zza();
        if (!bl2) {
            this.zzf = zzjl2 = zzjb.zza(zzjl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzi>)zzfk.zza;
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
                Object object3 = zzh;
                if (object3 != null) return object3;
                clazz = zzfi$zzi.class;
                synchronized (clazz) {
                    try {
                        object3 = zzh;
                        if (object3 != null) return object3;
                        object2 = zzg;
                        zzh = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzg;
            }
            case 3: {
                Object[] objectArray = new Object[5];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = zzfi$zzf.class;
                return zzjb.zza((zzkk)zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b", objectArray);
            }
            case 2: {
                return new zzfi$zzi$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzi();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zzf$zza;
import com.google.android.gms.internal.vision.zzfi$zzf$zzb;
import com.google.android.gms.internal.vision.zzfi$zzn;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzhf;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzf
extends zzjb
implements zzkm {
    private static final zzfi$zzf zzl;
    private static volatile zzkx zzm;
    private int zzc;
    private String zzd;
    private String zze;
    private zzjl zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private zzjl zzk;

    static {
        zzfi$zzf zzfi$zzf;
        zzl = zzfi$zzf = new zzfi$zzf();
        zzjb.zza(zzfi$zzf.class, zzfi$zzf);
    }

    private zzfi$zzf() {
        zzjl zzjl2;
        Object object = "";
        this.zzd = object;
        this.zze = object;
        this.zzf = zzjl2 = zzjb.zzo();
        this.zzh = object;
        this.zzk = object = zzjb.zzo();
    }

    public static zzfi$zzf$zzb zza() {
        return (zzfi$zzf$zzb)zzl.zzj();
    }

    private final void zza(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 0x10;
        this.zzi = l2;
    }

    public static /* synthetic */ void zza(zzfi$zzf zzfi$zzf, long l2) {
        zzfi$zzf.zza(l2);
    }

    public static /* synthetic */ void zza(zzfi$zzf zzfi$zzf, Iterable iterable) {
        zzfi$zzf.zza(iterable);
    }

    public static /* synthetic */ void zza(zzfi$zzf zzfi$zzf, String string2) {
        zzfi$zzf.zza(string2);
    }

    private final void zza(Iterable iterable) {
        zzjl zzjl2 = this.zzk;
        boolean bl2 = zzjl2.zza();
        if (!bl2) {
            this.zzk = zzjl2 = zzjb.zza(zzjl2);
        }
        zzjl2 = this.zzk;
        zzhf.zza(iterable, zzjl2);
    }

    private final void zza(String string2) {
        int n3;
        string2.getClass();
        this.zzc = n3 = this.zzc | 1;
        this.zzd = string2;
    }

    public static /* synthetic */ zzfi$zzf zzb() {
        return zzl;
    }

    private final void zzb(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 0x20;
        this.zzj = l2;
    }

    public static /* synthetic */ void zzb(zzfi$zzf zzfi$zzf, long l2) {
        zzfi$zzf.zzb(l2);
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
                Object object3 = zzm;
                if (object3 != null) return object3;
                objectArray = zzfi$zzf.class;
                synchronized (objectArray) {
                    try {
                        object3 = zzm;
                        if (object3 != null) return object3;
                        object2 = zzl;
                        zzm = object3 = new zzjb$zza((zzjb)object2);
                        return object3;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzl;
            }
            case 3: {
                zzjg zzjg2 = zzfi$zzf$zza.zzb();
                objectArray = new Object[11];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = zzjg2;
                objectArray[6] = "zzh";
                objectArray[7] = "zzi";
                objectArray[8] = "zzj";
                objectArray[9] = "zzk";
                objectArray[10] = zzfi.zzn.class;
                return zzjb.zza((zzkk)zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u100c\u0002\u0005\u1008\u0003\u0006\u1002\u0004\u0007\u1002\u0005\b\u001b", objectArray);
            }
            case 2: {
                return new zzfi$zzf$zzb(null);
            }
            case 1: 
        }
        return new zzfi$zzf();
    }
}


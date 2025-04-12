/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zza;
import com.google.android.gms.internal.vision.zzfi$zzb;
import com.google.android.gms.internal.vision.zzfi$zzg;
import com.google.android.gms.internal.vision.zzfi$zzk$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zzk
extends zzjb
implements zzkm {
    private static final zzfi$zzk zzj;
    private static volatile zzkx zzk;
    private int zzc;
    private String zzd;
    private long zze;
    private zzfi$zza zzf;
    private String zzg;
    private zzfi$zzg zzh;
    private zzfi$zzb zzi;

    static {
        zzfi$zzk zzfi$zzk;
        zzj = zzfi$zzk = new zzfi$zzk();
        zzjb.zza(zzfi$zzk.class, zzfi$zzk);
    }

    private zzfi$zzk() {
        String string2;
        this.zzd = string2 = "";
        this.zzg = string2;
    }

    public static zzfi$zzk$zza zza() {
        return (zzfi$zzk$zza)zzj.zzj();
    }

    private final void zza(long l2) {
        int n3;
        this.zzc = n3 = this.zzc | 2;
        this.zze = l2;
    }

    private final void zza(zzfi$zza zzfi$zza) {
        int n3;
        zzfi$zza.getClass();
        this.zzf = zzfi$zza;
        this.zzc = n3 = this.zzc | 4;
    }

    private final void zza(zzfi$zzg zzfi$zzg) {
        int n3;
        zzfi$zzg.getClass();
        this.zzh = zzfi$zzg;
        this.zzc = n3 = this.zzc | 0x10;
    }

    public static /* synthetic */ void zza(zzfi$zzk zzfi$zzk, long l2) {
        zzfi$zzk.zza(l2);
    }

    public static /* synthetic */ void zza(zzfi$zzk zzfi$zzk, zzfi$zza zzfi$zza) {
        zzfi$zzk.zza(zzfi$zza);
    }

    public static /* synthetic */ void zza(zzfi$zzk zzfi$zzk, zzfi$zzg zzfi$zzg) {
        zzfi$zzk.zza(zzfi$zzg);
    }

    public static /* synthetic */ void zza(zzfi$zzk zzfi$zzk, String string2) {
        zzfi$zzk.zza(string2);
    }

    private final void zza(String string2) {
        int n3;
        string2.getClass();
        this.zzc = n3 = this.zzc | 1;
        this.zzd = string2;
    }

    public static /* synthetic */ zzfi$zzk zzb() {
        return zzj;
    }

    public static /* synthetic */ void zzb(zzfi$zzk zzfi$zzk, String string2) {
        zzfi$zzk.zzb(string2);
    }

    private final void zzb(String string2) {
        int n3;
        string2.getClass();
        this.zzc = n3 = this.zzc | 8;
        this.zzg = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zzk>)zzfk.zza;
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
                clazz = zzfi$zzk.class;
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
                return zzjb.zza((zzkk)zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1009\u0002\u0006\u1008\u0003\u0010\u1009\u0004\u0011\u1009\u0005", objectArray);
            }
            case 2: {
                return new zzfi$zzk$zza(null);
            }
            case 1: 
        }
        return new zzfi$zzk();
    }
}


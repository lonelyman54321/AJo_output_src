/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zza$zza;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zza
extends zzjb
implements zzkm {
    private static final zzfi$zza zzf;
    private static volatile zzkx zzg;
    private int zzc;
    private String zzd;
    private String zze;

    static {
        zzfi$zza zzfi$zza;
        zzf = zzfi$zza = new zzfi$zza();
        zzjb.zza(zzfi$zza.class, zzfi$zza);
    }

    private zzfi$zza() {
        String string2;
        this.zzd = string2 = "";
        this.zze = string2;
    }

    public static zzfi$zza$zza zza() {
        return (zzfi$zza$zza)zzf.zzj();
    }

    public static /* synthetic */ void zza(zzfi$zza zzfi$zza, String string2) {
        zzfi$zza.zza(string2);
    }

    private final void zza(String string2) {
        int n3;
        string2.getClass();
        this.zzc = n3 = this.zzc | 1;
        this.zzd = string2;
    }

    public static /* synthetic */ zzfi$zza zzb() {
        return zzf;
    }

    public static /* synthetic */ void zzb(zzfi$zza zzfi$zza, String string2) {
        zzfi$zza.zzb(string2);
    }

    private final void zzb(String string2) {
        int n3;
        string2.getClass();
        this.zzc = n3 = this.zzc | 2;
        this.zze = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(int object, Object clazz, Object object2) {
        clazz = (Class<zzfi$zza>)zzfk.zza;
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
                clazz = zzfi$zza.class;
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
                return zzjb.zza((zzkk)zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", objectArray);
            }
            case 2: {
                return new zzfi$zza$zza(null);
            }
            case 1: 
        }
        return new zzfi$zza();
    }
}


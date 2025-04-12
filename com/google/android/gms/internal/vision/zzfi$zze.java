/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfi$zze$zza;
import com.google.android.gms.internal.vision.zzfi$zze$zzb;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zza;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkm;
import com.google.android.gms.internal.vision.zzkx;

public final class zzfi$zze
extends zzjb
implements zzkm {
    private static final zzfi$zze zzl;
    private static volatile zzkx zzm;
    private int zzc;
    private String zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private boolean zzk;

    static {
        zzfi$zze zzfi$zze;
        zzl = zzfi$zze = new zzfi$zze();
        zzjb.zza(zzfi$zze.class, zzfi$zze);
    }

    private zzfi$zze() {
        String string2;
        this.zzd = string2 = "";
        this.zzj = string2;
    }

    public static /* synthetic */ zzfi$zze zza() {
        return zzl;
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
                objectArray = zzfi$zze.class;
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
                zzjg zzjg2 = zzfi$zze$zzb.zzb();
                objectArray = new Object[10];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = zzjg2;
                objectArray[5] = "zzg";
                objectArray[6] = "zzh";
                objectArray[7] = "zzi";
                objectArray[8] = "zzj";
                objectArray[9] = "zzk";
                return zzjb.zza((zzkk)zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1008\u0006\b\u1007\u0007", objectArray);
            }
            case 2: {
                return new zzfi$zze$zza(null);
            }
            case 1: 
        }
        return new zzfi$zze();
    }
}


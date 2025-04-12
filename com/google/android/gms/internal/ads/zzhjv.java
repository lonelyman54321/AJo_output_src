/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhjm;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhjr;
import com.google.android.gms.internal.ads.zzhjt;

public final class zzhjv
extends zzhbo
implements zzhdf {
    private static final zzhjv zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private int zzf;
    private zzhca zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private zzhca zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        zzhjv zzhjv2;
        zza = zzhjv2 = new zzhjv();
        zzhbo.zzca(zzhjv.class, zzhjv2);
    }

    private zzhjv() {
        zzhca zzhca2;
        Object object = "";
        this.zzd = object;
        this.zze = object;
        this.zzf = 4;
        this.zzg = zzhca2 = zzhbo.zzbK();
        this.zzh = object;
        this.zzi = object;
        this.zzl = object = zzhbo.zzbK();
    }

    public static /* synthetic */ zzhjv zzc() {
        return zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                object = zzhjv.class;
                synchronized (object) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object2 = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object2);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzhjm(null);
            }
            case 3: {
                return new zzhjv();
            }
            case 2: {
                objectArray = new Object[18];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zzf";
                objectArray[3] = object = zzhjt.zza;
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                objectArray[9] = "zzl";
                objectArray[10] = zzhjr.class;
                objectArray[11] = "zze";
                objectArray[12] = "zzm";
                objectArray[13] = object = zzhjo.zza;
                objectArray[14] = "zzn";
                objectArray[15] = "zzo";
                objectArray[16] = "zzp";
                objectArray[17] = "zzu";
                return zzhbo.zzbR(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0002\u0003\u001a\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u1000\u0006\b\u001b\t\u1008\u0001\n\u180c\u0007\u000b\u1007\b\f\u1007\t\r\u1007\n\u000e\u1007\u000b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


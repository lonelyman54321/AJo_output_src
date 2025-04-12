/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfs;
import com.google.android.gms.internal.ads.zzhft;
import com.google.android.gms.internal.ads.zzhfu;
import com.google.android.gms.internal.ads.zzhfz;
import com.google.android.gms.internal.ads.zzhgb;
import com.google.android.gms.internal.ads.zzhge;
import com.google.android.gms.internal.ads.zzhgh;

public final class zzhgj
extends zzhbo
implements zzhdf {
    private static final zzhbx zza;
    private static final zzhbx zzb;
    private static final zzhgj zzc;
    private static volatile zzhdm zzd;
    private boolean zzA;
    private zzhbw zzB;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private zzhca zzi;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private String zzn;
    private int zzo;
    private int zzp;
    private int zzu;
    private boolean zzv;
    private zzhca zzw;
    private boolean zzx;
    private long zzy;
    private zzhbw zzz;

    static {
        Object object = new zzhfs();
        zza = object;
        object = new zzhft();
        zzb = object;
        zzc = object = new zzhgj();
        zzhbo.zzca(zzhgj.class, (zzhbo)object);
    }

    private zzhgj() {
        zzhca zzhca2;
        Object object = "";
        this.zzh = object;
        this.zzi = zzhca2 = zzhbo.zzbK();
        this.zzn = object;
        this.zzw = object = zzhbo.zzbK();
        this.zzz = object = zzhbo.zzbG();
        this.zzB = object = zzhbo.zzbG();
    }

    public static /* synthetic */ zzhgj zzc() {
        return zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object object2, Object objectArray) {
        byte by2 = 1;
        objectArray = zzhbn.zza;
        int n3 = object.ordinal();
        objectArray = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzd;
                if (object != null) return object;
                object2 = zzhgj.class;
                synchronized (object2) {
                    try {
                        object = zzd;
                        if (object != null) return object;
                        objectArray = zzc;
                        object = new zzhbj((zzhbo)objectArray);
                        zzd = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzc;
            }
            case 4: {
                return new zzhfu(null);
            }
            case 3: {
                return new zzhgj();
            }
            case 2: {
                object = zzhfl.zzb();
                objectArray = new Object[25];
                objectArray[0] = "zze";
                objectArray[by2] = "zzf";
                objectArray[2] = object2 = zzhgh.zza;
                objectArray[3] = "zzg";
                objectArray[4] = "zzh";
                objectArray[5] = "zzi";
                objectArray[6] = "zzj";
                objectArray[7] = object2 = zzhgb.zza;
                objectArray[8] = "zzk";
                objectArray[9] = "zzl";
                objectArray[10] = "zzm";
                objectArray[11] = "zzn";
                objectArray[12] = "zzo";
                objectArray[13] = "zzp";
                objectArray[14] = "zzu";
                objectArray[15] = "zzv";
                objectArray[16] = "zzw";
                objectArray[17] = zzhfz.class;
                objectArray[18] = "zzx";
                objectArray[19] = "zzy";
                objectArray[20] = "zzz";
                objectArray[21] = object;
                objectArray[22] = "zzA";
                objectArray[23] = "zzB";
                object = zzhge.zza;
                objectArray[24] = object;
                return zzhbo.zzbR(zzc, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u180c\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006\t\u1008\u0007\n\u1004\b\u000b\u1004\t\f\u1004\n\r\u1007\u000b\u000e\u001b\u000f\u1007\f\u0010\u1002\r\u0011\u082c\u0012\u1007\u000e\u0013\u082c", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


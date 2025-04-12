/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfry;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzfsd
extends zzhbo
implements zzhdf {
    private static final zzhbx zza;
    private static final zzfsd zzb;
    private static volatile zzhdm zzc;
    private int zzd;
    private zzhbw zze;
    private String zzf;
    private String zzg;
    private String zzh;

    static {
        Object object = new zzfry();
        zza = object;
        zzb = object = new zzfsd();
        zzhbo.zzca(zzfsd.class, (zzhbo)object);
    }

    private zzfsd() {
        Object object = zzhbo.zzbG();
        this.zze = object;
        this.zzf = object = "";
        this.zzg = object;
        this.zzh = object;
    }

    public static zzfsc zza() {
        return (zzfsc)zzb.zzaZ();
    }

    public static /* synthetic */ zzfsd zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfsd object, zzfsb zzfsb2) {
        zzfsb2.getClass();
        zzhbw zzhbw2 = ((zzfsd)object).zze;
        boolean bl2 = zzhbw2.zzc();
        if (!bl2) {
            ((zzfsd)object).zze = zzhbw2 = zzhbo.zzbH(zzhbw2);
        }
        object = ((zzfsd)object).zze;
        int n3 = zzfsb2.zza();
        object.zzi(n3);
    }

    public static /* synthetic */ void zze(zzfsd zzfsd2, String string2) {
        int n3;
        string2.getClass();
        zzfsd2.zzd = n3 = zzfsd2.zzd | 1;
        zzfsd2.zzf = string2;
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
                objectArray = zzc;
                if (objectArray != null) return objectArray;
                object = zzfsd.class;
                synchronized (object) {
                    try {
                        objectArray = zzc;
                        if (objectArray != null) return objectArray;
                        object2 = zzb;
                        zzc = objectArray = new zzhbj((zzhbo)object2);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzb;
            }
            case 4: {
                return new zzfsc(null);
            }
            case 3: {
                return new zzfsd();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzd";
                objectArray[by2] = "zze";
                objectArray[2] = object = zzfsa.zza;
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                return zzhbo.zzbR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u081e\u0002\u1008\u0000\u0003\u1008\u0001\u0004\u1008\u0002", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwr;
import com.google.android.gms.internal.ads.zzgwt;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.util.List;

public final class zzgwu
extends zzhbo
implements zzhdf {
    private static final zzgwu zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd;

    static {
        zzgwu zzgwu2;
        zza = zzgwu2 = new zzgwu();
        zzhbo.zzca(zzgwu.class, zzgwu2);
    }

    private zzgwu() {
        zzhca zzhca2;
        this.zzd = zzhca2 = zzhbo.zzbK();
    }

    public static zzgwr zzd() {
        return (zzgwr)zza.zzaZ();
    }

    public static /* synthetic */ zzgwu zzf() {
        return zza;
    }

    public static zzgwu zzg(InputStream inputStream, zzhay zzhay2) {
        return (zzgwu)zzhbo.zzbu(zza, inputStream, zzhay2);
    }

    public static /* synthetic */ void zzi(zzgwu zzgwu2, int n3) {
        zzgwu2.zzc = n3;
    }

    public static /* synthetic */ void zzj(zzgwu zzgwu2, zzgwt zzgwt2) {
        zzgwt2.getClass();
        zzhca zzhca2 = zzgwu2.zzd;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzgwu2.zzd = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzgwu2.zzd.add(zzgwt2);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = zzhbn.zza;
        int n3 = objectArray.ordinal();
        object = null;
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                clazz = zzgwu.class;
                synchronized (clazz) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object);
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
                return new zzgwr(null);
            }
            case 3: {
                return new zzgwu();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = zzgwt.class;
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgwt zze(int n3) {
        return (zzgwt)this.zzd.get(n3);
    }

    public final List zzh() {
        return this.zzd;
    }
}


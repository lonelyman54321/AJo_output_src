/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzbac
extends zzhbo
implements zzhdf {
    private static final zzbac zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzbac zzbac2;
        zza = zzbac2 = new zzbac();
        zzhbo.zzca(zzbac.class, zzbac2);
    }

    private zzbac() {
        String string2;
        this.zzd = string2 = "";
        this.zze = string2;
    }

    public static zzbab zze() {
        return (zzbab)zza.zzaZ();
    }

    public static /* synthetic */ zzbac zzf() {
        return zza;
    }

    public static zzbac zzg() {
        return zza;
    }

    public static zzbac zzh(zzhac zzhac2) {
        return (zzbac)zzhbo.zzbm(zza, zzhac2);
    }

    public static zzbac zzi(zzhac zzhac2, zzhay zzhay2) {
        return (zzbac)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzl(zzbac zzbac2, String string2) {
        int n3;
        string2.getClass();
        zzbac2.zzc = n3 = zzbac2.zzc | 1;
        zzbac2.zzd = string2;
    }

    public static /* synthetic */ void zzm(zzbac zzbac2, long l2) {
        int n3;
        zzbac2.zzc = n3 = zzbac2.zzc | 0x10;
        zzbac2.zzh = l2;
    }

    public static /* synthetic */ void zzn(zzbac zzbac2, String string2) {
        int n3;
        string2.getClass();
        zzbac2.zzc = n3 = zzbac2.zzc | 2;
        zzbac2.zze = string2;
    }

    public static /* synthetic */ void zzo(zzbac zzbac2, long l2) {
        int n3;
        zzbac2.zzc = n3 = zzbac2.zzc | 4;
        zzbac2.zzf = l2;
    }

    public static /* synthetic */ void zzp(zzbac zzbac2, long l2) {
        int n3;
        zzbac2.zzc = n3 = zzbac2.zzc | 8;
        zzbac2.zzg = l2;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
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
                clazz = zzbac.class;
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
                return new zzbab(null);
            }
            case 3: {
                return new zzbac();
            }
            case 2: {
                objectArray = new Object[6];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                return zzhbo.zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}


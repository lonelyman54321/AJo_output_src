/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgud;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgvw;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzgue
extends zzhbo
implements zzhdf {
    private static final zzgue zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguk zze;
    private zzgvw zzf;

    static {
        zzgue zzgue2;
        zza = zzgue2 = new zzgue();
        zzhbo.zzca(zzgue.class, zzgue2);
    }

    private zzgue() {
    }

    public static zzgud zzc() {
        return (zzgud)zza.zzaZ();
    }

    public static /* synthetic */ zzgue zzd() {
        return zza;
    }

    public static zzgue zze(zzhac zzhac2, zzhay zzhay2) {
        return (zzgue)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzi(zzgue zzgue2, zzguk zzguk2) {
        int n3;
        zzguk2.getClass();
        zzgue2.zze = zzguk2;
        zzgue2.zzc = n3 = zzgue2.zzc | 1;
    }

    public static /* synthetic */ void zzj(zzgue zzgue2, zzgvw zzgvw2) {
        int n3;
        zzgvw2.getClass();
        zzgue2.zzf = zzgvw2;
        zzgue2.zzc = n3 = zzgue2.zzc | 2;
    }

    public final int zza() {
        return this.zzd;
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
                clazz = zzgue.class;
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
                return new zzgud(null);
            }
            case 3: {
                return new zzgue();
            }
            case 2: {
                objectArray = new Object[4];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\u1009\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzguk zzf() {
        zzguk zzguk2 = this.zze;
        if (zzguk2 == null) {
            zzguk2 = zzguk.zze();
        }
        return zzguk2;
    }

    public final zzgvw zzg() {
        zzgvw zzgvw2 = this.zzf;
        if (zzgvw2 == null) {
            zzgvw2 = zzgvw.zze();
        }
        return zzgvw2;
    }
}


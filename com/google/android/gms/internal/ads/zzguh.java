/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgug;
import com.google.android.gms.internal.ads.zzgun;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;

public final class zzguh
extends zzhbo
implements zzhdf {
    private static final zzguh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgun zzd;
    private zzgvz zze;

    static {
        zzguh zzguh2;
        zza = zzguh2 = new zzguh();
        zzhbo.zzca(zzguh.class, zzguh2);
    }

    private zzguh() {
    }

    public static zzgug zza() {
        return (zzgug)zza.zzaZ();
    }

    public static /* synthetic */ zzguh zzc() {
        return zza;
    }

    public static zzguh zzd(zzhac zzhac2, zzhay zzhay2) {
        return (zzguh)zzhbo.zzbr(zza, zzhac2, zzhay2);
    }

    public static /* synthetic */ void zzg(zzguh zzguh2, zzgun zzgun2) {
        int n3;
        zzgun2.getClass();
        zzguh2.zzd = zzgun2;
        zzguh2.zzc = n3 = zzguh2.zzc | 1;
    }

    public static /* synthetic */ void zzh(zzguh zzguh2, zzgvz zzgvz2) {
        int n3;
        zzgvz2.getClass();
        zzguh2.zze = zzgvz2;
        zzguh2.zzc = n3 = zzguh2.zzc | 2;
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
                clazz = zzguh.class;
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
                return new zzgug(null);
            }
            case 3: {
                return new zzguh();
            }
            case 2: {
                objectArray = new Object[3];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public final zzgun zze() {
        zzgun zzgun2 = this.zzd;
        if (zzgun2 == null) {
            zzgun2 = zzgun.zze();
        }
        return zzgun2;
    }

    public final zzgvz zzf() {
        zzgvz zzgvz2 = this.zze;
        if (zzgvz2 == null) {
            zzgvz2 = zzgvz.zzf();
        }
        return zzgvz2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhhh;
import com.google.android.gms.internal.ads.zzhhl;
import com.google.android.gms.internal.ads.zzhio;
import com.google.android.gms.internal.ads.zzhip;
import com.google.android.gms.internal.ads.zzhiq;

public final class zzhir
extends zzhbo
implements zzhdf {
    private static final zzhir zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private zzhhh zzf;
    private zzhhl zzg;
    private int zzh;
    private zzhbw zzi;
    private String zzj;
    private int zzk;
    private zzhca zzl;
    private byte zzm = (byte)2;

    static {
        zzhir zzhir2;
        zza = zzhir2 = new zzhir();
        zzhbo.zzca(zzhir.class, zzhir2);
    }

    private zzhir() {
        zzhbw zzhbw2;
        Object object = "";
        this.zze = object;
        this.zzi = zzhbw2 = zzhbo.zzbG();
        this.zzj = object;
        this.zzl = object = zzhbo.zzbK();
    }

    public static zzhiq zze() {
        return (zzhiq)zza.zzaZ();
    }

    public static /* synthetic */ zzhir zzf() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzhir zzhir2, int n3) {
        int n4;
        zzhir2.zzc = n4 = zzhir2.zzc | 1;
        zzhir2.zzd = n3;
    }

    public static /* synthetic */ void zzi(zzhir zzhir2, String string2) {
        int n3;
        string2.getClass();
        zzhir2.zzc = n3 = zzhir2.zzc | 2;
        zzhir2.zze = string2;
    }

    public static /* synthetic */ void zzj(zzhir zzhir2, zzhhh zzhhh2) {
        int n3;
        zzhhh2.getClass();
        zzhir2.zzf = zzhhh2;
        zzhir2.zzc = n3 = zzhir2.zzc | 4;
    }

    public static /* synthetic */ void zzk(zzhir zzhir2, zzhip zzhip2) {
        int n3;
        zzhir2.zzk = n3 = zzhip2.zza();
        zzhir2.zzc = n3 = zzhir2.zzc | 0x40;
    }

    public static /* synthetic */ void zzl(zzhir zzhir2, String string2) {
        string2.getClass();
        zzhca zzhca2 = zzhir2.zzl;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzhir2.zzl = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzhir2.zzl.add(string2);
    }

    public final int zzc() {
        return this.zzl.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object object, Object object2) {
        byte by2 = 1;
        int n3 = objectArray.ordinal();
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                object = zzhir.class;
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
                return new zzhiq(null);
            }
            case 3: {
                return new zzhir();
            }
            case 2: {
                objectArray = new Object[11];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzd";
                objectArray[2] = "zze";
                objectArray[3] = "zzf";
                objectArray[4] = "zzg";
                objectArray[5] = "zzh";
                objectArray[6] = "zzi";
                objectArray[7] = "zzj";
                objectArray[8] = "zzk";
                objectArray[9] = object = zzhio.zza;
                objectArray[10] = "zzl";
                return zzhbo.zzbR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001\u1504\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1004\u0004\u0006\u0016\u0007\u1008\u0005\b\u180c\u0006\t\u001a", objectArray);
            }
            case 1: {
                if (object == null) {
                    by2 = 0;
                    object2 = null;
                }
                this.zzm = by2;
                return null;
            }
            case 0: 
        }
        return this.zzm;
    }

    public final String zzg() {
        return this.zze;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaf$zzd$1;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzd$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzaf$zzd
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzaf$zzd zza;
    public static final /* enum */ zzbdv$zzaf$zzd zzb;
    public static final /* enum */ zzbdv$zzaf$zzd zzc;
    public static final /* enum */ zzbdv$zzaf$zzd zzd;
    public static final /* enum */ zzbdv$zzaf$zzd zze;
    public static final /* enum */ zzbdv$zzaf$zzd zzf;
    public static final int zzg = 0;
    public static final int zzh = 1;
    public static final int zzi = 2;
    public static final int zzj = 3;
    public static final int zzk = 4;
    public static final int zzl = 5;
    private static final zzhbt zzm;
    private static final /* synthetic */ zzbdv$zzaf$zzd[] zzn;
    private final int zzo;

    static {
        Object object = new zzbdv$zzaf$zzd("UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzaf$zzd("CONNECTING", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzaf$zzd("CONNECTED", n3, n3);
        zzc = object;
        n3 = 3;
        object = new zzbdv$zzaf$zzd("DISCONNECTING", n3, n3);
        zzd = object;
        n3 = 4;
        object = new zzbdv$zzaf$zzd("DISCONNECTED", n3, n3);
        zze = object;
        n3 = 5;
        object = new zzbdv$zzaf$zzd("SUSPENDED", n3, n3);
        zzf = object;
        zzn = zzbdv$zzaf$zzd.zzf();
        zzm = object = new zzbdv$zzaf$zzd$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzaf$zzd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzo = var3_2;
    }

    public static zzbdv$zzaf$zzd[] values() {
        return (zzbdv$zzaf$zzd[])zzn.clone();
    }

    public static zzbdv$zzaf$zzd zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return zzf;
                        }
                        return zze;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzbdv$zzaf$zzd zzc(String string2) {
        return Enum.valueOf(zzbdv$zzaf$zzd.class, string2);
    }

    public static zzhbt zzd() {
        return zzm;
    }

    public static zzhbu zze() {
        return zzbdv$zzaf$zzd$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzaf$zzd[] zzf() {
        zzbdv$zzaf$zzd zzbdv$zzaf$zzd = zza;
        zzbdv$zzaf$zzd = zzb;
        zzbdv$zzaf$zzd = zzc;
        zzbdv$zzaf$zzd = zzd;
        zzbdv$zzaf$zzd = zze;
        zzbdv$zzaf$zzd = zzf;
        zzbdv$zzaf$zzd[] zzbdv$zzaf$zzdArray = new zzbdv$zzaf$zzd[]{zzbdv$zzaf$zzd, zzbdv$zzaf$zzd, zzbdv$zzaf$zzd, zzbdv$zzaf$zzd, zzbdv$zzaf$zzd, zzbdv$zzaf$zzd};
        return zzbdv$zzaf$zzdArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzo;
    }
}


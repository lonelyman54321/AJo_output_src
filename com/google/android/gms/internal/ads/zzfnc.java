/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfnc
extends Enum
implements zzhbs {
    public static final /* enum */ zzfnc zza;
    public static final /* enum */ zzfnc zzb;
    public static final /* enum */ zzfnc zzc;
    public static final /* enum */ zzfnc zzd;
    public static final /* enum */ zzfnc zze;
    public static final /* enum */ zzfnc zzf;
    public static final /* enum */ zzfnc zzg;
    public static final /* enum */ zzfnc zzh;
    public static final /* enum */ zzfnc zzi;
    public static final /* enum */ zzfnc zzj;
    public static final /* enum */ zzfnc zzk;
    private static final zzhbt zzl;
    private static final /* synthetic */ zzfnc[] zzm;
    private final int zzn;

    static {
        zzfnc zzfnc2;
        zzfnc zzfnc3;
        zzfnc zzfnc4;
        zzfnc zzfnc5;
        zzfnc zzfnc6;
        zzfnc zzfnc7;
        zzfnc zzfnc8;
        zzfnc zzfnc9;
        zzfnc zzfnc10;
        zzfnc zzfnc11;
        Object object = new zzfnc("SCAR_REQUEST_TYPE_ADMOB", 0, 0);
        zza = object;
        int n3 = 1;
        int n4 = -1;
        zzb = zzfnc11 = new zzfnc("SCAR_REQUEST_TYPE_UNSPECIFIED", n3, n4);
        int n7 = 2;
        zzc = zzfnc10 = new zzfnc("SCAR_REQUEST_TYPE_INBOUND_MEDIATION", n7, n3);
        int n8 = 3;
        zzd = zzfnc9 = new zzfnc("SCAR_REQUEST_TYPE_GBID", n8, n7);
        int n10 = 4;
        zze = zzfnc8 = new zzfnc("SCAR_REQUEST_TYPE_GOLDENEYE", n10, n8);
        int n14 = 5;
        zzf = zzfnc7 = new zzfnc("SCAR_REQUEST_TYPE_YAVIN", n14, n10);
        int n15 = 6;
        zzg = zzfnc6 = new zzfnc("SCAR_REQUEST_TYPE_UNITY", n15, n14);
        n10 = 7;
        zzh = zzfnc5 = new zzfnc("SCAR_REQUEST_TYPE_PAW", n10, n15);
        n8 = 8;
        zzi = zzfnc4 = new zzfnc("SCAR_REQUEST_TYPE_GUILDER", n8, n10);
        zzj = zzfnc3 = new zzfnc("SCAR_REQUEST_TYPE_GAM_S2S", 9, n8);
        n8 = 10;
        zzk = zzfnc2 = new zzfnc("UNRECOGNIZED", n8, n4);
        zzfnc[] zzfncArray = new zzfnc[11];
        zzfncArray[0] = object;
        zzfncArray[n3] = zzfnc11;
        zzfncArray[2] = zzfnc10;
        zzfncArray[3] = zzfnc9;
        zzfncArray[4] = zzfnc8;
        zzfncArray[5] = zzfnc7;
        zzfncArray[6] = zzfnc6;
        zzfncArray[7] = zzfnc5;
        zzfncArray[8] = zzfnc4;
        zzfncArray[9] = zzfnc3;
        zzfncArray[n8] = zzfnc2;
        zzm = zzfncArray;
        zzl = object = new zzfnb();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfnc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzn = var3_2;
    }

    public static zzfnc[] values() {
        return (zzfnc[])zzm.clone();
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzk;
        if (this != object) {
            return this.zzn;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}


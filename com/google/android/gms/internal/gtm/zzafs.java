/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaci;
import com.google.android.gms.internal.gtm.zzafr;

public final class zzafs
extends Enum
implements zzach {
    public static final /* enum */ zzafs zza;
    public static final /* enum */ zzafs zzb;
    public static final /* enum */ zzafs zzc;
    public static final /* enum */ zzafs zzd;
    public static final /* enum */ zzafs zze;
    public static final /* enum */ zzafs zzf;
    public static final /* enum */ zzafs zzg;
    public static final /* enum */ zzafs zzh;
    private static final zzaci zzi;
    private static final /* synthetic */ zzafs[] zzj;
    private final int zzk;

    static {
        zzafs zzafs2;
        zzafs zzafs3;
        zzafs zzafs4;
        zzafs zzafs5;
        zzafs zzafs6;
        zzafs zzafs7;
        zzafs zzafs8;
        Object object = new zzafs("DF_NONE", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzafs8 = new zzafs("DF_HTTPHEADER", n3, n3);
        int n4 = 2;
        zzc = zzafs7 = new zzafs("DF_COOKIE", n4, n4);
        int n7 = 3;
        zzd = zzafs6 = new zzafs("DF_URL", n7, n7);
        int n8 = 4;
        zze = zzafs5 = new zzafs("DF_CGI_ARGS", n8, n8);
        int n10 = 5;
        zzf = zzafs4 = new zzafs("DF_HOST_ORDER", n10, n10);
        int n14 = 6;
        zzg = zzafs3 = new zzafs("DF_BYTE_SWAPPED", n14, n14);
        n14 = 7;
        zzh = zzafs2 = new zzafs("DF_LOGGING_ELEMENT_TYPE_ID", n14, n14);
        zzafs[] zzafsArray = new zzafs[8];
        zzafsArray[0] = object;
        zzafsArray[n3] = zzafs8;
        zzafsArray[n4] = zzafs7;
        zzafsArray[n7] = zzafs6;
        zzafsArray[n8] = zzafs5;
        zzafsArray[n10] = zzafs4;
        zzafsArray[6] = zzafs3;
        zzafsArray[n14] = zzafs2;
        zzj = zzafsArray;
        zzi = object = new zzafr();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzafs() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzafs[] values() {
        return (zzafs[])zzj.clone();
    }

    public static zzaci zzb() {
        return zzi;
    }

    public final String toString() {
        return Integer.toString(this.zzk);
    }

    public final int zza() {
        return this.zzk;
    }
}


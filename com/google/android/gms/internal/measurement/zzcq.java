/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

final class zzcq
extends Enum {
    public static final /* enum */ zzcq zza;
    public static final /* enum */ zzcq zzb;
    public static final /* enum */ zzcq zzc;
    private static final /* enum */ zzcq zzd;
    private static final /* synthetic */ zzcq[] zze;

    static {
        zzcq zzcq2;
        zzcq zzcq3;
        zzcq zzcq4;
        zzcq zzcq5;
        zza = zzcq5 = new zzcq("ALL_CHECKS", 0);
        int n3 = 1;
        zzb = zzcq4 = new zzcq("SKIP_COMPLIANCE_CHECK", n3);
        int n4 = 2;
        zzd = zzcq3 = new zzcq("SKIP_SECURITY_CHECK", n4);
        int n7 = 3;
        zzc = zzcq2 = new zzcq("NO_CHECKS", n7);
        zzcq[] zzcqArray = new zzcq[4];
        zzcqArray[0] = zzcq5;
        zzcqArray[n3] = zzcq4;
        zzcqArray[n4] = zzcq3;
        zzcqArray[n7] = zzcq2;
        zze = zzcqArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzcq() {
        void var2_-1;
        void var1_-1;
    }

    public static zzcq[] values() {
        return (zzcq[])zze.clone();
    }
}


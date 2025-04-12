/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzazw
extends Enum
implements zzhbs {
    public static final /* enum */ zzazw zza;
    public static final /* enum */ zzazw zzb;
    public static final /* enum */ zzazw zzc;
    public static final /* enum */ zzazw zzd;
    public static final /* enum */ zzazw zze;
    public static final /* enum */ zzazw zzf;
    public static final /* enum */ zzazw zzg;
    private static final zzhbt zzh;
    private static final /* synthetic */ zzazw[] zzi;
    private final int zzj;

    static {
        zzazw zzazw2;
        zzazw zzazw3;
        zzazw zzazw4;
        zzazw zzazw5;
        zzazw zzazw6;
        zzazw zzazw7;
        Object object = new zzazw("UNSUPPORTED", 0, 0);
        zza = object;
        int n3 = 1;
        int n4 = 2;
        zzb = zzazw7 = new zzazw("ARM7", n3, n4);
        int n7 = 4;
        zzc = zzazw6 = new zzazw("X86", n4, n7);
        int n8 = 3;
        int n10 = 5;
        zzd = zzazw5 = new zzazw("ARM64", n8, n10);
        int n14 = 6;
        zze = zzazw4 = new zzazw("X86_64", n7, n14);
        int n15 = 7;
        zzf = zzazw3 = new zzazw("RISCV64", n10, n15);
        zzg = zzazw2 = new zzazw("UNKNOWN", n14, 999);
        zzazw[] zzazwArray = new zzazw[n15];
        zzazwArray[0] = object;
        zzazwArray[n3] = zzazw7;
        zzazwArray[n4] = zzazw6;
        zzazwArray[n8] = zzazw5;
        zzazwArray[n7] = zzazw4;
        zzazwArray[5] = zzazw3;
        zzazwArray[n14] = zzazw2;
        zzi = zzazwArray;
        zzh = object = new zzazv();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzazw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzazw[] values() {
        return (zzazw[])zzi.clone();
    }

    public final String toString() {
        return Integer.toString(this.zzj);
    }

    public final int zza() {
        return this.zzj;
    }
}


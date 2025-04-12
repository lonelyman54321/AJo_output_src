/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.Algorithm;

public final class EC2Algorithm
extends Enum
implements Algorithm {
    public static final /* enum */ EC2Algorithm ED25519;
    public static final /* enum */ EC2Algorithm ED256;
    public static final /* enum */ EC2Algorithm ED512;
    public static final /* enum */ EC2Algorithm ES256;
    public static final /* enum */ EC2Algorithm ES384;
    public static final /* enum */ EC2Algorithm ES512;
    private static final /* synthetic */ EC2Algorithm[] zza;
    private final int zzb;

    static {
        EC2Algorithm eC2Algorithm;
        EC2Algorithm eC2Algorithm2;
        EC2Algorithm eC2Algorithm3;
        EC2Algorithm eC2Algorithm4;
        EC2Algorithm eC2Algorithm5;
        EC2Algorithm eC2Algorithm6;
        ED256 = eC2Algorithm6 = new EC2Algorithm("ED256", 0, -260);
        int n3 = 1;
        ED512 = eC2Algorithm5 = new EC2Algorithm("ED512", n3, -261);
        int n4 = 2;
        ED25519 = eC2Algorithm4 = new EC2Algorithm("ED25519", n4, -8);
        int n7 = 3;
        ES256 = eC2Algorithm3 = new EC2Algorithm("ES256", n7, -7);
        int n8 = 4;
        ES384 = eC2Algorithm2 = new EC2Algorithm("ES384", n8, -35);
        int n10 = 5;
        ES512 = eC2Algorithm = new EC2Algorithm("ES512", n10, -36);
        EC2Algorithm[] eC2AlgorithmArray = new EC2Algorithm[6];
        eC2AlgorithmArray[0] = eC2Algorithm6;
        eC2AlgorithmArray[n3] = eC2Algorithm5;
        eC2AlgorithmArray[n4] = eC2Algorithm4;
        eC2AlgorithmArray[n7] = eC2Algorithm3;
        eC2AlgorithmArray[n8] = eC2Algorithm2;
        eC2AlgorithmArray[n10] = eC2Algorithm;
        zza = eC2AlgorithmArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EC2Algorithm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static EC2Algorithm valueOf(String string2) {
        return Enum.valueOf(EC2Algorithm.class, string2);
    }

    public static EC2Algorithm[] values() {
        return (EC2Algorithm[])zza.clone();
    }

    public int getAlgoValue() {
        return this.zzb;
    }
}


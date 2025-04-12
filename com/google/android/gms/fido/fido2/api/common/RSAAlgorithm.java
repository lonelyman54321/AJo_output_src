/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.Algorithm;

public final class RSAAlgorithm
extends Enum
implements Algorithm {
    public static final /* enum */ RSAAlgorithm LEGACY_RS1;
    public static final /* enum */ RSAAlgorithm PS256;
    public static final /* enum */ RSAAlgorithm PS384;
    public static final /* enum */ RSAAlgorithm PS512;
    public static final /* enum */ RSAAlgorithm RS1;
    public static final /* enum */ RSAAlgorithm RS256;
    public static final /* enum */ RSAAlgorithm RS384;
    public static final /* enum */ RSAAlgorithm RS512;
    private static final /* synthetic */ RSAAlgorithm[] zza;
    private final int zzb;

    static {
        RSAAlgorithm rSAAlgorithm;
        RSAAlgorithm rSAAlgorithm2;
        RSAAlgorithm rSAAlgorithm3;
        RSAAlgorithm rSAAlgorithm4;
        RSAAlgorithm rSAAlgorithm5;
        RSAAlgorithm rSAAlgorithm6;
        RSAAlgorithm rSAAlgorithm7;
        RSAAlgorithm rSAAlgorithm8;
        RS256 = rSAAlgorithm8 = new RSAAlgorithm("RS256", 0, -257);
        int n3 = 1;
        RS384 = rSAAlgorithm7 = new RSAAlgorithm("RS384", n3, -258);
        int n4 = 2;
        RS512 = rSAAlgorithm6 = new RSAAlgorithm("RS512", n4, -259);
        int n7 = 3;
        LEGACY_RS1 = rSAAlgorithm5 = new RSAAlgorithm("LEGACY_RS1", n7, -262);
        int n8 = 4;
        PS256 = rSAAlgorithm4 = new RSAAlgorithm("PS256", n8, -37);
        PS384 = rSAAlgorithm3 = new RSAAlgorithm("PS384", 5, -38);
        PS512 = rSAAlgorithm2 = new RSAAlgorithm("PS512", 6, -39);
        int n10 = 7;
        RS1 = rSAAlgorithm = new RSAAlgorithm("RS1", n10, (int)(-((char)-1)));
        RSAAlgorithm[] rSAAlgorithmArray = new RSAAlgorithm[8];
        rSAAlgorithmArray[0] = rSAAlgorithm8;
        rSAAlgorithmArray[n3] = rSAAlgorithm7;
        rSAAlgorithmArray[n4] = rSAAlgorithm6;
        rSAAlgorithmArray[n7] = rSAAlgorithm5;
        rSAAlgorithmArray[n8] = rSAAlgorithm4;
        rSAAlgorithmArray[5] = rSAAlgorithm3;
        rSAAlgorithmArray[6] = rSAAlgorithm2;
        rSAAlgorithmArray[n10] = rSAAlgorithm;
        zza = rSAAlgorithmArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RSAAlgorithm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static RSAAlgorithm valueOf(String string2) {
        return Enum.valueOf(RSAAlgorithm.class, string2);
    }

    public static RSAAlgorithm[] values() {
        return (RSAAlgorithm[])zza.clone();
    }

    public int getAlgoValue() {
        return this.zzb;
    }
}


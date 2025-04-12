/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

final class zzgnj {
    private static final int[] zza;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[16];
        byte[] byArray3 = byArray;
        byArray2[0] = 101;
        byArray3[1] = 120;
        byArray2[2] = 112;
        byArray3[3] = 97;
        byArray2[4] = 110;
        byArray3[5] = 100;
        byArray2[6] = 32;
        byArray3[7] = 51;
        byArray2[8] = 50;
        byArray3[9] = 45;
        byArray2[10] = 98;
        byArray3[11] = 121;
        byArray2[12] = 116;
        byArray3[13] = 101;
        byArray2[14] = 32;
        byArray3[15] = 107;
        zza = zzgnj.zze(byArray);
    }

    public static void zza(int[] nArray, int n3, int n4, int n7, int n8) {
        int n10 = nArray[n3];
        int n14 = nArray[n4];
        nArray[n3] = n10 += n14;
        n14 = nArray[n8];
        n10 ^= n14;
        n14 = n10 << 16;
        nArray[n8] = n10 = n10 >>> -16 | n14;
        nArray[n7] = n14 = nArray[n7] + n10;
        n10 = nArray[n4] ^ n14;
        n14 = n10 << 12;
        nArray[n4] = n10 = n10 >>> -12 | n14;
        nArray[n3] = n14 = nArray[n3] + n10;
        n3 = nArray[n8] ^ n14;
        n10 = n3 << 8;
        nArray[n8] = n3 = n3 >>> -8 | n10;
        nArray[n7] = n8 = nArray[n7] + n3;
        n3 = nArray[n4] ^ n8;
        n7 = n3 << 7;
        nArray[n4] = n3 = n3 >>> -7 | n7;
    }

    public static void zzb(int[] nArray, int[] nArray2) {
        int[] nArray3 = zza;
        int n3 = nArray3.length;
        System.arraycopy(nArray3, 0, nArray, 0, n3);
        int n4 = nArray3.length;
        System.arraycopy(nArray2, 0, nArray, n4, 8);
    }

    public static void zzc(int[] nArray) {
        int n3;
        int[] nArray2 = nArray;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            int n4 = 8;
            int n7 = 12;
            zzgnj.zza(nArray2, 0, 4, n4, n7);
            int n8 = 1;
            int n10 = 5;
            int n14 = 13;
            zzgnj.zza(nArray2, n8, n10, 9, n14);
            int n15 = 2;
            int n16 = 6;
            int n17 = 14;
            zzgnj.zza(nArray2, n15, n16, n3, n17);
            int n18 = 3;
            int n19 = 7;
            int n20 = 11;
            int n21 = 15;
            zzgnj.zza(nArray2, n18, n19, n20, n21);
            zzgnj.zza(nArray2, 0, n10, n3, n21);
            zzgnj.zza(nArray2, n8, n16, n20, n7);
            zzgnj.zza(nArray2, n15, n19, n4, n14);
            n3 = 4;
            n20 = 9;
            zzgnj.zza(nArray2, n18, n3, n20, n17);
        }
    }

    public static int[] zzd(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[16];
        zzgnj.zzb(nArray3, nArray);
        int n3 = nArray2[0];
        int n4 = 12;
        nArray3[n4] = n3;
        n3 = nArray2[1];
        int n7 = 13;
        nArray3[n7] = n3;
        n3 = nArray2[2];
        int n8 = 14;
        nArray3[n8] = n3;
        n3 = nArray2[3];
        int n10 = 15;
        nArray3[n10] = n3;
        zzgnj.zzc(nArray3);
        nArray3[4] = n3 = nArray3[n4];
        nArray3[5] = n3 = nArray3[n7];
        nArray3[6] = n3 = nArray3[n8];
        nArray3[7] = n3 = nArray3[n10];
        return Arrays.copyOf(nArray3, 8);
    }

    public static int[] zze(byte[] object) {
        int n3 = ((byte[])object).length & 3;
        if (n3 == 0) {
            object = ByteBuffer.wrap((byte[])object);
            Object object2 = ByteOrder.LITTLE_ENDIAN;
            object = ((ByteBuffer)object).order((ByteOrder)object2).asIntBuffer();
            object2 = new int[((Buffer)object).remaining()];
            ((IntBuffer)object).get((int[])object2);
            return object2;
        }
        object = new IllegalArgumentException;
        ((IllegalArgumentException)object)("invalid input length");
        throw object;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class zzaep {
    public static int zza(byte[] byArray) {
        int n3 = byArray[11] & 0xFF;
        int n4 = byArray[10] & 0xFF;
        return n4 | (n3 <<= 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int n3;
        int n4;
        int n7;
        int n8 = byteBuffer.get(5) & 2;
        byte by2 = 0;
        if (n8 == 0) {
            n7 = 0;
        } else {
            int n10;
            n8 = byteBuffer.get(26);
            n4 = 28;
            n7 = 28;
            for (n3 = 0; n3 < n8; ++n3) {
                n10 = n3 + 27;
                n10 = byteBuffer.get(n10);
                n7 += n10;
            }
            n8 = n7 + 26;
            n8 = byteBuffer.get(n8);
            for (n3 = 0; n3 < n8; ++n3) {
                n10 = n7 + 27 + n3;
                n10 = byteBuffer.get(n10);
                n4 += n10;
            }
            n7 += n4;
        }
        n8 = n7 + 26;
        n8 = byteBuffer.get(n8) + 27 + n7;
        n4 = byteBuffer.get(n8);
        n3 = byteBuffer.limit() - n8;
        n7 = 1;
        if (n3 > n7) {
            by2 = byteBuffer.get(n8 += n7);
        }
        return (int)(zzaep.zzg((byte)n4, by2) * 48000L / 1000000L);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        int n3;
        byte by2 = 0;
        byte by4 = byteBuffer.get(0);
        int n4 = byteBuffer.limit();
        if (n4 > (n3 = 1)) {
            by2 = byteBuffer.get(n3);
        }
        return (int)(zzaep.zzg(by4, by2) * 48000L / 1000000L);
    }

    public static long zzd(byte[] byArray) {
        byte by2 = 0;
        byte by4 = byArray[0];
        int n3 = byArray.length;
        int n4 = 1;
        if (n3 > n4) {
            by2 = byArray[n4];
        }
        return zzaep.zzg(by4, by2);
    }

    public static List zze(byte[] byArray) {
        long l2 = zzaep.zza(byArray);
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(3);
        arrayList.add(byArray);
        byArray = zzaep.zzi(zzaep.zzh(l2));
        arrayList.add(byArray);
        byArray = zzaep.zzi(zzaep.zzh(3840L));
        arrayList.add(byArray);
        return arrayList;
    }

    public static boolean zzf(long l2, long l3) {
        long l4 = zzaep.zzh(3840L);
        long l7 = (l2 -= l3) - (l4 /= (l3 = 1000L));
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        return object <= 0;
    }

    private static long zzg(byte n3, byte by2) {
        int n4;
        int n7 = n3 & 0xFF;
        byte by4 = 3;
        n3 = n3 & by4;
        int n8 = 1;
        if (n3 != 0) {
            n4 = 2;
            if (n3 != n8 && n3 != n4) {
                n4 = by2 & 0x3F;
            }
        } else {
            n4 = 1;
        }
        n3 = n7 >> 3;
        by2 = (byte)(n3 & 3);
        n7 = 16;
        if (n3 >= n7) {
            n3 = 2500 << by2;
        } else {
            n7 = 12;
            int n10 = 10000;
            if (n3 >= n7) {
                n3 &= n8;
                n3 = n10 << n3;
            } else {
                n3 = by2 == by4 ? 60000 : n10 << by2;
            }
        }
        long l2 = n4;
        long l3 = n3;
        return l2 * l3;
    }

    private static long zzh(long l2) {
        return l2 * 1000000000L / 48000L;
    }

    private static byte[] zzi(long l2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        return byteBuffer.order(byteOrder).putLong(l2).array();
    }
}


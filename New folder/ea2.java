/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public final class ea2 {
    public static ArrayList a(byte[] object) {
        int n3 = object[11] & 0xFF;
        int n4 = 8;
        int n7 = object[10] & 0xFF;
        long l2 = (long)((n3 <<= n4) | n7) * 1000000000L / 48000L;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(3);
        arrayList.add((byte[])object);
        object = ByteBuffer.allocate(n4);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        object = object.order(byteOrder).putLong(l2).array();
        arrayList.add((byte[])object);
        object = ByteBuffer.allocate(n4);
        ByteOrder byteOrder2 = ByteOrder.nativeOrder();
        object = object.order(byteOrder2).putLong(80000000L).array();
        arrayList.add((byte[])object);
        return arrayList;
    }

    public static long b(byte n3, byte by2) {
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
}


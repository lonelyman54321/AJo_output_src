/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;

public abstract class CodedOutputStream$a
extends CodedOutputStream {
    public final byte[] d;
    public final int e;
    public int f;

    public CodedOutputStream$a(int n3) {
        if (n3 >= 0) {
            byte[] byArray = new byte[Math.max(n3, 20)];
            this.d = byArray;
            this.e = n3 = byArray.length;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bufferSize must be >= 0");
        throw illegalArgumentException;
    }

    public final void Z(int n3) {
        byte by2;
        int n4;
        int n7 = this.f;
        this.f = n4 = n7 + 1;
        int n8 = n3 & 0xFF;
        byte[] byArray = this.d;
        byArray[n7] = n8;
        this.f = n8 = n7 + 2;
        byArray[n4] = by2 = (byte)(n3 >> 8 & 0xFF);
        this.f = n4 = n7 + 3;
        byArray[n8] = by2 = (byte)(n3 >> 16 & 0xFF);
        this.f = n7 += 4;
        byArray[n4] = n3 = (int)((byte)(n3 >> 24 & 0xFF));
    }

    public final void a0(long l2) {
        byte by2;
        byte by4;
        int n3;
        byte by5;
        int n4;
        int n7 = this.f;
        this.f = n4 = n7 + 1;
        long l3 = 255L;
        int n8 = (int)(l2 & l3);
        byte[] byArray = this.d;
        byArray[n7] = n8;
        this.f = n8 = n7 + 2;
        int n10 = 8;
        byArray[n4] = by5 = (byte)(l2 >> n10 & l3);
        this.f = n4 = n7 + 3;
        byArray[n8] = by5 = (byte)(l2 >> 16 & l3);
        this.f = n8 = n7 + 4;
        long l4 = l2 >> 24;
        byArray[n4] = n3 = (int)((int)(l3 & l4));
        this.f = n4 = n7 + 5;
        byArray[n8] = n3 = (byte)((int)(l2 >> 32) & 0xFF);
        this.f = n3 = n7 + 6;
        byArray[n4] = by4 = (byte)((int)(l2 >> 40) & 0xFF);
        this.f = n4 = n7 + 7;
        byArray[n3] = by4 = (byte)((int)(l2 >> 48) & 0xFF);
        this.f = n7 += n10;
        byArray[n4] = by2 = (byte)((int)(l2 >> 56) & 0xFF);
    }

    public final void b0(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.c0(n3);
    }

    public final void c0(int n3) {
        byte by2 = CodedOutputStream.c;
        byte[] byArray = this.d;
        if (by2 != 0) {
            while (true) {
                long l2;
                int n4;
                if ((by2 = n3 & 0xFFFFFF80) == 0) {
                    by2 = this.f;
                    this.f = n4 = by2 + 1;
                    l2 = by2;
                    n3 = (byte)n3;
                    nw3.m(byArray, l2, (byte)n3);
                    return;
                }
                by2 = this.f;
                this.f = n4 = by2 + 1;
                l2 = by2;
                by2 = (byte)(n3 & 0x7F | 0x80);
                nw3.m(byArray, l2, by2);
                n3 >>>= 7;
            }
        }
        while (true) {
            int n7;
            if ((by2 = n3 & 0xFFFFFF80) == 0) {
                by2 = this.f;
                this.f = n7 = by2 + 1;
                byArray[by2] = n3 = (int)((byte)n3);
                return;
            }
            by2 = this.f;
            this.f = n7 = by2 + 1;
            byArray[by2] = n7 = (int)((byte)(n3 & 0x7F | 0x80));
            n3 >>>= 7;
        }
    }

    public final void d0(long l2) {
        boolean by2 = CodedOutputStream.c;
        int n3 = 7;
        long l3 = 0L;
        long l4 = -128;
        byte[] byArray = this.d;
        if (by2) {
            while (true) {
                long l7;
                long l8;
                long l12;
                if ((l12 = (l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) {
                    int n4 = this.f;
                    this.f = n3 = n4 + 1;
                    long l14 = n4;
                    byte by4 = (byte)l2;
                    nw3.m(byArray, l14, by4);
                    return;
                }
                l12 = this.f;
                long l15 = l12 + true;
                this.f = (int)l15;
                l7 = l12;
                l12 = (byte)((int)l2 & 0x7F | 0x80);
                nw3.m(byArray, l7, (byte)l12);
                l2 >>>= n3;
            }
        }
        while (true) {
            long l16;
            long l17;
            long l18;
            if ((l18 = (l17 = (l16 = l2 & l4) - l3) == 0L ? 0 : (l17 < 0L ? -1 : 1)) == false) {
                byte by5;
                int n7 = this.f;
                this.f = n3 = n7 + 1;
                byArray[n7] = by5 = (byte)l2;
                return;
            }
            l18 = this.f;
            long l19 = l18 + true;
            this.f = (int)l19;
            l19 = (byte)((int)l2 & 0x7F | 0x80);
            byArray[l18] = (byte)l19;
            l2 >>>= n3;
        }
    }
}


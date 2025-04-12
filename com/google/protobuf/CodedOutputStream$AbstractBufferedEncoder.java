/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.WireFormat;

abstract class CodedOutputStream$AbstractBufferedEncoder
extends CodedOutputStream {
    final byte[] buffer;
    final int limit;
    int position;
    int totalBytesWritten;

    public CodedOutputStream$AbstractBufferedEncoder(int n3) {
        super(null);
        if (n3 >= 0) {
            byte[] byArray = new byte[Math.max(n3, 20)];
            this.buffer = byArray;
            this.limit = n3 = byArray.length;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bufferSize must be >= 0");
        throw illegalArgumentException;
    }

    public final void buffer(byte by2) {
        int n3;
        byte[] byArray = this.buffer;
        int n4 = this.position;
        this.position = n3 = n4 + 1;
        byArray[n4] = by2;
        by2 = (byte)(this.totalBytesWritten + 1);
        this.totalBytesWritten = by2;
    }

    public final void bufferFixed32NoTag(int n3) {
        byte by2;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.position;
        this.position = n7 = n8 + 1;
        byArray[n8] = n4 = (int)(n3 & 0xFF);
        this.position = n4 = n8 + 2;
        byArray[n7] = by2 = (byte)(n3 >> 8 & 0xFF);
        this.position = n7 = n8 + 3;
        byArray[n4] = by2 = (byte)(n3 >> 16 & 0xFF);
        this.position = n8 += 4;
        byArray[n7] = n3 = (int)((byte)(n3 >> 24 & 0xFF));
        this.totalBytesWritten = n3 = this.totalBytesWritten + 4;
    }

    public final void bufferFixed64NoTag(long l2) {
        int n3;
        byte by2;
        int n4;
        byte by4;
        int n7;
        int n8;
        byte[] byArray = this.buffer;
        int n10 = this.position;
        this.position = n8 = n10 + 1;
        long l3 = 255L;
        byArray[n10] = n7 = (int)((int)(l2 & l3));
        this.position = n7 = n10 + 2;
        int n14 = 8;
        byArray[n8] = by4 = (byte)(l2 >> n14 & l3);
        this.position = n8 = n10 + 3;
        byArray[n7] = by4 = (byte)(l2 >> 16 & l3);
        this.position = n7 = n10 + 4;
        long l4 = l2 >> 24;
        byArray[n8] = n4 = (int)((int)(l3 & l4));
        this.position = n8 = n10 + 5;
        byArray[n7] = n4 = (byte)((int)(l2 >> 32) & 0xFF);
        this.position = n4 = n10 + 6;
        byArray[n8] = by2 = (byte)((int)(l2 >> 40) & 0xFF);
        this.position = n8 = n10 + 7;
        byArray[n4] = by2 = (byte)((int)(l2 >> 48) & 0xFF);
        this.position = n10 += n14;
        byArray[n8] = n3 = (int)((int)(l2 >> 56) & 0xFF);
        this.totalBytesWritten = n3 = this.totalBytesWritten + n14;
    }

    public final void bufferInt32NoTag(int n3) {
        if (n3 >= 0) {
            this.bufferUInt32NoTag(n3);
        } else {
            long l2 = n3;
            this.bufferUInt64NoTag(l2);
        }
    }

    public final void bufferTag(int n3, int n4) {
        n3 = WireFormat.makeTag(n3, n4);
        this.bufferUInt32NoTag(n3);
    }

    public final void bufferUInt32NoTag(int n3) {
        int n4 = CodedOutputStream.access$100();
        if (n4 != 0) {
            n4 = this.position;
            long l2 = n4;
            while (true) {
                long l3;
                int n7;
                int n8;
                byte[] byArray;
                int n10;
                if ((n10 = n3 & 0xFFFFFF80) == 0) {
                    byArray = this.buffer;
                    n8 = this.position;
                    this.position = n7 = n8 + 1;
                    l3 = n8;
                    n3 = (byte)n3;
                    UnsafeUtil.putByte(byArray, l3, (byte)n3);
                    n3 = (int)((long)this.position - l2);
                    this.totalBytesWritten = n4 = this.totalBytesWritten + n3;
                    return;
                }
                byArray = this.buffer;
                n8 = this.position;
                this.position = n7 = n8 + 1;
                l3 = n8;
                byte by2 = (byte)(n3 & 0x7F | 0x80);
                UnsafeUtil.putByte(byArray, l3, by2);
                n3 >>>= 7;
            }
        }
        while (true) {
            int n14;
            int n15;
            byte[] byArray;
            if ((n4 = n3 & 0xFFFFFF80) == 0) {
                byArray = this.buffer;
                n15 = this.position;
                this.position = n14 = n15 + 1;
                byArray[n15] = n3 = (int)((byte)n3);
                this.totalBytesWritten = n3 = this.totalBytesWritten + 1;
                return;
            }
            byArray = this.buffer;
            n15 = this.position;
            this.position = n14 = n15 + 1;
            byArray[n15] = n14 = (int)((byte)(n3 & 0x7F | 0x80));
            this.totalBytesWritten = n4 = this.totalBytesWritten + 1;
            n3 >>>= 7;
        }
    }

    public final void bufferUInt64NoTag(long l2) {
        int n3 = CodedOutputStream.access$100();
        int n4 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n3 != 0) {
            n3 = this.position;
            long l7 = n3;
            while (true) {
                int n7;
                byte[] byArray;
                long l8;
                long l12;
                if ((n3 = (int)((l12 = (l8 = l2 & l4) - l3) == 0L ? 0 : (l12 < 0L ? -1 : 1))) == 0) {
                    int n8;
                    byArray = this.buffer;
                    n4 = this.position;
                    this.position = n8 = n4 + 1;
                    long l14 = n4;
                    int n10 = (int)l2;
                    UnsafeUtil.putByte(byArray, l14, (byte)n10);
                    int n14 = (int)((long)this.position - l7);
                    this.totalBytesWritten = n10 = this.totalBytesWritten + n14;
                    return;
                }
                byArray = this.buffer;
                int n15 = this.position;
                this.position = n7 = n15 + 1;
                l8 = n15;
                byte by2 = (byte)((int)l2 & 0x7F | 0x80);
                UnsafeUtil.putByte(byArray, l8, by2);
                l2 >>>= n4;
            }
        }
        while (true) {
            int n16;
            byte[] byArray;
            long l15;
            long l16;
            if ((n3 = (int)((l16 = (l15 = l2 & l4) - l3) == 0L ? 0 : (l16 < 0L ? -1 : 1))) == 0) {
                int n17;
                int n18;
                byArray = this.buffer;
                n4 = this.position;
                this.position = n18 = n4 + 1;
                byArray[n4] = n17 = (int)((int)l2);
                this.totalBytesWritten = n17 = this.totalBytesWritten + 1;
                return;
            }
            byArray = this.buffer;
            int n19 = this.position;
            this.position = n16 = n19 + 1;
            byArray[n19] = n16 = (int)((byte)((int)l2 & 0x7F | 0x80));
            this.totalBytesWritten = n3 = this.totalBytesWritten + 1;
            l2 >>>= n4;
        }
    }

    public final int getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public final int spaceLeft() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        throw unsupportedOperationException;
    }
}


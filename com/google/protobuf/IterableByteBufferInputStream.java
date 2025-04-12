/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.UnsafeUtil;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream
extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize;
    private boolean hasArray;
    private Iterator iterator;

    public IterableByteBufferInputStream(Iterable object) {
        int n3;
        Iterator iterator;
        this.iterator = iterator = object.iterator();
        iterator = null;
        this.dataSize = 0;
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            ByteBuffer cfr_ignored_0 = (ByteBuffer)object.next();
            this.dataSize = n3 = this.dataSize + 1;
        }
        this.currentIndex = -1;
        boolean bl2 = this.getNextByteBuffer();
        if (!bl2) {
            long l2;
            this.currentByteBuffer = object = Internal.EMPTY_BYTE_BUFFER;
            this.currentIndex = 0;
            this.currentByteBufferPos = 0;
            this.currentAddress = l2 = 0L;
        }
    }

    private boolean getNextByteBuffer() {
        int n3 = this.currentIndex;
        int n4 = 1;
        this.currentIndex = n3 += n4;
        Object object = this.iterator;
        n3 = (int)(object.hasNext() ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        this.currentByteBuffer = object = (ByteBuffer)this.iterator.next();
        this.currentByteBufferPos = n3 = ((Buffer)object).position();
        object = this.currentByteBuffer;
        n3 = (int)(((ByteBuffer)object).hasArray() ? 1 : 0);
        if (n3 != 0) {
            this.hasArray = n4;
            object = this.currentByteBuffer.array();
            this.currentArray = (byte[])object;
            object = this.currentByteBuffer;
            this.currentArrayOffset = n3 = ((ByteBuffer)object).arrayOffset();
        } else {
            long l2;
            this.hasArray = false;
            this.currentAddress = l2 = UnsafeUtil.addressOffset(this.currentByteBuffer);
            n3 = 0;
            object = null;
            this.currentArray = null;
        }
        return n4 != 0;
    }

    private void updateCurrentByteBufferPos(int n3) {
        int n4;
        this.currentByteBufferPos = n4 = this.currentByteBufferPos + n3;
        ByteBuffer byteBuffer = this.currentByteBuffer;
        n3 = byteBuffer.limit();
        if (n4 == n3) {
            this.getNextByteBuffer();
        }
    }

    public int read() {
        int n3 = this.currentIndex;
        int n4 = this.dataSize;
        if (n3 == n4) {
            return -1;
        }
        n3 = (int)(this.hasArray ? 1 : 0);
        n4 = 1;
        if (n3 != 0) {
            byte[] byArray = this.currentArray;
            int n7 = this.currentByteBufferPos;
            int n8 = this.currentArrayOffset;
            n3 = byArray[n7 += n8] & 0xFF;
            this.updateCurrentByteBufferPos(n4);
            return n3;
        }
        long l2 = this.currentByteBufferPos;
        long l3 = this.currentAddress;
        n3 = UnsafeUtil.getByte(l2 + l3) & 0xFF;
        this.updateCurrentByteBufferPos(n4);
        return n3;
    }

    public int read(byte[] object, int n3, int n4) {
        int n7 = this.currentIndex;
        int n8 = this.dataSize;
        if (n7 == n8) {
            return -1;
        }
        Object object2 = this.currentByteBuffer;
        n7 = ((Buffer)object2).limit();
        n8 = this.currentByteBufferPos;
        if (n4 > (n7 -= n8)) {
            n4 = n7;
        }
        if ((n7 = (int)(this.hasArray ? 1 : 0)) != 0) {
            object2 = this.currentArray;
            int n10 = this.currentArrayOffset;
            System.arraycopy(object2, n8 += n10, object, n3, n4);
            this.updateCurrentByteBufferPos(n4);
        } else {
            object2 = this.currentByteBuffer;
            n7 = ((Buffer)object2).position();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            int n14 = this.currentByteBufferPos;
            Java8Compatibility.position(byteBuffer, n14);
            byteBuffer = this.currentByteBuffer;
            byteBuffer.get((byte[])object, n3, n4);
            object = this.currentByteBuffer;
            Java8Compatibility.position((Buffer)object, n7);
            this.updateCurrentByteBufferPos(n4);
        }
        return n4;
    }
}


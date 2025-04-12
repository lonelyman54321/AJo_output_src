/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.AbstractStreamingHasher;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;

final class SipHashFunction$SipHasher
extends AbstractStreamingHasher {
    private static final int CHUNK_SIZE = 8;
    private long b;
    private final int c;
    private final int d;
    private long finalM;
    private long v0;
    private long v1;
    private long v2;
    private long v3;

    public SipHashFunction$SipHasher(int n3, int n4, long l2, long l3) {
        super(8);
        long l4;
        long l7;
        this.b = l7 = 0L;
        this.finalM = l7;
        this.c = n3;
        this.d = n4;
        this.v0 = l4 = 0x736F6D6570736575L ^ l2;
        this.v1 = l4 = 0x646F72616E646F6DL ^ l3;
        this.v2 = l4 = 0x6C7967656E657261L ^ l2;
        this.v3 = l4 = 0x7465646279746573L ^ l3;
    }

    private void processM(long l2) {
        long l3;
        this.v3 = l3 = this.v3 ^ l2;
        int n3 = this.c;
        this.sipRound(n3);
        l3 = this.v0;
        this.v0 = l2 ^= l3;
    }

    private void sipRound(int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            long l2 = this.v0;
            long l3 = this.v1;
            this.v0 = l2 += l3;
            l2 = this.v2;
            long l4 = this.v3;
            this.v2 = l2 += l4;
            this.v1 = l2 = Long.rotateLeft(l3, 13);
            l2 = this.v3;
            int n4 = 16;
            l2 = Long.rotateLeft(l2, n4);
            l3 = this.v1;
            l4 = this.v0;
            this.v1 = l3 ^= l4;
            l3 = this.v2;
            this.v3 = l2 ^= l3;
            int n7 = 32;
            long l7 = Long.rotateLeft(l4, n7);
            long l8 = this.v2;
            long l12 = this.v1;
            this.v2 = l8 += l12;
            l8 = this.v3;
            this.v0 = l7 += l8;
            int n8 = 17;
            this.v1 = l7 = Long.rotateLeft(l12, n8);
            l7 = this.v3;
            int n10 = 21;
            l7 = Long.rotateLeft(l7, n10);
            l8 = this.v1;
            l12 = this.v2;
            this.v1 = l8 ^= l12;
            l8 = this.v0;
            this.v3 = l7 ^= l8;
            this.v2 = l2 = Long.rotateLeft(l12, n7);
        }
    }

    public HashCode makeHash() {
        long l2 = this.finalM;
        long l3 = this.b << 56;
        this.finalM = l2 ^= l3;
        this.processM(l2);
        this.v2 = l2 = this.v2 ^ 0xFFL;
        int n3 = this.d;
        this.sipRound(n3);
        l2 = this.v0;
        l3 = this.v1;
        l2 ^= l3;
        l3 = this.v2;
        l2 ^= l3;
        l3 = this.v3;
        return HashCode.fromLong(l2 ^ l3);
    }

    public void process(ByteBuffer byteBuffer) {
        long l2;
        this.b = l2 = this.b + (long)8;
        l2 = byteBuffer.getLong();
        this.processM(l2);
    }

    public void processRemaining(ByteBuffer byteBuffer) {
        boolean bl2;
        long l2 = this.b;
        int n3 = byteBuffer.remaining();
        long l3 = n3;
        this.b = l2 += l3;
        int n4 = 0;
        while (bl2 = byteBuffer.hasRemaining()) {
            long l4 = this.finalM;
            byte by2 = byteBuffer.get();
            long l7 = by2;
            long l8 = 255L;
            l7 = (l7 & l8) << n4;
            this.finalM = l4 ^= l7;
            n4 += 8;
        }
    }
}


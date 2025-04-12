/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DecoderInputBuffer
extends fE {
    public d b;
    public final Fe0 c;
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final int i;

    static {
        im1_0.a("media3.decoder");
    }

    public DecoderInputBuffer(int n3) {
        Fe0 fe0;
        this.c = fe0 = new Fe0();
        this.h = n3;
        this.i = 0;
    }

    public void g() {
        this.a = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.g) != null) {
            byteBuffer.clear();
        }
        this.e = false;
    }

    public final ByteBuffer h(int n3) {
        int n4 = this.h;
        int n7 = 1;
        if (n4 == n7) {
            return ByteBuffer.allocate(n3);
        }
        n7 = 2;
        if (n4 == n7) {
            return ByteBuffer.allocateDirect(n3);
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            n7 = 0;
            byteBuffer = null;
        } else {
            n7 = byteBuffer.capacity();
        }
        String string2 = z41.a("Buffer too small (", " < ", ")", n7, n3);
        DecoderInputBuffer$InsufficientCapacityException decoderInputBuffer$InsufficientCapacityException = new IllegalStateException(string2);
        throw decoderInputBuffer$InsufficientCapacityException;
    }

    public final void i(int n3) {
        int n4;
        int n7 = this.i;
        n3 += n7;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            ByteBuffer byteBuffer2;
            this.d = byteBuffer2 = this.h(n3);
            return;
        }
        int n8 = byteBuffer.capacity();
        if (n8 >= (n3 += (n4 = byteBuffer.position()))) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer3 = this.h(n3);
        ByteOrder byteOrder = byteBuffer.order();
        byteBuffer3.order(byteOrder);
        if (n4 > 0) {
            byteBuffer.flip();
            byteBuffer3.put(byteBuffer);
        }
        this.d = byteBuffer3;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.g) != null) {
            byteBuffer.flip();
        }
    }
}


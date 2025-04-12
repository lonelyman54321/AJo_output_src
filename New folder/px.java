/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

public final class px
extends DecoderInputBuffer {
    public long j;
    public int k;
    public int l;

    public final void g() {
        super.g();
        this.k = 0;
    }

    public final boolean k(DecoderInputBuffer decoderInputBuffer) {
        long l2;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int n3;
        int n4;
        int n7;
        block6: {
            block7: {
                n7 = decoderInputBuffer.f(0x40000000);
                n4 = 1;
                ct3.a(n7 ^ n4);
                ct3.a(decoderInputBuffer.f(0x10000000) ^ n4);
                ct3.a(decoderInputBuffer.f(4) ^ n4);
                n7 = this.l();
                if (n7 == 0) break block6;
                n7 = this.k;
                n3 = this.l;
                if (n7 >= n3) break block7;
                byteBuffer2 = decoderInputBuffer.d;
                if (byteBuffer2 == null || (byteBuffer = this.d) == null) break block6;
                n3 = byteBuffer.position();
                n7 = byteBuffer2.remaining() + n3;
                if (n7 <= (n3 = 0x2EE000)) break block6;
            }
            return false;
        }
        n7 = this.k;
        this.k = n3 = n7 + 1;
        if (n7 == 0) {
            this.f = l2 = decoderInputBuffer.f;
            n7 = (int)(decoderInputBuffer.f(n4) ? 1 : 0);
            if (n7 != 0) {
                this.a = n4;
            }
        }
        if ((byteBuffer2 = decoderInputBuffer.d) != null) {
            n3 = byteBuffer2.remaining();
            this.i(n3);
            byteBuffer = this.d;
            byteBuffer.put(byteBuffer2);
        }
        this.j = l2 = decoderInputBuffer.f;
        return n4 != 0;
    }

    public final boolean l() {
        int n3 = this.k;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.nio.ByteBuffer;

/*
 * Renamed from dy
 */
public final class dy_2
extends SimpleDecoder
implements nd1_0 {
    public final dy$a n;

    public dy_2(ey_2 ey_22) {
        int n3 = 1;
        DecoderInputBuffer[] decoderInputBufferArray = new DecoderInputBuffer[n3];
        gj0_0[] gj0_0Array = new ie1[n3];
        super(decoderInputBufferArray, gj0_0Array);
        this.n = ey_22;
    }

    public final DecoderInputBuffer g() {
        DecoderInputBuffer decoderInputBuffer = new DecoderInputBuffer(1);
        return decoderInputBuffer;
    }

    public final gj0_0 h() {
        cy_2 cy_22 = new cy_2(this);
        return cy_22;
    }

    public final DecoderException i(Throwable throwable) {
        ImageDecoderException imageDecoderException = new Exception("Unexpected decode error", throwable);
        return imageDecoderException;
    }

    /*
     * WARNING - void declaration
     */
    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, gj0_0 gj0_02, boolean bl2) {
        void var5_11;
        dy$a dy$a;
        ByteBuffer byteBuffer;
        block12: {
            gj0_02 = (ie1)gj0_02;
            byteBuffer = decoderInputBuffer.d;
            byteBuffer.getClass();
            boolean bl3 = byteBuffer.hasArray();
            ct3.f(bl3);
            int n3 = byteBuffer.arrayOffset();
            if (n3 == 0) {
                boolean bl4 = true;
                break block12;
            }
            boolean bl5 = false;
            dy$a = null;
        }
        ct3.a((boolean)var5_11);
        dy$a = this.n;
        byte[] byArray = byteBuffer.array();
        int n4 = byteBuffer.remaining();
        dy$a = (ey_2)dy$a;
        byteBuffer = ((ey_2)dy$a).a(n4, byArray);
        ((ie1)gj0_02).d = byteBuffer;
        long l2 = decoderInputBuffer.f;
        try {
            gj0_02.b = l2;
            decoderInputBuffer = null;
        }
        catch (ImageDecoderException imageDecoderException) {
            // empty catch block
        }
        return decoderInputBuffer;
    }
}


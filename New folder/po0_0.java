/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/*
 * Renamed from po0
 */
public final class po0_0
extends SimpleDecoder
implements mf3_0 {
    public final vf3_0 n;

    public po0_0(vf3_0 vf3_02) {
        int n3 = 2;
        DecoderInputBuffer[] decoderInputBufferArray = new qf3_0[n3];
        gj0_0[] gj0_0Array = new Rf3[n3];
        super(decoderInputBufferArray, gj0_0Array);
        n3 = this.g;
        decoderInputBufferArray = this.e;
        int n4 = decoderInputBufferArray.length;
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            gj0_0Array = null;
        }
        ct3.f(n3 != 0);
        n3 = decoderInputBufferArray.length;
        while (n7 < n3) {
            DecoderInputBuffer decoderInputBuffer = decoderInputBufferArray[n7];
            int n8 = 1024;
            decoderInputBuffer.i(n8);
            ++n7;
        }
        this.n = vf3_02;
    }

    public final void a(long l2) {
    }

    public final DecoderInputBuffer g() {
        qf3_0 qf3_02 = new qf3_0();
        return qf3_02;
    }

    public final gj0_0 h() {
        d53_0 d53_02 = new d53_0(this);
        return d53_02;
    }

    public final DecoderException i(Throwable throwable) {
        SubtitleDecoderException subtitleDecoderException = new Exception("Unexpected decode error", throwable);
        return subtitleDecoderException;
    }

    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, gj0_0 gj0_02, boolean bl2) {
        long l2;
        long l3;
        block14: {
            vf3_0 vf3_02;
            int n3;
            byte[] byArray;
            Object object;
            block13: {
                decoderInputBuffer = (qf3_0)decoderInputBuffer;
                gj0_02 = (Rf3)gj0_02;
                object = decoderInputBuffer.d;
                object.getClass();
                byArray = ((ByteBuffer)object).array();
                n3 = ((Buffer)object).limit();
                vf3_02 = this.n;
                if (!bl2) break block13;
                vf3_02.reset();
            }
            bl2 = false;
            object = vf3_02.a(0, byArray, n3);
            l3 = decoderInputBuffer.f;
            long l4 = ((qf3_0)decoderInputBuffer).j;
            gj0_02.b = l3;
            ((Rf3)gj0_02).d = object;
            long l7 = Long.MAX_VALUE;
            l2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (l2 == false) break block14;
            l3 = l4;
        }
        ((Rf3)gj0_02).e = l3;
        try {
            gj0_02.c = false;
        }
        catch (SubtitleDecoderException subtitleDecoderException) {
            // empty catch block
        }
        l2 = 0;
        decoderInputBuffer = null;
        return decoderInputBuffer;
    }
}


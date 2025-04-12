/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CodecException
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.mediacodec.e;
import java.io.Serializable;

public class MediaCodecDecoderException
extends DecoderException {
    public final int a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, e object) {
        int n3;
        int n4;
        int n7;
        boolean bl2;
        Serializable serializable = new StringBuilder("Decoder failed: ");
        String string2 = null;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            object = ((e)object).a;
        }
        serializable.append((String)object);
        object = serializable.toString();
        super((String)object, illegalStateException);
        bl2 = illegalStateException instanceof MediaCodec.CodecException;
        if (bl2) {
            serializable = illegalStateException;
            serializable = (MediaCodec.CodecException)illegalStateException;
            string2 = serializable.getDiagnosticInfo();
        }
        if ((n7 = gz3.a) >= (n4 = 23)) {
            if (bl2) {
                illegalStateException = (MediaCodec.CodecException)illegalStateException;
                n3 = GL1.a((MediaCodec.CodecException)illegalStateException);
            } else {
                n3 = 0;
                illegalStateException = null;
            }
        } else {
            n3 = gz3.q(string2);
        }
        this.a = n3;
    }
}


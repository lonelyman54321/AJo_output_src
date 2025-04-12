/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Trace
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.d$a;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.mediacodec.h;
import java.io.IOException;

public final class h$a
implements d$b {
    public static MediaCodec b(d$a object) {
        ((d$a)object).a.getClass();
        object = ((d$a)object).a.a;
        StringBuilder stringBuilder = new StringBuilder("createCodec:");
        stringBuilder.append((String)object);
        Trace.beginSection((String)stringBuilder.toString());
        object = MediaCodec.createByCodecName((String)object);
        Trace.endSection();
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d a(d$a object) {
        void var1_4;
        MediaCodec mediaCodec;
        block5: {
            int n3;
            Object object2;
            block4: {
                e e2;
                block3: {
                    mediaCodec = null;
                    try {
                        int n4;
                        mediaCodec = h$a.b((d$a)object);
                        object2 = "configureCodec";
                        Trace.beginSection((String)object2);
                        object2 = ((d$a)object).d;
                        if (object2 != null) break block3;
                        e2 = ((d$a)object).a;
                        n3 = e2.h;
                        if (n3 == 0 || (n3 = gz3.a) < (n4 = 35)) break block3;
                        n3 = 8;
                        break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        break block5;
                    }
                    catch (IOException iOException) {
                        break block5;
                    }
                }
                n3 = 0;
                e2 = null;
            }
            MediaFormat mediaFormat = ((d$a)object).b;
            MediaCrypto mediaCrypto = ((d$a)object).e;
            mediaCodec.configure(mediaFormat, (Surface)object2, mediaCrypto, n3);
            Trace.endSection();
            object2 = "startCodec";
            Trace.beginSection((String)object2);
            mediaCodec.start();
            Trace.endSection();
            object = ((d$a)object).f;
            return new h(mediaCodec, (RC1)object);
        }
        if (mediaCodec == null) throw var1_4;
        mediaCodec.release();
        throw var1_4;
    }
}


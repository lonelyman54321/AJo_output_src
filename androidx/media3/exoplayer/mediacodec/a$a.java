/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.HandlerThread
 *  android.os.Trace
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.d$a;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.mediacodec.e;
import com.google.common.base.Supplier;

public final class a$a
implements d$b {
    public final Supplier a;
    public final Supplier b;
    public boolean c;

    public a$a(int n3) {
        Lq lq = new Lq(n3);
        mq_0 mq_02 = new mq_0(n3);
        this.a = lq;
        this.b = mq_02;
        this.c = false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a b(d$a d$a) {
        void var1_5;
        Object object;
        String string2;
        block7: {
            a a2;
            int n3;
            Object object2;
            block10: {
                int n4;
                int n7;
                block9: {
                    block8: {
                        string2 = "createCodec:";
                        object2 = d$a.a.a;
                        n7 = 0;
                        object = null;
                        try {
                            StringBuilder stringBuilder = new StringBuilder(string2);
                            stringBuilder.append((String)object2);
                            string2 = stringBuilder.toString();
                            Trace.beginSection((String)string2);
                            string2 = MediaCodec.createByCodecName((String)object2);
                        }
                        catch (Exception exception) {
                            string2 = null;
                            break block7;
                        }
                        try {
                            boolean bl2 = this.c;
                            n4 = 35;
                            if (!bl2) break block8;
                            object2 = d$a.c;
                            n3 = gz3.a;
                            int n8 = 34;
                            if (n3 < n8 || n3 < n4 && !(bl2 = ip1_0.k((String)(object2 = ((d)object2).o)))) break block8;
                            object2 = new mh3_1((MediaCodec)string2);
                            n3 = 4;
                            break block9;
                        }
                        catch (Exception exception) {
                            break block7;
                        }
                    }
                    Object object3 = this.b;
                    object3 = object3.get();
                    object3 = (HandlerThread)object3;
                    object2 = new Pq((MediaCodec)string2, (HandlerThread)object3);
                    n3 = 0;
                    object3 = null;
                }
                Object object4 = this.a;
                object4 = object4.get();
                object4 = (HandlerThread)object4;
                RC1 rC1 = d$a.f;
                a2 = new a((MediaCodec)string2, (HandlerThread)object4, (FL1)object2, rC1);
                try {
                    Trace.endSection();
                    object2 = d$a.d;
                    if (object2 != null) break block10;
                    object = d$a.a;
                    n7 = ((e)object).h;
                    if (n7 == 0 || (n7 = gz3.a) < n4) break block10;
                    n3 |= 8;
                }
                catch (Exception exception) {
                    object = a2;
                    break block7;
                }
            }
            object = d$a.b;
            d$a = d$a.e;
            androidx.media3.exoplayer.mediacodec.a.o(a2, (MediaFormat)object, (Surface)object2, (MediaCrypto)d$a, n3);
            return a2;
        }
        if (object == null) {
            if (string2 == null) throw var1_5;
            string2.release();
            throw var1_5;
        }
        ((a)object).release();
        throw var1_5;
    }
}


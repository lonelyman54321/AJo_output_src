/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class c
implements AudioProcessor {
    public int b;
    public float c;
    public float d;
    public AudioProcessor$a e;
    public AudioProcessor$a f;
    public AudioProcessor$a g;
    public AudioProcessor$a h;
    public boolean i;
    public l93_0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        int n3 = this.p;
        if (n3 == 0) return 0 != 0;
        l93_0 l93_02 = this.j;
        if (l93_02 == null) return 1 != 0;
        int n4 = l93_02.m;
        n3 = l93_02.b;
        if ((n4 = n4 * n3 * 2) != 0) return 0 != 0;
        return 1 != 0;
    }

    public final ByteBuffer c() {
        ByteBuffer byteBuffer;
        Object object = this.j;
        if (object != null) {
            int n3 = ((l93_0)object).m;
            int n4 = ((l93_0)object).b;
            if ((n3 = n3 * n4 * 2) > 0) {
                Buffer buffer = this.k;
                int n7 = buffer.capacity();
                if (n7 < n3) {
                    buffer = ByteBuffer.allocateDirect(n3);
                    ByteOrder byteOrder = ByteOrder.nativeOrder();
                    buffer = ((ByteBuffer)buffer).order(byteOrder);
                    this.k = buffer;
                    buffer = ((ByteBuffer)buffer).asShortBuffer();
                    this.l = buffer;
                } else {
                    this.k.clear();
                    buffer = this.l;
                    ((ShortBuffer)buffer).clear();
                }
                buffer = this.l;
                int n8 = buffer.remaining() / n4;
                int n10 = ((l93_0)object).m;
                n8 = Math.min(n8, n10);
                short[] sArray = ((l93_0)object).l;
                int n14 = n8 * n4;
                ((ShortBuffer)buffer).put(sArray, 0, n14);
                ((l93_0)object).m = n7 = ((l93_0)object).m - n8;
                object = ((l93_0)object).l;
                System.arraycopy(object, n14, object, 0, n7 *= n4);
                long l2 = this.o;
                long l3 = n3;
                this.o = l2 += l3;
                this.k.limit(n3);
                this.m = object = this.k;
            }
        }
        object = this.m;
        this.m = byteBuffer = AudioProcessor.a;
        return object;
    }

    public final void d(ByteBuffer byteBuffer) {
        int n3;
        int n4 = byteBuffer.hasRemaining();
        if (n4 == 0) {
            return;
        }
        l93_0 l93_02 = this.j;
        l93_02.getClass();
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        int n7 = byteBuffer.remaining();
        long l2 = this.n;
        long l3 = n7;
        this.n = l2 += l3;
        int n8 = shortBuffer.remaining();
        int n10 = l93_02.b;
        int n14 = (n8 /= n10) * n10 * 2;
        short[] sArray = l93_02.j;
        int n15 = l93_02.k;
        l93_02.j = sArray = l93_02.c(sArray, n15, n8);
        n15 = l93_02.k * n10;
        shortBuffer.get(sArray, n15, n14 /= 2);
        l93_02.k = n3 = l93_02.k + n8;
        l93_02.f();
        n4 = byteBuffer.position() + n7;
        byteBuffer.position(n4);
    }

    public final void e() {
        l93_0 l93_02 = this.j;
        if (l93_02 != null) {
            int n3;
            int n4 = l93_02.k;
            float f5 = l93_02.c;
            float f6 = l93_02.d;
            double d2 = f5 / f6;
            double d5 = l93_02.e * f6;
            int n7 = l93_02.r;
            int n8 = n4 - n7;
            int n10 = l93_02.m;
            double d7 = (double)n8 / d2;
            d2 = n7;
            d7 += d2;
            d2 = l93_02.w;
            d7 += d2;
            d2 = l93_02.o;
            d7 = (d7 + d2) / d5 + 0.5;
            int n14 = (int)d7;
            n10 += n14;
            l93_02.w = d5 = 0.0;
            short[] sArray = l93_02.j;
            int n15 = l93_02.h * 2;
            int n16 = n15 + n4;
            l93_02.j = sArray = l93_02.c(sArray, n4, n16);
            n14 = 0;
            f5 = 0.0f;
            sArray = null;
            for (n16 = 0; n16 < (n7 = n15 * (n3 = l93_02.b)); ++n16) {
                short[] sArray2 = l93_02.j;
                n3 = n3 * n4 + n16;
                sArray2[n3] = 0;
            }
            n4 = l93_02.k;
            l93_02.k = n15 += n4;
            l93_02.f();
            n4 = l93_02.m;
            if (n4 > n10) {
                l93_02.m = n10;
            }
            l93_02.k = 0;
            l93_02.r = 0;
            l93_02.o = 0;
        }
        this.p = true;
    }

    public final AudioProcessor$a f(AudioProcessor$a audioProcessor$a) {
        int n3 = audioProcessor$a.c;
        int n4 = 2;
        if (n3 == n4) {
            AudioProcessor$a audioProcessor$a2;
            n3 = this.b;
            int n7 = -1;
            if (n3 == n7) {
                n3 = audioProcessor$a.a;
            }
            this.e = audioProcessor$a;
            int n8 = audioProcessor$a.b;
            this.f = audioProcessor$a2 = new AudioProcessor$a(n3, n8, n4);
            this.i = true;
            return audioProcessor$a2;
        }
        AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
        throw audioProcessor$UnhandledAudioFormatException;
    }

    public final void flush() {
        long l2;
        Object object;
        boolean bl2 = this.isActive();
        if (bl2) {
            AudioProcessor$a audioProcessor$a;
            this.g = object = this.e;
            this.h = audioProcessor$a = this.f;
            boolean bl3 = this.i;
            if (bl3) {
                l93_0 l93_02;
                int n3 = ((AudioProcessor$a)object).a;
                float f5 = this.c;
                float f6 = this.d;
                int n4 = audioProcessor$a.a;
                int n7 = ((AudioProcessor$a)object).b;
                this.j = l93_02 = new l93_0(n3, n7, f5, f6, n4);
            } else {
                object = this.j;
                if (object != null) {
                    double d2;
                    ((l93_0)object).k = 0;
                    ((l93_0)object).m = 0;
                    ((l93_0)object).o = 0;
                    ((l93_0)object).p = 0;
                    ((l93_0)object).q = 0;
                    ((l93_0)object).r = 0;
                    ((l93_0)object).s = 0;
                    ((l93_0)object).t = 0;
                    ((l93_0)object).u = 0;
                    ((l93_0)object).v = 0;
                    l2 = 0L;
                    ((l93_0)object).w = d2 = 0.0;
                }
            }
        }
        this.m = object = AudioProcessor.a;
        this.n = l2 = 0L;
        this.o = l2;
        this.p = false;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isActive() {
        void var2_8;
        block2: {
            block3: {
                float f5;
                float f6;
                float f7;
                AudioProcessor$a audioProcessor$a = this.f;
                int n3 = audioProcessor$a.a;
                int n4 = -1;
                float f8 = 0.0f / 0.0f;
                if (n3 == n4) break block2;
                float f11 = this.c;
                n4 = 1065353216;
                f8 = 1.0f;
                float f12 = (f11 = Math.abs(f11 - f8)) - (f7 = 1.0E-4f);
                Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object >= 0 || (f6 = (f5 = (f11 = Math.abs(this.d - f8)) - f7) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) >= 0) break block3;
                audioProcessor$a = this.f;
                int n7 = audioProcessor$a.a;
                AudioProcessor$a audioProcessor$a2 = this.e;
                n4 = audioProcessor$a2.a;
                if (n7 == n4) break block2;
            }
            boolean bl2 = true;
            return (boolean)var2_8;
        }
        boolean bl3 = false;
        return (boolean)var2_8;
    }

    public final void reset() {
        long l2;
        ShortBuffer shortBuffer;
        float f5;
        this.c = f5 = 1.0f;
        this.d = f5;
        Object object = AudioProcessor$a.e;
        this.e = object;
        this.f = object;
        this.g = object;
        this.h = object;
        this.k = object = AudioProcessor.a;
        this.l = shortBuffer = ((ByteBuffer)object).asShortBuffer();
        this.m = object;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = l2 = 0L;
        this.o = l2;
        this.p = false;
    }
}


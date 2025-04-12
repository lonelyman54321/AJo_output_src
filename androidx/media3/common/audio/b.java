/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessor$a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class b
implements AudioProcessor {
    public AudioProcessor$a b;
    public AudioProcessor$a c;
    public AudioProcessor$a d;
    public AudioProcessor$a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public b() {
        Object object = AudioProcessor.a;
        this.f = object;
        this.g = object;
        this.d = object = AudioProcessor$a.e;
        this.e = object;
        this.b = object;
        this.c = object;
    }

    public abstract AudioProcessor$a a(AudioProcessor$a var1);

    public boolean b() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean bl2 = this.h;
        if (bl2 && (byteBuffer2 = this.g) == (byteBuffer = AudioProcessor.a)) {
            bl2 = true;
        } else {
            bl2 = false;
            byteBuffer2 = null;
        }
        return bl2;
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = this.g;
        this.g = byteBuffer = AudioProcessor.a;
        return byteBuffer2;
    }

    public final void e() {
        this.h = true;
        this.h();
    }

    public final AudioProcessor$a f(AudioProcessor$a audioProcessor$a) {
        this.d = audioProcessor$a;
        this.e = audioProcessor$a = this.a(audioProcessor$a);
        boolean bl2 = this.isActive();
        audioProcessor$a = bl2 ? this.e : AudioProcessor$a.e;
        return audioProcessor$a;
    }

    public final void flush() {
        Object object = AudioProcessor.a;
        this.g = object;
        this.h = false;
        this.b = object = this.d;
        this.c = object = this.e;
        this.g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public boolean isActive() {
        boolean bl2;
        AudioProcessor$a audioProcessor$a = this.e;
        AudioProcessor$a audioProcessor$a2 = AudioProcessor$a.e;
        if (audioProcessor$a != audioProcessor$a2) {
            bl2 = true;
        } else {
            bl2 = false;
            audioProcessor$a = null;
        }
        return bl2;
    }

    public final ByteBuffer j(int n3) {
        ByteBuffer byteBuffer;
        Object object = this.f;
        int n4 = ((Buffer)object).capacity();
        if (n4 < n3) {
            byteBuffer = ByteBuffer.allocateDirect(n3);
            object = ByteOrder.nativeOrder();
            this.f = byteBuffer = byteBuffer.order((ByteOrder)object);
        } else {
            byteBuffer = this.f;
            byteBuffer.clear();
        }
        this.g = byteBuffer = this.f;
        return byteBuffer;
    }

    public final void reset() {
        this.flush();
        Object object = AudioProcessor.a;
        this.f = object;
        this.d = object = AudioProcessor$a.e;
        this.e = object;
        this.b = object;
        this.c = object;
        this.i();
    }
}


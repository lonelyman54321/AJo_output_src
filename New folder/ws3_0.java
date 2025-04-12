/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;

/*
 * Renamed from ws3
 */
public final class ws3_0
extends b {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        int n3 = audioProcessor$a.c;
        int n4 = 2;
        if (n3 == n4) {
            this.k = true;
            n3 = this.i;
            if (n3 == 0 && (n3 = this.j) == 0) {
                audioProcessor$a = AudioProcessor$a.e;
            }
            return audioProcessor$a;
        }
        AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
        throw audioProcessor$UnhandledAudioFormatException;
    }

    public final boolean b() {
        boolean bl2 = super.b();
        bl2 = bl2 && !(bl2 = this.n);
        return bl2;
    }

    public final ByteBuffer c() {
        int n3 = super.b();
        if (n3 != 0 && (n3 = this.n) > 0) {
            ByteBuffer byteBuffer = this.j(n3);
            byte[] byArray = this.m;
            int n4 = this.n;
            byteBuffer = byteBuffer.put(byArray, 0, n4);
            byteBuffer.flip();
            this.n = 0;
        }
        return super.c();
    }

    public final void d(ByteBuffer byteBuffer) {
        int n3;
        int n4;
        int n7 = byteBuffer.position();
        int n8 = byteBuffer.limit();
        int n10 = n8 - n7;
        if (n10 == 0) {
            return;
        }
        int n14 = this.l;
        n14 = Math.min(n10, n14);
        long l2 = this.o;
        Object object = this.b;
        int n15 = ((AudioProcessor$a)object).d;
        n15 = n14 / n15;
        long l3 = n15;
        this.o = l2 += l3;
        this.l = n4 = this.l - n14;
        byteBuffer.position(n7 += n14);
        n7 = this.l;
        if (n7 > 0) {
            return;
        }
        n7 = this.n + (n10 -= n14);
        n14 = this.m.length;
        ByteBuffer byteBuffer2 = this.j(n7 -= n14);
        n4 = this.n;
        n4 = gz3.h(n7, 0, n4);
        object = this.m;
        byteBuffer2.put((byte[])object, 0, n4);
        n7 = gz3.h(n7 - n4, 0, n10);
        n15 = byteBuffer.position() + n7;
        byteBuffer.limit(n15);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(n8);
        n10 -= n7;
        this.n = n7 = this.n - n4;
        byte[] byArray = this.m;
        System.arraycopy(byArray, n4, byArray, 0, n7);
        byte[] byArray2 = this.m;
        n8 = this.n;
        byteBuffer.get(byArray2, n8, n10);
        this.n = n3 = this.n + n10;
        byteBuffer2.flip();
    }

    public final void g() {
        int n3 = this.k;
        if (n3 != 0) {
            this.k = false;
            n3 = this.j;
            AudioProcessor$a audioProcessor$a = this.b;
            int n4 = audioProcessor$a.d;
            byte[] byArray = new byte[n3 * n4];
            this.m = byArray;
            this.l = n3 = this.i * n4;
        }
        this.n = 0;
    }

    public final void h() {
        int n3 = this.k;
        if (n3 != 0) {
            n3 = this.n;
            if (n3 > 0) {
                long l2 = this.o;
                AudioProcessor$a audioProcessor$a = this.b;
                int n4 = audioProcessor$a.d;
                long l3 = n3 /= n4;
                this.o = l2 += l3;
            }
            n3 = 0;
            this.n = 0;
        }
    }

    public final void i() {
        byte[] byArray = gz3.f;
        this.m = byArray;
    }
}


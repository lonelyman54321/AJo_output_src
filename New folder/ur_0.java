/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;

/*
 * Renamed from UR
 */
public final class ur_0
extends b {
    public int[] i;
    public int[] j;

    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        Object object = this.i;
        if (object == null) {
            return AudioProcessor$a.e;
        }
        int n3 = audioProcessor$a.c;
        int n4 = 2;
        if (n3 == n4) {
            int n7;
            AudioProcessor$a audioProcessor$a2;
            int n8 = audioProcessor$a.b;
            n3 = ((int[])object).length;
            if (n8 != n3) {
                n3 = 1;
            } else {
                n3 = 0;
                audioProcessor$a2 = null;
            }
            for (int i3 = 0; i3 < (n7 = ((int[])object).length); ++i3) {
                n7 = object[i3];
                if (n7 < n8) {
                    n7 = n7 != i3 ? 1 : 0;
                    n3 |= n7;
                    continue;
                }
                object = new AudioProcessor$UnhandledAudioFormatException;
                object(audioProcessor$a);
                throw object;
            }
            if (n3 != 0) {
                int n10 = audioProcessor$a.a;
                int n14 = ((int[])object).length;
                audioProcessor$a2 = new AudioProcessor$a(n10, n14, n4);
            } else {
                audioProcessor$a2 = AudioProcessor$a.e;
            }
            return audioProcessor$a2;
        }
        object = new AudioProcessor$UnhandledAudioFormatException;
        object(audioProcessor$a);
        throw object;
    }

    public final void d(ByteBuffer byteBuffer) {
        int n3;
        int[] nArray = this.j;
        nArray.getClass();
        int n4 = byteBuffer.limit();
        int n7 = n4 - n3;
        int n8 = this.b.d;
        n7 /= n8;
        AudioProcessor$a audioProcessor$a = this.c;
        n8 = audioProcessor$a.d;
        ByteBuffer byteBuffer2 = this.j(n7 *= n8);
        for (n3 = byteBuffer.position(); n3 < n4; n3 += n8) {
            n8 = nArray.length;
            for (int i3 = 0; i3 < n8; ++i3) {
                short s7 = nArray[i3] * 2 + n3;
                s7 = byteBuffer.getShort(s7);
                byteBuffer2.putShort(s7);
            }
            audioProcessor$a = this.b;
            n8 = audioProcessor$a.d;
        }
        byteBuffer.position(n4);
        byteBuffer2.flip();
    }

    public final void g() {
        int[] nArray = this.i;
        this.j = nArray;
    }

    public final void i() {
        this.j = null;
        this.i = null;
    }
}


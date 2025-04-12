/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class Yn3
extends b {
    public static final int i = Float.floatToIntBits(0.0f / 0.0f);

    public static void k(int n3, ByteBuffer byteBuffer) {
        int n4;
        double d2 = 4.656612875245797E-10;
        double d5 = (double)n3 * d2;
        float f5 = (float)d5;
        if ((n3 = Float.floatToIntBits(f5)) == (n4 = i)) {
            f5 = 0.0f;
            n3 = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n3);
    }

    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        AudioProcessor$a audioProcessor$a2;
        int n3 = 21;
        int n4 = 4;
        int n7 = audioProcessor$a.c;
        if (n7 != n3 && n7 != (n3 = 0x50000000) && n7 != (n3 = 22) && n7 != (n3 = 0x60000000) && n7 != n4) {
            AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
            throw audioProcessor$UnhandledAudioFormatException;
        }
        if (n7 != n4) {
            n7 = audioProcessor$a.a;
            int n8 = audioProcessor$a.b;
            audioProcessor$a2 = new AudioProcessor$a(n7, n8, n4);
        } else {
            audioProcessor$a2 = AudioProcessor$a.e;
        }
        return audioProcessor$a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(ByteBuffer object) {
        ByteBuffer byteBuffer;
        int n3;
        block9: {
            int n4;
            int n7;
            int n8;
            int n10;
            block10: {
                n10 = ((Buffer)object).limit();
                n8 = n10 - n3;
                AudioProcessor$a audioProcessor$a = this.b;
                n7 = audioProcessor$a.c;
                n4 = 21;
                if (n7 == n4) break block10;
                n4 = 22;
                if (n7 != n4) {
                    n4 = 0x50000000;
                    if (n7 != n4) {
                        n4 = 0x60000000;
                        if (n7 != n4) {
                            object = new IllegalStateException();
                            throw object;
                        }
                        byteBuffer = this.j(n8);
                        for (n3 = ((Buffer)object).position(); n3 < n10; n3 += 4) {
                            n7 = n3 + 3;
                            n7 = ((ByteBuffer)object).get(n7) & 0xFF;
                            n4 = n3 + 2;
                            n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 8;
                            n7 |= n4;
                            n4 = n3 + 1;
                            n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                            n7 |= n4;
                            n4 = (((ByteBuffer)object).get(n3) & 0xFF) << 24;
                            Yn3.k(n7 |= n4, byteBuffer);
                        }
                        break block9;
                    } else {
                        n8 = n8 / 3 * 4;
                        byteBuffer = this.j(n8);
                        while (n3 < n10) {
                            n7 = n3 + 2;
                            n7 = (((ByteBuffer)object).get(n7) & 0xFF) << 8;
                            n4 = n3 + 1;
                            n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                            n7 |= n4;
                            n4 = (((ByteBuffer)object).get(n3) & 0xFF) << 24;
                            Yn3.k(n7 |= n4, byteBuffer);
                            n3 += 3;
                        }
                    }
                    break block9;
                } else {
                    byteBuffer = this.j(n8);
                    while (n3 < n10) {
                        n7 = ((ByteBuffer)object).get(n3) & 0xFF;
                        n4 = n3 + 1;
                        n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 8;
                        n7 |= n4;
                        n4 = n3 + 2;
                        n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                        n7 |= n4;
                        n4 = n3 + 3;
                        n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 24;
                        Yn3.k(n7 |= n4, byteBuffer);
                        n3 += 4;
                    }
                }
                break block9;
            }
            n8 = n8 / 3 * 4;
            byteBuffer = this.j(n8);
            while (n3 < n10) {
                n7 = (((ByteBuffer)object).get(n3) & 0xFF) << 8;
                n4 = n3 + 1;
                n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                n7 |= n4;
                n4 = n3 + 2;
                n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 24;
                Yn3.k(n7 |= n4, byteBuffer);
                n3 += 3;
            }
        }
        n3 = ((Buffer)object).limit();
        ((ByteBuffer)object).position(n3);
        byteBuffer.flip();
    }
}


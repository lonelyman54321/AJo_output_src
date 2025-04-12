/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class D43
extends b {
    public final float i;
    public final short j = (short)1024;
    public final int k;
    public final long l;
    public final long m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public int r = 0;
    public byte[] s;
    public int t = 0;
    public int u = 0;
    public byte[] v;

    public D43() {
        this.l = 100000L;
        this.i = 0.2f;
        this.m = 2000000L;
        this.k = 10;
        byte[] byArray = gz3.f;
        this.s = byArray;
        this.v = byArray;
    }

    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        int n3 = audioProcessor$a.c;
        int n4 = 2;
        if (n3 == n4) {
            n3 = audioProcessor$a.a;
            n4 = -1;
            if (n3 == n4) {
                audioProcessor$a = AudioProcessor$a.e;
            }
            return audioProcessor$a;
        }
        AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
        throw audioProcessor$UnhandledAudioFormatException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(ByteBuffer object) {
        while (true) {
            int n3;
            int n4;
            int n7;
            int n8;
            block17: {
                int n10;
                int n14;
                block21: {
                    int n15;
                    byte[] byArray;
                    block16: {
                        block20: {
                            block18: {
                                byte[] byArray2;
                                block19: {
                                    ByteBuffer byteBuffer;
                                    if ((n8 = ((Buffer)object).hasRemaining()) == 0 || (n8 = (byteBuffer = this.g).hasRemaining()) != 0) break block18;
                                    n8 = this.p;
                                    n7 = this.j;
                                    n4 = 1;
                                    if (n8 == 0) break block19;
                                    if (n8 != n4) {
                                        object = new IllegalStateException();
                                        throw object;
                                    }
                                    n8 = this.t;
                                    byArray = this.s;
                                    n3 = byArray.length;
                                    n14 = 0;
                                    byArray2 = null;
                                    if (n8 < n3) {
                                        n8 = 1;
                                    } else {
                                        n8 = 0;
                                        byteBuffer = null;
                                    }
                                    ct3.f(n8 != 0);
                                    n8 = ((Buffer)object).limit();
                                    break block20;
                                }
                                n8 = ((Buffer)object).limit();
                                n3 = ((Buffer)object).position();
                                byArray2 = this.s;
                                n14 = byArray2.length;
                                n3 += n14;
                                n3 = Math.min(n8, n3);
                                ((ByteBuffer)object).limit(n3);
                                break block21;
                            }
                            return;
                        }
                        for (n3 = ((Buffer)object).position() + n4; n3 < (n10 = ((Buffer)object).limit()); n3 += 2) {
                            n10 = ((ByteBuffer)object).get(n3);
                            n15 = n3 + -1;
                            if ((n10 = Math.abs(n10 << 8 | (n15 = ((ByteBuffer)object).get(n15) & 0xFF))) <= n7) continue;
                            n7 = this.n;
                            n3 = n3 / n7 * n7;
                            break block16;
                        }
                        n3 = ((Buffer)object).limit();
                    }
                    n7 = ((Buffer)object).position();
                    n7 = n3 - n7;
                    n10 = this.t;
                    n15 = this.u;
                    int n16 = n10 + n15;
                    byte[] byArray3 = this.s;
                    int n17 = byArray3.length;
                    if (n16 < n17) {
                        n10 = byArray3.length;
                    } else {
                        n16 = byArray3.length - n10;
                        n16 = n15 - n16;
                    }
                    n10 -= n16;
                    if (n3 < n8) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        byArray = null;
                    }
                    n15 = Math.min(n7, n10);
                    int n18 = ((Buffer)object).position() + n15;
                    ((ByteBuffer)object).limit(n18);
                    byArray3 = this.s;
                    ((ByteBuffer)object).get(byArray3, n16, n15);
                    this.u = n16 = this.u + n15;
                    byte[] byArray4 = this.s;
                    n15 = byArray4.length;
                    if (n16 <= n15) {
                        n15 = 1;
                    } else {
                        n15 = 0;
                        byArray4 = null;
                    }
                    ct3.f(n15 != 0);
                    if (n3 == 0 || n7 >= n10) {
                        n4 = 0;
                    }
                    this.l(n4 != 0);
                    if (n4 != 0) {
                        this.p = 0;
                        this.r = 0;
                    }
                    ((ByteBuffer)object).limit(n8);
                    continue;
                }
                for (n3 = ((Buffer)object).limit() - n4; n3 >= (n14 = ((Buffer)object).position()); n3 += -2) {
                    n14 = ((ByteBuffer)object).get(n3);
                    n10 = n3 + -1;
                    if ((n14 = Math.abs(n14 << 8 | (n10 = ((ByteBuffer)object).get(n10) & 0xFF))) <= n7) continue;
                    n7 = this.n;
                    n3 = n3 / n7 * n7 + n7;
                    break block17;
                }
                n3 = ((Buffer)object).position();
            }
            n7 = ((Buffer)object).position();
            if (n3 == n7) {
                this.p = n4;
            } else {
                n7 = ((Buffer)object).capacity();
                n7 = Math.min(n3, n7);
                ((ByteBuffer)object).limit(n7);
                n7 = ((Buffer)object).remaining();
                ByteBuffer byteBuffer = this.j(n7).put((ByteBuffer)object);
                byteBuffer.flip();
            }
            ((ByteBuffer)object).limit(n8);
        }
    }

    public final void g() {
        int n3 = this.isActive();
        if (n3 != 0) {
            int n4;
            Object object = this.b;
            this.n = n4 = ((AudioProcessor$a)object).b * 2;
            long l2 = ((AudioProcessor$a)object).a;
            long l3 = this.l * l2;
            byte[] byArray = this.s;
            n4 = byArray.length;
            l2 = 1000000L;
            n3 = (int)(l3 /= l2) / 2 / n4 * n4 * 2;
            if (n4 != n3) {
                this.s = byArray = new byte[n3];
                object = new byte[n3];
                this.v = (byte[])object;
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    public final void h() {
        int n3 = this.u;
        if (n3 > 0) {
            this.l(true);
            n3 = 0;
            this.r = 0;
        }
    }

    public final void i() {
        this.o = false;
        byte[] byArray = gz3.f;
        this.s = byArray;
        this.v = byArray;
    }

    public final boolean isActive() {
        boolean bl2 = super.isActive();
        bl2 = bl2 && (bl2 = this.o);
        return bl2;
    }

    public final int k(int n3) {
        float f5;
        AudioProcessor$a audioProcessor$a = this.b;
        long l2 = audioProcessor$a.a;
        long l3 = this.m * l2;
        l2 = 1000000L;
        int n4 = (int)(l3 /= l2);
        int n7 = this.r;
        n4 -= n7;
        n7 = this.n;
        n4 *= n7;
        byte[] byArray = this.s;
        n7 = byArray.length / 2;
        if ((n4 -= n7) >= 0) {
            n7 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f5 = 0.0f;
            byArray = null;
        }
        ct3.f(n7 != 0);
        float f6 = n3;
        f5 = this.i;
        f6 = f6 * f5 + 0.5f;
        float f7 = n4;
        n3 = (int)Math.min(f6, f7);
        n4 = this.n;
        return n3 / n4 * n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(boolean n3) {
        int n4 = this.u;
        byte[] byArray = this.s;
        int n7 = byArray.length;
        if (n4 == n7 || n3 != 0) {
            byte[] byArray2;
            int n8;
            n7 = this.r;
            int n10 = 0;
            int n14 = 1;
            int n15 = 2;
            if (n7 == 0) {
                if (n3 != 0) {
                    this.m(n4, 3);
                    n3 = n4;
                } else {
                    byte[] byArray3;
                    n3 = byArray.length / n15;
                    if (n4 >= n3) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        byArray3 = null;
                    }
                    ct3.f(n3 != 0);
                    byArray3 = this.s;
                    n3 = byArray3.length / n15;
                    this.m(n3, 0);
                }
                n8 = n3;
            } else if (n3 != 0) {
                n3 = byArray.length / n15;
                n3 = n4 - n3;
                n8 = byArray.length / n15 + n3;
                n3 = this.k(n3);
                byArray2 = this.s;
                n7 = byArray2.length / n15;
                this.m(n3 += n7, n15);
                int n16 = n8;
                n8 = n3;
                n3 = n16;
            } else {
                n3 = byArray.length / n15;
                n3 = n4 - n3;
                n8 = this.k(n3);
                this.m(n8, n14);
            }
            n7 = this.n;
            n7 = n3 % n7;
            if (n7 == 0) {
                n7 = 1;
            } else {
                n7 = 0;
                byArray2 = null;
            }
            String string2 = "bytesConsumed is not aligned to frame size: %s";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            String string3 = stringBuilder.toString();
            ct3.g(n7 != 0, string3);
            if (n4 >= n8) {
                n10 = 1;
            }
            ct3.f(n10 != 0);
            this.u = n4 = this.u - n3;
            this.t = n4 = this.t + n3;
            byArray2 = this.s;
            n7 = byArray2.length;
            this.t = n4 %= n7;
            n4 = this.r;
            n7 = this.n;
            this.r = n10 = n8 / n7 + n4;
            long l2 = this.q;
            n3 = (n3 - n8) / n7;
            long l3 = n3;
            this.q = l2 += l3;
        }
    }

    public final void m(int n3, int n4) {
        Object object;
        int n7;
        Object object2;
        byte[] byArray;
        int n8;
        byte[] byArray2;
        int n10;
        int n14;
        int n15;
        if (n3 == 0) {
            return;
        }
        int n16 = this.u;
        int n17 = 1;
        n16 = n16 >= n3 ? 1 : 0;
        ct3.a(n16 != 0);
        n16 = 2;
        if (n4 == n16) {
            n15 = this.t;
            n14 = this.u;
            n10 = n15 + n14;
            byArray2 = this.s;
            n8 = byArray2.length;
            if (n10 <= n8) {
                byArray = this.v;
                System.arraycopy(byArray2, n10 -= n3, byArray, 0, n3);
            } else {
                n10 = byArray2.length - n15;
                if ((n14 -= n10) >= n3) {
                    byArray = this.v;
                    System.arraycopy(byArray2, n14 -= n3, byArray, 0, n3);
                } else {
                    n15 = n3 - n14;
                    n10 = byArray2.length - n15;
                    byte[] byArray3 = this.v;
                    System.arraycopy(byArray2, n10, byArray3, 0, n15);
                    object2 = this.s;
                    byArray2 = this.v;
                    System.arraycopy(object2, 0, byArray2, n15, n14);
                }
            }
        } else {
            n15 = this.t;
            n14 = n15 + n3;
            object2 = this.s;
            n7 = ((byte[])object2).length;
            if (n14 <= n7) {
                object = this.v;
                System.arraycopy(object2, n15, object, 0, n3);
            } else {
                n14 = ((byte[])object2).length - n15;
                byArray2 = this.v;
                System.arraycopy(object2, n15, byArray2, 0, n14);
                n15 = n3 - n14;
                object2 = this.s;
                byArray2 = this.v;
                System.arraycopy(object2, 0, byArray2, n14, n15);
            }
        }
        n15 = this.n;
        n15 = n3 % n15;
        if (n15 == 0) {
            n15 = 1;
        } else {
            n15 = 0;
            byArray = null;
        }
        object = new StringBuilder;
        object2 = "sizeToOutput is not aligned to frame size: ";
        ((StringBuilder)object)((String)object2);
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        ct3.b(n15 != 0, (String)object);
        n15 = this.t;
        object = this.s;
        n14 = ((byte[])object).length;
        if (n15 < n14) {
            n15 = 1;
        } else {
            n15 = 0;
            byArray = null;
        }
        ct3.f(n15 != 0);
        byArray = this.v;
        n14 = this.n;
        n14 = n3 % n14;
        if (n14 != 0) {
            n17 = 0;
        }
        object = new StringBuilder;
        object2 = "byteOutput size is not aligned to frame size ";
        ((StringBuilder)object)((String)object2);
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        ct3.b(n17 != 0, (String)object);
        n17 = 3;
        if (n4 != n17) {
            for (n17 = 0; n17 < n3; n17 += 2) {
                int n18;
                n14 = n17 + 1;
                n10 = byArray[n14];
                n7 = byArray[n17] & 0xFF;
                n10 = n10 << 8 | n7;
                n7 = this.k;
                if (n4 == 0) {
                    n8 = n3 + -1;
                    n18 = n17 * 1000 / n8 * (n7 += -100) / 1000;
                    n7 = n18 + 100;
                } else if (n4 == n16) {
                    n8 = n3 + -1;
                    n18 = 100 - n7;
                    int n19 = n17 * 1000 * n18 / n8 / 1000;
                    n7 += n19;
                }
                n10 = n10 * n7 / 100;
                n7 = Short.MAX_VALUE;
                if (n10 >= n7) {
                    byArray[n17] = -1;
                    byArray[n14] = n10 = 127;
                    continue;
                }
                n7 = Short.MIN_VALUE;
                if (n10 <= n7) {
                    byArray[n17] = 0;
                    byArray[n14] = n10 = -128;
                    continue;
                }
                byArray[n17] = n7 = (int)((byte)(n10 & 0xFF));
                byArray[n14] = n10 = (int)((byte)(n10 >> 8));
            }
        }
        this.j(n3).put(byArray, 0, n3).flip();
    }
}


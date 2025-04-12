/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import androidx.media3.common.audio.b;
import java.nio.ByteBuffer;

public final class d
extends b {
    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        AudioProcessor$a audioProcessor$a2;
        int n3 = audioProcessor$a.c;
        int n4 = 3;
        int n7 = 2;
        if (n3 != n4 && n3 != n7 && n3 != (n4 = 0x10000000) && n3 != (n4 = 21) && n3 != (n4 = 0x50000000) && n3 != (n4 = 22) && n3 != (n4 = 0x60000000) && n3 != (n4 = 4)) {
            AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
            throw audioProcessor$UnhandledAudioFormatException;
        }
        if (n3 != n7) {
            n4 = audioProcessor$a.a;
            int n8 = audioProcessor$a.b;
            audioProcessor$a2 = new AudioProcessor$a(n4, n8, n7);
        } else {
            audioProcessor$a2 = AudioProcessor$a.e;
        }
        return audioProcessor$a2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(ByteBuffer var1_1) {
        block20: {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            block19: {
                                block14: {
                                    block12: {
                                        block11: {
                                            block13: {
                                                var2_2 = var1_1.position();
                                                var3_3 = var1_1.limit();
                                                var4_4 = var3_3 - var2_2;
                                                var5_5 = this.b;
                                                var6_6 = var5_5.c;
                                                var7_7 = 4;
                                                var8_8 = 5.6E-45f;
                                                var9_9 = 3;
                                                var10_10 = 4.2E-45f;
                                                var11_11 = 0x60000000;
                                                var12_12 = 0x50000000;
                                                var13_13 = 0x10000000;
                                                var14_14 = 22;
                                                var15_15 = 21;
                                                if (var6_6 == var9_9) break block11;
                                                if (var6_6 == var7_7) break block12;
                                                if (var6_6 == var15_15) break block13;
                                                if (var6_6 == var14_14) break block12;
                                                if (var6_6 == var13_13) break block14;
                                                if (var6_6 != var12_12) {
                                                    if (var6_6 != var11_11) {
                                                        var1_1 = new IllegalStateException();
                                                        throw var1_1;
                                                    } else {
                                                        ** GOTO lbl25
                                                    }
                                                }
                                                break block13;
lbl25:
                                                // 2 sources

                                                break block12;
                                            }
                                            var4_4 /= 3;
                                        }
                                        var4_4 *= 2;
                                        break block14;
                                    }
                                    var4_4 /= 2;
                                }
                                var16_16 = this.j(var4_4);
                                var5_5 = this.b;
                                var6_6 = var5_5.c;
                                if (var6_6 == var9_9) break block15;
                                if (var6_6 == var7_7) break block16;
                                if (var6_6 == var15_15) break block17;
                                if (var6_6 == var14_14) break block18;
                                if (var6_6 == var13_13) break block19;
                                if (var6_6 == var12_12) ** GOTO lbl57
                                if (var6_6 == var11_11) {
                                    while (var2_2 < var3_3) {
                                        var6_6 = var2_2 + 1;
                                        var6_6 = var1_1.get(var6_6);
                                        var16_16.put((byte)var6_6);
                                        var6_6 = var1_1.get(var2_2);
                                        var16_16.put((byte)var6_6);
                                        var2_2 += 4;
                                    }
                                } else {
                                    var1_1 = new IllegalStateException();
                                    throw var1_1;
lbl57:
                                    // 2 sources

                                    while (var2_2 < var3_3) {
                                        var6_6 = var2_2 + 1;
                                        var6_6 = var1_1.get(var6_6);
                                        var16_16.put((byte)var6_6);
                                        var6_6 = var1_1.get(var2_2);
                                        var16_16.put((byte)var6_6);
                                        var2_2 += 3;
                                    }
                                }
                                break block20;
                            }
                            while (var2_2 < var3_3) {
                                var6_6 = var2_2 + 1;
                                var6_6 = var1_1.get(var6_6);
                                var16_16.put((byte)var6_6);
                                var6_6 = var1_1.get(var2_2);
                                var16_16.put((byte)var6_6);
                                var2_2 += 2;
                            }
                            break block20;
                        }
                        while (var2_2 < var3_3) {
                            var6_6 = var2_2 + 2;
                            var6_6 = var1_1.get(var6_6);
                            var16_16.put((byte)var6_6);
                            var6_6 = var2_2 + 3;
                            var6_6 = var1_1.get(var6_6);
                            var16_16.put((byte)var6_6);
                            var2_2 += 4;
                        }
                        break block20;
                    }
                    while (var2_2 < var3_3) {
                        var6_6 = var2_2 + 1;
                        var6_6 = var1_1.get(var6_6);
                        var16_16.put((byte)var6_6);
                        var6_6 = var2_2 + 2;
                        var6_6 = var1_1.get(var6_6);
                        var16_16.put((byte)var6_6);
                        var2_2 += 3;
                    }
                    break block20;
                }
                while (var2_2 < var3_3) {
                    var17_17 = var1_1.getFloat(var2_2);
                    var9_9 = 1065353216;
                    var10_10 = 1.0f;
                    var17_17 = gz3.g(var17_17, -1.0f, var10_10);
                    var8_8 = 32767.0f;
                    var6_6 = (short)(var17_17 *= var8_8);
                    var7_7 = (byte)(var6_6 & 255);
                    var16_16.put(var7_7);
                    var6_6 = (byte)(var6_6 >> 8 & 255);
                    var16_16.put((byte)var6_6);
                    var2_2 += 4;
                }
                break block20;
            }
            while (var2_2 < var3_3) {
                var17_18 = 0.0f;
                var5_5 = null;
                var16_16.put((byte)0);
                var6_6 = (byte)((var1_1.get(var2_2) & 255) + -128);
                var16_16.put((byte)var6_6);
                ++var2_2;
            }
        }
        var2_2 = var1_1.limit();
        var1_1.position(var2_2);
        var16_16.flip();
    }
}


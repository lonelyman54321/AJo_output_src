/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.e_0;
import androidx.datastore.preferences.protobuf.p;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class e$a
extends e_0 {
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k = -1 >>> 1;

    public e$a(byte[] byArray, int n3, int n4, boolean bl2) {
        this.e = byArray;
        this.f = n4 += n3;
        this.h = n3;
        this.i = n3;
    }

    public final long A() {
        int n3 = this.h;
        int n4 = this.f - n3;
        int n7 = 8;
        if (n4 >= n7) {
            this.h = n4 = n3 + 8;
            byte[] byArray = this.e;
            long l2 = byArray[n3];
            long l3 = 255L;
            int n8 = n3 + 1;
            long l4 = ((long)byArray[n8] & l3) << n7;
            long l7 = (l2 &= l3) | l4;
            int n10 = n3 + 2;
            l4 = ((long)byArray[n10] & l3) << 16;
            l7 |= l4;
            n10 = n3 + 3;
            l4 = ((long)byArray[n10] & l3) << 24;
            l7 |= l4;
            n10 = n3 + 4;
            l4 = ((long)byArray[n10] & l3) << 32;
            l7 |= l4;
            n10 = n3 + 5;
            l4 = ((long)byArray[n10] & l3) << 40;
            l7 |= l4;
            n10 = n3 + 6;
            l4 = ((long)byArray[n10] & l3) << 48;
            return ((long)byArray[n3 += 7] & l3) << 56 | (l7 |= l4);
        }
        throw InvalidProtocolBufferException.f();
    }

    /*
     * Unable to fully structure code
     */
    public final int B() {
        block9: {
            block13: {
                block12: {
                    block14: {
                        block10: {
                            block11: {
                                var2_2 = this.f;
                                var1_1 = this.h;
                                if (var2_2 == var1_1) break block10;
                                var3_3 = var1_1 + 1;
                                var4_4 = this.e;
                                var5_5 = var4_4[var1_1];
                                if (var5_5 >= 0) {
                                    this.h = var3_3;
                                    return var5_5;
                                }
                                var6_6 = 9;
                                if ((var2_2 -= var3_3) < var6_6) break block10;
                                var2_2 = var1_1 + 2;
                                if ((var3_3 = var4_4[var3_3] << 7 ^ var5_5) >= 0) break block11;
                                var1_1 = var3_3 ^ -128;
                                break block9;
                            }
                            var5_5 = var1_1 + 3;
                            if ((var2_2 = var4_4[var2_2] << 14 ^ var3_3) >= 0) {
                                var1_1 = var2_2 ^ 16256;
lbl20:
                                // 2 sources

                                while (true) {
                                    var2_2 = var5_5;
                                    break block9;
                                    break;
                                }
                            }
                            var3_3 = var1_1 + 4;
                            if ((var2_2 ^= (var5_5 = var4_4[var5_5] << 21)) < 0) {
                                var1_1 = -2080896 ^ var2_2;
lbl26:
                                // 2 sources

                                while (true) {
                                    var2_2 = var3_3;
                                    break block9;
                                    break;
                                }
                            }
                            var5_5 = var1_1 + 5;
                            var3_3 = var4_4[var3_3];
                            var6_6 = var3_3 << 28;
                            var2_2 ^= var6_6;
                            var6_6 = 266354560;
                            var2_2 ^= var6_6;
                            if (var3_3 >= 0) break block12;
                            var3_3 = var1_1 + 6;
                            if ((var5_5 = var4_4[var5_5]) >= 0) break block13;
                            var5_5 = var1_1 + 7;
                            if ((var3_3 = var4_4[var3_3]) >= 0) break block12;
                            var3_3 = var1_1 + 8;
                            if ((var5_5 = var4_4[var5_5]) >= 0) break block13;
                            var5_5 = var1_1 + 9;
                            if ((var3_3 = var4_4[var3_3]) >= 0) break block12;
                            var1_1 += 10;
                            var3_3 = var4_4[var5_5];
                            if (var3_3 >= 0) break block14;
                        }
                        return (int)this.D();
                    }
                    var7_7 = var2_2;
                    var2_2 = var1_1;
                    var1_1 = var7_7;
                    break block9;
                }
                var1_1 = var2_2;
                ** while (true)
            }
            var1_1 = var2_2;
            ** while (true)
        }
        this.h = var2_2;
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long C() {
        block13: {
            block17: {
                block18: {
                    block14: {
                        block16: {
                            block15: {
                                var2_2 = this.f;
                                var1_1 = this.h;
                                if (var2_2 == var1_1) break block14;
                                var3_3 = var1_1 + 1;
                                var4_4 = this.e;
                                var5_5 = var4_4[var1_1];
                                if (var5_5 >= 0) {
                                    this.h = var3_3;
                                    return var5_5;
                                }
                                var6_6 = 9;
                                if ((var2_2 -= var3_3) < var6_6) break block14;
                                var2_2 = var1_1 + 2;
                                if ((var3_3 = var4_4[var3_3] << 7 ^ var5_5) >= 0) break block15;
                                var1_1 = var3_3 ^ -128;
                                var7_7 = var1_1;
                                break block13;
                            }
                            var5_5 = var1_1 + 3;
                            if ((var2_2 = var4_4[var2_2] << 14 ^ var3_3) < 0) break block16;
                            var1_1 = var2_2 ^ 16256;
                            var7_7 = var1_1;
                            var2_2 = var5_5;
                            break block13;
                        }
                        var3_3 = var1_1 + 4;
                        if ((var2_2 ^= (var5_5 = var4_4[var5_5] << 21)) < 0) {
                            var1_1 = -2080896 ^ var2_2;
                            var9_8 = var1_1;
lbl29:
                            // 2 sources

                            while (true) {
                                var2_2 = var3_3;
                                var7_7 = var9_8;
                                break block13;
                                break;
                            }
                        }
                        var11_9 = var2_2;
                        var2_2 = var1_1 + 5;
                        var13_10 = (long)var4_4[var3_3] << 28;
                        cfr_temp_0 = (var11_9 ^= var13_10) - (var13_10 = 0L);
                        var3_3 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var3_3 >= 0) {
                            var7_7 = 266354560L;
lbl40:
                            // 2 sources

                            while (true) {
                                var7_7 ^= var11_9;
                                break block13;
                                break;
                            }
                        }
                        var3_3 = var1_1 + 6;
                        var15_11 = (long)var4_4[var2_2] << 35;
                        cfr_temp_1 = (var11_9 ^= var15_11) - var13_10;
                        if ((var2_2 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                            var9_8 = -34093383808L;
lbl48:
                            // 2 sources

                            while (true) {
                                var9_8 ^= var11_9;
                                ** continue;
                                break;
                            }
                        }
                        var2_2 = var1_1 + 7;
                        var15_11 = (long)var4_4[var3_3] << 42;
                        cfr_temp_2 = (var11_9 ^= var15_11) - var13_10;
                        if ((var3_3 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0) {
                            var7_7 = 4363953127296L;
                            ** continue;
                        }
                        var3_3 = var1_1 + 8;
                        var15_11 = (long)var4_4[var2_2] << 49;
                        cfr_temp_3 = (var11_9 ^= var15_11) - var13_10;
                        if ((var2_2 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) < 0) {
                            var9_8 = -558586000294016L;
                            ** continue;
                        }
                        var2_2 = var1_1 + 9;
                        var15_11 = (long)var4_4[var3_3] << 56;
                        var11_9 ^= var15_11;
                        var15_11 = 71499008037633920L;
                        cfr_temp_4 = (var11_9 ^= var15_11) - var13_10;
                        var3_3 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var3_3 >= 0) break block17;
                        var1_1 += 10;
                        var17_12 = var2_2 = var4_4[var2_2];
                        cfr_temp_5 = var17_12 - var13_10;
                        var19_13 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var19_13 /* !! */  >= 0) break block18;
                    }
                    return this.D();
                }
                var2_2 = var1_1;
            }
            var7_7 = var11_9;
        }
        this.h = var2_2;
        return var7_7;
    }

    public final long D() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.h;
            int n4 = this.f;
            if (n3 != n4) {
                this.h = n4 = n3 + 1;
                byte[] byArray = this.e;
                n3 = byArray[n3];
                n4 = n3 & 0x7F;
                long l3 = (long)n4 << i3;
                l2 |= l3;
                if ((n3 &= 0x80) != 0) continue;
                return l2;
            }
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void E() {
        int n3 = this.f;
        int n4 = this.g;
        this.f = n3 += n4;
        n4 = this.i;
        int n7 = this.k;
        if ((n4 = n3 - n4) > n7) {
            this.g = n4 -= n7;
            this.f = n3 -= n4;
        } else {
            n3 = 0;
            this.g = 0;
        }
    }

    public final void F(int n3) {
        if (n3 >= 0) {
            int n4 = this.f;
            int n7 = this.h;
            if (n3 <= (n4 -= n7)) {
                this.h = n7 += n3;
                return;
            }
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void a(int n3) {
        int n4 = this.j;
        if (n4 == n3) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message end-group tag did not match expected tag.");
        throw invalidProtocolBufferException;
    }

    public final int c() {
        int n3 = this.h;
        int n4 = this.i;
        return n3 - n4;
    }

    public final boolean d() {
        int n3 = this.h;
        int n4 = this.f;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public final void e(int n3) {
        this.k = n3;
        this.E();
    }

    public final int f(int n3) {
        if (n3 >= 0) {
            int n4 = this.c() + n3;
            if (n4 <= (n3 = this.k)) {
                this.k = n4;
                this.E();
                return n3;
            }
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean g() {
        long l2;
        long l3 = this.C();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    public final DF$e h() {
        block8: {
            block9: {
                byte[] byArray;
                Object object;
                block7: {
                    int n3;
                    block6: {
                        int n4;
                        int n7;
                        n3 = this.B();
                        object = this.e;
                        if (n3 > 0) {
                            n7 = this.f;
                            n4 = this.h;
                            if (n3 <= (n7 -= n4)) {
                                object = DF.c(n4, object, n3);
                                this.h = n7 = this.h + n3;
                                return object;
                            }
                        }
                        if (n3 == 0) {
                            return DF.b;
                        }
                        if (n3 <= 0) break block6;
                        n7 = this.f;
                        n4 = this.h;
                        if (n3 > (n7 -= n4)) break block6;
                        this.h = n3 += n4;
                        byArray = Arrays.copyOfRange(object, n4, n3);
                        break block7;
                    }
                    if (n3 > 0) break block8;
                    if (n3 != 0) break block9;
                    byArray = p.b;
                }
                object = DF.b;
                object = new DF$e;
                object(byArray);
                return object;
            }
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    public final double i() {
        return Double.longBitsToDouble(this.A());
    }

    public final int j() {
        return this.B();
    }

    public final int k() {
        return this.z();
    }

    public final long l() {
        return this.A();
    }

    public final float m() {
        return Float.intBitsToFloat(this.z());
    }

    public final int n() {
        return this.B();
    }

    public final long o() {
        return this.C();
    }

    public final int p() {
        return this.z();
    }

    public final long q() {
        return this.A();
    }

    public final int r() {
        int n3 = this.B();
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public final long s() {
        return e_0.b(this.C());
    }

    public final String t() {
        int n3 = this.B();
        if (n3 > 0) {
            int n4 = this.f;
            int n7 = this.h;
            if (n3 <= (n4 -= n7)) {
                byte[] byArray = this.e;
                Charset charset = p.a;
                String string2 = new String(byArray, n7, n3, charset);
                this.h = n7 = this.h + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    public final String u() {
        int n3 = this.B();
        if (n3 > 0) {
            int n4 = this.f;
            int n7 = this.h;
            if (n3 <= (n4 -= n7)) {
                Object object = K.a;
                byte[] byArray = this.e;
                object = ((K$b)object).a(byArray, n7, n3);
                this.h = n7 = this.h + n3;
                return object;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.f();
    }

    public final int v() {
        int n3 = this.d();
        if (n3 != 0) {
            this.j = 0;
            return 0;
        }
        this.j = n3 = this.B();
        int n4 = n3 >>> 3;
        if (n4 != 0) {
            return n3;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message contained an invalid tag (zero).");
        throw invalidProtocolBufferException;
    }

    public final int w() {
        return this.B();
    }

    public final long x() {
        return this.C();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean y(int n3) {
        int n4;
        int n7 = n3 & 7;
        int n8 = 1;
        if (n7 != 0) {
            if (n7 != n8) {
                int n10 = 2;
                if (n7 != n10) {
                    n10 = 4;
                    int n14 = 3;
                    if (n7 != n14) {
                        if (n7 == n10) return false;
                        n3 = 5;
                        if (n7 != n3) throw InvalidProtocolBufferException.b();
                        this.F(n10);
                        return n8 != 0;
                    }
                    while ((n7 = this.v()) != 0 && (n7 = (int)(this.y(n7) ? 1 : 0)) != 0) {
                    }
                    n3 = n3 >>> n14 << n14 | n10;
                    this.a(n3);
                    return n8 != 0;
                }
                n3 = this.B();
                this.F(n3);
                return n8 != 0;
            }
            this.F(8);
            return n8 != 0;
        }
        n3 = this.f;
        n7 = this.h;
        byte[] byArray = this.e;
        int n15 = 10;
        if ((n3 -= n7) >= n15) {
            for (n4 = 0; n4 < n15; ++n4) {
                int n16;
                n3 = this.h;
                this.h = n16 = n3 + 1;
                if ((n3 = byArray[n3]) >= 0) return n8 != 0;
            }
            throw InvalidProtocolBufferException.c();
        }
        while (n4 < n15) {
            n3 = this.h;
            int n17 = this.f;
            if (n3 == n17) throw InvalidProtocolBufferException.f();
            this.h = n17 = n3 + 1;
            if ((n3 = byArray[n3]) >= 0) {
                return n8 != 0;
            }
            ++n4;
        }
        throw InvalidProtocolBufferException.c();
    }

    public final int z() {
        int n3 = this.h;
        int n4 = this.f - n3;
        int n7 = 4;
        if (n4 >= n7) {
            this.h = n4 = n3 + 4;
            byte[] byArray = this.e;
            n7 = byArray[n3] & 0xFF;
            int n8 = n3 + 1;
            n8 = (byArray[n8] & 0xFF) << 8;
            n7 |= n8;
            n8 = n3 + 2;
            n8 = (byArray[n8] & 0xFF) << 16;
            return (byArray[n3 += 3] & 0xFF) << 24 | (n7 |= n8);
        }
        throw InvalidProtocolBufferException.f();
    }
}


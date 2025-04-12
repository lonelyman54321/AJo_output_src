/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.e_0;
import androidx.datastore.preferences.protobuf.p;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class e$b
extends e_0 {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = -1 >>> 1;

    public e$b(FileInputStream object) {
        this.e = object;
        object = new byte[4096];
        this.f = (byte[])object;
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    public final byte[] A(int n3) {
        if (n3 == 0) {
            return p.b;
        }
        if (n3 >= 0) {
            int n4 = this.k;
            int n7 = this.i;
            int n8 = n4 + n7 + n3;
            int n10 = this.c;
            if ((n10 = n8 - n10) <= 0) {
                n10 = this.l;
                if (n8 <= n10) {
                    n4 = this.g - n7;
                    n7 = n3 - n4;
                    n8 = 4096;
                    InputStream inputStream = this.e;
                    if (n7 >= n8 && n7 > (n8 = inputStream.available())) {
                        return null;
                    }
                    byte[] byArray = new byte[n3];
                    n8 = this.i;
                    byte[] byArray2 = this.f;
                    System.arraycopy(byArray2, n8, byArray, 0, n4);
                    n8 = this.k;
                    int n14 = this.g;
                    this.k = n8 += n14;
                    this.i = 0;
                    this.g = 0;
                    while (n4 < n3) {
                        n8 = n3 - n4;
                        if ((n8 = inputStream.read(byArray, n4, n8)) != (n14 = -1)) {
                            this.k = n14 = this.k + n8;
                            n4 += n8;
                            continue;
                        }
                        throw InvalidProtocolBufferException.f();
                    }
                    return byArray;
                }
                n10 = n10 - n4 - n7;
                this.J(n10);
                throw InvalidProtocolBufferException.f();
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            throw invalidProtocolBufferException;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final ArrayList B(int n3) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while (n3 > 0) {
            int n4;
            int n7 = Math.min(n3, 4096);
            byte[] byArray = new byte[n7];
            for (int i3 = 0; i3 < n7; i3 += n4) {
                InputStream inputStream = this.e;
                int n8 = n7 - i3;
                n4 = inputStream.read(byArray, i3, n8);
                if (n4 != (n8 = -1)) {
                    this.k = n8 = this.k + n4;
                    continue;
                }
                throw InvalidProtocolBufferException.f();
            }
            n3 -= n7;
            arrayList.add(byArray);
        }
        return arrayList;
    }

    public final int C() {
        int n3 = this.i;
        int n4 = this.g - n3;
        int n7 = 4;
        if (n4 < n7) {
            this.I(n7);
            n3 = this.i;
        }
        this.i = n4 = n3 + 4;
        byte[] byArray = this.f;
        n7 = byArray[n3] & 0xFF;
        int n8 = n3 + 1;
        n8 = (byArray[n8] & 0xFF) << 8;
        n7 |= n8;
        n8 = n3 + 2;
        n8 = (byArray[n8] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n7 |= n8);
    }

    public final long D() {
        int n3 = this.i;
        int n4 = this.g - n3;
        int n7 = 8;
        if (n4 < n7) {
            this.I(n7);
            n3 = this.i;
        }
        this.i = n4 = n3 + 8;
        byte[] byArray = this.f;
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

    /*
     * Unable to fully structure code
     */
    public final int E() {
        block9: {
            block13: {
                block12: {
                    block14: {
                        block10: {
                            block11: {
                                var2_2 = this.g;
                                var1_1 = this.i;
                                if (var2_2 == var1_1) break block10;
                                var3_3 = var1_1 + 1;
                                var4_4 = this.f;
                                var5_5 = var4_4[var1_1];
                                if (var5_5 >= 0) {
                                    this.i = var3_3;
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
                        return (int)this.G();
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
        this.i = var2_2;
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long F() {
        block13: {
            block17: {
                block18: {
                    block14: {
                        block16: {
                            block15: {
                                var2_2 = this.g;
                                var1_1 = this.i;
                                if (var2_2 == var1_1) break block14;
                                var3_3 = var1_1 + 1;
                                var4_4 = this.f;
                                var5_5 = var4_4[var1_1];
                                if (var5_5 >= 0) {
                                    this.i = var3_3;
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
                    return this.G();
                }
                var2_2 = var1_1;
            }
            var7_7 = var11_9;
        }
        this.i = var2_2;
        return var7_7;
    }

    public final long G() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.i;
            int n4 = this.g;
            if (n3 == n4) {
                n3 = 1;
                this.I(n3);
            }
            n3 = this.i;
            this.i = n4 = n3 + 1;
            byte[] byArray = this.f;
            n3 = byArray[n3];
            n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void H() {
        int n3 = this.g;
        int n4 = this.h;
        this.g = n3 += n4;
        n4 = this.k + n3;
        int n7 = this.l;
        if (n4 > n7) {
            this.h = n4 -= n7;
            this.g = n3 -= n4;
        } else {
            n3 = 0;
            this.h = 0;
        }
    }

    public final void I(int n3) {
        int n4 = this.K(n3);
        if (n4 == 0) {
            n4 = this.c;
            int n7 = this.k;
            n4 -= n7;
            n7 = this.i;
            if (n3 > (n4 -= n7)) {
                InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                throw invalidProtocolBufferException;
            }
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void J(int n3) {
        block19: {
            int n4;
            int n7;
            int n8;
            block20: {
                block18: {
                    int n10;
                    int n14;
                    block17: {
                        n14 = this.g;
                        n8 = this.i;
                        n10 = n14 - n8;
                        if (n3 > n10 || n3 < 0) break block17;
                        this.i = n8 += n3;
                        break block18;
                    }
                    Object object = this.e;
                    if (n3 < 0) break block19;
                    n7 = this.k;
                    int n15 = n7 + n8;
                    int n16 = n15 + n3;
                    n4 = this.l;
                    if (n16 > n4) break block20;
                    this.k = n15;
                    n14 -= n8;
                    n8 = 0;
                    CharSequence charSequence = null;
                    this.g = 0;
                    this.i = 0;
                    while (n14 < n3) {
                        long l2;
                        long l3;
                        long l4;
                        n8 = n3 - n14;
                        long l7 = n8;
                        try {
                            l4 = ((InputStream)object).skip(l7);
                            l3 = 0L;
                        }
                        catch (Throwable throwable) {
                            this.k = n8 = this.k + n14;
                            this.H();
                            throw throwable;
                        }
                        n8 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
                        if (n8 >= 0 && (l2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1)) <= 0) {
                            if (n8 == 0) break;
                            n8 = (int)l4;
                            n14 += n8;
                            continue;
                        }
                        charSequence = new StringBuilder();
                        object = object.getClass();
                        charSequence.append(object);
                        object = "#skip returned invalid result: ";
                        charSequence.append((String)object);
                        charSequence.append(l4);
                        object = "\nThe InputStream implementation is buggy.";
                        charSequence.append((String)object);
                        charSequence = charSequence.toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                        throw illegalStateException;
                    }
                    this.k = n8 = this.k + n14;
                    this.H();
                    if (n14 < n3) {
                        n14 = this.g;
                        n8 = this.i;
                        n8 = n14 - n8;
                        this.i = n14;
                        n14 = 1;
                        this.I(n14);
                        while ((n10 = n3 - n8) > (n7 = this.g)) {
                            n8 += n7;
                            this.i = n7;
                            this.I(n14);
                        }
                        this.i = n10;
                    }
                }
                return;
            }
            n4 = n4 - n7 - n8;
            this.J(n4);
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean K(int n3) {
        int n4 = this.i;
        int n7 = n4 + n3;
        int n8 = this.g;
        if (n7 > n8) {
            int n10 = this.c;
            n7 = this.k;
            int n14 = n10 - n7 - n4;
            if (n3 > n14) {
                return false;
            }
            n14 = this.l;
            if ((n7 = n7 + n4 + n3) > n14) {
                return false;
            }
            Object object = this.f;
            if (n4 > 0) {
                if (n8 > n4) {
                    System.arraycopy(object, n4, object, 0, n8 -= n4);
                }
                this.k = n8 = this.k + n4;
                this.g = n8 = this.g - n4;
                this.i = 0;
            }
            n4 = this.g;
            n8 = ((byte[])object).length - n4;
            InputStream inputStream = this.e;
            n14 = this.k;
            if ((n4 = inputStream.read((byte[])object, n4, n8 = Math.min(n8, n10 = n10 - n14 - n4))) != 0 && n4 >= (n8 = -1) && n4 <= (n7 = ((byte[])object).length)) {
                if (n4 > 0) {
                    this.g = n7 = this.g + n4;
                    this.H();
                    n4 = this.g;
                    n3 = n4 >= n3 ? 1 : (int)(this.K(n3) ? 1 : 0);
                    return n3 != 0;
                }
                return false;
            }
            object = new StringBuilder;
            ((StringBuilder)object)();
            Class<?> clazz = inputStream.getClass();
            ((StringBuilder)object).append(clazz);
            ((StringBuilder)object).append("#read(byte[]) returned invalid result: ");
            ((StringBuilder)object).append(n4);
            ((StringBuilder)object).append("\nThe InputStream implementation is buggy.");
            String string2 = ((StringBuilder)object).toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        String string3 = Gj0.b(n3, "refillBuffer() called when ", " bytes were already available in buffer");
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
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
        int n3 = this.k;
        int n4 = this.i;
        return n3 + n4;
    }

    public final boolean d() {
        int n3 = this.i;
        int n4 = this.g;
        if (n3 != n4 || (n4 = (int)(this.K(n3 = 1) ? 1 : 0)) != 0) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final void e(int n3) {
        this.l = n3;
        this.H();
    }

    public final int f(int n3) {
        if (n3 >= 0) {
            int n4 = this.k;
            int n7 = this.i;
            if ((n4 = n4 + n7 + n3) <= (n3 = this.l)) {
                this.l = n4;
                this.H();
                return n3;
            }
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.d();
    }

    public final boolean g() {
        long l2;
        long l3 = this.F();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    public final DF$e h() {
        Object object;
        int n3 = this.E();
        int n4 = this.g;
        int n7 = this.i;
        byte[] byArray = this.f;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            DF$e dF$e = DF.c(n7, byArray, n3);
            this.i = n7 = this.i + n3;
            return dF$e;
        }
        if (n3 == 0) {
            return DF.b;
        }
        Object object2 = this.A(n3);
        n7 = 0;
        if (object2 != null) {
            n3 = ((byte[])object2).length;
            object = DF.c(0, (byte[])object2, n3);
        } else {
            int n8;
            int n10;
            n4 = this.i;
            int n14 = this.g;
            int n15 = n14 - n4;
            this.k = n10 = this.k + n14;
            this.i = 0;
            this.g = 0;
            n14 = n3 - n15;
            ArrayList arrayList = this.B(n14);
            object = new byte[n3];
            System.arraycopy(byArray, n4, object, 0, n15);
            object2 = arrayList.iterator();
            while ((n8 = object2.hasNext()) != 0) {
                byArray = (byte[])object2.next();
                n14 = byArray.length;
                System.arraycopy(byArray, 0, object, n15, n14);
                n8 = byArray.length;
                n15 += n8;
            }
            object2 = DF.b;
            object = object2 = new DF$e((byte[])object);
        }
        return object;
    }

    public final double i() {
        return Double.longBitsToDouble(this.D());
    }

    public final int j() {
        return this.E();
    }

    public final int k() {
        return this.C();
    }

    public final long l() {
        return this.D();
    }

    public final float m() {
        return Float.intBitsToFloat(this.C());
    }

    public final int n() {
        return this.E();
    }

    public final long o() {
        return this.F();
    }

    public final int p() {
        return this.C();
    }

    public final long q() {
        return this.D();
    }

    public final int r() {
        int n3 = this.E();
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public final long s() {
        return e_0.b(this.F());
    }

    public final String t() {
        int n3;
        int n4;
        int n7 = this.E();
        Object object = this.f;
        if (n7 > 0) {
            n4 = this.g;
            n3 = this.i;
            if (n7 <= (n4 -= n3)) {
                int n8;
                Charset charset = p.a;
                String string2 = new String((byte[])object, n3, n7, charset);
                this.i = n8 = this.i + n7;
                return string2;
            }
        }
        if (n7 == 0) {
            return "";
        }
        n4 = this.g;
        if (n7 <= n4) {
            int n10;
            this.I(n7);
            n3 = this.i;
            Charset charset = p.a;
            String string3 = new String((byte[])object, n3, n7, charset);
            this.i = n10 = this.i + n7;
            return string3;
        }
        object = new String;
        byte[] byArray = this.z(n7);
        Charset charset = p.a;
        object(byArray, charset);
        return object;
    }

    public final String u() {
        int n3 = this.E();
        int n4 = this.i;
        int n7 = this.g;
        int n8 = n7 - n4;
        byte[] byArray = this.f;
        if (n3 <= n8 && n3 > 0) {
            this.i = n7 = n4 + n3;
        } else {
            if (n3 == 0) {
                return "";
            }
            n4 = 0;
            if (n3 <= n7) {
                this.I(n3);
                this.i = n3;
            } else {
                byArray = this.z(n3);
            }
        }
        return K.a.a(byArray, n4, n3);
    }

    public final int v() {
        int n3 = this.d();
        if (n3 != 0) {
            this.j = 0;
            return 0;
        }
        this.j = n3 = this.E();
        int n4 = n3 >>> 3;
        if (n4 != 0) {
            return n3;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new IOException("Protocol message contained an invalid tag (zero).");
        throw invalidProtocolBufferException;
    }

    public final int w() {
        return this.E();
    }

    public final long x() {
        return this.F();
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
                        this.J(n10);
                        return n8 != 0;
                    }
                    while ((n7 = this.v()) != 0 && (n7 = (int)(this.y(n7) ? 1 : 0)) != 0) {
                    }
                    n3 = n3 >>> n14 << n14 | n10;
                    this.a(n3);
                    return n8 != 0;
                }
                n3 = this.E();
                this.J(n3);
                return n8 != 0;
            }
            this.J(8);
            return n8 != 0;
        }
        n3 = this.g;
        n7 = this.i;
        byte[] byArray = this.f;
        int n15 = 10;
        if ((n3 -= n7) >= n15) {
            for (n4 = 0; n4 < n15; ++n4) {
                int n16;
                n3 = this.i;
                this.i = n16 = n3 + 1;
                if ((n3 = byArray[n3]) >= 0) return n8 != 0;
            }
            throw InvalidProtocolBufferException.c();
        }
        while (n4 < n15) {
            n3 = this.i;
            int n17 = this.g;
            if (n3 == n17) {
                this.I(n8);
            }
            n3 = this.i;
            this.i = n17 = n3 + 1;
            if ((n3 = byArray[n3]) >= 0) {
                return n8 != 0;
            }
            ++n4;
        }
        throw InvalidProtocolBufferException.c();
    }

    public final byte[] z(int n3) {
        int n4;
        Object object = this.A(n3);
        if (object != null) {
            return object;
        }
        int n7 = this.i;
        int n8 = this.g;
        int n10 = n8 - n7;
        this.k = n4 = this.k + n8;
        n8 = 0;
        this.i = 0;
        this.g = 0;
        n4 = n3 - n10;
        Object object2 = this.B(n4);
        byte[] byArray = new byte[n3];
        byte[] byArray2 = this.f;
        System.arraycopy(byArray2, n7, byArray, 0, n10);
        object = ((ArrayList)object2).iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (byte[])object.next();
            int n14 = ((Object)object2).length;
            System.arraycopy(object2, 0, byArray, n10, n14);
            n4 = ((Object)object2).length;
            n10 += n4;
        }
        return byArray;
    }
}


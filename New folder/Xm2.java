/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class Xm2 {
    public static final char[] d;
    public static final char[] e;
    public static final ImmutableSet f;
    public byte[] a;
    public int b;
    public int c;

    static {
        Object object = new char[]{'\r', '\n'};
        d = object;
        object = new char[]{'\n'};
        e = object;
        object = StandardCharsets.US_ASCII;
        Charset charset = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16;
        Charset charset3 = StandardCharsets.UTF_16BE;
        Charset charset4 = StandardCharsets.UTF_16LE;
        f = ImmutableSet.of(object, charset, charset2, charset3, charset4);
    }

    public Xm2() {
        byte[] byArray = gz3.f;
        this.a = byArray;
    }

    public Xm2(int n3) {
        byte[] byArray = new byte[n3];
        this.a = byArray;
        this.c = n3;
    }

    public Xm2(byte[] byArray) {
        int n3;
        this.a = byArray;
        this.c = n3 = byArray.length;
    }

    public Xm2(byte[] byArray, int n3) {
        this.a = byArray;
        this.c = n3;
    }

    public final int A() {
        int n3 = this.i();
        if (n3 >= 0) {
            return n3;
        }
        String string2 = hj0_0.a(n3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final long B() {
        long l2;
        long l3 = this.q();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l3;
        }
        String string2 = Wm2.a(l3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int C() {
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        int n7 = (byArray[n4] & 0xFF) << 8;
        this.b = n4 += 2;
        return byArray[n3] & 0xFF | n7;
    }

    public final long D() {
        NumberFormatException numberFormatException;
        long l2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        long l3;
        Object object;
        block7: {
            object = this.a;
            int n14 = this.b;
            byte by2 = object[n14];
            l3 = by2;
            n10 = 7;
            n8 = 7;
            while (true) {
                n7 = 6;
                n4 = 1;
                if (n8 < 0) break;
                n3 = n4 << n8;
                long l4 = (long)n3 & l3;
                long l7 = 0L;
                long l8 = l4 - l7;
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 == false) {
                    if (n8 < n7) {
                        l2 = n3 -= n4;
                        l3 &= l2;
                        n10 -= n8;
                    } else {
                        if (n8 != n10) break;
                        n10 = 1;
                    }
                    break block7;
                }
                n8 += -1;
            }
            n10 = 0;
            numberFormatException = null;
        }
        if (n10 != 0) {
            while (n4 < n10) {
                byte[] byArray = this.a;
                n3 = this.b + n4;
                n8 = byArray[n3];
                int n15 = 128;
                if ((n3 = n8 & 0xC0) == n15) {
                    l3 <<= n7;
                    l2 = n8 &= 0x3F;
                    l3 |= l2;
                    ++n4;
                    continue;
                }
                object = Wm2.a(l3, "Invalid UTF-8 sequence continuation byte: ");
                numberFormatException = new NumberFormatException((String)object);
                throw numberFormatException;
            }
            this.b = n8 = this.b + n10;
            return l3;
        }
        object = Wm2.a(l3, "Invalid UTF-8 sequence first byte: ");
        numberFormatException = new NumberFormatException((String)object);
        throw numberFormatException;
    }

    public final Charset E() {
        int n3;
        int n4;
        byte[] byArray;
        int n7;
        int n8;
        int n10 = this.a();
        if (n10 >= (n8 = 3) && (n7 = (byArray = this.a)[n4 = this.b]) == (n3 = -17)) {
            n7 = n4 + 1;
            n3 = -69;
            if ((n7 = byArray[n7]) == n3) {
                n7 = n4 + 2;
                n10 = byArray[n7];
                if (n10 == (n7 = -65)) {
                    this.b = n4 += n8;
                    return StandardCharsets.UTF_8;
                }
            }
        }
        if ((n10 = this.a()) >= (n8 = 2)) {
            byArray = this.a;
            n4 = this.b;
            n7 = byArray[n4];
            n3 = -1;
            int n14 = -2;
            if (n7 == n14) {
                int n15 = n4 + 1;
                if ((n15 = byArray[n15]) == n3) {
                    this.b = n4 += n8;
                    return StandardCharsets.UTF_16BE;
                }
            }
            if (n7 == n3 && (n10 = byArray[n7 = n4 + 1]) == n14) {
                this.b = n4 += n8;
                return StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public final void F(int n3) {
        byte[] byArray = this.a;
        int n4 = byArray.length;
        if (n4 < n3) {
            byArray = new byte[n3];
        }
        this.G(n3, byArray);
    }

    public final void G(int n3, byte[] byArray) {
        this.a = byArray;
        this.c = n3;
        this.b = 0;
    }

    public final void H(int n3) {
        byte[] byArray;
        int n4;
        if (n3 >= 0 && n3 <= (n4 = (byArray = this.a).length)) {
            n4 = 1;
        } else {
            n4 = 0;
            byArray = null;
        }
        ct3.a(n4 != 0);
        this.c = n3;
    }

    public final void I(int n3) {
        int n4;
        n4 = n3 >= 0 && n3 <= (n4 = this.c) ? 1 : 0;
        ct3.a(n4 != 0);
        this.b = n3;
    }

    public final void J(int n3) {
        int n4 = this.b + n3;
        this.I(n4);
    }

    public final int a() {
        int n3 = this.c;
        int n4 = this.b;
        return n3 - n4;
    }

    public final void b(int n3) {
        byte[] byArray = this.a;
        int n4 = byArray.length;
        if (n3 > n4) {
            byte[] byArray2 = Arrays.copyOf(byArray, n3);
            this.a = byArray2;
        }
    }

    public final byte[] c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final char e(Charset charset) {
        boolean bl2 = f.contains(charset);
        CharSequence charSequence = new StringBuilder("Unsupported charset: ");
        charSequence.append(charset);
        charSequence = charSequence.toString();
        ct3.b(bl2, (String)charSequence);
        return (char)(this.f(charset) >> 16);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int f(Charset object) {
        void var7_12;
        int n3;
        void var7_18;
        Charset charset = StandardCharsets.UTF_8;
        int n4 = ((Charset)object).equals(charset);
        int n7 = 1;
        if ((n4 != 0 || (n4 = (int)(((Charset)object).equals(charset = StandardCharsets.US_ASCII) ? 1 : 0)) != 0) && (n4 = this.a()) >= n7) {
            object = this.a;
            n4 = this.b;
            long l2 = UnsignedBytes.toInt((byte)object[n4]);
            byte by2 = (byte)Chars.checkedCast(l2);
            return (Chars.checkedCast((long)var7_18) << 16) + n3;
        }
        charset = StandardCharsets.UTF_16;
        n4 = (int)(((Charset)object).equals(charset) ? 1 : 0);
        int n8 = 2;
        if ((n4 != 0 || (n4 = (int)(((Charset)object).equals(charset = StandardCharsets.UTF_16BE) ? 1 : 0)) != 0) && (n4 = this.a()) >= n8) {
            object = this.a;
            n4 = this.b;
            Object object2 = object[n4];
            Object object3 = object[n4 += n7];
            char c2 = Chars.fromBytes((byte)object2, (byte)object3);
        } else {
            charset = StandardCharsets.UTF_16LE;
            boolean bl2 = ((Charset)object).equals(charset);
            if (!bl2) return 0;
            int n10 = this.a();
            if (n10 < n8) return 0;
            object = this.a;
            n4 = this.b;
            int n14 = n4 + 1;
            Object object4 = object[n14];
            Object object5 = object[n4];
            char c3 = Chars.fromBytes((byte)object4, (byte)object5);
        }
        byte by4 = (byte)var7_12;
        n3 = 2;
        return (Chars.checkedCast((long)var7_18) << 16) + n3;
    }

    public final void g(int n3, byte[] byArray, int n4) {
        byte[] byArray2 = this.a;
        int n7 = this.b;
        System.arraycopy(byArray2, n7, byArray, n3, n4);
        this.b = n3 = this.b + n4;
    }

    public final char h(Charset charset, char[] cArray) {
        char c2;
        int n3;
        int n4 = this.f(charset);
        if (n4 != 0 && (n3 = Chars.contains(cArray, c2 = (char)(n4 >> 16))) != 0) {
            n3 = this.b;
            this.b = n3 += (n4 &= (char)-1);
            return c2;
        }
        return '\u0000';
    }

    public final int i() {
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        int n8 = (byArray[n7] & 0xFF) << 24;
        this.b = n3 = n7 + 2;
        n4 = (byArray[n4] & 0xFF) << 16 | n8;
        this.b = n8 = n7 + 3;
        n3 = (byArray[n3] & 0xFF) << 8;
        this.b = n7 += 4;
        return byArray[n8] & 0xFF | (n4 |= n3);
    }

    /*
     * WARNING - void declaration
     */
    public final String j(Charset object) {
        int n3;
        Object object2;
        Object object3;
        int n7;
        block13: {
            Object object4;
            boolean bl2;
            boolean bl3;
            n7 = 1;
            object3 = f;
            boolean n4 = ((ImmutableCollection)object3).contains(object);
            Object object5 = "Unsupported charset: ";
            Object object6 = new StringBuilder((String)object5);
            ((StringBuilder)object6).append(object);
            object6 = ((StringBuilder)object6).toString();
            ct3.b(n4, (String)object6);
            int n8 = this.a();
            if (n8 == 0) {
                return null;
            }
            object3 = StandardCharsets.US_ASCII;
            boolean bl4 = ((Charset)object).equals(object3);
            if (!bl4) {
                this.E();
            }
            if (!(bl3 = ((Charset)object).equals(object6 = StandardCharsets.UTF_8)) && !(bl2 = ((Charset)object).equals(object3))) {
                boolean bl5;
                boolean bl6;
                object3 = StandardCharsets.UTF_16;
                boolean bl7 = ((Charset)object).equals(object3);
                if (!(bl7 || (bl6 = ((Charset)object).equals(object3 = StandardCharsets.UTF_16LE)) || (bl5 = ((Charset)object).equals(object3 = StandardCharsets.UTF_16BE)))) {
                    object3 = new StringBuilder((String)object5);
                    ((StringBuilder)object3).append(object);
                    object = ((StringBuilder)object3).toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
                int n10 = 2;
            } else {
                boolean bl8 = true;
            }
            int n14 = this.b;
            while (true) {
                Object object7;
                void var7_20;
                void var4_12;
                object4 = this.c;
                int n15 = var4_12 + -1;
                n15 = object4 - n15;
                object2 = 13;
                if (var7_20 >= n15) break;
                object5 = StandardCharsets.UTF_8;
                object4 = ((Charset)object).equals(object5);
                n15 = 10;
                if (object4 != 0 || (object4 = (Object)((Charset)object).equals(object5 = StandardCharsets.US_ASCII)) != 0) {
                    object5 = this.a;
                    object4 = object5[var7_20];
                    object7 = gz3.a;
                    if (object4 == n15 || object4 == object2) break block13;
                }
                if (((object4 = (Object)((Charset)object).equals(object5 = StandardCharsets.UTF_16)) != 0 || (object4 = (Object)((Charset)object).equals(object5 = StandardCharsets.UTF_16BE)) != 0) && (object7 = (Object)(object5 = (Object)this.a)[var7_20]) == 0) {
                    object7 = var7_20 + true;
                    object4 = object5[object7];
                    object7 = gz3.a;
                    if (object4 == n15 || object4 == object2) break block13;
                }
                if ((object4 = (Object)((Charset)object).equals(object5 = StandardCharsets.UTF_16LE)) != 0) {
                    object5 = this.a;
                    object7 = var7_20 + true;
                    if ((object7 = (Object)object5[object7]) == 0) {
                        object4 = object5[var7_20];
                        object7 = gz3.a;
                        if (object4 == n15 || object4 == object2) break block13;
                    }
                }
                var7_20 += var4_12;
            }
            n3 = object4;
        }
        n7 = this.b;
        int n16 = n3 - n7;
        String string2 = this.u(n16, (Charset)object);
        int n17 = this.b;
        int n18 = this.c;
        if (n17 == n18) {
            return string2;
        }
        object3 = d;
        char c2 = this.h((Charset)object, (char[])object3);
        if (c2 == object2) {
            object3 = e;
            this.h((Charset)object, (char[])object3);
        }
        return string2;
    }

    public final int k() {
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        int n8 = byArray[n7] & 0xFF;
        this.b = n3 = n7 + 2;
        n4 = (byArray[n4] & 0xFF) << 8 | n8;
        this.b = n8 = n7 + 3;
        n3 = (byArray[n3] & 0xFF) << 16;
        this.b = n7 += 4;
        return (byArray[n8] & 0xFF) << 24 | (n4 |= n3);
    }

    public final long l() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.a;
        int n8 = this.b;
        this.b = n7 = n8 + 1;
        long l2 = byArray[n8];
        long l3 = 255L;
        l2 &= l3;
        this.b = n4 = n8 + 2;
        long l4 = (long)byArray[n7] & l3;
        n7 = 8;
        l2 |= (l4 <<= n7);
        this.b = n3 = n8 + 3;
        long l7 = ((long)byArray[n4] & l3) << 16;
        l2 |= l7;
        this.b = n4 = n8 + 4;
        l4 = ((long)byArray[n3] & l3) << 24;
        l2 |= l4;
        this.b = n3 = n8 + 5;
        l7 = ((long)byArray[n4] & l3) << 32;
        l2 |= l7;
        this.b = n4 = n8 + 6;
        l4 = ((long)byArray[n3] & l3) << 40;
        l2 |= l4;
        this.b = n3 = n8 + 7;
        l7 = ((long)byArray[n4] & l3) << 48;
        this.b = n8 += n7;
        return ((long)byArray[n3] & l3) << 56 | (l2 |= l7);
    }

    public final short m() {
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.b = n4 += 2;
        return (short)((byArray[n3] & 0xFF) << 8 | n7);
    }

    public final long n() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.a;
        int n8 = this.b;
        this.b = n7 = n8 + 1;
        long l2 = byArray[n8];
        long l3 = 255L;
        this.b = n4 = n8 + 2;
        long l4 = ((long)byArray[n7] & l3) << 8;
        long l7 = (l2 &= l3) | l4;
        this.b = n3 = n8 + 3;
        long l8 = ((long)byArray[n4] & l3) << 16;
        this.b = n8 += 4;
        return ((long)byArray[n3] & l3) << 24 | (l7 |= l8);
    }

    public final int o() {
        int n3 = this.k();
        if (n3 >= 0) {
            return n3;
        }
        String string2 = hj0_0.a(n3, "Top bit not zero: ");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final int p() {
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        int n7 = byArray[n4] & 0xFF;
        this.b = n4 += 2;
        return (byArray[n3] & 0xFF) << 8 | n7;
    }

    public final long q() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.a;
        int n8 = this.b;
        this.b = n7 = n8 + 1;
        long l2 = byArray[n8];
        long l3 = 255L;
        l2 = (l2 & l3) << 56;
        this.b = n4 = n8 + 2;
        long l4 = ((long)byArray[n7] & l3) << 48;
        long l7 = l2 | l4;
        this.b = n3 = n8 + 3;
        long l8 = ((long)byArray[n4] & l3) << 40;
        l7 |= l8;
        this.b = n4 = n8 + 4;
        l4 = ((long)byArray[n3] & l3) << 32;
        l7 |= l4;
        this.b = n3 = n8 + 5;
        l8 = ((long)byArray[n4] & l3) << 24;
        l7 |= l8;
        this.b = n4 = n8 + 6;
        l4 = ((long)byArray[n3] & l3) << 16;
        l7 |= l4;
        this.b = n3 = n8 + 7;
        l8 = (long)byArray[n4] & l3;
        int n10 = 8;
        this.b = n8 += n10;
        return (long)byArray[n3] & l3 | (l7 |= (l8 <<= n10));
    }

    public final String r() {
        String string2;
        int n3 = this.a();
        if (n3 == 0) {
            n3 = 0;
            string2 = null;
        } else {
            byte[] byArray;
            int n4;
            for (n3 = this.b; n3 < (n4 = this.c) && (n4 = (byArray = this.a)[n3]) != 0; ++n3) {
            }
            byArray = this.a;
            int n7 = this.b;
            int n8 = n3 - n7;
            Charset charset = StandardCharsets.UTF_8;
            String string3 = new String(byArray, n7, n8, charset);
            this.b = n3;
            n4 = this.c;
            if (n3 < n4) {
                this.b = ++n3;
            }
            string2 = string3;
        }
        return string2;
    }

    public final String s(int n3) {
        byte[] byArray;
        if (n3 == 0) {
            return "";
        }
        int n4 = this.b;
        int n7 = n4 + n3 + -1;
        int n8 = this.c;
        n7 = n7 < n8 && (n7 = (byArray = this.a)[n7]) == 0 ? n3 + -1 : n3;
        byArray = this.a;
        Charset charset = StandardCharsets.UTF_8;
        String string2 = new String(byArray, n4, n7, charset);
        this.b = n4 = this.b + n3;
        return string2;
    }

    public final short t() {
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        int n7 = (byArray[n4] & 0xFF) << 8;
        this.b = n4 += 2;
        return (short)(byArray[n3] & 0xFF | n7);
    }

    public final String u(int n3, Charset charset) {
        int n4;
        byte[] byArray = this.a;
        int n7 = this.b;
        String string2 = new String(byArray, n7, n3, charset);
        this.b = n4 = this.b + n3;
        return string2;
    }

    public final int v() {
        int n3 = this.w();
        int n4 = this.w();
        int n7 = this.w();
        int n8 = this.w();
        n3 <<= 21;
        n4 = n7 << 7;
        return (n3 |= (n4 <<= 14)) | n4 | n8;
    }

    public final int w() {
        int n3;
        byte[] byArray = this.a;
        int n4 = this.b;
        this.b = n3 = n4 + 1;
        return byArray[n4] & 0xFF;
    }

    public final int x() {
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        int n8 = (byArray[n7] & 0xFF) << 8;
        this.b = n3 = n7 + 2;
        int n10 = byArray[n4] & 0xFF | n8;
        this.b = n7 += 4;
        return n10;
    }

    public final long y() {
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.a;
        int n8 = this.b;
        this.b = n7 = n8 + 1;
        long l2 = byArray[n8];
        long l3 = 255L;
        l2 = (l2 & l3) << 24;
        this.b = n4 = n8 + 2;
        long l4 = ((long)byArray[n7] & l3) << 16;
        long l7 = l2 | l4;
        this.b = n3 = n8 + 3;
        long l8 = ((long)byArray[n4] & l3) << 8;
        this.b = n8 += 4;
        return (long)byArray[n3] & l3 | (l7 |= l8);
    }

    public final int z() {
        int n3;
        int n4;
        byte[] byArray = this.a;
        int n7 = this.b;
        this.b = n4 = n7 + 1;
        int n8 = (byArray[n7] & 0xFF) << 16;
        this.b = n3 = n7 + 2;
        n4 = (byArray[n4] & 0xFF) << 8 | n8;
        this.b = n7 += 3;
        return byArray[n3] & 0xFF | n4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.b;
import okio.a;

/*
 * Renamed from cE
 */
public final class ce_2
implements se_1,
re_2,
Cloneable,
ByteChannel {
    public vx2_2 a;
    public long b;

    public final void A(byte[] object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "sink");
        for (int i3 = 0; i3 < (n3 = ((byte[])object).length); i3 += n3) {
            int n4;
            n3 = ((byte[])object).length - i3;
            if ((n3 = this.read((byte[])object, i3, n3)) != (n4 = -1)) {
                continue;
            }
            object = new EOFException;
            object();
            throw object;
        }
    }

    public final long C() {
        long l2 = this.b;
        long l3 = 8;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            vx2_2 vx2_22 = this.a;
            Intrinsics.checkNotNull(vx2_22);
            int n3 = vx2_22.b;
            object = vx2_22.c;
            long l7 = object - n3;
            long l8 = l7;
            int n4 = 32;
            long l12 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
            if (l12 < 0) {
                int n7 = this.readInt();
                l2 = n7;
                l3 = 0xFFFFFFFFL;
                l2 = (l2 & l3) << n4;
                object = this.readInt();
                long l14 = object;
                l2 |= (l3 &= l14);
            } else {
                l7 = n3 + 1;
                byte[] byArray = vx2_22.a;
                l12 = byArray[n3];
                long l15 = l12;
                long l16 = 255L;
                l15 = (l15 & l16) << 56;
                int n8 = n3 + 2;
                long l17 = ((long)byArray[l7] & l16) << 48;
                l15 |= l17;
                l7 = n3 + 3;
                long l18 = (long)byArray[n8] & l16;
                int n10 = 40;
                n8 = n3 + 4;
                l17 = ((long)byArray[l7] & l16) << n4;
                long l19 = (l15 |= (l18 <<= n10)) | l17;
                l7 = n3 + 5;
                l18 = ((long)byArray[n8] & l16) << 24;
                l19 |= l18;
                int n14 = n3 + 6;
                l18 = ((long)byArray[l7] & l16) << 16;
                l19 |= l18;
                l7 = n3 + 7;
                l18 = (long)byArray[n14] & l16;
                n14 = 8;
                l7 = byArray[l7];
                l8 = (long)l7 & l16 | (l19 |= (l18 <<= n14));
                this.b = l19 = this.b - l3;
                if ((n3 += n14) == object) {
                    vx2_2 vx2_23;
                    this.a = vx2_23 = vx2_22.a();
                    ax2_2.a(vx2_22);
                } else {
                    vx2_22.b = n3;
                }
                l2 = l8;
            }
            return l2;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final long E(ff_2 ff_22) {
        Intrinsics.checkNotNullParameter(ff_22, "targetBytes");
        return this.u(0L, ff_22);
    }

    public final void F0(String object, int n3, int n4, Charset charset) {
        Intrinsics.checkNotNullParameter(object, "string");
        Object object2 = "charset";
        Intrinsics.checkNotNullParameter(charset, (String)object2);
        if (n3 >= 0) {
            if (n4 >= n3) {
                int n7 = ((String)object).length();
                if (n4 <= n7) {
                    object2 = Charsets.UTF_8;
                    n7 = (int)(Intrinsics.areEqual(charset, object2) ? 1 : 0);
                    if (n7 != 0) {
                        this.G0(n3, n4, (String)object);
                        return;
                    }
                    object = ((String)object).substring(n3, n4);
                    Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    object = ((String)object).getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
                    n3 = ((Object)object).length;
                    this.R((byte[])object, 0, n3);
                    return;
                }
                Serializable serializable = wk0_0.a(n4, "endIndex > string.length: ", " > ");
                int n8 = ((String)object).length();
                serializable.append(n8);
                object = serializable.toString();
                object = object.toString();
                serializable = new IllegalArgumentException((String)object);
                throw serializable;
            }
            object = D70.b(n4, n3, "endIndex < beginIndex: ", " < ");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = hj0_0.a(n3, "beginIndex < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final short G() {
        short s7 = this.readShort();
        int n3 = l_0.a;
        n3 = (0xFF00 & s7) >>> 8;
        return (short)((s7 & 0xFF) << 8 | n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void G0(int n3, int n4, String string2) {
        String string3 = "string";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (n3 < 0) {
            String string4 = hj0_0.a(n3, "beginIndex < 0: ");
            string4 = string4.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
            throw illegalArgumentException;
        }
        if (n4 < n3) {
            String string5 = D70.b(n4, n3, "endIndex < beginIndex: ", " < ");
            string5 = string5.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string5);
            throw illegalArgumentException;
        }
        int n7 = string2.length();
        if (n4 > n7) {
            CharSequence charSequence = wk0_0.a(n4, "endIndex > string.length: ", " > ");
            n4 = string2.length();
            ((StringBuilder)charSequence).append(n4);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = ((Object)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
            throw illegalArgumentException;
        }
        while (n3 < n4) {
            long l2;
            long l3;
            byte[] byArray;
            int n8;
            int n10;
            int n14;
            int n15;
            int n16;
            n7 = string2.charAt(n3);
            if (n7 < (n16 = 128)) {
                n15 = 1;
                vx2_2 vx2_22 = this.O(n15);
                n14 = vx2_22.c - n3;
                n10 = 8192 - n14;
                n10 = Math.min(n4, n10);
                n8 = n3 + 1;
                n7 = (byte)n7;
                byArray = vx2_22.a;
                byArray[n3 += n14] = n7;
                while (true) {
                    n3 = ++n8;
                    if (n8 >= n10 || (n7 = (int)string2.charAt(n8)) >= n16) break;
                    byArray[n3 += n14] = n7 = (int)((byte)n7);
                }
                n14 += n3;
                n7 = vx2_22.c;
                n14 -= n7;
                vx2_22.c = n7 += n14;
                l3 = this.b;
                l2 = n14;
                this.b = l3 += l2;
                continue;
            }
            n15 = 2048;
            if (n7 < n15) {
                n15 = 2;
                vx2_2 vx2_23 = this.O(n15);
                n10 = vx2_23.c;
                n8 = n7 >> 6 | 0xC0;
                byArray = vx2_23.a;
                byArray[n10] = n8;
                n8 = n10 + 1;
                byArray[n8] = n7 = (int)((byte)(n7 & 0x3F | n16));
                vx2_23.c = n10 += n15;
                l3 = this.b;
                l2 = 2;
                this.b = l3 += l2;
            } else {
                int n17;
                byte[] byArray2;
                int n18;
                vx2_2 vx2_24;
                n15 = 55296;
                n14 = 63;
                if (n7 >= n15 && n7 <= (n15 = 57343)) {
                    n15 = n3 + 1;
                    if (n15 < n4) {
                        n10 = string2.charAt(n15);
                    } else {
                        n10 = 0;
                        vx2_24 = null;
                    }
                    n8 = 56319;
                    if (n7 <= n8 && (n8 = 56320) <= n10 && n10 < (n8 = 57344)) {
                        n7 = (n7 & 0x3FF) << 10;
                        n15 = n10 & 0x3FF;
                        n7 = (n7 | n15) + 65536;
                        n15 = 4;
                        vx2_24 = this.O(n15);
                        n8 = vx2_24.c;
                        n18 = (byte)(n7 >> 18 | 0xF0);
                        byArray2 = vx2_24.a;
                        byArray2[n8] = n18;
                        n18 = n8 + 1;
                        byArray2[n18] = n17 = (int)((byte)(n7 >> 12 & n14 | n16));
                        n18 = n8 + 2;
                        byArray2[n18] = n17 = (int)((byte)(n7 >> 6 & n14 | n16));
                        n18 = n8 + 3;
                        byArray2[n18] = n7 = (int)((byte)(n7 & n14 | n16));
                        vx2_24.c = n8 += n15;
                        l3 = this.b;
                        l2 = 4;
                        this.b = l3 += l2;
                        n3 += 2;
                        continue;
                    }
                    this.U(n14);
                    n3 = n15;
                    continue;
                }
                n15 = 3;
                vx2_24 = this.O(n15);
                n8 = vx2_24.c;
                n18 = n7 >> 12 | 0xE0;
                byArray2 = vx2_24.a;
                byArray2[n8] = n18;
                n18 = n8 + 1;
                n17 = n7 >> 6;
                byArray2[n18] = n14 = (int)((byte)(n14 & n17 | n16));
                n14 = n8 + 2;
                byArray2[n14] = n7 = (int)((byte)(n7 & 0x3F | n16));
                vx2_24.c = n8 += n15;
                l3 = this.b;
                l2 = 3;
                this.b = l3 += l2;
            }
            ++n3;
        }
        return;
    }

    public final String H(long l2, Charset charset) {
        long l3;
        Object object;
        Object object2 = "charset";
        Intrinsics.checkNotNullParameter(charset, (String)object2);
        long l4 = 0L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 >= 0 && (object = (l3 = l2 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            l4 = this.b;
            long l8 = l4 - l2;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object >= 0) {
                long l12;
                int n3;
                if (l7 == false) {
                    return "";
                }
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                int n4 = ((vx2_2)object2).b;
                long l14 = (long)n4 + l2;
                int n7 = ((vx2_2)object2).c;
                long l15 = n7;
                long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
                if (l16 > 0) {
                    byte[] byArray = this.w(l2);
                    object2 = new String(byArray, charset);
                    return object2;
                }
                object = (int)l2;
                byte[] byArray = ((vx2_2)object2).a;
                String string2 = new String(byArray, n4, (int)object, charset);
                ((vx2_2)object2).b = n3 = ((vx2_2)object2).b + object;
                this.b = l12 = this.b - l2;
                int n8 = ((vx2_2)object2).c;
                if (n3 == n8) {
                    vx2_2 vx2_22;
                    this.a = vx2_22 = ((vx2_2)object2).a();
                    ax2_2.a((vx2_2)object2);
                }
                return string2;
            }
            EOFException eOFException = new EOFException();
            throw eOFException;
        }
        String string3 = Wm2.a(l2, "byteCount: ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final long H0() {
        block8: {
            vx2_2 vx2_22;
            long l2 = this.b;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) break block8;
            int n3 = 0;
            Object object2 = null;
            long l7 = l3;
            boolean bl2 = false;
            Object object3 = null;
            do {
                vx2_22 = this.a;
                Intrinsics.checkNotNull(vx2_22);
                Object object4 = vx2_22.a;
                int n4 = vx2_22.b;
                int n7 = vx2_22.c;
                while (n4 < n7) {
                    int n8;
                    block12: {
                        int n10;
                        block10: {
                            block11: {
                                block9: {
                                    n8 = object4[n4];
                                    n10 = 48;
                                    if (n8 < n10 || n8 > (n10 = 57)) break block9;
                                    n10 = n8 + -48;
                                    break block10;
                                }
                                n10 = 97;
                                if (n8 < n10 || n8 > (n10 = 102)) break block11;
                                n10 = n8 + -87;
                                break block10;
                            }
                            n10 = 65;
                            if (n8 < n10 || n8 > (n10 = 70)) break block12;
                            n10 = n8 + -55;
                        }
                        long l8 = 0xF000000000000000L & l7;
                        long l12 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
                        if (l12 == false) {
                            n8 = 4;
                            l7 <<= n8;
                            long l14 = n10;
                            l7 |= l14;
                            ++n4;
                            ++n3;
                            continue;
                        }
                        object2 = new ce_2();
                        ((ce_2)object2).l0(l7);
                        ((ce_2)object2).U(n8);
                        object2 = ((ce_2)object2).I();
                        object2 = "Number too large: ".concat((String)object2);
                        object3 = new NumberFormatException((String)object2);
                        throw object3;
                    }
                    if (n3 != 0) {
                        bl2 = true;
                        break;
                    }
                    object3 = l_0.d((byte)n8);
                    object3 = "Expected leading [0-9a-fA-F] character but was 0x".concat((String)object3);
                    object2 = new NumberFormatException((String)object3);
                    throw object2;
                }
                if (n4 == n7) {
                    object4 = vx2_22.a();
                    this.a = object4;
                    ax2_2.a(vx2_22);
                    continue;
                }
                vx2_22.b = n4;
            } while (!bl2 && (vx2_22 = this.a) != null);
            long l15 = this.b;
            long l16 = n3;
            this.b = l15 -= l16;
            return l7;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final String I() {
        long l2 = this.b;
        Charset charset = Charsets.UTF_8;
        return this.H(l2, charset);
    }

    public final void I0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        int n3 = string2.length();
        this.G0(0, n3, string2);
    }

    public final void J0(int n3) {
        String string2;
        int n4;
        int n7;
        Object object;
        int n8;
        Object object2;
        block11: {
            block7: {
                int n10;
                int n14;
                int n15;
                vx2_2 vx2_22;
                ce_2 ce_22;
                block10: {
                    int n16;
                    block9: {
                        block8: {
                            int n17;
                            block6: {
                                ce_22 = this;
                                object2 = n3;
                                vx2_22 = null;
                                n8 = 8;
                                object = 4;
                                n16 = 3;
                                n15 = 6;
                                n17 = 2;
                                n7 = 1;
                                n14 = 128;
                                if (n3 >= n14) break block6;
                                this.U(n3);
                                break block7;
                            }
                            n10 = 2048;
                            n4 = 63;
                            if (n3 >= n10) break block8;
                            vx2_22 = this.O(n17);
                            n8 = vx2_22.c;
                            object = (byte)(n3 >> 6 | 0xC0);
                            byte[] byArray = vx2_22.a;
                            byArray[n8] = object;
                            byArray[n7 += n8] = object2 = (Object)((byte)(n3 & n4 | n14));
                            vx2_22.c = n8 += n17;
                            long l2 = this.b;
                            long l3 = 2;
                            this.b = l2 += l3;
                            break block7;
                        }
                        n10 = 55296;
                        if (n10 > n3 || n3 >= (n10 = 57344)) break block9;
                        this.U(n4);
                        break block7;
                    }
                    n10 = 65536;
                    if (object2 >= n10) break block10;
                    vx2_22 = ce_22.O(n16);
                    n8 = vx2_22.c;
                    object = (byte)(object2 >> 12 | 0xE0);
                    byte[] byArray = vx2_22.a;
                    byArray[n8] = object;
                    byArray[n7 += n8] = object = (Object)((byte)(object2 >> 6 & n4 | n14));
                    byArray[n17 += n8] = object2 = (Object)((byte)(object2 & n4 | n14));
                    vx2_22.c = n8 += n16;
                    long l4 = ce_22.b;
                    long l7 = 3;
                    ce_22.b = l4 += l7;
                    break block7;
                }
                n10 = 0x10FFFF;
                if (object2 > n10) break block11;
                vx2_22 = ce_22.O((int)object);
                n8 = vx2_22.c;
                n10 = (byte)(object2 >> 18 | 0xF0);
                byte[] byArray = vx2_22.a;
                byArray[n8] = n10;
                byArray[n7 += n8] = n10 = (int)((byte)(object2 >> 12 & n4 | n14));
                byArray[n17 += n8] = n15 = (int)((byte)(object2 >> 6 & n4 | n14));
                byArray[n16 += n8] = object2 = (Object)((byte)(object2 & n4 | n14));
                vx2_22.c = n8 += object;
                long l8 = ce_22.b;
                long l12 = 4;
                ce_22.b = l8 += l12;
            }
            return;
        }
        Object object3 = "Unexpected code point: 0x";
        StringBuilder stringBuilder = new StringBuilder((String)object3);
        n4 = l_0.a;
        if (object2 != 0) {
            int n18;
            object3 = d_0.a;
            Object object4 = object2 >> 28 & 0xF;
            object4 = object3[object4];
            Object object5 = object2 >> 24 & 0xF;
            object5 = object3[object5];
            Object object6 = object2 >> 20 & 0xF;
            object6 = object3[object6];
            Object object7 = object2 >> 16 & 0xF;
            object7 = object3[object7];
            Object object8 = object2 >> 12 & 0xF;
            object8 = object3[object8];
            Object object9 = object2 >> 8 & 0xF;
            object9 = object3[object9];
            Object object10 = object2 >> 4 & 0xF;
            object10 = object3[object10];
            object2 &= 0xF;
            object2 = object3[object2];
            object3 = new char[n8];
            object3[0] = object4;
            object3[n7] = object5;
            object3[n17] = object6;
            object3[n16] = object7;
            object3[object] = object8;
            object3[5] = object9;
            object3[n15] = object10;
            object = 7;
            object3[object] = object2;
            for (n18 = 0; n18 < n8 && (object2 = (Object)object3[n18]) == (object = 48); n18 += n7) {
            }
            string2 = kotlin.text.b.g((char[])object3, n18, n8);
        } else {
            string2 = "0";
        }
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int K() {
        block5: {
            int n3;
            long l2;
            block10: {
                int n4;
                int n7;
                int n8;
                int n10;
                int n14;
                int n15;
                block7: {
                    block9: {
                        block8: {
                            block6: {
                                l2 = this.b;
                                long l3 = 0L;
                                long l4 = l2 - l3;
                                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (object == false) break block5;
                                n15 = this.n(l3);
                                n14 = n15 & 0x80;
                                n10 = 1;
                                n8 = 128;
                                char c2 = (char)-3;
                                if (n14 != 0) break block6;
                                n14 = n15 & 0x7F;
                                n7 = 1;
                                n4 = 0;
                                break block7;
                            }
                            n14 = n15 & 0xE0;
                            n7 = 192;
                            if (n14 != n7) break block8;
                            n14 = n15 & 0x1F;
                            n7 = 2;
                            n4 = 128;
                            break block7;
                        }
                        n14 = n15 & 0xF0;
                        n7 = 224;
                        if (n14 != n7) break block9;
                        n14 = n15 & 0xF;
                        n7 = 3;
                        n4 = 2048;
                        break block7;
                    }
                    n14 = n15 & 0xF8;
                    n7 = 240;
                    if (n14 != n7) break block10;
                    n14 = n15 & 7;
                    n7 = 4;
                    n4 = 65536;
                }
                long l7 = this.b;
                long l8 = n7;
                long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                if (l12 >= 0) {
                    while (n10 < n7) {
                        l7 = n10;
                        n15 = this.n(l7);
                        l12 = n15 & 0xC0;
                        if (l12 == n8) {
                            n14 <<= 6;
                            n14 |= (n15 &= 0x3F);
                            ++n10;
                            continue;
                        }
                        this.skip(l7);
                        return n3;
                    }
                    this.skip(l8);
                    n15 = 0x10FFFF;
                    if (n14 > n15 || (n15 = 55296) <= n14 && n14 < (n15 = 57344)) return n3;
                    if (n14 >= n4) return n14;
                    return n3;
                }
                StringBuilder stringBuilder = wk0_0.a(n7, "size < ", ": ");
                long l14 = this.b;
                stringBuilder.append(l14);
                stringBuilder.append(" (to read code point prefixed 0x");
                String string2 = l_0.d((byte)n15);
                stringBuilder.append(string2);
                stringBuilder.append(')');
                string2 = stringBuilder.toString();
                EOFException eOFException = new EOFException(string2);
                throw eOFException;
            }
            l2 = 1L;
            this.skip(l2);
            return n3;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final String L() {
        return this.x(Long.MAX_VALUE);
    }

    public final ff_2 M(int n3) {
        ff_2 ff_22;
        if (n3 == 0) {
            ff_22 = ff_2.d;
        } else {
            int n4;
            long l2 = this.b;
            long l3 = 0L;
            long l4 = n3;
            l_0.b(l2, l3, l4);
            Object object = this.a;
            int n7 = 0;
            int n8 = 0;
            int[] nArray = null;
            int n10 = 0;
            while (n8 < n3) {
                Intrinsics.checkNotNull(object);
                n4 = ((vx2_2)object).c;
                int n14 = ((vx2_2)object).b;
                if (n4 != n14) {
                    n8 += (n4 -= n14);
                    ++n10;
                    object = ((vx2_2)object).f;
                    continue;
                }
                AssertionError assertionError = new AssertionError((Object)"s.limit == s.pos");
                throw assertionError;
            }
            object = new byte[n10][];
            n8 = n10 * 2;
            nArray = new int[n8];
            vx2_2 vx2_22 = this.a;
            n4 = 0;
            while (n7 < n3) {
                Intrinsics.checkNotNull(vx2_22);
                byte[] byArray = vx2_22.a;
                object[n4] = byArray;
                int n15 = vx2_22.c;
                int n16 = vx2_22.b;
                nArray[n4] = n15 = Math.min(n7 += (n15 -= n16), n3);
                n15 = n4 + n10;
                nArray[n15] = n16 = vx2_22.b;
                n15 = 1;
                vx2_22.d = n15;
                n4 += n15;
                vx2_22 = vx2_22.f;
            }
            ff_22 = new cx2_2((byte[][])object, nArray);
        }
        return ff_22;
    }

    public final vx2_2 O(int n3) {
        int n4 = 1;
        if (n3 >= n4 && n3 <= (n4 = 8192)) {
            vx2_2 vx2_22;
            vx2_2 vx2_23 = this.a;
            if (vx2_23 == null) {
                this.a = vx2_22 = ax2_2.b();
                vx2_22.g = vx2_22;
                vx2_22.f = vx2_22;
            } else {
                Intrinsics.checkNotNull(vx2_23);
                vx2_23 = vx2_23.g;
                Intrinsics.checkNotNull(vx2_23);
                int n7 = vx2_23.c + n3;
                if (n7 <= n4 && (n3 = (int)(vx2_23.e ? 1 : 0)) != 0) {
                    vx2_22 = vx2_23;
                } else {
                    vx2_22 = ax2_2.b();
                    vx2_23.b(vx2_22);
                }
            }
            return vx2_22;
        }
        String string2 = "unexpected capacity".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void P(ff_2 ff_22) {
        Intrinsics.checkNotNullParameter(ff_22, "byteString");
        int n3 = ff_22.d();
        ff_22.r(this, n3);
    }

    public final void Q(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "source");
        int n3 = byArray.length;
        this.R(byArray, 0, n3);
    }

    public final void R(byte[] byArray, int n3, int n4) {
        long l2;
        Object object = "source";
        Intrinsics.checkNotNullParameter(byArray, (String)object);
        int n7 = byArray.length;
        long l3 = n7;
        long l4 = n3;
        long l7 = n4;
        l_0.b(l3, l4, l7);
        n4 += n3;
        while (n3 < n4) {
            n7 = 1;
            object = this.O(n7);
            int n8 = n4 - n3;
            int n10 = ((vx2_2)object).c;
            n10 = 8192 - n10;
            n8 = Math.min(n8, n10);
            n10 = ((vx2_2)object).c;
            int n14 = n3 + n8;
            byte[] byArray2 = ((vx2_2)object).a;
            rp_1.g(byArray, n10, byArray2, n3, n14);
            ((vx2_2)object).c = n3 = ((vx2_2)object).c + n8;
            n3 = n14;
        }
        this.b = l2 = this.b + l7;
    }

    public final long T() {
        long l2 = this.C();
        long l3 = 0xFF00000000000000L & l2;
        int n3 = 56;
        l3 >>>= n3;
        long l4 = 0xFF000000000000L & l2;
        int n4 = 40;
        l3 |= (l4 >>>= n4);
        l4 = 0xFF0000000000L & l2;
        int n7 = 24;
        l3 |= (l4 >>>= n7);
        l4 = 0xFF00000000L & l2;
        int n8 = 8;
        l3 |= (l4 >>>= n8);
        l4 = (0xFF000000L & l2) << n8;
        l3 |= l4;
        l4 = (0xFF0000L & l2) << n7;
        l3 |= l4;
        l4 = (0xFF00L & l2) << n4;
        return (l2 & 0xFFL) << n3 | (l3 |= l4);
    }

    public final void U(int n3) {
        long l2;
        int n4;
        vx2_2 vx2_22 = this.O(1);
        int n7 = vx2_22.c;
        vx2_22.c = n4 = n7 + 1;
        vx2_22.a[n7] = n3 = (int)((byte)n3);
        this.b = l2 = this.b + 1L;
    }

    public final void W(long l2) {
        block11: {
            int n3;
            Object object;
            long l3;
            int n4;
            Object object2;
            long l4;
            block14: {
                block12: {
                    block13: {
                        block10: {
                            l4 = 0L;
                            long l7 = l2 - l4;
                            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object2 != false) break block10;
                            int n7 = 48;
                            this.U(n7);
                            break block11;
                        }
                        n4 = 1;
                        if (object2 >= 0) break block12;
                        long l8 = (l2 = -l2) - l4;
                        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object2 >= 0) break block13;
                        String string2 = "-9223372036854775808";
                        this.I0(string2);
                        break block11;
                    }
                    object2 = 1;
                    break block14;
                }
                object2 = 0;
            }
            long l12 = 100000000L;
            int n8 = 10;
            Object object3 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1);
            if (object3 < 0) {
                l12 = 10000L;
                long l14 = l2 - l12;
                object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object3 < 0) {
                    l12 = 100;
                    long l15 = l2 - l12;
                    object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object3 < 0) {
                        l12 = 10;
                        long l16 = l2 - l12;
                        object3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object3 >= 0) {
                            n4 = 2;
                        }
                    } else {
                        l3 = 1000L;
                        long l17 = l2 - l3;
                        object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                        n4 = object < 0 ? 3 : 4;
                    }
                } else {
                    long l18;
                    long l19;
                    l3 = 1000000L;
                    long l20 = l2 - l3;
                    object = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                    n4 = object < 0 ? ((object = (l19 = l2 - (l3 = 100000L)) == 0L ? 0 : (l19 < 0L ? -1 : 1)) < 0 ? 5 : 6) : ((object = (l18 = l2 - (l3 = 10000000L)) == 0L ? 0 : (l18 < 0L ? -1 : 1)) < 0 ? 7 : 8);
                }
            } else {
                long l21;
                long l22;
                long l23;
                long l24;
                long l25;
                long l26;
                long l27;
                long l28;
                long l29;
                l3 = 1000000000000L;
                long l30 = l2 - l3;
                object = l30 == 0L ? 0 : (l30 < 0L ? -1 : 1);
                n4 = object < 0 ? ((object = (l29 = l2 - (l3 = 10000000000L)) == 0L ? 0 : (l29 < 0L ? -1 : 1)) < 0 ? ((object = (l28 = l2 - (l3 = 1000000000L)) == 0L ? 0 : (l28 < 0L ? -1 : 1)) < 0 ? 9 : 10) : ((object = (l27 = l2 - (l3 = 100000000000L)) == 0L ? 0 : (l27 < 0L ? -1 : 1)) < 0 ? 11 : 12)) : ((object = (l26 = l2 - (l3 = 1000000000000000L)) == 0L ? 0 : (l26 < 0L ? -1 : 1)) < 0 ? ((object = (l25 = l2 - (l3 = 10000000000000L)) == 0L ? 0 : (l25 < 0L ? -1 : 1)) < 0 ? 13 : ((object = (l24 = l2 - (l3 = 100000000000000L)) == 0L ? 0 : (l24 < 0L ? -1 : 1)) < 0 ? 14 : 15)) : ((object = (l23 = l2 - (l3 = 100000000000000000L)) == 0L ? 0 : (l23 < 0L ? -1 : 1)) < 0 ? ((object = (l22 = l2 - (l3 = 10000000000000000L)) == 0L ? 0 : (l22 < 0L ? -1 : 1)) < 0 ? 16 : 17) : ((object = (l21 = l2 - (l3 = 1000000000000000000L)) == 0L ? 0 : (l21 < 0L ? -1 : 1)) < 0 ? 18 : 19)));
            }
            if (object2 != false) {
                ++n4;
            }
            vx2_2 vx2_22 = this.O(n4);
            object = vx2_22.c + n4;
            while (true) {
                byte by2;
                byte[] byArray = vx2_22.a;
                Object object4 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (object4 == false) break;
                long l31 = n8;
                long l34 = l2 % l31;
                int n10 = (int)l34;
                byte[] byArray2 = c_0.a;
                byArray[object += -1] = by2 = byArray2[n10];
                l2 /= l31;
            }
            if (object2 != false) {
                byArray[object += -1] = n3 = 45;
            }
            vx2_22.c = n3 = vx2_22.c + n4;
            l2 = this.b;
            l4 = n4;
            this.b = l2 += l4;
        }
    }

    public final long a0(ce_2 object, long l2) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            long l7;
            long l8 = this.b;
            long l12 = l8 - l3;
            Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 == false) {
                l7 = -1;
            } else {
                Object object3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                if (object3 > 0) {
                    l2 = l8;
                }
                ((ce_2)object).s0(this, l2);
                l7 = l2;
            }
            return l7;
        }
        object = Wm2.a(l2, "byteCount < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void b() {
        long l2 = this.b;
        this.skip(l2);
    }

    public final ff_2 b0(long l2) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0 && (object = (l3 = l2 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            l4 = this.b;
            long l8 = l4 - l2;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object >= 0) {
                ff_2 ff_22;
                l4 = 4096L;
                long l12 = l2 - l4;
                object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object >= 0) {
                    int n3 = (int)l2;
                    ff_22 = this.M(n3);
                    this.skip(l2);
                } else {
                    byte[] byArray = this.w(l2);
                    ff_22 = new ff_2(byArray);
                }
                return ff_22;
            }
            EOFException eOFException = new EOFException();
            throw eOFException;
        }
        String string2 = Wm2.a(l2, "byteCount: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final Object clone() {
        ce_2 ce_22 = new ce_2();
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            vx2_2 vx2_22;
            vx2_2 vx2_23 = this.a;
            Intrinsics.checkNotNull(vx2_23);
            ce_22.a = vx2_22 = vx2_23.c();
            vx2_22.g = vx2_22;
            vx2_22.f = vx2_22;
            vx2_2 vx2_24 = vx2_23.f;
            while (vx2_24 != vx2_23) {
                vx2_2 vx2_25 = vx2_22.g;
                Intrinsics.checkNotNull(vx2_25);
                Intrinsics.checkNotNull(vx2_24);
                vx2_2 vx2_26 = vx2_24.c();
                vx2_25.b(vx2_26);
                vx2_24 = vx2_24.f;
            }
            ce_22.b = l2 = this.b;
        }
        return ce_22;
    }

    public final void close() {
    }

    public final long d() {
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            vx2_2 vx2_22 = this.a;
            Intrinsics.checkNotNull(vx2_22);
            vx2_22 = vx2_22.g;
            Intrinsics.checkNotNull(vx2_22);
            int n3 = vx2_22.c;
            object = 8192;
            if (n3 < object && (object = (Object)vx2_22.e) != false) {
                int n4 = vx2_22.b;
                l3 = n3 -= n4;
                l2 -= l3;
            }
            l3 = l2;
        }
        return l3;
    }

    public final int d0(aa2_2 object) {
        Intrinsics.checkNotNullParameter(object, "options");
        int n3 = c_0.b(this, (aa2_2)object, false);
        int n4 = -1;
        if (n3 == n4) {
            n3 = -1;
        } else {
            object = ((aa2_2)object).b[n3];
            int n7 = ((ff_2)object).d();
            long l2 = n7;
            this.skip(l2);
        }
        return n3;
    }

    public final ce_2 e() {
        return this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        block8: {
            var2_2 = this;
            var3_3 = var1_1;
            if (this == var1_1) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var4_4 = 1;
                    break block8;
                    break;
                }
            }
            var5_5 /* !! */  = var1_1 instanceof ce_2;
            if (var5_5 /* !! */  == 0) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var4_4 = 0;
                    var6_6 /* !! */  = null;
                    break block8;
                    break;
                }
            }
            var7_7 = this.b;
            var3_3 = (ce_2)var1_1;
            var9_8 = var3_3.b;
            cfr_temp_0 = var7_7 - var9_8;
            var5_5 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var5_5 /* !! */  != 0) ** GOTO lbl-1000
            var9_8 = 0L;
            cfr_temp_1 = var7_7 - var9_8;
            var5_5 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
            var11_9 = this.a;
            Intrinsics.checkNotNull(var11_9);
            var3_3 = var3_3.a;
            Intrinsics.checkNotNull(var3_3);
            var12_10 = var11_9.b;
            var13_11 = var3_3.b;
            var14_12 = var9_8;
            while (true) {
                if ((var18_14 = (cfr_temp_2 = var14_12 - (var16_13 = var2_2.b)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) < 0) ** break;
                ** continue;
                var19_15 = var11_9.c - var12_10;
                var20_16 = var3_3.c - var13_11;
                var19_15 = Math.min(var19_15, var20_16);
                var16_13 = var19_15;
                var21_17 = var9_8;
                while ((var23_18 = var21_17 == var16_13 ? 0 : (var21_17 < var16_13 ? -1 : 1)) < 0) {
                    var23_18 = var12_10 + 1;
                    var6_6 /* !! */  = var11_9.a;
                    var4_4 = var6_6 /* !! */ [var12_10];
                    var12_10 = var13_11 + 1;
                    var24_19 = var3_3.a;
                    var25_20 = var24_19[var13_11];
                    if (var4_4 == var25_20) ** break;
                    ** continue;
                    var26_21 = 1L;
                    var21_17 += var26_21;
                    var13_11 = var12_10;
                    var12_10 = (int)var23_18;
                }
                var4_4 = var11_9.c;
                if (var12_10 == var4_4) {
                    var6_6 /* !! */  = (byte[])var11_9.f;
                    Intrinsics.checkNotNull(var6_6 /* !! */ );
                    var12_10 = var5_5 /* !! */  = var6_6 /* !! */ .b;
                    var11_9 = var6_6 /* !! */ ;
                }
                if (var13_11 == (var4_4 = var3_3.c)) {
                    var3_3 = var3_3.f;
                    Intrinsics.checkNotNull(var3_3);
                    var13_11 = var4_4 = var3_3.b;
                }
                var14_12 += var16_13;
            }
        }
        return (boolean)var4_4;
    }

    public final void f(long l2) {
        long l3 = this.b;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final void flush() {
    }

    public final boolean g() {
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public final byte[] h0() {
        long l2 = this.b;
        return this.w(l2);
    }

    public final int hashCode() {
        int n3;
        vx2_2 vx2_22 = this.a;
        if (vx2_22 == null) {
            n3 = 0;
            vx2_22 = null;
        } else {
            vx2_2 vx2_23;
            int n4 = 1;
            do {
                int n7 = vx2_22.c;
                for (int i3 = vx2_22.b; i3 < n7; ++i3) {
                    n4 *= 31;
                    byte[] byArray = vx2_22.a;
                    byte by2 = byArray[i3];
                    n4 += by2;
                }
                vx2_22 = vx2_22.f;
                Intrinsics.checkNotNull(vx2_22);
            } while (vx2_22 != (vx2_23 = this.a));
            n3 = n4;
        }
        return n3;
    }

    public final InputStream inputStream() {
        ce$a_1 ce$a_1 = new ce$a_1(this);
        return ce$a_1;
    }

    public final boolean isOpen() {
        return true;
    }

    public final long j0(y63_0 y63_02) {
        String string2 = "sink";
        Intrinsics.checkNotNullParameter(y63_02, string2);
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            y63_02.s0(this, l2);
        }
        return l2;
    }

    public final void k(ce_2 ce_22, long l2, long l3) {
        String string2 = "out";
        Intrinsics.checkNotNullParameter(ce_22, string2);
        long l4 = this.b;
        long l7 = l2;
        l_0.b(l4, l2, l3);
        long l8 = 0L;
        long l12 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
        if (l12 != false) {
            int n3;
            int n4;
            long l14;
            ce_22.b = l14 = ce_22.b + l3;
            vx2_2 vx2_22 = this.a;
            while (true) {
                Intrinsics.checkNotNull(vx2_22);
                n4 = vx2_22.c;
                n3 = vx2_22.b;
                l7 = n4 -= n3;
                long l15 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                if (l15 < 0) break;
                l2 -= l7;
                vx2_22 = vx2_22.f;
            }
            while ((n4 = (int)(l3 == l8 ? 0 : (l3 < l8 ? -1 : 1))) > 0) {
                Intrinsics.checkNotNull(vx2_22);
                vx2_2 vx2_23 = vx2_22.c();
                n3 = vx2_23.b;
                int n7 = (int)l2;
                vx2_23.b = n3 += n7;
                int n8 = (int)l3;
                n3 += n8;
                n8 = vx2_23.c;
                vx2_23.c = n8 = Math.min(n3, n8);
                vx2_2 vx2_24 = ce_22.a;
                if (vx2_24 == null) {
                    vx2_23.g = vx2_23;
                    vx2_23.f = vx2_23;
                    ce_22.a = vx2_23;
                } else {
                    Intrinsics.checkNotNull(vx2_24);
                    vx2_24 = vx2_24.g;
                    Intrinsics.checkNotNull(vx2_24);
                    vx2_24.b(vx2_23);
                }
                n8 = vx2_23.c;
                n7 = vx2_23.b;
                l2 = n8 -= n7;
                l3 -= l2;
                vx2_22 = vx2_22.f;
                l2 = l8;
            }
        }
    }

    public final boolean l(long l2, ff_2 ff_22) {
        boolean bl2;
        block3: {
            int n3;
            long l3;
            long l4;
            long l7;
            String string2 = "bytes";
            Intrinsics.checkNotNullParameter(ff_22, string2);
            int n4 = ff_22.d();
            Intrinsics.checkNotNullParameter(ff_22, string2);
            long l8 = 0L;
            bl2 = false;
            string2 = null;
            long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (l12 >= 0 && n4 >= 0 && (l7 = (l4 = (l8 = this.b - l2) - (l3 = (long)n4)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0 && (n3 = ff_22.d()) >= n4) {
                for (n3 = 0; n3 < n4; ++n3) {
                    long l14 = (long)n3 + l2;
                    byte by2 = this.n(l14);
                    if (by2 == (l12 = (long)ff_22.i(n3))) {
                        continue;
                    }
                    break block3;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void l0(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            int n3 = 48;
            this.U(n3);
        } else {
            int n4;
            int n7 = 1;
            long l7 = l2 >>> n7 | l2;
            int n8 = 2;
            long l8 = l7 >>> n8;
            int n10 = 4;
            long l12 = (l7 |= l8) >>> n10;
            int n14 = 8;
            long l14 = (l7 |= l12) >>> n14;
            int n15 = 16;
            long l15 = (l7 |= l14) >>> n15;
            int n16 = 32;
            long l16 = (l7 |= l15) >>> n16;
            l7 |= l16;
            l16 = l7 >>> n7 & 0x5555555555555555L;
            l7 -= l16;
            l16 = l7 >>> n8;
            long l17 = 0x3333333333333333L;
            l16 &= l17;
            l7 = ((l16 += (l7 &= l17)) >>> n10) + l16 & 0xF0F0F0F0F0F0F0FL;
            l16 = l7 >>> n14;
            l12 = (l7 += l16) >>> n15;
            l7 += l12;
            l12 = 63;
            l16 = l7 & l12;
            l7 = l7 >>> n16 & l12;
            l16 += l7;
            l7 = 3;
            l16 += l7;
            l7 = n10;
            int n17 = (int)(l16 /= l7);
            vx2_2 vx2_22 = this.O(n17);
            n8 = vx2_22.c;
            for (n14 = n8 + n17 - n7; n14 >= n8; n14 += -1) {
                byte[] byArray = c_0.a;
                l14 = (long)15 & l2;
                n16 = (int)l14;
                n7 = byArray[n16];
                byte[] byArray2 = vx2_22.a;
                byArray2[n14] = n7;
                l2 >>>= n10;
            }
            vx2_22.c = n4 = vx2_22.c + n17;
            l2 = this.b;
            l3 = n17;
            this.b = l2 += l3;
        }
    }

    public final ce_2 m() {
        return this;
    }

    public final byte n(long l2) {
        long l3 = this.b;
        long l4 = 1L;
        l_0.b(l3, l2, l4);
        vx2_2 vx2_22 = this.a;
        if (vx2_22 != null) {
            int n3;
            long l7 = this.b;
            long l8 = l7 - l2;
            long l12 = l8 - l2;
            Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object < 0) {
                long l14;
                while ((l14 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) > 0) {
                    vx2_22 = vx2_22.g;
                    Intrinsics.checkNotNull(vx2_22);
                    l14 = vx2_22.c;
                    int n4 = vx2_22.b;
                    l8 = l14 -= n4;
                    l7 -= l8;
                }
                Intrinsics.checkNotNull(vx2_22);
                l14 = vx2_22.b;
                l8 = (long)l14 + l2 - l7;
                n3 = (int)l8;
                byte[] byArray = vx2_22.a;
                n3 = byArray[n3];
            } else {
                int n7;
                l7 = 0L;
                while (true) {
                    n7 = vx2_22.c;
                    int n8 = vx2_22.b;
                    l8 = (long)(n7 -= n8) + l7;
                    long l15 = l8 - l2;
                    object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object > 0) break;
                    vx2_22 = vx2_22.f;
                    Intrinsics.checkNotNull(vx2_22);
                    l7 = l8;
                }
                Intrinsics.checkNotNull(vx2_22);
                n7 = vx2_22.b;
                l8 = (long)n7 + l2 - l7;
                n3 = (int)l8;
                byte[] byArray = vx2_22.a;
                n3 = byArray[n3];
            }
            return (byte)n3;
        }
        Intrinsics.checkNotNull(null);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long p(byte var1_1, long var2_2, long var4_3) {
        block10: {
            block9: {
                block11: {
                    var6_4 = this;
                    var7_5 = var1_1;
                    var8_6 = var2_2;
                    var10_7 = var4_3;
                    var12_8 = 0L;
                    cfr_temp_0 = var12_8 - var2_2;
                    var14_9 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var14_9 /* !! */  > 0 || (var14_9 /* !! */  = var2_2 == var4_3 ? 0 : (var2_2 < var4_3 ? -1 : 1)) > 0) break block10;
                    var15_10 = this.b;
                    cfr_temp_1 = var4_3 - var15_10;
                    var17_11 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var17_11 /* !! */  > 0) {
                        var10_7 = var15_10;
                    }
                    if ((var18_12 = var8_6 == var10_7 ? 0 : (var8_6 < var10_7 ? -1 : 1)) == false) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            var19_13 = -1;
                            break block9;
                            break;
                        }
                    }
                    var21_14 = var6_4.a;
                    if (var21_14 == null) ** GOTO lbl-1000
                    var22_15 = var15_10 - var8_6;
                    cfr_temp_2 = var22_15 - var8_6;
                    var24_16 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var24_16 /* !! */  >= 0) break block11;
                    while ((var25_17 = var15_10 == var8_6 ? 0 : (var15_10 < var8_6 ? -1 : 1)) > 0) {
                        var21_14 = var21_14.g;
                        Intrinsics.checkNotNull(var21_14);
                        var25_17 = var21_14.c;
                        var26_18 = var21_14.b;
                        var12_8 = var25_17 -= var26_18;
                        var15_10 -= var12_8;
                    }
                    while (true) {
                        if ((var25_17 = var15_10 == var10_7 ? 0 : (var15_10 < var10_7 ? -1 : 1)) >= 0) ** GOTO lbl-1000
                        var27_19 = var21_14.a;
                        var22_15 = var21_14.c;
                        var19_13 = (long)var21_14.b + var10_7 - var15_10;
                        var26_18 = (int)Math.min(var22_15, var19_13);
                        var17_11 /* !! */  = var21_14.b;
                        var19_13 = (long)var17_11 /* !! */  + var8_6 - var15_10;
                        for (var28_20 = (int)var19_13; var28_20 < var26_18; ++var28_20) {
                            var29_22 = var27_19[var28_20];
                            if (var29_22 != var7_5) continue;
                            var7_5 = var21_14.b;
                            var30_24 = var28_20 -= var7_5;
                            var19_13 = var30_24 + var15_10;
                            break block9;
                        }
                        var28_20 = var21_14.c;
                        var29_22 = var21_14.b;
                        var8_6 = var28_20 -= var29_22;
                        var15_10 += var8_6;
                        var21_14 = var21_14.f;
                        Intrinsics.checkNotNull(var21_14);
                        var8_6 = var15_10;
                    }
                }
                while (true) {
                    var14_9 /* !! */  = var21_14.c;
                    var32_26 = var21_14.b;
                    var15_10 = (long)(var14_9 /* !! */  -= var32_26) + var12_8;
                    cfr_temp_3 = var15_10 - var8_6;
                    var17_11 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var17_11 /* !! */  > 0) break;
                    var21_14 = var21_14.f;
                    Intrinsics.checkNotNull(var21_14);
                    var12_8 = var15_10;
                }
                block5: while (true) {
                    if ((var14_9 /* !! */  = var12_8 == var10_7 ? 0 : (var12_8 < var10_7 ? -1 : 1)) < 0) ** break;
                    ** continue;
                    var33_27 = var21_14.a;
                    var34_28 = var21_14.c;
                    var36_29 = var21_14.b;
                    var22_15 = (long)var36_29 + var10_7 - var12_8;
                    var34_28 = Math.min(var34_28, var22_15);
                    var17_11 /* !! */  = (int)var34_28;
                    var32_26 = var21_14.b;
                    var22_15 = (long)var32_26 + var8_6 - var12_8;
                    for (var28_21 = (int)var22_15; var28_21 < var17_11 /* !! */ ; ++var28_21) {
                        var29_23 = var33_27[var28_21];
                        if (var29_23 != var7_5) continue;
                        var7_5 = var21_14.b;
                        var30_25 = var28_21 -= var7_5;
                        var19_13 = var30_25 + var12_8;
                        break block5;
                    }
                    var28_21 = var21_14.c;
                    var29_23 = var21_14.b;
                    var8_6 = var28_21 -= var29_23;
                    var12_8 += var8_6;
                    var21_14 = var21_14.f;
                    Intrinsics.checkNotNull(var21_14);
                    var8_6 = var12_8;
                }
            }
            return var19_13;
        }
        var37_30 = new StringBuilder("size=");
        var12_8 = var6_4.b;
        var37_30.append(var12_8);
        fn0_2.b((StringBuilder)var37_30, " fromIndex=", var8_6, " toIndex=");
        var37_30.append(var10_7);
        var37_30 = var37_30.toString();
        var37_30 = var37_30.toString();
        var38_31 = new IllegalArgumentException((String)var37_30);
        throw var38_31;
    }

    public final int read(ByteBuffer object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "sink");
        vx2_2 vx2_22 = this.a;
        if (vx2_22 == null) {
            return -1;
        }
        int n4 = ((Buffer)object).remaining();
        int n7 = vx2_22.c;
        int n8 = vx2_22.b;
        n4 = Math.min(n4, n7 -= n8);
        byte[] byArray = vx2_22.a;
        n8 = vx2_22.b;
        ((ByteBuffer)object).put(byArray, n8, n4);
        vx2_22.b = n3 = vx2_22.b + n4;
        long l2 = this.b;
        long l3 = n4;
        this.b = l2 -= l3;
        n7 = vx2_22.c;
        if (n3 == n7) {
            this.a = object = vx2_22.a();
            ax2_2.a(vx2_22);
        }
        return n4;
    }

    public final int read(byte[] object, int n3, int n4) {
        int n7;
        Intrinsics.checkNotNullParameter(object, "sink");
        int n8 = ((byte[])object).length;
        long l2 = n8;
        long l3 = n3;
        long l4 = n4;
        l_0.b(l2, l3, l4);
        vx2_2 vx2_22 = this.a;
        if (vx2_22 == null) {
            n7 = -1;
        } else {
            int n10 = vx2_22.c;
            int n14 = vx2_22.b;
            n4 = Math.min(n4, n10 -= n14);
            n10 = vx2_22.b;
            n14 = n10 + n4;
            byte[] byArray = vx2_22.a;
            rp_1.g(byArray, n3, object, n10, n14);
            vx2_22.b = n7 = vx2_22.b + n4;
            l2 = this.b;
            l3 = n4;
            this.b = l2 -= l3;
            n3 = vx2_22.c;
            if (n7 == n3) {
                object = vx2_22.a();
                this.a = object;
                ax2_2.a(vx2_22);
            }
            n7 = n4;
        }
        return n7;
    }

    public final byte readByte() {
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            vx2_2 vx2_22 = this.a;
            Intrinsics.checkNotNull(vx2_22);
            int by2 = vx2_22.b;
            int n3 = vx2_22.c;
            int n4 = by2 + 1;
            byte[] byArray = vx2_22.a;
            byte by4 = byArray[by2];
            long l7 = this.b;
            long l8 = 1L;
            this.b = l7 -= l8;
            if (n4 == n3) {
                vx2_2 vx2_23;
                this.a = vx2_23 = vx2_22.a();
                ax2_2.a(vx2_22);
            } else {
                vx2_22.b = n4;
            }
            return by4;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final int readInt() {
        long l2 = this.b;
        long l3 = 4;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            int n3;
            vx2_2 vx2_22 = this.a;
            Intrinsics.checkNotNull(vx2_22);
            int n4 = vx2_22.b;
            object = vx2_22.c;
            long l7 = object - n4;
            long l8 = l7;
            long l12 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
            if (l12 < 0) {
                n3 = (this.readByte() & 0xFF) << 24;
                n4 = (this.readByte() & 0xFF) << 16;
                n3 |= n4;
                n4 = (this.readByte() & 0xFF) << 8;
                n3 |= n4;
                n4 = this.readByte() & 0xFF;
                n3 |= n4;
            } else {
                long l14;
                l7 = n4 + 1;
                byte[] byArray = vx2_22.a;
                l12 = (byArray[n4] & 0xFF) << 24;
                int n7 = n4 + 2;
                l7 = (byArray[l7] & 0xFF) << 16 | l12;
                l12 = n4 + 3;
                n7 = (byArray[n7] & 0xFF) << 8;
                l7 = l7 | n7;
                int n8 = byArray[l12] & 0xFF;
                l7 = l7 | n8;
                this.b = l14 = this.b - l3;
                if ((n4 += 4) == object) {
                    vx2_2 vx2_23;
                    this.a = vx2_23 = vx2_22.a();
                    ax2_2.a(vx2_22);
                } else {
                    vx2_22.b = n4;
                }
                n3 = (int)l7;
            }
            return n3;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final short readShort() {
        long l2 = this.b;
        long l3 = 2;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            short s7;
            vx2_2 vx2_22 = this.a;
            Intrinsics.checkNotNull(vx2_22);
            int n3 = vx2_22.b;
            object = vx2_22.c;
            long l7 = object - n3;
            int n4 = 2;
            if (l7 < n4) {
                s7 = (this.readByte() & 0xFF) << 8;
                n3 = this.readByte() & 0xFF;
                s7 = (short)(s7 | n3);
            } else {
                long l8;
                l7 = n3 + 1;
                byte[] byArray = vx2_22.a;
                int n7 = (byArray[n3] & 0xFF) << 8;
                l7 = byArray[l7] & 0xFF | n7;
                this.b = l8 = this.b - l3;
                if ((n3 += n4) == object) {
                    vx2_2 vx2_23;
                    this.a = vx2_23 = vx2_22.a();
                    ax2_2.a(vx2_22);
                } else {
                    vx2_22.b = n3;
                }
                s7 = (short)l7;
            }
            return s7;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }

    public final boolean request(long l2) {
        long l3 = this.b;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    public final long s(a93_0 a93_02) {
        long l2;
        long l3;
        long l4;
        long l7;
        String string2 = "source";
        Intrinsics.checkNotNullParameter(a93_02, string2);
        long l8 = 0L;
        while ((l7 = (l4 = (l3 = a93_02.a0(this, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l8 += l3;
        }
        return l8;
    }

    public final void s0(ce_2 object, long l2) {
        block15: {
            long l3;
            long l4;
            long l7;
            Object object2 = "source";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            if (object == this) break block15;
            long l8 = ((ce_2)object).b;
            long l12 = 0L;
            long l14 = l2;
            l_0.b(l8, l12, l2);
            while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                block21: {
                    block20: {
                        Object object3;
                        int n3;
                        vx2_2 vx2_22;
                        int n4;
                        vx2_2 vx2_23;
                        block19: {
                            long l15;
                            block16: {
                                block18: {
                                    block17: {
                                        vx2_2 vx2_24;
                                        object2 = ((ce_2)object).a;
                                        Intrinsics.checkNotNull(object2);
                                        int n7 = ((vx2_2)object2).c;
                                        vx2_23 = ((ce_2)object).a;
                                        Intrinsics.checkNotNull(vx2_23);
                                        n4 = vx2_23.b;
                                        l3 = n7 -= n4;
                                        l7 = 0;
                                        vx2_22 = null;
                                        l15 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                        if (l15 >= 0) break block16;
                                        object2 = this.a;
                                        if (object2 != null) {
                                            Intrinsics.checkNotNull(object2);
                                            object2 = ((vx2_2)object2).g;
                                        } else {
                                            n7 = 0;
                                            object2 = null;
                                        }
                                        if (object2 != null && (n4 = (int)(((vx2_2)object2).e ? 1 : 0)) != 0) {
                                            l12 = (long)((vx2_2)object2).c + l2;
                                            n4 = (int)(((vx2_2)object2).d ? 1 : 0);
                                            if (n4 != 0) {
                                                n4 = 0;
                                                vx2_23 = null;
                                            } else {
                                                n4 = ((vx2_2)object2).b;
                                            }
                                            l14 = n4;
                                            l12 -= l14;
                                            l14 = 8192L;
                                            n4 = (int)(l12 == l14 ? 0 : (l12 < l14 ? -1 : 1));
                                            if (n4 <= 0) {
                                                vx2_23 = ((ce_2)object).a;
                                                Intrinsics.checkNotNull(vx2_23);
                                                l7 = (int)l2;
                                                vx2_23.d((vx2_2)object2, (int)l7);
                                                ((ce_2)object).b = l3 = ((ce_2)object).b - l2;
                                                this.b = l3 = this.b + l2;
                                                break;
                                            }
                                        }
                                        object2 = ((ce_2)object).a;
                                        Intrinsics.checkNotNull(object2);
                                        n4 = (int)l2;
                                        if (n4 <= 0) break block17;
                                        l15 = ((vx2_2)object2).c;
                                        int n8 = ((vx2_2)object2).b;
                                        if (n4 > (l15 -= n8)) break block18;
                                        l15 = 1024;
                                        if (n4 >= l15) {
                                            vx2_24 = ((vx2_2)object2).c();
                                        } else {
                                            vx2_24 = ax2_2.b();
                                            n8 = ((vx2_2)object2).b;
                                            n3 = n8 + n4;
                                            object3 = ((vx2_2)object2).a;
                                            byte[] byArray = vx2_24.a;
                                            rp_1.g(object3, 0, byArray, n8, n3);
                                        }
                                        vx2_24.c = n8 = vx2_24.b + n4;
                                        ((vx2_2)object2).b = n8 = ((vx2_2)object2).b + n4;
                                        object2 = ((vx2_2)object2).g;
                                        Intrinsics.checkNotNull(object2);
                                        ((vx2_2)object2).b(vx2_24);
                                        ((ce_2)object).a = vx2_24;
                                        break block16;
                                    }
                                    object2.getClass();
                                }
                                String string2 = "byteCount out of range".toString();
                                object = new IllegalArgumentException(string2);
                                throw object;
                            }
                            object2 = ((ce_2)object).a;
                            Intrinsics.checkNotNull(object2);
                            n4 = ((vx2_2)object2).c;
                            l15 = ((vx2_2)object2).b;
                            l12 = n4 -= l15;
                            ((ce_2)object).a = vx2_23 = ((vx2_2)object2).a();
                            vx2_23 = this.a;
                            if (vx2_23 != null) break block19;
                            this.a = object2;
                            ((vx2_2)object2).g = object2;
                            ((vx2_2)object2).f = object2;
                            break block20;
                        }
                        Intrinsics.checkNotNull(vx2_23);
                        vx2_23 = vx2_23.g;
                        Intrinsics.checkNotNull(vx2_23);
                        vx2_23.b((vx2_2)object2);
                        vx2_23 = ((vx2_2)object2).g;
                        if (vx2_23 == object2) break block21;
                        Intrinsics.checkNotNull(vx2_23);
                        n4 = (int)(vx2_23.e ? 1 : 0);
                        if (n4 != 0) {
                            n4 = ((vx2_2)object2).c;
                            n3 = ((vx2_2)object2).b;
                            n4 -= n3;
                            vx2_2 vx2_25 = ((vx2_2)object2).g;
                            Intrinsics.checkNotNull(vx2_25);
                            n3 = vx2_25.c;
                            n3 = 8192 - n3;
                            object3 = ((vx2_2)object2).g;
                            Intrinsics.checkNotNull(object3);
                            boolean bl2 = object3.d;
                            if (!bl2) {
                                vx2_22 = ((vx2_2)object2).g;
                                Intrinsics.checkNotNull(vx2_22);
                                l7 = vx2_22.b;
                            }
                            if (n4 <= (n3 += l7)) {
                                vx2_22 = ((vx2_2)object2).g;
                                Intrinsics.checkNotNull(vx2_22);
                                ((vx2_2)object2).d(vx2_22, n4);
                                ((vx2_2)object2).a();
                                ax2_2.a((vx2_2)object2);
                            }
                        }
                    }
                    ((ce_2)object).b = l3 = ((ce_2)object).b - l12;
                    this.b = l3 = this.b + l12;
                    l2 -= l12;
                    continue;
                }
                String string3 = "cannot compact".toString();
                object = new IllegalStateException(string3);
                throw object;
            }
            return;
        }
        String string4 = "source == this".toString();
        object = new IllegalArgumentException(string4);
        throw object;
    }

    public final void skip(long l2) {
        long l3;
        long l4;
        long l7;
        while ((l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            vx2_2 vx2_22 = this.a;
            if (vx2_22 != null) {
                vx2_2 vx2_23;
                int n3 = vx2_22.c;
                l7 = vx2_22.b;
                long l8 = n3 - l7;
                l8 = Math.min(l2, l8);
                l7 = (int)l8;
                long l12 = this.b;
                long l14 = l7;
                this.b = l12 -= l14;
                l2 -= l14;
                vx2_22.b = n3 = vx2_22.b + l7;
                l7 = vx2_22.c;
                if (n3 != l7) continue;
                this.a = vx2_23 = vx2_22.a();
                ax2_2.a(vx2_22);
                continue;
            }
            EOFException eOFException = new EOFException();
            throw eOFException;
        }
    }

    public final String t0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        long l2 = this.b;
        return this.H(l2, charset);
    }

    public final a timeout() {
        return okio.a.d;
    }

    public final String toString() {
        long l2 = this.b;
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            int n3 = (int)l2;
            return this.M(n3).toString();
        }
        CharSequence charSequence = new StringBuilder("size > Int.MAX_VALUE: ");
        long l7 = this.b;
        ((StringBuilder)charSequence).append(l7);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long u(long var1_1, ff_2 var3_2) {
        var4_3 = this;
        var5_4 = var1_1;
        var7_5 = var3_2;
        var8_6 = "targetBytes";
        Intrinsics.checkNotNullParameter(var3_2, (String)var8_6);
        var9_7 = 0L;
        var11_8 = var1_1 == var9_7 ? 0 : (var1_1 < var9_7 ? -1 : 1);
        if (var11_8 >= 0) {
            block24: {
                var12_9 = this.a;
                var13_10 = -1;
                if (var12_9 != null) {
                    var15_11 = this.b;
                    var17_12 = var15_11 - var1_1;
                    var19_13 /* !! */  = 1;
                    var20_14 = 2;
                    var21_15 /* !! */  = (long)(var17_12 == var1_1 ? 0 : (var17_12 < var1_1 ? -1 : 1));
                    if (var21_15 /* !! */  < 0) {
                        while ((var22_16 = var15_11 == var5_4 ? 0 : (var15_11 < var5_4 ? -1 : 1)) > 0) {
                            var12_9 = var12_9.g;
                            Intrinsics.checkNotNull(var12_9);
                            var22_16 = var12_9.c;
                            var23_17 /* !! */  = var12_9.b;
                            var9_7 = var22_16 -= var23_17 /* !! */ ;
                            var15_11 -= var9_7;
                        }
                        var7_5 = var7_5.a;
                        var22_16 = ((Object)var7_5).length;
                        if (var22_16 == var20_14) {
                            var22_16 = (long)var7_5[0];
                            var24_18 = var7_5[var19_13 /* !! */ ];
                            while ((var23_17 /* !! */  = (int)((cfr_temp_0 = var15_11 - (var17_12 = var4_3.b)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
                                var25_20 = var12_9.a;
                                var26_21 = var12_9.b;
                                var17_12 = (long)var26_21 + var5_4 - var15_11;
                                var28_26 = var12_9.c;
                                for (var27_24 = (int)var17_12; var27_24 < var28_26; ++var27_24) {
                                    var26_21 = var25_20[var27_24];
                                    if (var26_21 != var22_16 && var26_21 != var24_18) {
                                        continue;
                                    }
                                    var28_26 = var12_9.b;
lbl41:
                                    // 2 sources

                                    while (true) {
                                        var5_4 = var27_24 -= var28_26;
                                        var13_10 = var5_4 + var15_11;
                                        break block24;
                                        break;
                                    }
                                }
                                var27_24 = var12_9.c;
                                var28_26 = var12_9.b;
                                var5_4 = var27_24 -= var28_26;
                                var15_11 += var5_4;
                                var12_9 = var12_9.f;
                                Intrinsics.checkNotNull(var12_9);
                                var5_4 = var15_11;
                            }
                        } else {
                            while ((var26_22 = (cfr_temp_1 = var15_11 - (var9_7 = var4_3.b)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) < 0) {
                                var8_6 = var12_9.a;
                                var23_17 /* !! */  = var12_9.b;
                                var17_12 = (long)var23_17 /* !! */  + var5_4 - var15_11;
                                var28_26 = var12_9.c;
                                for (var27_24 = (int)var17_12; var27_24 < var28_26; ++var27_24) {
                                    var23_17 /* !! */  = (int)var8_6[var27_24];
                                    var26_22 = ((Object)var7_5).length;
                                    for (var29_28 = 0; var29_28 < var26_22; ++var29_28) {
                                        var19_13 /* !! */  = (int)var7_5[var29_28];
                                        if (var23_17 /* !! */  != var19_13 /* !! */ ) continue;
                                        var28_26 = var12_9.b;
                                        ** continue;
                                    }
                                }
                                var27_24 = var12_9.c;
                                var28_26 = var12_9.b;
                                var5_4 = var27_24 -= var28_26;
                                var15_11 += var5_4;
                                var12_9 = var12_9.f;
                                Intrinsics.checkNotNull(var12_9);
                                var5_4 = var15_11;
                            }
                        }
                    } else {
                        while (true) {
                            var30_31 /* !! */  = var12_9.c;
                            var31_32 = var12_9.b;
                            var15_11 = (long)(var30_31 /* !! */  -= var31_32) + var9_7;
                            cfr_temp_2 = var15_11 - var5_4;
                            var26_23 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                            if (var26_23 /* !! */  > 0) break;
                            var12_9 = var12_9.f;
                            Intrinsics.checkNotNull(var12_9);
                            var9_7 = var15_11;
                        }
                        var7_5 = var7_5.a;
                        var30_31 /* !! */  = ((Object)var7_5).length;
                        if (var30_31 /* !! */  == var20_14) {
                            var30_31 /* !! */  = (int)var7_5[0];
                            var24_19 = var7_5[var19_13 /* !! */ ];
                            while ((var29_29 = (cfr_temp_3 = var9_7 - (var32_33 = var4_3.b)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) < 0) {
                                var34_35 = var12_9.a;
                                var26_23 /* !! */  = var12_9.b;
                                var17_12 = (long)var26_23 /* !! */  + var5_4 - var9_7;
                                var28_27 = var12_9.c;
                                for (var27_25 = (int)var17_12; var27_25 < var28_27; ++var27_25) {
                                    var26_23 /* !! */  = var34_35[var27_25];
                                    if (var26_23 /* !! */  != var30_31 /* !! */  && var26_23 /* !! */  != var24_19) {
                                        continue;
                                    }
                                    var28_27 = var12_9.b;
lbl103:
                                    // 2 sources

                                    while (true) {
                                        var5_4 = var27_25 -= var28_27;
                                        var13_10 = var5_4 + var9_7;
                                        break block24;
                                        break;
                                    }
                                }
                                var27_25 = var12_9.c;
                                var28_27 = var12_9.b;
                                var5_4 = var27_25 -= var28_27;
                                var9_7 += var5_4;
                                var12_9 = var12_9.f;
                                Intrinsics.checkNotNull(var12_9);
                                var5_4 = var9_7;
                            }
                        } else {
                            while ((var26_23 /* !! */  = (cfr_temp_4 = var9_7 - (var15_11 = var4_3.b)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) < 0) {
                                var35_36 = var12_9.a;
                                var31_32 = var12_9.b;
                                var32_34 = (long)var31_32 + var5_4 - var9_7;
                                var28_27 = var12_9.c;
                                for (var27_25 = (int)var32_34; var27_25 < var28_27; ++var27_25) {
                                    var31_32 = var35_36[var27_25];
                                    var26_23 /* !! */  = ((Object)var7_5).length;
                                    for (var29_30 = 0; var29_30 < var26_23 /* !! */ ; ++var29_30) {
                                        var19_13 /* !! */  = (int)var7_5[var29_30];
                                        if (var31_32 != var19_13 /* !! */ ) continue;
                                        var28_27 = var12_9.b;
                                        ** continue;
                                    }
                                }
                                var27_25 = var12_9.c;
                                var28_27 = var12_9.b;
                                var5_4 = var27_25 -= var28_27;
                                var9_7 += var5_4;
                                var12_9 = var12_9.f;
                                Intrinsics.checkNotNull(var12_9);
                                var5_4 = var9_7;
                            }
                        }
                    }
                }
            }
            return var13_10;
        }
        var36_37 = Wm2.a(var1_1, "fromIndex < 0: ");
        var36_37 = var36_37.toString();
        var37_38 = new IllegalArgumentException(var36_37);
        throw var37_38;
    }

    public final re_2 v() {
        return this;
    }

    public final void v0(int n3) {
        long l2;
        byte by2;
        int n4 = 4;
        vx2_2 vx2_22 = this.O(n4);
        int n7 = vx2_22.c;
        int n8 = n7 + 1;
        int n10 = n3 >>> 24 & 0xFF;
        byte[] byArray = vx2_22.a;
        byArray[n7] = n10;
        n10 = n7 + 2;
        byArray[n8] = by2 = (byte)(n3 >>> 16 & 0xFF);
        n8 = n7 + 3;
        byArray[n10] = by2 = (byte)(n3 >>> 8 & 0xFF);
        byArray[n8] = n3 = (int)((byte)(n3 & 0xFF));
        vx2_22.c = n7 += n4;
        this.b = l2 = this.b + (long)4;
    }

    public final byte[] w(long l2) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0 && (object = (l3 = l2 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            l4 = this.b;
            long l8 = l4 - l2;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object >= 0) {
                byte[] byArray = new byte[(int)l2];
                this.A(byArray);
                return byArray;
            }
            EOFException eOFException = new EOFException();
            throw eOFException;
        }
        String string2 = Wm2.a(l2, "byteCount: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final int write(ByteBuffer byteBuffer) {
        int n3;
        int n4;
        String string2 = "source";
        Intrinsics.checkNotNullParameter(byteBuffer, string2);
        for (int i3 = n3 = byteBuffer.remaining(); i3 > 0; i3 -= n4) {
            int n7;
            int n8 = 1;
            vx2_2 vx2_22 = this.O(n8);
            n4 = vx2_22.c;
            n4 = 8192 - n4;
            n4 = Math.min(i3, n4);
            byte[] byArray = vx2_22.a;
            int n10 = vx2_22.c;
            byteBuffer.get(byArray, n10, n4);
            vx2_22.c = n7 = vx2_22.c + n4;
        }
        long l2 = this.b;
        long l3 = n3;
        this.b = l2 += l3;
        return n3;
    }

    public final String x(long l2) {
        block4: {
            long l3;
            long l4;
            block7: {
                String string2;
                block6: {
                    int n3;
                    int n4;
                    long l7;
                    block5: {
                        l4 = 0L;
                        long l8 = l2 - l4;
                        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object < 0) break block4;
                        l4 = 1L;
                        l7 = Long.MAX_VALUE;
                        long l12 = l2 - l7;
                        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                        if (object2 != false) {
                            l7 = l2 + l4;
                        }
                        byte by2 = 10;
                        l3 = this.p(by2, 0L, l7);
                        long l14 = -1;
                        long l15 = l3 == l14 ? 0 : (l3 < l14 ? -1 : 1);
                        if (l15 == false) break block5;
                        string2 = c_0.a(this, l3);
                        break block6;
                    }
                    l3 = this.b;
                    long l16 = l7 - l3;
                    Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object >= 0 || (n4 = this.n(l4 = l7 - l4)) != (n3 = 13) || (n4 = this.n(l7)) != (n3 = 10)) break block7;
                    string2 = c_0.a(this, l7);
                }
                return string2;
            }
            ce_2 ce_22 = new ce_2();
            l4 = this.b;
            l3 = Math.min((long)32, l4);
            Object object = this;
            Object object3 = ce_22;
            this.k(ce_22, 0L, l3);
            object3 = new StringBuilder("\\n not found: limit=");
            l2 = Math.min(this.b, l2);
            ((StringBuilder)object3).append(l2);
            ((StringBuilder)object3).append(" content=");
            l2 = ce_22.b;
            String string3 = ce_22.b0(l2).e();
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append('\u2026');
            string3 = ((StringBuilder)object3).toString();
            object = new EOFException(string3);
            throw object;
        }
        String string4 = Wm2.a(l2, "limit < 0: ");
        string4 = string4.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }

    public final int x0() {
        int n3 = this.readInt();
        int n4 = l_0.a;
        n4 = (0xFF000000 & n3) >>> 24;
        int n7 = (0xFF0000 & n3) >>> 8;
        n4 |= n7;
        n7 = (0xFF00 & n3) << 8;
        return (n3 & 0xFF) << 24 | (n4 |= n7);
    }

    public final void y0(int n3) {
        long l2;
        int n4 = 2;
        vx2_2 vx2_22 = this.O(n4);
        int n7 = vx2_22.c;
        int n8 = n7 + 1;
        byte by2 = (byte)(n3 >>> 8 & 0xFF);
        byte[] byArray = vx2_22.a;
        byArray[n7] = by2;
        byArray[n8] = n3 = (int)((byte)(n3 & 0xFF));
        vx2_22.c = n7 += n4;
        this.b = l2 = this.b + (long)2;
    }

    public final long z() {
        block11: {
            Object object;
            int n3;
            ce_2 ce_22 = this;
            long l2 = this.b;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) break block11;
            int n4 = 0;
            Object object3 = null;
            long l7 = -7;
            long l8 = l3;
            long l12 = l7;
            boolean bl2 = false;
            NumberFormatException numberFormatException = null;
            object2 = 0;
            while (true) {
                vx2_2 vx2_22 = ce_22.a;
                Intrinsics.checkNotNull(vx2_22);
                byte[] byArray = vx2_22.a;
                int n7 = vx2_22.b;
                int n8 = vx2_22.c;
                while (n7 < n8) {
                    block15: {
                        block14: {
                            int n10;
                            block12: {
                                block13: {
                                    long l14;
                                    long l15;
                                    n10 = byArray[n7];
                                    n3 = 48;
                                    if (n10 < n3 || n10 > (n3 = 57)) break block12;
                                    n3 = 48 - n10;
                                    long l16 = -922337203685477580L;
                                    long l17 = l8 - l16;
                                    Object object4 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                    if (object4 < 0 || object4 == false && (l15 = (l14 = (l3 = (long)n3) - l12) == 0L ? 0 : (l14 < 0L ? -1 : 1)) < 0) break block13;
                                    l8 *= (long)10;
                                    l3 = n3;
                                    l8 += l3;
                                    break block14;
                                }
                                object3 = new ce_2();
                                ((ce_2)object3).W(l8);
                                ((ce_2)object3).U(n10);
                                if (!bl2) {
                                    ((ce_2)object3).readByte();
                                }
                                object3 = ((ce_2)object3).I();
                                object3 = "Number too large: ".concat((String)object3);
                                numberFormatException = new NumberFormatException((String)object3);
                                throw numberFormatException;
                            }
                            int n14 = 45;
                            if (n10 != n14 || n4 != 0) break block15;
                            long l18 = 1L;
                            l12 -= l18;
                            bl2 = true;
                        }
                        ++n7;
                        ++n4;
                        l3 = 0L;
                        continue;
                    }
                    object2 = 1;
                    break;
                }
                if (n7 == n8) {
                    object = vx2_22.a();
                    ce_22.a = object;
                    ax2_2.a(vx2_22);
                } else {
                    vx2_22.b = n7;
                }
                if (object2 != false || (object = ce_22.a) == null) break;
                l3 = 0L;
            }
            l3 = ce_22.b;
            l7 = n4;
            ce_22.b = l3 -= l7;
            n3 = bl2 ? 2 : 1;
            if (n4 < n3) {
                l7 = 0L;
                long l19 = l3 - l7;
                n4 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                if (n4 != 0) {
                    object3 = bl2 ? "Expected a digit" : "Expected a digit or '-'";
                    object3 = nn_2.a((String)object3, " but was 0x");
                    object = l_0.d(ce_22.n(l7));
                    ((StringBuilder)object3).append((String)object);
                    object3 = ((StringBuilder)object3).toString();
                    numberFormatException = new NumberFormatException((String)object3);
                    throw numberFormatException;
                }
                object3 = new EOFException();
                throw object3;
            }
            if (!bl2) {
                l8 = -l8;
            }
            return l8;
        }
        EOFException eOFException = new EOFException();
        throw eOFException;
    }
}


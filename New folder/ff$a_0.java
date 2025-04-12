/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from FF$a
 */
public final class ff$a_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static ff_2 a(String string2) {
        Object object;
        byte[] byArray;
        Object object2;
        block16: {
            int n3;
            int n4;
            block15: {
                int n7;
                int n8;
                int n10;
                block13: {
                    int n14;
                    int n15;
                    block14: {
                        int n16;
                        block5: {
                            int n17;
                            int n18;
                            int n19;
                            int n20;
                            int n21;
                            object2 = string2;
                            n15 = 65;
                            n10 = 1;
                            String string3 = "<this>";
                            Intrinsics.checkNotNullParameter(string2, string3);
                            Intrinsics.checkNotNullParameter(string2, string3);
                            int n22 = string2.length();
                            while (true) {
                                n21 = 9;
                                n20 = 32;
                                n19 = 13;
                                n18 = 10;
                                if (n22 <= 0) break;
                                n16 = n22 + -1;
                                if ((n16 = (int)((String)object2).charAt(n16)) != (n4 = 61) && n16 != n18 && n16 != n19 && n16 != n20 && n16 != n21) break;
                                n22 += -1;
                            }
                            long l2 = (long)n22 * (long)6;
                            long l3 = 8;
                            n4 = (int)(l2 /= l3);
                            byArray = new byte[n4];
                            int n24 = 0;
                            int n25 = 0;
                            n8 = 0;
                            n3 = 0;
                            while (true) {
                                block12: {
                                    int n26;
                                    block7: {
                                        block10: {
                                            block11: {
                                                block9: {
                                                    block8: {
                                                        block6: {
                                                            n26 = 0;
                                                            object = null;
                                                            if (n24 >= n22) break;
                                                            n14 = ((String)object2).charAt(n24);
                                                            if (n15 > n14 || n14 >= (n17 = 91)) break block6;
                                                            n14 -= n15;
                                                            break block7;
                                                        }
                                                        n17 = 97;
                                                        if (n17 > n14 || n14 >= (n17 = 123)) break block8;
                                                        n14 += -71;
                                                        break block7;
                                                    }
                                                    n17 = 48;
                                                    if (n17 > n14 || n14 >= (n17 = 58)) break block9;
                                                    n14 += 4;
                                                    break block7;
                                                }
                                                n17 = 43;
                                                if (n14 == n17 || n14 == (n17 = 45)) break block10;
                                                n17 = 47;
                                                if (n14 == n17 || n14 == (n17 = 95)) break block11;
                                                if (n14 != n18 && n14 != n19 && n14 != n20 && n14 != n21) break block5;
                                                n17 = 3;
                                                break block12;
                                            }
                                            n14 = 63;
                                            break block7;
                                        }
                                        n14 = 62;
                                    }
                                    n17 = n8 << 6;
                                    n14 |= n17;
                                    n17 = (n25 += n10) % 4;
                                    if (n17 == 0) {
                                        n17 = n3 + 1;
                                        byArray[n3] = n8 = (int)((byte)(n14 >> 16));
                                        n26 = n3 + 2;
                                        byArray[n17] = n8 = (int)((byte)(n14 >> 8));
                                        n17 = 3;
                                        n3 += n17;
                                        byArray[n26] = n8 = (int)((byte)n14);
                                    } else {
                                        n17 = 3;
                                    }
                                    n8 = n14;
                                }
                                n24 += n10;
                            }
                            n17 = 3;
                            if ((n25 %= 4) == n10) break block5;
                            n7 = 2;
                            if (n25 == n7) break block13;
                            if (n25 == n17) break block14;
                            break block15;
                        }
                        n16 = 0;
                        byArray = null;
                        break block16;
                    }
                    n14 = n8 << 6;
                    n10 += n3;
                    byArray[n3] = n15 = (int)((byte)(n14 >> 16));
                    n3 += n7;
                    byArray[n10] = n7 = (int)((byte)(n14 >> 8));
                    break block15;
                }
                n7 = n8 << 12;
                n10 += n3;
                byArray[n3] = n7 = (int)((byte)(n7 >> 16));
                n3 = n10;
            }
            if (n3 != n4) {
                byArray = Arrays.copyOf(byArray, n3);
                object2 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(byArray, (String)object2);
            }
        }
        if (byArray == null) return object;
        object2 = new ff_2(byArray);
        return object2;
    }

    public static ff_2 b(String object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((String)object).length() % 2;
        if (n3 == 0) {
            n3 = ((String)object).length() / 2;
            byte[] byArray = new byte[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = i3 * 2;
                int n7 = d_0.a(((String)object).charAt(n4)) << 4;
                ++n4;
                byArray[i3] = n4 = (int)((byte)(d_0.a(((String)object).charAt(n4)) + n7));
            }
            object = new ff_2(byArray);
            return object;
        }
        object = "Unexpected hex string: ".concat((String)object);
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static ff_2 c(String string2) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = Charsets.UTF_8;
        object = string2.getBytes((Charset)object);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        ff_2 ff_22 = new ff_2((byte[])object);
        ff_22.c = string2;
        return ff_22;
    }

    public static ff_2 d(byte[] byArray) {
        int n3 = l_0.a;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(byArray, (String)object);
        Intrinsics.checkNotNullParameter(byArray, (String)object);
        int n4 = l_0.a;
        if (n3 == n4) {
            n3 = byArray.length;
        }
        long l2 = byArray.length;
        long l3 = 0;
        long l4 = n3;
        l_0.b(l2, l3, l4);
        byArray = rp_1.l(0, byArray, n3 += 0);
        object = new ff_2(byArray);
        return object;
    }
}


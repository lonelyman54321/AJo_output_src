/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.http.URLDecodeException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.ranges.b;
import kotlin.text.Charsets;

/*
 * Renamed from PW
 */
public final class pw_1 {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final ArrayList d;
    public static final Set e;
    public static final ArrayList f;

    static {
        byte by2;
        Comparable<Byte> comparable;
        byte by4;
        int n3 = 6;
        int n4 = 5;
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        int n14 = 1;
        int n15 = 10;
        byte by22 = 97;
        char c2 = 'z';
        ArrayList<Object> arrayList = new ArrayList<Object>((char)by22, c2);
        int n16 = 65;
        char c3 = 'Z';
        Object[] objectArray = new a((char)n16, c3);
        arrayList = CollectionsKt.Y((b)((Object)arrayList), (b)objectArray);
        char c5 = '0';
        char c6 = '9';
        objectArray = new a(c5, c6);
        arrayList = CollectionsKt.W((Iterable)objectArray, arrayList);
        int c7 = yx_2.o(arrayList, n15);
        objectArray = new ArrayList(c7);
        arrayList = arrayList.iterator();
        while ((by4 = arrayList.hasNext()) != 0) {
            by4 = (byte)((Character)arrayList.next()).charValue();
            comparable = by4;
            objectArray.add(comparable);
        }
        a = CollectionsKt.o0((Iterable)objectArray);
        arrayList = new ArrayList<Object>((char)by22, c2);
        Serializable serializable = new Serializable((char)n16, c3);
        arrayList = CollectionsKt.Y((b)((Object)arrayList), (b)((Object)serializable));
        serializable = new Serializable(c5, c6);
        b = CollectionsKt.o0(CollectionsKt.W(serializable, arrayList));
        arrayList = new ArrayList<Object>((char)by22, 'f');
        Object object = new a((char)n16, 'F');
        arrayList = CollectionsKt.Y((b)((Object)arrayList), (b)object);
        object = new a(c5, c6);
        arrayList = CollectionsKt.o0(CollectionsKt.W((Iterable)object, arrayList));
        c = arrayList;
        int n17 = 58;
        object = Character.valueOf((char)n17);
        c2 = '/';
        serializable = Character.valueOf(c2);
        objectArray = Character.valueOf('?');
        Character c8 = Character.valueOf('#');
        c5 = '[';
        Character c10 = Character.valueOf(c5);
        c6 = ']';
        Character c11 = Character.valueOf(c6);
        char c12 = '@';
        Character c13 = Character.valueOf(c12);
        char c14 = '!';
        Character c15 = Character.valueOf(c14);
        char c16 = '$';
        Character c17 = Character.valueOf(c16);
        char c18 = '&';
        Character c19 = Character.valueOf(c18);
        char c20 = '\'';
        Character c22 = Character.valueOf(c20);
        char c23 = '(';
        Character c24 = Character.valueOf(c23);
        char c25 = ')';
        Character c26 = Character.valueOf(c25);
        char c27 = '*';
        Character c28 = Character.valueOf(c27);
        char c29 = ',';
        Character c30 = Character.valueOf(c29);
        char c31 = ';';
        Character c32 = Character.valueOf(c31);
        char c34 = '=';
        Character c35 = Character.valueOf(c34);
        char c36 = '-';
        Character c37 = Character.valueOf(c36);
        char c38 = '.';
        Character c39 = Character.valueOf(c38);
        char c40 = '_';
        Character c41 = Character.valueOf(c40);
        char c42 = '~';
        Character c43 = Character.valueOf(c42);
        char c44 = '+';
        Character c45 = Character.valueOf(c44);
        n16 = 22;
        Object object2 = new Character[n16];
        object2[0] = object;
        object2[n14] = serializable;
        object2[n10] = objectArray;
        object2[n8] = c8;
        object2[n7] = c10;
        object2[n4] = c11;
        object2[n3] = c13;
        object2[7] = c15;
        object2[8] = c17;
        object2[9] = c19;
        object2[n15] = c22;
        object2[11] = c24;
        object2[12] = c26;
        object2[13] = c28;
        object2[14] = c30;
        object2[15] = c32;
        object2[16] = c35;
        object2[17] = c37;
        object2[18] = c39;
        object2[19] = c41;
        object2[20] = c43;
        by22 = 21;
        object2[by22] = c45;
        object = p03_0.f(object2);
        int n18 = yx_2.o((Iterable)object, n15);
        serializable = new Serializable(n18);
        object = object.iterator();
        while ((by2 = object.hasNext()) != 0) {
            by2 = (byte)((Character)object.next()).charValue();
            objectArray = by2;
            serializable.add(objectArray);
        }
        d = serializable;
        arrayList = Character.valueOf((char)n17);
        object = Character.valueOf(c12);
        serializable = Character.valueOf(c14);
        objectArray = Character.valueOf(c16);
        object2 = Character.valueOf(c18);
        c8 = Character.valueOf(c20);
        c10 = Character.valueOf(c23);
        c11 = Character.valueOf(c25);
        comparable = Character.valueOf(c27);
        c13 = Character.valueOf(c44);
        c15 = Character.valueOf(c29);
        c17 = Character.valueOf(c31);
        c19 = Character.valueOf(c34);
        Character c46 = Character.valueOf(c36);
        c22 = Character.valueOf(c38);
        Character c47 = Character.valueOf(c40);
        c24 = Character.valueOf(c42);
        n15 = 17;
        Object object3 = new Character[n15];
        object3[0] = arrayList;
        object3[n14] = object;
        object3[n10] = serializable;
        object3[n8] = objectArray;
        object3[n7] = object2;
        object3[n4] = c8;
        object3[n3] = c10;
        object3[7] = c11;
        object3[8] = comparable;
        object3[9] = c13;
        object3[10] = c15;
        object3[11] = c17;
        object3[12] = c19;
        object3[13] = c46;
        object3[14] = c22;
        object3[15] = c47;
        object3[16] = c24;
        e = p03_0.f((Object[])object3);
        object3 = b;
        arrayList = Character.valueOf(c14);
        object = Character.valueOf('#');
        serializable = Character.valueOf(c16);
        objectArray = Character.valueOf(c18);
        object2 = Character.valueOf(c44);
        c8 = Character.valueOf(c36);
        c10 = Character.valueOf(c38);
        c6 = '^';
        c11 = Character.valueOf(c6);
        comparable = Character.valueOf(c40);
        char c48 = '`';
        Character c49 = Character.valueOf(c48);
        char c50 = '|';
        Character c51 = Character.valueOf(c50);
        Character c53 = Character.valueOf(c42);
        n3 = 12;
        Object[] objectArray2 = new Character[n3];
        objectArray2[0] = arrayList;
        objectArray2[n14] = object;
        objectArray2[n10] = serializable;
        objectArray2[n8] = objectArray;
        objectArray2[n7] = object2;
        objectArray2[n4] = c8;
        objectArray2[6] = c10;
        objectArray2[7] = c11;
        objectArray2[8] = comparable;
        objectArray2[9] = c49;
        objectArray2[10] = c51;
        n17 = 11;
        objectArray2[n17] = c53;
        arrayList = p03_0.f(objectArray2);
        q03_0.h((Set)object3, arrayList);
        object3 = Character.valueOf(c36);
        arrayList = Character.valueOf(c38);
        object = Character.valueOf(c40);
        serializable = Character.valueOf(c42);
        objectArray = new Character[n7];
        objectArray[0] = object3;
        objectArray[n14] = arrayList;
        objectArray[n10] = object;
        objectArray[n8] = serializable;
        object3 = xx_2.i(objectArray);
        by22 = yx_2.o((Iterable)object3, 10);
        arrayList = new ArrayList<Object>(by22);
        object3 = object3.iterator();
        while ((by22 = (byte)(object3.hasNext() ? 1 : 0)) != 0) {
            by22 = (byte)((Character)object3.next()).charValue();
            object = by22;
            arrayList.add(object);
        }
        f = arrayList;
    }

    public static final int a(char n3) {
        int n4;
        int n7 = 48;
        n3 = n7 <= n3 && n3 < (n4 = 58) ? (n3 -= n7) : ((n7 = 65) <= n3 && n3 < (n7 = 71) ? (n3 += -55) : ((n7 = 97) <= n3 && n3 < (n7 = 103) ? (n3 += -87) : -1));
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final String b(String string2, int n3, int n4, boolean n7) {
        StringBuilder stringBuilder;
        char c2;
        char c3;
        char c5;
        int n8;
        block14: {
            for (n8 = n3; n8 < n4; ++n8) {
                c5 = string2.charAt(n8);
                c3 = '+';
                c2 = '%';
                if (c5 != c2 && (n7 == 0 || c5 != c3)) {
                    continue;
                }
                c5 = n4 - n3;
                char c6 = '\u00ff';
                if (c5 > c6) {
                    c5 /= 3;
                }
                stringBuilder = new StringBuilder(c5);
                if (n8 > n3) {
                    stringBuilder.append(string2, n3, n8);
                }
                break block14;
            }
            if (n3 == 0 && n4 == (n7 = string2.length())) {
                return string2;
            }
            string2 = string2.substring(n3, n4);
            String string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            return string2;
        }
        n3 = 0;
        Object var10_10 = null;
        while (true) {
            if (n8 >= n4) {
                string2 = stringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
            c5 = string2.charAt(n8);
            if (n7 != 0 && c5 == c3) {
                c5 = ' ';
                stringBuilder.append(c5);
            } else {
                if (c5 == c2) {
                    int n10;
                    Object object;
                    int n14;
                    void var10_11;
                    if (var10_11 == null) {
                        n3 = (n4 - n8) / 3;
                        byte[] byArray = new byte[n3];
                    }
                    c5 = '\u0000';
                    int n15 = 0;
                    while (n8 < n4 && (n14 = string2.charAt(n8)) == c2) {
                        n14 = n8 + 2;
                        object = ", in ";
                        if (n14 >= n4) {
                            StringBuilder stringBuilder2 = new StringBuilder("Incomplete trailing HEX escape: ");
                            n7 = string2.length();
                            String string4 = ((Object)string2.subSequence(n8, n7)).toString();
                            stringBuilder2.append(string4);
                            stringBuilder2.append((String)object);
                            stringBuilder2.append((Object)string2);
                            stringBuilder2.append(" at ");
                            stringBuilder2.append(n8);
                            string2 = stringBuilder2.toString();
                            URLDecodeException uRLDecodeException = new URLDecodeException(string2);
                            throw uRLDecodeException;
                        }
                        int n16 = n8 + 1;
                        int n17 = pw_1.a(string2.charAt(n16));
                        int n18 = pw_1.a(string2.charAt(n14));
                        int n19 = -1;
                        if (n17 != n19 && n18 != n19) {
                            n14 = n15 + 1;
                            n17 = n17 * 16 + n18;
                            var10_11[n15] = n10 = (int)((byte)n17);
                            n8 += 3;
                            n15 = n14;
                            continue;
                        }
                        StringBuilder stringBuilder3 = new StringBuilder("Wrong HEX escape: %");
                        n7 = string2.charAt(n16);
                        stringBuilder3.append((char)n7);
                        n7 = string2.charAt(n14);
                        stringBuilder3.append((char)n7);
                        stringBuilder3.append((String)object);
                        stringBuilder3.append((Object)string2);
                        stringBuilder3.append(", at ");
                        stringBuilder3.append(n8);
                        string2 = stringBuilder3.toString();
                        URLDecodeException uRLDecodeException = new URLDecodeException(string2);
                        throw uRLDecodeException;
                    }
                    Intrinsics.checkNotNullParameter(var10_11, "<this>");
                    Object object2 = x0_0.a;
                    n10 = ((void)var10_11).length;
                    object2.getClass();
                    X0$a.a(0, n15, n10);
                    object = Charsets.UTF_8;
                    object2 = new String((byte[])var10_11, 0, n15, (Charset)object);
                    stringBuilder.append((String)object2);
                    continue;
                }
                stringBuilder.append(c5);
            }
            ++n8;
        }
    }

    public static String c(String string2) {
        int n3 = string2.length();
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return pw_1.b(string2, 0, n3, false);
    }

    public static String d(String string2, int n3, int n4, boolean bl2, int n7) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n8 = n7 & 2) != 0) {
            n4 = string2.length();
        }
        if ((n7 &= 4) != 0) {
            bl2 = false;
        }
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return pw_1.b(string2, n3, n4, bl2);
    }

    public static final String e(String object, boolean bl2) {
        block2: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            StringBuilder stringBuilder = new StringBuilder();
            CharsetEncoder charsetEncoder = Charsets.UTF_8.newEncoder();
            String string3 = "newEncoder(...)";
            Intrinsics.checkNotNullExpressionValue(charsetEncoder, string3);
            int n3 = ((String)object).length();
            Intrinsics.checkNotNullParameter(charsetEncoder, string2);
            String string4 = "input";
            Intrinsics.checkNotNullParameter(object, string4);
            ee_2 ee_22 = new ee_2();
            Intrinsics.checkNotNullParameter(charsetEncoder, string2);
            String string5 = "destination";
            Intrinsics.checkNotNullParameter(ee_22, string5);
            Intrinsics.checkNotNullParameter(object, string4);
            if (n3 > 0) {
                int n4;
                string5 = null;
                int n7 = 0;
                do {
                    Intrinsics.checkNotNullParameter(charsetEncoder, string2);
                    Intrinsics.checkNotNullParameter(object, string4);
                    Intrinsics.checkNotNullParameter(ee_22, "dst");
                    byte[] byArray = os_2.a(charsetEncoder, (CharSequence)object, n7, n3);
                    int n8 = byArray.length;
                    ee_22.n(byArray, 0, n8);
                    n4 = byArray.length;
                    if (n4 < 0) break block2;
                } while ((n7 += n4) < n3);
            }
            object = new mw_2(stringBuilder, bl2);
            pw_1.f(ee_22, (Function1)object);
            return stringBuilder.toString();
        }
        object = new IllegalStateException("Check failed.");
        throw object;
    }

    public static final void f(ee_2 ee_22, Function1 object) {
        int n3 = 1;
        L l2 = new L(object, n3);
        int n4 = af_2.a;
        Intrinsics.checkNotNullParameter(ee_22, "<this>");
        object = "block";
        Intrinsics.checkNotNullParameter(l2, (String)object);
        while ((n4 = (int)(ee_22.g() ? 1 : 0)) == 0) {
            l2.invoke(ee_22);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final String g(byte by2) {
        char c2 = (by2 & 0xFF) >> 4;
        char c3 = '\n';
        c2 = c2 >= '\u0000' && c2 < c3 ? (c2 += 48) : (char)(c2 + 65) - c3;
        c2 = c2;
        by2 = (byte)(by2 & 0xF);
        by2 = by2 >= 0 && by2 < c3 ? (byte)(by2 + 48) : (byte)((char)(by2 + 65) - c3);
        by2 = by2;
        char[] cArray = new char[]{'%', c2, (char)by2};
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        return new String(cArray);
    }
}


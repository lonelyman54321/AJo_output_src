/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.d;
import kotlin.ranges.e;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.time.a;

public final class b {
    /*
     * Enabled aggressive block sorting
     */
    public static final long a(String string2) {
        long l2;
        int n3;
        aw0_1 aw0_12;
        Object object = string2;
        char c2 = '\u0001';
        int n4 = string2.length();
        if (n4 == 0) {
            object = new IllegalArgumentException("The string is empty");
            throw object;
        }
        a.b.getClass();
        int n7 = 0;
        int n8 = string2.charAt(0);
        int n10 = 43;
        int n14 = 45;
        if (n8 == n10 || n8 == n14) {
            n8 = 1;
        } else {
            n8 = 0;
            aw0_12 = null;
        }
        n10 = n8 > 0 ? 1 : 0;
        n10 = n10 != 0 && (n10 = (int)(StringsKt.d0((CharSequence)object, (char)n14) ? 1 : 0)) != 0 ? 1 : 0;
        if (n4 <= n8) {
            object = new IllegalArgumentException("No components");
            throw object;
        }
        n14 = ((String)object).charAt(n8);
        if (n14 != (n3 = 80)) {
            object = new IllegalArgumentException();
            throw object;
        }
        if ((n8 += c2) == n4) {
            object = new IllegalArgumentException();
            throw object;
        }
        n14 = 0;
        Object object2 = null;
        long l3 = 0L;
        boolean bl2 = false;
        while (n8 < n4) {
            int n15;
            int n16;
            Object object3;
            boolean bl3;
            char c3;
            int n17 = ((String)object).charAt(n8);
            if (n17 == (c3 = 'T')) {
                if (!bl2 && (n8 += c2) != n4) {
                    bl2 = true;
                    continue;
                }
                object = new IllegalArgumentException();
                throw object;
            }
            for (n17 = n8; n17 < (c3 = string2.length()) && ((bl3 = ((kotlin.ranges.b)(object3 = new kotlin.ranges.a((char)(n16 = 48), (char)(n15 = 57)))).d(c3 = (char)((String)object).charAt(n17))) || (c3 = (char)(StringsKt.G((CharSequence)(object3 = "+-."), c3) ? 1 : 0)) != '\u0000'); n17 += c2) {
            }
            String string3 = "null cannot be cast to non-null type java.lang.String";
            Intrinsics.checkNotNull(object, string3);
            String string4 = ((String)object).substring(n8, n17);
            object3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
            n16 = string4.length();
            if (n16 == 0) {
                object = new IllegalArgumentException();
                throw object;
            }
            n16 = string4.length() + n8;
            if (n16 >= 0 && n16 <= (n8 = StringsKt.K(string2))) {
                int n18;
                int n19;
                n8 = ((String)object).charAt(n16);
                n16 += c2;
                if (!bl2) {
                    n15 = 68;
                    if (n8 != n15) {
                        StringBuilder stringBuilder = new StringBuilder("Invalid or unsupported duration ISO non-time unit: ");
                        stringBuilder.append((char)n8);
                        String string5 = stringBuilder.toString();
                        object = new IllegalArgumentException(string5);
                        throw object;
                    }
                    aw0_12 = aw0_1.DAYS;
                } else {
                    n15 = 72;
                    if (n8 == n15) {
                        aw0_12 = aw0_1.HOURS;
                    } else {
                        n15 = 77;
                        if (n8 == n15) {
                            aw0_12 = aw0_1.MINUTES;
                        } else {
                            n15 = 83;
                            if (n8 != n15) {
                                StringBuilder stringBuilder = new StringBuilder("Invalid duration ISO time unit: ");
                                stringBuilder.append((char)n8);
                                String string6 = stringBuilder.toString();
                                object = new IllegalArgumentException(string6);
                                throw object;
                            }
                            aw0_12 = aw0_1.SECONDS;
                        }
                    }
                }
                if (object2 != null && (n14 = ((Enum)object2).compareTo(aw0_12)) <= 0) {
                    object = new IllegalArgumentException("Unexpected order of duration components");
                    throw object;
                }
                n15 = 6;
                n14 = StringsKt.N(string4, '.', 0, false, n15);
                aw0_1 aw0_13 = aw0_1.SECONDS;
                if (aw0_12 == aw0_13 && n14 > 0) {
                    Intrinsics.checkNotNull(string4, string3);
                    String string7 = string4.substring(0, n14);
                    Intrinsics.checkNotNullExpressionValue(string7, (String)object3);
                    long l4 = b.g(b.e(string7), aw0_12);
                    l3 = a.f(l3, l4);
                    Intrinsics.checkNotNull(string4, string3);
                    object2 = string4.substring(n14);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    double d2 = Double.parseDouble((String)object2);
                    Intrinsics.checkNotNullParameter((Object)aw0_12, "unit");
                    object2 = aw0_1.NANOSECONDS;
                    double d5 = bw0_2.a(d2, aw0_12, (aw0_1)((Object)object2));
                    n14 = Double.isNaN(d5) ^ c2;
                    if (n14 == 0) {
                        String string8 = "Duration value cannot be NaN.".toString();
                        object = new IllegalArgumentException(string8);
                        throw object;
                    }
                    l4 = ok1_1.c(d5);
                    n19 = n4;
                    l2 = -4611686018426999999L;
                    double d7 = -2.0000000001722644;
                    n18 = n16;
                    long l7 = 4611686018426999999L;
                    object2 = new d(l2, l7);
                    c2 = (char)(((e)object2).d(l4) ? 1 : 0);
                    if (c2 != '\u0000') {
                        l2 = b.d(l4);
                    } else {
                        aw0_1 aw0_14 = aw0_1.MILLISECONDS;
                        d7 = bw0_2.a(d2, aw0_12, aw0_14);
                        l2 = b.c(ok1_1.c(d7));
                    }
                    l3 = a.f(l3, l2);
                } else {
                    n19 = n4;
                    n18 = n16;
                    l2 = b.g(b.e(string4), aw0_12);
                    l3 = a.f(l3, l2);
                }
                object2 = aw0_12;
                n4 = n19;
                n8 = n18;
                c2 = '\u0001';
                continue;
            }
            String string9 = "Missing unit for value ".concat(string4);
            object = new IllegalArgumentException(string9);
            throw object;
        }
        if (n10 != 0) {
            int n20 = 1;
            l2 = -(l3 >> n20);
            n7 = (int)l3 & n20;
            long l8 = l2 << n20;
            long l12 = n7;
            l3 = l8 + l12;
            n20 = yw0_2.a;
        }
        return l3;
    }

    public static final long b(long l2) {
        l2 = (l2 << 1) + 1L;
        return l2;
    }

    public static final long c(long l2) {
        long l3 = -4611686018426L;
        long l4 = 4611686018426L;
        e e2 = new e(l3, l4);
        int n3 = e2.d(l2);
        if (n3 != 0) {
            n3 = 1000000;
            long l7 = n3;
            l2 = b.d(l2 * l7);
        } else {
            long l8 = -4611686018427387903L;
            long l12 = 0x3FFFFFFFFFFFFFFFL;
            long l14 = l2;
            l2 = b.b(f.i(l2, l8, l12));
        }
        return l2;
    }

    public static final long d(long l2) {
        return l2 <<= 1;
    }

    /*
     * WARNING - void declaration
     */
    public static final long e(String string2) {
        Object object;
        void var5_8;
        int n3;
        Object object2;
        boolean c2;
        int n4 = string2.length();
        int n7 = 1;
        if (n4 > 0 && (c2 = StringsKt.G((CharSequence)(object2 = "+-"), (char)(n3 = string2.charAt(0))))) {
            boolean bl2 = true;
        } else {
            boolean bl3 = false;
            object2 = null;
        }
        n3 = 16;
        if ((n4 -= var5_8) > n3) {
            char c3;
            n3 = StringsKt.K(string2);
            object = new c((int)var5_8, n3, n7);
            boolean bl4 = object instanceof Collection;
            if (bl4) {
                object2 = object;
                object2 = (Collection)object;
                boolean bl5 = object2.isEmpty();
                if (bl5) {
                    char c5 = string2.charAt(0);
                    n4 = 45;
                    long l2 = c5 == n4 ? Long.MIN_VALUE : Long.MAX_VALUE;
                    return l2;
                }
            }
            object = ((c)object).d();
            while ((c3 = ((ui1_2)object).c) != '\u0000') {
                c3 = ((mi1_2)object).nextInt();
                char c6 = '0';
                char c7 = '9';
                kotlin.ranges.b b2 = new kotlin.ranges.a(c6, c7);
                c3 = string2.charAt(c3);
                if ((c3 = (char)(b2.d(c3) ? 1 : 0)) != '\u0000') continue;
                break;
            }
        }
        if ((n4 = (int)(kotlin.text.b.s(string2, (String)(object = "+"), false) ? 1 : 0)) != 0) {
            string2 = le3_2.B(n7, string2);
        }
        return Long.parseLong(string2);
    }

    public static final long f(int n3, aw0_1 aw0_12) {
        long l2;
        Intrinsics.checkNotNullParameter((Object)aw0_12, "unit");
        aw0_1 aw0_13 = aw0_1.SECONDS;
        int n4 = aw0_12.compareTo(aw0_13);
        if (n4 <= 0) {
            long l3 = n3;
            aw0_1 aw0_14 = aw0_1.NANOSECONDS;
            l2 = b.d(bw0_2.b(l3, aw0_12, aw0_14));
        } else {
            long l4 = n3;
            l2 = b.g(l4, aw0_12);
        }
        return l2;
    }

    public static final long g(long l2, aw0_1 enum_) {
        Intrinsics.checkNotNullParameter(enum_, "unit");
        Enum enum_2 = aw0_1.NANOSECONDS;
        long l3 = bw0_2.b(4611686018426999999L, (aw0_1)enum_2, (aw0_1)enum_);
        long l4 = -l3;
        e e2 = new d(l4, l3);
        boolean bl2 = e2.d(l2);
        if (bl2) {
            return b.d(bw0_2.b(l2, (aw0_1)enum_, (aw0_1)enum_2));
        }
        enum_2 = aw0_1.MILLISECONDS;
        Intrinsics.checkNotNullParameter(enum_, "sourceUnit");
        Intrinsics.checkNotNullParameter(enum_2, "targetUnit");
        enum_2 = ((aw0_1)enum_2).getTimeUnit$kotlin_stdlib();
        enum_ = ((aw0_1)enum_).getTimeUnit$kotlin_stdlib();
        return b.b(f.i(((TimeUnit)enum_2).convert(l2, (TimeUnit)enum_), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }
}


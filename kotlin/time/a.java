/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.e;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.time.a$a;
import kotlin.time.b;

public final class a
implements Comparable {
    public static final a$a b;
    public static final long c;
    public static final long d;
    public final long a;

    static {
        a$a a$a;
        b = a$a = new a$a(null);
        c = kotlin.time.b.b(0x3FFFFFFFFFFFFFFFL);
        d = kotlin.time.b.b(-4611686018427387903L);
    }

    public /* synthetic */ a(long l2) {
        this.a = l2;
    }

    public static final long a(long l2, long l3) {
        long l4 = -4611686018426L;
        long l7 = 4611686018426L;
        e e2 = new d(l4, l7);
        int n3 = 1000000;
        long l8 = n3;
        long l12 = l3 / l8;
        long l14 = l2 + l12;
        boolean bl2 = e2.d(l14);
        if (bl2) {
            l14 = l14 * l8 + (l3 -= (l12 *= l8));
            l2 = kotlin.time.b.d(l14);
        } else {
            l4 = -4611686018427387903L;
            l7 = 0x3FFFFFFFFFFFFFFFL;
            l2 = kotlin.time.b.b(f.i(l14, l4, l7));
        }
        return l2;
    }

    public static final void b(StringBuilder stringBuilder, int n3, int n4, int n7, String string2, boolean bl2) {
        stringBuilder.append(n3);
        if (n4 != 0) {
            char c2;
            char c3;
            n3 = 46;
            stringBuilder.append((char)n3);
            String string3 = String.valueOf(n4);
            string3 = StringsKt.T(n7, string3);
            n4 = string3.length();
            n7 = -1;
            if ((n4 += n7) >= 0) {
                while (true) {
                    int n8 = n4 + -1;
                    c3 = string3.charAt(n4);
                    if (c3 != (c2 = '0')) {
                        n7 = n4;
                        break;
                    }
                    if (n8 < 0) break;
                    n4 = n8;
                }
            }
            n4 = n7 + 1;
            String string4 = "append(...)";
            c3 = '\u0000';
            c2 = '\u0003';
            if (!bl2 && n4 < c2) {
                stringBuilder.append(string3, 0, n4);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string4);
            } else {
                n7 = (n7 + c2) / c2 * 3;
                stringBuilder.append(string3, 0, n7);
                Intrinsics.checkNotNullExpressionValue(stringBuilder, string4);
            }
        }
        stringBuilder.append(string2);
    }

    public static final long c(long l2) {
        int n3 = (int)l2;
        int n4 = 1;
        if ((n3 &= n4) == n4 && (n3 = kotlin.time.a.e(l2) ^ n4) != 0) {
            l2 >>= n4;
        } else {
            aw0_1 aw0_12 = aw0_1.MILLISECONDS;
            l2 = kotlin.time.a.g(l2, aw0_12);
        }
        return l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int d(long l2) {
        int n3 = kotlin.time.a.e(l2);
        int n4 = 0;
        if (n3 != 0) return n4;
        n3 = (int)l2;
        int n7 = 1;
        if ((n3 &= n7) == n7) {
            n4 = 1;
        }
        if (n4 != 0) {
            l2 >>= n7;
            long l3 = 1000;
            l2 %= l3;
            n3 = 1000000;
            l3 = n3;
            l2 *= l3;
            return (int)l2;
        }
        l2 >>= n7;
        n3 = 1000000000;
        long l4 = n3;
        l2 %= l4;
        return (int)l2;
    }

    public static final boolean e(long l2) {
        long l3;
        long l4 = c;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object == false || (object = (l3 = l2 - (l4 = d)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false;
        return bl2;
    }

    public static final long f(long l2, long l3) {
        int n3 = kotlin.time.a.e(l2);
        int n4 = 1;
        if (n3 != 0) {
            long l4;
            long l7;
            long l8;
            n3 = kotlin.time.a.e(l3) ^ n4;
            if (n3 == 0 && (l8 = (l7 = (l3 ^= l2) - (l4 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                throw illegalArgumentException;
            }
            return l2;
        }
        n3 = kotlin.time.a.e(l3);
        if (n3 != 0) {
            return l3;
        }
        n3 = (int)l2 & n4;
        int n7 = (int)l3 & n4;
        if (n3 == n7) {
            l2 >>= n4;
            l2 += (l3 >>= n4);
            if (n3 == 0) {
                long l12 = -4611686018426999999L;
                long l14 = 4611686018426999999L;
                e e2 = new d(l12, l14);
                int n8 = e2.d(l2);
                if (n8 != 0) {
                    l2 = kotlin.time.b.d(l2);
                } else {
                    n8 = 1000000;
                    l3 = n8;
                    l2 = kotlin.time.b.b(l2 / l3);
                }
            } else {
                l2 = kotlin.time.b.c(l2);
            }
        } else if (n3 == n4) {
            l2 >>= n4;
            l2 = kotlin.time.a.a(l2, l3 >>= n4);
        } else {
            l2 >>= n4;
            l2 = kotlin.time.a.a(l3 >>= n4, l2);
        }
        return l2;
    }

    public static final long g(long l2, aw0_1 aw0_12) {
        String string2 = "unit";
        Intrinsics.checkNotNullParameter((Object)aw0_12, string2);
        long l3 = c;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            l2 = Long.MAX_VALUE;
        } else {
            l3 = d;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                l2 = Long.MIN_VALUE;
            } else {
                int n3 = 1;
                long l7 = l2 >> n3;
                int n4 = (int)l2;
                int n7 = n4 & 1;
                Enum enum_ = n7 == 0 ? aw0_1.NANOSECONDS : aw0_1.MILLISECONDS;
                Intrinsics.checkNotNullParameter(enum_, "sourceUnit");
                Intrinsics.checkNotNullParameter((Object)aw0_12, "targetUnit");
                TimeUnit timeUnit = aw0_12.getTimeUnit$kotlin_stdlib();
                enum_ = ((aw0_1)enum_).getTimeUnit$kotlin_stdlib();
                l2 = timeUnit.convert(l7, (TimeUnit)enum_);
            }
        }
        return l2;
    }

    public final int compareTo(Object object) {
        object = (a)object;
        long l2 = this.a;
        long l3 = ((a)object).a;
        long l4 = l2 ^ l3;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 >= 0 && (object2 = (Object)((int)l4 & 1)) != false) {
            object2 = (int)l2 & 1;
            int n3 = (int)l3;
            int n4 = n3 & 1;
            object2 -= n4;
            n4 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
            if (n4 < 0) {
                object2 = -object2;
            }
        } else {
            object2 = Intrinsics.compare(l2, l3);
        }
        return (int)object2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof a;
        boolean bl3 = false;
        if (bl2) {
            object = (a)object;
            long l2 = this.a;
            long l3 = ((a)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        CharSequence charSequence;
        int n3 = 1;
        long l2 = this.a;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            charSequence = "0s";
        } else {
            long l7 = c;
            long l8 = l2 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false) {
                charSequence = "Infinity";
            } else {
                l7 = d;
                long l12 = l2 - l7;
                object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 == false) {
                    charSequence = "-Infinity";
                } else {
                    int n4;
                    String string2;
                    int n7;
                    StringBuilder stringBuilder;
                    Object object3;
                    aw0_1 aw0_12;
                    int n8;
                    long l14;
                    char c2;
                    int n10;
                    int n14;
                    long l15;
                    char c3 = object < 0 ? (char)'\u0001' : '\u0000';
                    StringBuilder stringBuilder2 = new StringBuilder();
                    if (c3 != '\u0000') {
                        object2 = 45;
                        stringBuilder2.append((char)object2);
                    }
                    if (object < 0) {
                        l15 = -(l2 >> n3);
                        n14 = (int)l2;
                        n10 = n14 & 1;
                        l2 = (long)n10 + (l15 <<= n3);
                        object = yw0_2.a;
                    }
                    aw0_1 aw0_13 = aw0_1.DAYS;
                    l15 = kotlin.time.a.g(l2, aw0_13);
                    object = kotlin.time.a.e(l2);
                    if (object != false) {
                        c2 = c3;
                        object = 0;
                        aw0_13 = null;
                    } else {
                        aw0_13 = aw0_1.HOURS;
                        l14 = kotlin.time.a.g(l2, aw0_13);
                        c2 = c3;
                        l7 = 24;
                        object = (int)(l14 %= l7);
                    }
                    int n15 = kotlin.time.a.e(l2);
                    c3 = '<';
                    if (n15 != 0) {
                        n8 = 0;
                        charSequence = null;
                    } else {
                        aw0_12 = aw0_1.MINUTES;
                        l14 = kotlin.time.a.g(l2, aw0_12);
                        long l16 = c3;
                        n8 = (int)(l14 %= l16);
                    }
                    n3 = (int)(kotlin.time.a.e(l2) ? 1 : 0);
                    if (n3 != 0) {
                        n15 = 0;
                        aw0_12 = null;
                    } else {
                        object3 = aw0_1.SECONDS;
                        l14 = kotlin.time.a.g(l2, object3);
                        l7 = c3;
                        n15 = (int)(l14 %= l7);
                    }
                    int n16 = kotlin.time.a.d(l2);
                    n10 = (int)(l15 == l3 ? 0 : (l15 < l3 ? -1 : 1));
                    if (n10 != 0) {
                        n10 = 1;
                    } else {
                        n10 = 0;
                        stringBuilder = null;
                    }
                    n14 = object != false ? 1 : 0;
                    boolean bl2 = n8 != 0;
                    boolean bl3 = n15 != 0 || n16 != 0;
                    if (n10 != 0) {
                        stringBuilder2.append(l15);
                        c3 = 'd';
                        stringBuilder2.append(c3);
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    c3 = ' ';
                    if (n14 != 0 || n10 != 0 && (bl2 || bl3)) {
                        object2 = 1;
                        n4 = n7 + 1;
                        if (n7 > 0) {
                            stringBuilder2.append(c3);
                        }
                        stringBuilder2.append((int)object);
                        object = 104;
                        stringBuilder2.append((char)object);
                        n7 = n4;
                    }
                    if (!bl2 && (!bl3 || n14 == 0 && n10 == 0)) {
                        object = 1;
                    } else {
                        object = 1;
                        object2 = n7 + 1;
                        if (n7 > 0) {
                            stringBuilder2.append(c3);
                        }
                        stringBuilder2.append(n8);
                        n8 = 109;
                        stringBuilder2.append((char)n8);
                        n7 = (int)object2;
                    }
                    if (bl3) {
                        n8 = n7 + 1;
                        if (n7 > 0) {
                            stringBuilder2.append(c3);
                        }
                        if (n15 == 0 && n10 == 0 && n14 == 0 && !bl2) {
                            n10 = 1000000;
                            if (n16 >= n10) {
                                n4 = n16 / n10;
                                n16 %= n10;
                                int n17 = 6;
                                string2 = "ms";
                                n3 = 0;
                                object3 = null;
                                StringBuilder stringBuilder3 = stringBuilder2;
                                stringBuilder = stringBuilder2;
                                stringBuilder2 = null;
                                kotlin.time.a.b(stringBuilder3, n4, n16, n17, string2, false);
                            } else {
                                stringBuilder = stringBuilder2;
                                n3 = 1000;
                                if (n16 >= n3) {
                                    n4 = n16 / 1000;
                                    int n18 = 3;
                                    string2 = "us";
                                    stringBuilder2 = null;
                                    StringBuilder stringBuilder4 = stringBuilder;
                                    kotlin.time.a.b(stringBuilder, n4, n16 %= n3, n18, string2, false);
                                } else {
                                    stringBuilder2.append(n16);
                                    object3 = "ns";
                                    stringBuilder2.append((String)object3);
                                }
                            }
                        } else {
                            stringBuilder = stringBuilder2;
                            int n19 = 9;
                            string2 = "s";
                            stringBuilder2 = null;
                            StringBuilder stringBuilder5 = stringBuilder;
                            n4 = n15;
                            kotlin.time.a.b(stringBuilder, n15, n16, n19, string2, false);
                        }
                        n7 = n8;
                    } else {
                        stringBuilder = stringBuilder2;
                    }
                    if (c2 != '\u0000' && n7 > (n8 = 1)) {
                        charSequence = stringBuilder.insert(n8, '(');
                        n3 = 41;
                        ((StringBuilder)charSequence).append((char)n3);
                    }
                    charSequence = stringBuilder.toString();
                    object3 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(charSequence, (String)object3);
                }
            }
        }
        return charSequence;
    }
}


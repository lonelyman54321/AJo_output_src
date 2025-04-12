/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public class f
extends gd2_2 {
    public static float a(float f5, float f6) {
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object < 0) {
            f5 = f6;
        }
        return f5;
    }

    public static long b(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object < 0) {
            l2 = l3;
        }
        return l2;
    }

    public static float c(float f5, float f6) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object > 0) {
            f5 = f6;
        }
        return f5;
    }

    public static long d(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            l2 = l3;
        }
        return l2;
    }

    public static double e(double d2, double d5, double d7) {
        Object object = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
        if (object <= 0) {
            object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
            if (object < 0) {
                return d5;
            }
            Object object2 = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
            if (object2 > 0) {
                return d7;
            }
            return d2;
        }
        CharSequence charSequence = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        charSequence.append(d7);
        charSequence.append(" is less than minimum ");
        charSequence.append(d5);
        charSequence.append('.');
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public static float f(float f5, float f6, float f7) {
        Object object = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (object <= 0) {
            object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
            if (object < 0) {
                return f6;
            }
            Object object2 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
            if (object2 > 0) {
                return f7;
            }
            return f5;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(f7);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(f6);
        stringBuilder.append('.');
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int g(int n3, int n4, int n7) {
        if (n4 <= n7) {
            if (n3 < n4) {
                return n4;
            }
            if (n3 > n7) {
                return n7;
            }
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n7);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n4);
        stringBuilder.append('.');
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int h(int n3, IntRange object) {
        Object object2 = "range";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object instanceof cw_2;
        char c2 = '.';
        String string2 = "Cannot coerce value to an empty range: ";
        if (n4 != 0) {
            Object object3 = n3;
            object = (cw_2)object;
            String string3 = "<this>";
            Intrinsics.checkNotNullParameter(object3, string3);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            boolean bl2 = object.isEmpty();
            if (!bl2) {
                boolean bl3;
                object2 = object.getStart();
                boolean n7 = object.a((Comparable)object3, (Comparable)object2);
                if (n7 && !(bl3 = object.a((Comparable)(object2 = object.getStart()), (Comparable)object3))) {
                    object3 = object.getStart();
                } else {
                    boolean bl4;
                    object2 = object.c();
                    boolean bl5 = object.a((Comparable)object2, (Comparable)object3);
                    if (bl5 && !(bl4 = object.a((Comparable)object3, (Comparable)(object2 = object.c())))) {
                        object3 = object.c();
                    }
                }
                return ((Number)object3).intValue();
            }
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(c2);
            object = ((StringBuilder)object2).toString();
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
        boolean bl6 = ((IntRange)object).isEmpty();
        if (!bl6) {
            int n7 = ((c)object).a;
            Integer n8 = n7;
            n4 = n8;
            if (n3 < n4) {
                Integer n10 = n7;
                n3 = n10;
            } else {
                int n10 = ((c)object).b;
                object2 = n10;
                int n14 = ((Number)object2).intValue();
                if (n3 > n14) {
                    Integer n15 = n10;
                    n3 = n15;
                }
            }
            return n3;
        }
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(c2);
        object = ((StringBuilder)object2).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static long i(long l2, long l3, long l4) {
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object <= 0) {
            object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object < 0) {
                return l3;
            }
            Object object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object2 > 0) {
                return l4;
            }
            return l2;
        }
        CharSequence charSequence = D70.c(l4, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        charSequence.append(l3);
        charSequence.append('.');
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Comparable j(Integer serializable, Integer object, Integer n3) {
        int n4;
        int n7;
        CharSequence charSequence = "<this>";
        Intrinsics.checkNotNullParameter(serializable, (String)charSequence);
        if (object != null && n3 != null) {
            int n8 = ((Integer)object).compareTo((Object)n3);
            if (n8 <= 0) {
                n8 = ((Integer)serializable).compareTo(object);
                if (n8 < 0) {
                    return object;
                }
                int n10 = ((Integer)serializable).compareTo((Object)n3);
                if (n10 <= 0) return serializable;
                return n3;
            }
            charSequence = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(" is less than minimum ");
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append('.');
            object = ((StringBuilder)charSequence).toString();
            serializable = new IllegalArgumentException((String)object);
            throw serializable;
        }
        if (object != null && (n7 = ((Integer)serializable).compareTo(object)) < 0) {
            return object;
        }
        if (n3 == null || (n4 = ((Integer)serializable).compareTo((Object)n3)) <= 0) return serializable;
        return n3;
    }

    public static c k(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Object object = c.d;
        int n3 = -intRange.c;
        object.getClass();
        int n4 = intRange.a;
        int n7 = intRange.b;
        object = new c(n7, n4, n3);
        return object;
    }

    public static c l(int n3, IntRange object) {
        boolean bl2;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        Integer n4 = n3;
        String string2 = "step";
        Intrinsics.checkNotNullParameter(n4, string2);
        if (bl2) {
            object2 = c.d;
            int n7 = ((c)object).a;
            int n8 = ((c)object).c;
            if (n8 <= 0) {
                n3 = -n3;
            }
            object2.getClass();
            int n10 = ((c)object).b;
            object2 = new c(n7, n10, n3);
            return object2;
        }
        object = new StringBuilder("Step must be positive, was: ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append('.');
        object = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static IntRange m(int n3, int n4) {
        int n7 = -1 << -1;
        if (n4 <= n7) {
            IntRange.e.getClass();
            return IntRange.f;
        }
        int n8 = 1;
        IntRange intRange = new c(n3, n4 -= n8, n8);
        return intRange;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

/*
 * Renamed from Ug3
 */
public final class ug3_0 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    public static final long a(long l2, boolean n3, int n4, float f5) {
        int n7;
        int n8 = -1 >>> 1;
        n3 = (n3 != 0 || (n3 = km3.b(n4, 2)) != 0) && (n3 = c60.e(l2)) != 0 ? c60.i(l2) : -1 >>> 1;
        n4 = c60.k(l2);
        if (n4 != n3) {
            n4 = Nj3.a(f5);
            n7 = c60.k(l2);
            n3 = f.g(n4, n7, n3);
        }
        int n10 = c60.h(l2);
        n4 = 262142;
        n7 = Math.min(0, n4);
        n3 = n3 == n8 ? -1 >>> 1 : Math.min(n3, n4);
        n4 = n3 == n8 ? n7 : n3;
        n4 = f60.c(n4);
        if (n10 != n8) {
            n8 = Math.min(n4, n10);
        }
        n10 = Math.min(n4, 0);
        return f60.a(n7, n3, n10, n8);
    }
}


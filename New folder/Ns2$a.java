/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public abstract class Ns2$a {
    public boolean a;

    public static final void a(Ns2$a ns2$a, Ns2 object) {
        ns2$a.getClass();
        boolean bl2 = object instanceof rq1_1;
        if (bl2) {
            object = (rq1_1)object;
            boolean bl3 = ns2$a.a;
            object.X(bl3);
        }
    }

    public static void d(Ns2$a ns2$a, Ns2 ns2, int n3, int n4) {
        ns2$a.getClass();
        long l2 = Ti1.a(n3, n4);
        Ns2$a.a(ns2$a, ns2);
        long l3 = ns2.e;
        l2 = Si1.d(l2, l3);
        ns2.k0(l2, 0.0f, null);
    }

    public static void e(Ns2$a ns2$a, Ns2 ns2, long l2) {
        ns2$a.getClass();
        Ns2$a.a(ns2$a, ns2);
        long l3 = ns2.e;
        l2 = Si1.d(l2, l3);
        ns2.k0(l2, 0.0f, null);
    }

    public static void f(Ns2$a ns2$a, Ns2 ns2, int n3, int n4) {
        int n7;
        bp1_0 bp1_02;
        long l2 = Ti1.a(n3, n4);
        bp1_0 bp1_03 = ns2$a.b();
        if (bp1_03 != (bp1_02 = bp1_0.Ltr) && (n7 = ns2$a.c()) != 0) {
            n7 = ns2$a.c();
            int n8 = ns2.a;
            n7 -= n8;
            n8 = (int)(l2 >> 32);
            long l3 = 0xFFFFFFFFL;
            n4 = (int)(l2 & l3);
            l2 = Ti1.a(n7 -= n8, n4);
            Ns2$a.a(ns2$a, ns2);
            long l4 = ns2.e;
            l2 = Si1.d(l2, l4);
            ns2.k0(l2, 0.0f, null);
        } else {
            Ns2$a.a(ns2$a, ns2);
            long l7 = ns2.e;
            l2 = Si1.d(l2, l7);
            ns2.k0(l2, 0.0f, null);
        }
    }

    public static void g(Ns2$a ns2$a, Ns2 ns2, int n3, int n4) {
        int n7;
        bp1_0 bp1_02;
        Os2$a os2$a = Os2.a;
        long l2 = Ti1.a(n3, n4);
        bp1_0 bp1_03 = ns2$a.b();
        if (bp1_03 != (bp1_02 = bp1_0.Ltr) && (n7 = ns2$a.c()) != 0) {
            n7 = ns2$a.c();
            int n8 = ns2.a;
            n7 -= n8;
            n8 = (int)(l2 >> 32);
            long l3 = 0xFFFFFFFFL;
            n4 = (int)(l2 & l3);
            l2 = Ti1.a(n7 -= n8, n4);
            Ns2$a.a(ns2$a, ns2);
            long l4 = ns2.e;
            l2 = Si1.d(l2, l4);
            ns2.k0(l2, 0.0f, os2$a);
        } else {
            Ns2$a.a(ns2$a, ns2);
            long l7 = ns2.e;
            l2 = Si1.d(l2, l7);
            ns2.k0(l2, 0.0f, os2$a);
        }
    }

    public static void h(Ns2$a ns2$a, Ns2 ns2, long l2) {
        int n3;
        bp1_0 bp1_02;
        Os2$a os2$a = Os2.a;
        bp1_0 bp1_03 = ns2$a.b();
        if (bp1_03 != (bp1_02 = bp1_0.Ltr) && (n3 = ns2$a.c()) != 0) {
            n3 = ns2$a.c();
            int n4 = ns2.a;
            n3 -= n4;
            n4 = (int)(l2 >> 32);
            long l3 = 0xFFFFFFFFL;
            int n7 = (int)(l2 & l3);
            l2 = Ti1.a(n3 -= n4, n7);
            Ns2$a.a(ns2$a, ns2);
            long l4 = ns2.e;
            l2 = Si1.d(l2, l4);
            ns2.k0(l2, 0.0f, os2$a);
        } else {
            Ns2$a.a(ns2$a, ns2);
            long l7 = ns2.e;
            l2 = Si1.d(l2, l7);
            ns2.k0(l2, 0.0f, os2$a);
        }
    }

    public static void i(Ns2$a ns2$a, Ns2 ns2, long l2, W01 w01) {
        int n3;
        bp1_0 bp1_02;
        bp1_0 bp1_03 = ns2$a.b();
        if (bp1_03 != (bp1_02 = bp1_0.Ltr) && (n3 = ns2$a.c()) != 0) {
            n3 = ns2$a.c();
            int n4 = ns2.a;
            n3 -= n4;
            n4 = (int)(l2 >> 32);
            long l3 = 0xFFFFFFFFL;
            int n7 = (int)(l2 & l3);
            l2 = Ti1.a(n3 -= n4, n7);
            Ns2$a.a(ns2$a, ns2);
            long l4 = ns2.e;
            l2 = Si1.d(l2, l4);
            ns2.j0(l2, 0.0f, w01);
        } else {
            Ns2$a.a(ns2$a, ns2);
            long l7 = ns2.e;
            l2 = Si1.d(l2, l7);
            ns2.j0(l2, 0.0f, w01);
        }
    }

    public static void j(Ns2$a ns2$a, Ns2 ns2, int n3, int n4, Function1 function1, int n7) {
        if ((n7 &= 8) != 0) {
            function1 = Os2.a;
        }
        ns2$a.getClass();
        long l2 = Ti1.a(n3, n4);
        Ns2$a.a(ns2$a, ns2);
        long l3 = ns2.e;
        l2 = Si1.d(l2, l3);
        ns2.k0(l2, 0.0f, function1);
    }

    public static void k(Ns2$a ns2$a, Ns2 ns2, long l2) {
        Os2$a os2$a = Os2.a;
        ns2$a.getClass();
        Ns2$a.a(ns2$a, ns2);
        long l3 = ns2.e;
        l2 = Si1.d(l2, l3);
        ns2.k0(l2, 0.0f, os2$a);
    }

    public abstract bp1_0 b();

    public abstract int c();
}


/*
 * Decompiled with CFR 0.152.
 */
public final class I92$C
extends I92 {
    public static final I92$C c;

    static {
        I92$C i92$C;
        c = i92$C = new I92(1, 0, 2);
    }

    public final void a(R92$a r92$a, mp mp2, q73 q732, F30$a f30$a) {
        int n3;
        int n4 = 0;
        int n7 = r92$a.a(0);
        int n8 = q732.o();
        int n10 = q732.v;
        int[] nArray = q732.b;
        int n14 = q732.p(n10);
        int n15 = q732.I(nArray, n14);
        Object object = q732.b;
        int n16 = 1;
        n10 += n16;
        n10 = q732.p(n10);
        n10 = q732.f((int[])object, n10);
        n14 = n10 - n7;
        for (n15 = Math.max(n15, n14); n15 < n10; ++n15) {
            object = q732.c;
            int n17 = q732.g(n15);
            if ((n17 = (object = (Object)object[n17]) instanceof ui2_0) != 0) {
                n17 = n8 - n15;
                object = ((ui2_0)object).a;
                int n18 = -1;
                f30$a.e(n17, object, n18, n18);
                continue;
            }
            n17 = object instanceof CF2;
            if (n17 == 0) continue;
            object = (CF2)object;
            ((CF2)object).d();
        }
        if (n7 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            f30$a = null;
        }
        p30_0.h(n3 != 0);
        n3 = q732.v;
        int[] nArray2 = q732.b;
        n10 = q732.p(n3);
        n8 = q732.I(nArray2, n10);
        int[] nArray3 = q732.b;
        n15 = n3 + 1;
        n15 = q732.p(n15);
        n10 = q732.f(nArray3, n15) - n7;
        if (n10 >= n8) {
            n4 = 1;
        }
        p30_0.h(n4 != 0);
        q732.F(n10, n7, n3);
        n4 = q732.i;
        if (n4 >= n8) {
            q732.i = n4 -= n7;
        }
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "count" : super.b(n3);
        return string2;
    }
}


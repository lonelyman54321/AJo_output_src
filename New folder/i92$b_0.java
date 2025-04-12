/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from I92$b
 */
public final class i92$b_0
extends I92 {
    public static final i92$b_0 c;

    static {
        i92$b_0 i92$b_0;
        c = i92$b_0 = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp object2, q73 q732, F30$a f30$a) {
        int n3;
        int n4 = 0;
        object2 = (Ae)((R92$a)object).b(0);
        int n7 = 1;
        int n8 = (object = ((R92$a)object).b(n7)) instanceof ui2_0;
        if (n8 != 0) {
            Object object3 = object;
            object3 = ((ui2_0)object).a;
            f30$a.g((ti2_0)object3);
        }
        if ((n3 = q732.n) == 0) {
            int n10;
            n3 = q732.i;
            n8 = q732.j;
            n4 = q732.c((Ae)object2);
            int[] nArray = q732.b;
            int n14 = n4 + 1;
            n14 = q732.p(n14);
            q732.i = n10 = q732.f(nArray, n14);
            q732.j = n10;
            q732.t(n7, n4);
            if (n3 >= n10) {
                ++n3;
                ++n8;
            }
            q732.c[n10] = object;
            q732.i = n3;
            q732.j = n8;
            return;
        }
        p30_0.c("Can only append a slot if not current inserting");
        throw null;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "anchor" : ((bl2 = I92$t.a(n3, 1)) ? "value" : super.c(n3));
        return string2;
    }
}


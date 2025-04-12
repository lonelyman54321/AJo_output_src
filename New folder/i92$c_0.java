/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from I92$c
 */
public final class i92$c_0
extends I92 {
    public static final i92$c_0 c;

    static {
        i92$c_0 i92$c_0;
        c = i92$c_0 = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp mp2, q73 q732, F30$a f30$a) {
        int n3 = 1;
        Xi1 xi1 = (Xi1)((R92$a)object).b(n3);
        f72 f722 = null;
        if (xi1 != null) {
            n3 = xi1.a;
        } else {
            n3 = 0;
            xi1 = null;
        }
        object = (zr_1)((R92$a)object).b(0);
        if (n3 > 0) {
            f722 = new f72(mp2, n3);
            mp2 = f722;
        }
        ((zr_1)object).Q(mp2, q732, f30$a);
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "changes" : ((bl2 = I92$t.a(n3, 1)) ? "effectiveNodeIndex" : super.c(n3));
        return string2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public final class I92$y
extends I92 {
    public static final I92$y c;

    static {
        I92$y i92$y;
        int n3 = 2;
        c = i92$y = new I92(n3, 0, n3);
    }

    public final void a(R92$a r92$a, mp mp2, q73 q732, F30$a f30$a) {
        int n3 = r92$a.a(0);
        int n4 = r92$a.a(1);
        mp2.c(n3, n4);
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "removeIndex" : ((bl2 = I92$q.a(n3, 1)) ? "count" : super.b(n3));
        return string2;
    }
}


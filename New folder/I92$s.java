/*
 * Decompiled with CFR 0.152.
 */
public final class I92$s
extends I92 {
    public static final I92$s c;

    static {
        I92$s i92$s;
        c = i92$s = new I92(3, 0, 2);
    }

    public final void a(R92$a r92$a, mp mp2, q73 q732, F30$a f30$a) {
        int n3 = r92$a.a(0);
        int n4 = r92$a.a(1);
        int n7 = r92$a.a(2);
        mp2.b(n3, n4, n7);
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "from" : ((bl2 = I92$q.a(n3, 1)) ? "to" : ((bl2 = I92$q.a(n3, 2)) ? "count" : super.b(n3)));
        return string2;
    }
}


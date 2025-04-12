/*
 * Decompiled with CFR 0.152.
 */
public final class I92$o
extends I92 {
    public static final I92$o c;

    static {
        I92$o i92$o;
        c = i92$o = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp object2, q73 q732, F30$a f30$a) {
        object2 = (l73)((R92$a)object).b(1);
        object = (Ae)((R92$a)object).b(0);
        q732.d();
        object.getClass();
        int n3 = ((l73)object2).d((Ae)object);
        q732.v((l73)object2, n3);
        q732.j();
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "anchor" : ((bl2 = I92$t.a(n3, 1)) ? "from" : super.c(n3));
        return string2;
    }
}


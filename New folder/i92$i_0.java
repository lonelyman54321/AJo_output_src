/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from I92$i
 */
public final class i92$i_0
extends I92 {
    public static final i92$i_0 c;

    static {
        i92$i_0 i92$i_0;
        c = i92$i_0 = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp object2, q73 q732, F30$a f30$a) {
        object2 = (Function1)((R92$a)object).b(0);
        object = (z30_0)((R92$a)object).b(1);
        object2.invoke(object);
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "anchor" : ((bl2 = I92$t.a(n3, 1)) ? "composition" : super.c(n3));
        return string2;
    }
}


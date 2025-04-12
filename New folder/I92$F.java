/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class I92$F
extends I92 {
    public static final I92$F c;

    static {
        I92$F i92$F;
        c = i92$F = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp object2, q73 object3, F30$a f30$a) {
        object3 = ((R92$a)object).b(0);
        object = (Function2)((R92$a)object).b(1);
        object2 = object2.a();
        object.invoke(object2, object3);
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "value" : ((bl2 = I92$t.a(n3, 1)) ? "block" : super.c(n3));
        return string2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Fm2$m
extends fm2_2 {
    public static final Fm2$m a;

    static {
        Fm2$m fm2$m;
        a = fm2$m = new Object();
    }

    public final void a(sj2_1 object, Object object2) {
        if ((object2 = (cr1$c_0)object2) != null) {
            object = ((sj2_1)object).i;
            object.getClass();
            String string2 = "part";
            Intrinsics.checkNotNullParameter(object2, string2);
            object = ((cr1$a_0)object).c;
            ((ArrayList)object).add(object2);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class PY2
extends Lambda
implements Function2 {
    public static final PY2 c;

    static {
        PY2 pY2;
        c = pY2 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        String string2;
        object = (H1)object;
        object2 = (H1)object2;
        if (object == null || (string2 = ((H1)object).a) == null) {
            string2 = ((H1)object2).a;
        }
        if (object == null || (object = ((H1)object).b) == null) {
            object = ((H1)object2).b;
        }
        H1 h1 = new H1(string2, (fx0_2)object);
        return h1;
    }
}


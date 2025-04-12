/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from el
 */
public final class el_1
extends Lambda
implements Function1 {
    public static final el_1 c;

    static {
        el_1 el_12;
        c = el_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        ((Boolean)object).booleanValue();
        return object;
    }
}


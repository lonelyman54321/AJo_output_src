/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class lY2$b
extends Lambda
implements Function1 {
    public static final lY2$b c;

    static {
        lY2$b lY2$b;
        c = lY2$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (ll_1)object;
        float f5 = ((ll_1)object).a;
        float f6 = ((ll_1)object).b;
        long l2 = h72.a(f5, f6);
        object = new e72(l2);
        return object;
    }
}


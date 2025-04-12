/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Zj3$a
extends Lambda
implements Function1 {
    public static final Zj3$a c;

    static {
        Zj3$a zj3$a;
        c = zj3$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Go1$b)object;
        ((ho1_0)object).a = 1000;
        float f5 = 1.0f;
        Float f6 = Float.valueOf(f5);
        ((Go1$b)object).a(0, f6);
        Float f7 = Float.valueOf(f5);
        ((Go1$b)object).a(499, f7);
        f6 = Float.valueOf(0.0f);
        ((Go1$b)object).a(500, f6);
        f7 = Float.valueOf(0.0f);
        ((Go1$b)object).a(999, f7);
        return Unit.a;
    }
}


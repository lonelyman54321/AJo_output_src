/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Zz0$b
extends Lambda
implements Function1 {
    public static final Zz0$b c;

    static {
        Zz0$b zz0$b;
        c = zz0$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (ll_1)object;
        float f5 = ((ll_1)object).a;
        float f6 = ((ll_1)object).b;
        long l2 = Pq3.a(f5, f6);
        object = new Oq3(l2);
        return object;
    }
}


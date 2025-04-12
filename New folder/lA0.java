/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class lA0
extends Lambda
implements Function1 {
    public static final lA0 c;

    static {
        lA0 lA02;
        c = lA02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bj1)object).a;
        l2 = dj1.a(0, 0);
        object = new bj1(l2);
        return object;
    }
}


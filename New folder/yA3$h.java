/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$h
extends Lambda
implements Function1 {
    public static final yA3$h c;

    static {
        yA3$h yA3$h;
        c = yA3$h = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (ll_1)object;
        int n3 = Math.round(((ll_1)object).a);
        int n4 = Math.round(((ll_1)object).b);
        long l2 = Ti1.a(n3, n4);
        object = new Si1(l2);
        return object;
    }
}


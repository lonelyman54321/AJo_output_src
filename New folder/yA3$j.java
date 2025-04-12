/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$j
extends Lambda
implements Function1 {
    public static final yA3$j c;

    static {
        yA3$j yA3$j;
        c = yA3$j = new Lambda(1);
    }

    public final Object invoke(Object object) {
        float f5;
        int n3;
        object = (ll_1)object;
        float f6 = ((ll_1)object).a;
        int n4 = Math.round(f6);
        int n7 = 0;
        if (n4 < 0) {
            n4 = 0;
            f6 = 0.0f;
        }
        if ((n3 = Math.round(f5 = ((ll_1)object).b)) >= 0) {
            n7 = n3;
        }
        long l2 = dj1.a(n4, n7);
        object = new bj1(l2);
        return object;
    }
}


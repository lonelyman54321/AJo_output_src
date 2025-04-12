/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$i
extends Lambda
implements Function1 {
    public static final yA3$i c;

    static {
        yA3$i yA3$i;
        c = yA3$i = new Lambda(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bj1)object).a;
        float f5 = (int)(l2 >> 32);
        float f6 = (int)(l2 & 0xFFFFFFFFL);
        object = new ll_1(f5, f6);
        return object;
    }
}


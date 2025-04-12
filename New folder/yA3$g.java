/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$g
extends Lambda
implements Function1 {
    public static final yA3$g c;

    static {
        yA3$g yA3$g;
        c = yA3$g = new Lambda(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Si1)object).a;
        float f5 = (int)(l2 >> 32);
        float f6 = (int)(l2 & 0xFFFFFFFFL);
        object = new ll_1(f5, f6);
        return object;
    }
}


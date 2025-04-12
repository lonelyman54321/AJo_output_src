/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$a
extends Lambda
implements Function1 {
    public static final yA3$a c;

    static {
        yA3$a yA3$a;
        c = yA3$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((as0_0)object).a;
        float f5 = Float.intBitsToFloat((int)(l2 >> 32));
        float f6 = Float.intBitsToFloat((int)(l2 & 0xFFFFFFFFL));
        object = new ll_1(f5, f6);
        return object;
    }
}


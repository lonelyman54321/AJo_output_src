/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yA3$b
extends Lambda
implements Function1 {
    public static final yA3$b c;

    static {
        yA3$b yA3$b;
        c = yA3$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (ll_1)object;
        float f5 = ((ll_1)object).a;
        float f6 = ((ll_1)object).b;
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        l2 <<= 32;
        object = new as0_0(l2 |= (l3 &= 0xFFFFFFFFL));
        return object;
    }
}


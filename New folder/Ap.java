/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Ap
extends Lambda
implements Function2 {
    public static final Ap c;

    static {
        Ap ap2;
        c = ap2 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Number)object;
        int n3 = ((Number)object).intValue();
        object2 = (bp1_0)((Object)object2);
        float f5 = n3;
        float f6 = 2.0f;
        f5 /= f6;
        bp1_0 bp1_02 = bp1_0.Ltr;
        float f7 = -1.0f;
        if (object2 != bp1_02) {
            int n4 = -1;
            float f8 = n4;
            f7 *= f8;
        }
        return Math.round((1.0f + f7) * f5);
    }
}


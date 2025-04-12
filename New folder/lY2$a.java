/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class lY2$a
extends Lambda
implements Function1 {
    public static final lY2$a c;

    static {
        lY2$a lY2$a;
        c = lY2$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (e72)object;
        long l2 = ((e72)object).a;
        boolean bl2 = h72.c(l2);
        if (bl2) {
            float f5 = e72.d(l2);
            float f6 = e72.e(l2);
            object = new ll_1(f5, f6);
        } else {
            object = ly2_0.a;
        }
        return object;
    }
}


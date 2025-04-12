/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class Hm0$a
extends Lambda
implements Function2 {
    public static final Hm0$a c;

    static {
        Hm0$a hm0$a;
        c = hm0$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (hm0_0)object2;
        object = ((Cl2)object2).j();
        Float f5 = Float.valueOf(f.f(((Cl2)object2).k(), -0.5f, 0.5f));
        object2 = ((hm0_0)object2).m();
        Object[] objectArray = new Object[]{object, f5, object2};
        return xx_2.i(objectArray);
    }
}


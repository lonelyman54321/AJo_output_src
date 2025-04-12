/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ft1$a
extends Lambda
implements Function2 {
    public static final ft1$a c;

    static {
        ft1$a ft1$a;
        c = ft1$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (ft1_2)object2;
        object = ((ft1_2)object2).h();
        object2 = ((ft1_2)object2).i();
        Object[] objectArray = new Integer[]{object, object2};
        return xx_2.i(objectArray);
    }
}


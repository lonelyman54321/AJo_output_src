/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class MY2$i
extends Lambda
implements Function2 {
    public static final MY2$i c;

    static {
        MY2$i mY2$i;
        c = mY2$i = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Float)object;
        ((Number)object2).floatValue();
        return object;
    }
}


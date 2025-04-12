/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class MY2$e
extends Lambda
implements Function2 {
    public static final MY2$e c;

    static {
        MY2$e mY2$e;
        c = mY2$e = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        object = new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        throw object;
    }
}


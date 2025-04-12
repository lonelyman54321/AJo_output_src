/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class MY2$c
extends Lambda
implements Function2 {
    public static final MY2$c c;

    static {
        MY2$c mY2$c;
        c = mY2$c = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Unit)object;
        object2 = (Unit)object2;
        object = new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        throw object;
    }
}


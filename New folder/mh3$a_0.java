/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from MH3$a
 */
public final class mh3$a_0
extends Lambda
implements Function1 {
    public static final mh3$a_0 c;

    static {
        mh3$a_0 mh3$a_0;
        c = mh3$a_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (w50)object;
        Intrinsics.checkNotNullParameter(object, "it");
        object = object.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "it.javaClass.simpleName");
        return object;
    }
}


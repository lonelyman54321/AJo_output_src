/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class am2$c
extends Lambda
implements Function1 {
    public static final am2$c c;

    static {
        am2$c am2$c;
        c = am2$c = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "it");
        object.invoke();
        return Unit.a;
    }
}


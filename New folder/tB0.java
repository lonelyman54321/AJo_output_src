/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class tB0
extends Lambda
implements Function1 {
    public static final tB0 c;

    static {
        tB0 tB02;
        c = tB02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((String)object, "it");
        return Unit.a;
    }
}


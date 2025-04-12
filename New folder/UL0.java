/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class UL0
extends Lambda
implements Function1 {
    public static final UL0 c;

    static {
        UL0 uL0;
        c = uL0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((Pair)object, "it");
        return Unit.a;
    }
}


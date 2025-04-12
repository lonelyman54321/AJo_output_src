/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class W32$c
extends Lambda
implements Function1 {
    public static final W32$c c;

    static {
        W32$c w32$c;
        c = w32$c = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = ((w32_0)object).G;
        if (object != null) {
            object.invalidate();
        }
        return Unit.a;
    }
}


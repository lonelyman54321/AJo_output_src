/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vA0
extends Lambda
implements Function1 {
    public static final vA0 c;

    static {
        vA0 vA02;
        c = vA02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        return -((Number)object).intValue() / 2;
    }
}


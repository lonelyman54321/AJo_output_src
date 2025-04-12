/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Fv1
extends Lambda
implements Function2 {
    public static final Fv1 c;

    static {
        Fv1 fv1;
        c = fv1 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        return Intrinsics.areEqual(object, object2);
    }
}


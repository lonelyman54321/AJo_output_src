/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$F
extends Lambda
implements Function1 {
    public static final FS2$F c;

    static {
        FS2$F fS2$F;
        c = fS2$F = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        object = (List)object;
        float f5 = ((Number)object.get(0)).floatValue();
        float f6 = ((Number)object.get(1)).floatValue();
        tl3_0 tl3_02 = new tl3_0(f5, f6);
        return tl3_02;
    }
}


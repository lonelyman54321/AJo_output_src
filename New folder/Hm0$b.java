/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Hm0$b
extends Lambda
implements Function1 {
    public static final Hm0$b c;

    static {
        Hm0$b hm0$b;
        c = hm0$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        Object e2 = object.get(0);
        Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type kotlin.Int");
        int n3 = (Integer)e2;
        Object e5 = object.get(1);
        Intrinsics.checkNotNull(e5, "null cannot be cast to non-null type kotlin.Float");
        float f5 = ((Float)e5).floatValue();
        im0_0 im0_02 = new im0_0((List)object);
        hm0_0 hm0_02 = new hm0_0(n3, f5, im0_02);
        return hm0_02;
    }
}


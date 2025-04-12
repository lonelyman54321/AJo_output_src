/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$N
extends Lambda
implements Function1 {
    public static final FS2$N c;

    static {
        FS2$N fS2$N;
        c = fS2$N = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Comparable<Boolean> comparable = Boolean.FALSE;
        boolean bl2 = Intrinsics.areEqual(object, comparable);
        if (bl2) {
            long l2 = Dm3.c;
            object = new Dm3(l2);
        } else {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            object = (List)object;
            bl2 = false;
            float f5 = 0.0f;
            comparable = object.get(0);
            Object object2 = null;
            if (comparable != null) {
                comparable = (Float)comparable;
            } else {
                bl2 = false;
                comparable = null;
                f5 = 0.0f;
            }
            Intrinsics.checkNotNull(comparable);
            f5 = ((Number)((Object)comparable)).floatValue();
            int n3 = 1;
            object = object.get(n3);
            if (object != null) {
                object2 = object;
                object2 = (Fm3)object;
            }
            Intrinsics.checkNotNull(object2);
            long l3 = ((Fm3)object2).a;
            long l4 = Em3.i(l3, f5);
            object = new Dm3(l4);
        }
        return object;
    }
}


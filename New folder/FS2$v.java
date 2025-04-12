/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$v
extends Lambda
implements Function1 {
    public static final FS2$v c;

    static {
        FS2$v fS2$v;
        c = fS2$v = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Comparable<Boolean> comparable = Boolean.FALSE;
        boolean bl2 = Intrinsics.areEqual(object, comparable);
        if (bl2) {
            long l2 = 9205357640488583168L;
            object = new e72(l2);
        } else {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
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
                object2 = (Float)object;
            }
            Intrinsics.checkNotNull(object2);
            float f6 = ((Number)object2).floatValue();
            long l3 = h72.a(f5, f6);
            object = new e72(l3);
        }
        return object;
    }
}


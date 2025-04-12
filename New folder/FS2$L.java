/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$L
extends Lambda
implements Function1 {
    public static final FS2$L c;

    static {
        FS2$L fS2$L;
        c = fS2$L = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        object = (List)object;
        int n3 = 0;
        Object object2 = object.get(0);
        Object object3 = null;
        if (object2 != null) {
            object2 = (Integer)object2;
        } else {
            n3 = 0;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        n3 = ((Number)object2).intValue();
        int n4 = 1;
        object = object.get(n4);
        if (object != null) {
            object3 = object;
            object3 = (Integer)object;
        }
        Intrinsics.checkNotNull(object3);
        int n7 = ((Number)object3).intValue();
        long l2 = nm3.a(n3, n7);
        object = new mm3(l2);
        return object;
    }
}


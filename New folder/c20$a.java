/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c20$a
extends Lambda
implements Function2 {
    public static final c20$a c;

    static {
        c20$a c20$a;
        c = c20$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = 0;
            object4 = null;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n7 = 6;
            Ll3.d(null, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, null, null, (b30_0)object3, n7, 0);
        }
        return Unit.a;
    }
}


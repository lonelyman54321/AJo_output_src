/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

public final class VS$c
extends Lambda
implements gx0_2 {
    public static final VS$c c;

    static {
        VS$c vS$c;
        c = vS$c = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (gr3$b)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = 1075283605;
        object2.K(n3);
        object3 = object.b();
        ao3 ao32 = ao3.Off;
        if (object3 == ao32) {
            object = new u83_0(0);
        } else {
            object = object.a();
            n3 = 100;
            if (object == ao32) {
                object = new u83_0(n3);
            } else {
                int n4 = 6;
                ao32 = null;
                object = Hl.c(n3, 0, null, n4);
            }
        }
        object2.E();
        return object;
    }
}


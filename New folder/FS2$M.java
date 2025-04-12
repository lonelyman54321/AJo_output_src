/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$M
extends Lambda
implements Function2 {
    public static final FS2$M c;

    static {
        FS2$M fS2$M;
        c = fS2$M = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (Dm3)object2;
        long l2 = ((Dm3)object2).a;
        long l3 = Dm3.c;
        boolean bl2 = Dm3.a(l2, l3);
        if (bl2) {
            object = Boolean.FALSE;
        } else {
            float f5 = Dm3.c(l2);
            Float f6 = Float.valueOf(f5);
            Object object3 = FS2.a;
            l2 = Dm3.b(l2);
            object3 = new Fm3(l2);
            int n3 = 2;
            object = new Object[n3];
            object2 = null;
            object[0] = f6;
            int n4 = 1;
            object[n4] = object3;
            object = xx_2.d(object);
        }
        return object;
    }
}


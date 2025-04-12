/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$y
extends Lambda
implements Function2 {
    public static final FS2$y c;

    static {
        FS2$y fS2$y;
        c = fS2$y = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (b13_0)object2;
        long l2 = ((b13_0)object2).a;
        Object object3 = new OX(l2);
        Object object4 = FS2.q;
        object4 = FS2.a(object3, (BS2)object4, (ES2)object);
        long l3 = ((b13_0)object2).b;
        Object[] objectArray = new e72(l3);
        object3 = FS2.s;
        object = FS2.a(objectArray, (BS2)object3, (ES2)object);
        object2 = Float.valueOf(((b13_0)object2).c);
        objectArray = new Object[]{object4, object, object2};
        return xx_2.d(objectArray);
    }
}


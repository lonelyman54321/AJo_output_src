/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$u
extends Lambda
implements Function2 {
    public static final FS2$u c;

    static {
        FS2$u fS2$u;
        c = fS2$u = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (e72)objectArray;
        long l2 = objectArray.a;
        long l3 = 9205357640488583168L;
        int n3 = (int)(e72.b(l2, l3) ? 1 : 0);
        if (n3 != 0) {
            object = Boolean.FALSE;
        } else {
            Float f5 = Float.valueOf(e72.d(l2));
            float f6 = e72.e(l2);
            object = Float.valueOf(f6);
            int n4 = 2;
            objectArray = new Float[n4];
            objectArray[0] = f5;
            n3 = 1;
            objectArray[n3] = object;
            object = xx_2.d(objectArray);
        }
        return object;
    }
}


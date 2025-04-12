/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$I
extends Lambda
implements Function2 {
    public static final FS2$I c;

    static {
        FS2$I fS2$I;
        c = fS2$I = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (gm3_0)objectArray;
        Object object2 = objectArray.a;
        ds2_0 ds2_02 = FS2.i;
        object2 = FS2.a(object2, ds2_02, (ES2)object);
        Object object3 = FS2.a(objectArray.b, ds2_02, (ES2)object);
        Object object4 = FS2.a(objectArray.c, ds2_02, (ES2)object);
        object = FS2.a(objectArray.d, ds2_02, (ES2)object);
        objectArray = new Object[]{object2, object3, object4, object};
        return xx_2.d(objectArray);
    }
}


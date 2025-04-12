/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$E
extends Lambda
implements Function2 {
    public static final FS2$E c;

    static {
        FS2$E fS2$E;
        c = fS2$E = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (tl3_0)object2;
        object = Float.valueOf(((tl3_0)object2).a);
        object2 = Float.valueOf(((tl3_0)object2).b);
        Object[] objectArray = new Float[]{object, object2};
        return xx_2.d(objectArray);
    }
}


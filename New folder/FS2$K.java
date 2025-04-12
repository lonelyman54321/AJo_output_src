/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$K
extends Lambda
implements Function2 {
    public static final FS2$K c;

    static {
        FS2$K fS2$K;
        c = fS2$K = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        long l2 = ((mm3)objectArray).a;
        Integer n3 = (int)(l2 >> 32);
        object = (int)(l2 & 0xFFFFFFFFL);
        objectArray = new Integer[]{n3, object};
        return xx_2.d(objectArray);
    }
}


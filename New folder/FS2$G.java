/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$G
extends Lambda
implements Function2 {
    public static final FS2$G c;

    static {
        FS2$G fS2$G;
        c = fS2$G = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (vl3_0)objectArray;
        long l2 = objectArray.a;
        Dm3 dm3 = new Dm3(l2);
        GS2 gS2 = FS2.r;
        Object object2 = FS2.a(dm3, gS2, (ES2)object);
        long l3 = objectArray.b;
        dm3 = new Dm3(l3);
        object = FS2.a(dm3, gS2, (ES2)object);
        objectArray = new Object[]{object2, object};
        return xx_2.d(objectArray);
    }
}


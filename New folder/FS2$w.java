/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FS2$w
extends Lambda
implements Function2 {
    public static final FS2$w c;

    static {
        FS2$w fS2$w;
        c = fS2$w = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (ym2_0)objectArray;
        int n3 = objectArray.a;
        Cj3 cj3 = new Cj3(n3);
        Object object2 = FS2.a;
        int n4 = objectArray.b;
        object2 = new Pj3(n4);
        long l2 = objectArray.c;
        Object object3 = new Dm3(l2);
        Object object4 = FS2.r;
        object3 = FS2.a(object3, (BS2)object4, (ES2)object);
        object4 = vl3_0.c;
        object4 = FS2.m;
        object = FS2.a(objectArray.d, (BS2)object4, (ES2)object);
        objectArray = new Object[]{cj3, object2, object3, object};
        return xx_2.d(objectArray);
    }
}


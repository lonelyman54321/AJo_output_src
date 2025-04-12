/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class qr1$a
extends Lambda
implements Function2 {
    public static final qr1$a c;

    static {
        qr1$a qr1$a;
        c = qr1$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (qr1_0)object2;
        object = ((qr1_0)object2).b.a.o();
        object2 = ((qr1_0)object2).b.b.o();
        Object[] objectArray = new Integer[]{object, object2};
        return xx_2.i(objectArray);
    }
}


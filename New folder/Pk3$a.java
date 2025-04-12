/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Pk3$a
extends Lambda
implements Function2 {
    public static final Pk3$a c;

    static {
        Pk3$a pk3$a;
        c = pk3$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        Object[] objectArray;
        int n3 = 1;
        object = (ES2)object;
        object2 = (Pk3)object2;
        float f5 = ((Pk3)object2).a.c();
        object = Float.valueOf(f5);
        object2 = (pg2_0)((Object)((Pk3)object2).e.getValue());
        if (object2 == (objectArray = pg2_0.Vertical)) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        object2 = bl2;
        objectArray = new Object[2];
        objectArray[0] = object;
        objectArray[n3] = object2;
        return xx_2.i(objectArray);
    }
}


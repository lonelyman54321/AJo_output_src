/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$a
 */
public final class fs2$a_0
extends Lambda
implements Function2 {
    public static final fs2$a_0 c;

    static {
        fs2$a_0 fs2$a_0;
        c = fs2$a_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (Sl)objectArray;
        String string2 = objectArray.a;
        Object object2 = objectArray.b();
        ds2_0 ds2_02 = FS2.b;
        object2 = FS2.a(object2, ds2_02, (ES2)object);
        Object object3 = objectArray.c;
        if (object3 == null) {
            object3 = mz0_2.a;
        }
        object3 = FS2.a(object3, ds2_02, (ES2)object);
        object = FS2.a(objectArray.d, ds2_02, (ES2)object);
        objectArray = new Object[]{string2, object2, object3, object};
        return xx_2.d(objectArray);
    }
}


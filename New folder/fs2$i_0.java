/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$i
 */
public final class fs2$i_0
extends Lambda
implements Function2 {
    public static final fs2$i_0 c;

    static {
        fs2$i_0 fs2$i_0;
        c = fs2$i_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (ES2)object;
        objectArray = (Gu1$a)objectArray;
        String string2 = objectArray.a;
        ds2_0 ds2_02 = FS2.j;
        object = FS2.a(objectArray.b, ds2_02, (ES2)object);
        objectArray = new Object[]{string2, object};
        return xx_2.d(objectArray);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$k
 */
public final class fs2$k_0
extends Lambda
implements Function2 {
    public static final fs2$k_0 c;

    static {
        fs2$k_0 fs2$k_0;
        c = fs2$k_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object2 = (OX)object2;
        long l2 = ((OX)object2).a;
        long l3 = 16;
        long l4 = l2 - l3;
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 == false) {
            object = Boolean.FALSE;
        } else {
            int n3 = zx_0.i(l2);
            object = n3;
        }
        return object;
    }
}


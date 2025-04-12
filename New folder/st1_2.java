/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from st1
 */
public final class st1_2
extends Lambda
implements Function2 {
    public static final st1_2 c;

    static {
        st1_2 st1_22;
        c = st1_22 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        object = ((rt1_0)(object2 = (rt1_0)object2)).e();
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = null;
        }
        return object;
    }
}


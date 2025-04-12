/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hq3$a
 */
public final class hq3$a_0
extends Lambda
implements Function2 {
    public static final hq3$a_0 c;

    static {
        hq3$a_0 hq3$a_0;
        c = hq3$a_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        object2 = (Boolean)object2;
        boolean bl3 = (Boolean)object2;
        if (bl2 && bl3) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}


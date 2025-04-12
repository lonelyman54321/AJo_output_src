/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from il
 */
public final class il_1
extends Lambda
implements Function2 {
    public static final il_1 c;

    static {
        il_1 il_12;
        c = il_12 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        if ((object = (Xz0)((Object)object)) == (object2 = (Xz0)((Object)object2)) && object2 == (object = Xz0.PostExit)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}


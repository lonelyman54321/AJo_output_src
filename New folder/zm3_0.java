/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Zm3
 */
public final class zm3_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (xm3_0)object;
        object2 = (CoroutineContext$Element)object2;
        if (object == null) {
            boolean bl2 = object2 instanceof xm3_0;
            if (bl2) {
                object = object2 = (xm3_0)object2;
            } else {
                bl2 = false;
                object = null;
            }
        }
        return object;
    }
}


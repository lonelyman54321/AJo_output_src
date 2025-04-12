/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from x90
 */
public final class x90_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        object2 = (CoroutineContext$Element)object2;
        if (!bl2 && !(bl2 = object2 instanceof c80_0)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}


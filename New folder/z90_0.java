/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from z90
 */
public final class z90_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (CoroutineContext)object;
        boolean bl2 = (object2 = (CoroutineContext$Element)object2) instanceof c80_0;
        if (bl2) {
            object2 = ((c80_0)object2).I();
            object = object.plus((CoroutineContext)object2);
        } else {
            object = object.plus((CoroutineContext)object2);
        }
        return object;
    }
}


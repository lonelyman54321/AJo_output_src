/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from an3
 */
public final class an3_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (in3_0)object;
        int n3 = (object2 = (CoroutineContext$Element)object2) instanceof xm3_0;
        if (n3 != 0) {
            object2 = (xm3_0)object2;
            xm3_0[] xm3_0Array = ((in3_0)object).a;
            xm3_0Array = object2.G0((CoroutineContext)xm3_0Array);
            int n4 = ((in3_0)object).d;
            Object[] objectArray = ((in3_0)object).b;
            objectArray[n4] = xm3_0Array;
            ((in3_0)object).d = n3 = n4 + 1;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            xm3_0Array = ((in3_0)object).c;
            xm3_0Array[n4] = object2;
        }
        return object;
    }
}


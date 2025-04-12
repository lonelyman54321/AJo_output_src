/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CoroutineContext$Element$a {
    public static Object a(CoroutineContext$Element coroutineContext$Element, Object object, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "operation");
        return function2.invoke(object, coroutineContext$Element);
    }

    public static CoroutineContext$Element b(CoroutineContext$Element coroutineContext$Element, CoroutineContext$a object) {
        Intrinsics.checkNotNullParameter(object, "key");
        CoroutineContext$a coroutineContext$a = coroutineContext$Element.getKey();
        boolean bl2 = Intrinsics.areEqual(coroutineContext$a, object);
        if (bl2) {
            object = "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get";
            Intrinsics.checkNotNull(coroutineContext$Element, (String)object);
        } else {
            coroutineContext$Element = null;
        }
        return coroutineContext$Element;
    }

    public static CoroutineContext c(CoroutineContext$Element coroutineContext, CoroutineContext$a coroutineContext$a) {
        Intrinsics.checkNotNullParameter(coroutineContext$a, "key");
        CoroutineContext$a coroutineContext$a2 = coroutineContext.getKey();
        boolean bl2 = Intrinsics.areEqual(coroutineContext$a2, coroutineContext$a);
        if (bl2) {
            coroutineContext = f.a;
        }
        return coroutineContext;
    }

    public static CoroutineContext d(CoroutineContext object, CoroutineContext$Element object2) {
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = f.a;
        if (object != object3) {
            object3 = e.c;
            object2 = object = object.fold(object2, (Function2)object3);
            object2 = (CoroutineContext)object;
        }
        return object2;
    }
}


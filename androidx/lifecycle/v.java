/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class v {
    public static final Object a(mu1_1 object, i$b object2, Function2 function2, f80_0 f80_02) {
        object = object.getLifecycle();
        Object object3 = i$b.INITIALIZED;
        if (object2 != object3) {
            i$b i$b;
            object3 = ((i)object).b();
            if (object3 == (i$b = i$b.DESTROYED)) {
                object = Unit.a;
            } else {
                i$b = null;
                object3 = new u((i)object, (i$b)((Object)object2), function2, null);
                if ((object = d.c((Function2)object3, f80_02)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
                    object = Unit.a;
                }
            }
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object == object2) {
                return object;
            }
            return Unit.a;
        }
        object2 = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}


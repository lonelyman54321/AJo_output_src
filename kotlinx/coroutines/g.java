/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.coroutines.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;
import kotlinx.coroutines.c$a;

public abstract class g
extends c
implements Closeable,
AutoCloseable {
    static {
        Object object = new he0_2(0);
        c$a c$a = c.a;
        Intrinsics.checkNotNullParameter(c$a, "baseKey");
        String string2 = "safeCast";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = c$a instanceof b;
        if (bl2) {
            object = ((b)c$a).b;
        }
    }
}


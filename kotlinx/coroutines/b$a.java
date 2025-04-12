/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.b;

public final class b$a
implements b {
    public final Function1 a;

    public b$a(Function1 function1) {
        this.a = function1;
    }

    public final void b(Throwable throwable) {
        this.a.invoke(throwable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelHandler.UserSupplied[");
        String string2 = this.a.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = si0_2.d(this);
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}


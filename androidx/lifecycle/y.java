/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class y
implements n {
    public final us2_1 a;

    public y(us2_1 us2_12) {
        Intrinsics.checkNotNullParameter(us2_12, "provider");
        this.a = us2_12;
    }

    public final void k(mu1_1 object, i$a object2) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(object2, "event");
        i$a i$a = i$a.ON_CREATE;
        if (object2 == i$a) {
            object.getLifecycle().c(this);
            this.a.b();
            return;
        }
        object = new StringBuilder("Next event must be ON_CREATE, it was ");
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

public final class z
implements n,
Closeable {
    public final String a;
    public final x b;
    public boolean c;

    public z(String string2, x x5) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(x5, "handle");
        this.a = string2;
        this.b = x5;
    }

    public final void b(i object, xs2_1 object2) {
        Intrinsics.checkNotNullParameter(object2, "registry");
        String string2 = "lifecycle";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            this.c = bl3;
            ((i)object).a(this);
            object = this.b.e;
            string2 = this.a;
            ((xs2_1)object2).c(string2, (xS2$b)object);
            return;
        }
        object2 = "Already attached to lifecycleOwner".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void close() {
    }

    public final void k(mu1_1 object, i$a i$a) {
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        i$a i$a2 = i$a.ON_DESTROY;
        if (i$a == i$a2) {
            i$a = null;
            this.c = false;
            object = object.getLifecycle();
            ((i)object).c(this);
        }
    }
}


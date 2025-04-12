/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import androidx.fragment.app.n$c$b$a;
import kotlin.jvm.internal.Intrinsics;

public class b$f {
    public final n$c a;

    public b$f(n$c n$c) {
        Intrinsics.checkNotNullParameter(n$c, "operation");
        this.a = n$c;
    }

    public final boolean a() {
        boolean bl2;
        Object object;
        Object object2 = this.a;
        Object object3 = object2.c.mView;
        if (object3 != null) {
            object = n$c$b.Companion;
            object.getClass();
            object3 = n$c$b$a.a(object3);
        } else {
            object3 = null;
        }
        object2 = object2.a;
        if (object3 != object2 && (object3 == (object = n$c$b.VISIBLE) || object2 == object)) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.E$b;
import androidx.lifecycle.E$c$a;
import kotlin.jvm.internal.Intrinsics;

public class E$c
implements E$b {
    public static final E$c$a Companion;
    public static final Wd0$b VIEW_MODEL_KEY;
    private static E$c _instance;

    static {
        E$c$a e$c$a;
        Companion = e$c$a = new Object();
        VIEW_MODEL_KEY = qD3.a;
    }

    public static final E$c getInstance() {
        Companion.getClass();
        E$c e$c = E$c._instance;
        if (e$c == null) {
            e$c = new E$c();
            E$c._instance = e$c;
        }
        e$c = E$c._instance;
        Intrinsics.checkNotNull(e$c);
        return e$c;
    }

    public jD3 create(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "modelClass");
        return c13_0.b(clazz);
    }

    public jD3 create(Class clazz, Wd0 wd0) {
        Intrinsics.checkNotNullParameter(clazz, "modelClass");
        Intrinsics.checkNotNullParameter(wd0, "extras");
        return this.create(clazz);
    }

    public jD3 create(yn1_2 object, Wd0 wd0) {
        Intrinsics.checkNotNullParameter(object, "modelClass");
        Intrinsics.checkNotNullParameter(wd0, "extras");
        object = rn1_2.a((yn1_2)object);
        return this.create((Class)object, wd0);
    }
}


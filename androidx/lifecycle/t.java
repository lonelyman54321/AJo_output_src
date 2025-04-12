/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.b$a;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import java.util.HashMap;
import java.util.List;

public final class t
implements n {
    public final Object a;
    public final b$a b;

    public t(Object clazz) {
        this.a = clazz;
        b b2 = androidx.lifecycle.b.c;
        clazz = clazz.getClass();
        b$a b$a = (b$a)b2.a.get(clazz);
        if (b$a == null) {
            b$a = b2.a(clazz, null);
        }
        this.b = b$a;
    }

    public final void k(mu1_1 mu1_12, i$a i$a) {
        HashMap hashMap = this.b.a;
        Object object = (List)hashMap.get((Object)i$a);
        Object object2 = this.a;
        b$a.a(object, mu1_12, i$a, object2);
        object = i$a.ON_ANY;
        b$a.a((List)hashMap.get(object), mu1_12, i$a, object2);
    }
}


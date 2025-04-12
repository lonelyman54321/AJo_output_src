/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.z$a;
import androidx.recyclerview.widget.z$d;

public final class z$a$a
implements z$d {
    public final pb1_0 a;
    public final /* synthetic */ z$a b;

    public z$a$a(z$a object) {
        this.b = object;
        this.a = object = new pb1_0();
    }

    public final long a(long l2) {
        pb1_0 pb1_02 = this.a;
        Object object = (Long)pb1_02.f(l2);
        if (object == null) {
            long l3;
            object = this.b;
            long l4 = ((z$a)object).a;
            ((z$a)object).a = l3 = 1L + l4;
            object = l4;
            pb1_02.l(l2, object);
        }
        return (Long)object;
    }
}


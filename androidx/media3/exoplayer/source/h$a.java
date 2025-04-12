/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import java.util.Objects;

public final class h$a
extends QV0 {
    public static final Object e;
    public final Object c;
    public final Object d;

    static {
        Object object;
        e = object = new Object();
    }

    public h$a(g g3, Object object, Object object2) {
        super(g3);
        this.c = object;
        this.d = object2;
    }

    public final int b(Object object) {
        Object object2 = e;
        boolean bl2 = object2.equals(object);
        if (bl2 && (object2 = this.d) != null) {
            object = object2;
        }
        return this.b.b(object);
    }

    public final g$b g(int n3, g$b g$b, boolean bl2) {
        this.b.g(n3, g$b, bl2);
        Object object = g$b.b;
        Object object2 = this.d;
        n3 = (int)(Objects.equals(object, object2) ? 1 : 0);
        if (n3 != 0 && bl2) {
            g$b.b = object = e;
        }
        return g$b;
    }

    public final Object m(int n3) {
        Object object = this.b.m(n3);
        int n4 = gz3.a;
        Object object2 = this.d;
        n4 = (int)(Objects.equals(object, object2) ? 1 : 0);
        if (n4 != 0) {
            object = e;
        }
        return object;
    }

    public final g$c n(int n3, g$c g$c, long l2) {
        g g3 = this.b;
        g3.n(n3, g$c, l2);
        Object object = g$c.a;
        Object object2 = this.c;
        n3 = (int)(Objects.equals(object, object2) ? 1 : 0);
        if (n3 != 0) {
            g$c.a = object = g$c.q;
        }
        return g$c;
    }
}


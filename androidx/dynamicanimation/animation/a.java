/*
 * Decompiled with CFR 0.152.
 */
package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.a$a;
import androidx.dynamicanimation.animation.a$d;
import java.util.ArrayList;

public final class a {
    public static final ThreadLocal f;
    public final a53 a;
    public final ArrayList b;
    public final a$a c;
    public a$d d;
    public boolean e;

    static {
        ThreadLocal threadLocal;
        f = threadLocal = new ThreadLocal();
    }

    public a() {
        Object object = new a53();
        this.a = object;
        object = new ArrayList();
        this.b = object;
        this.c = object = new a$a(this);
        this.e = false;
    }
}


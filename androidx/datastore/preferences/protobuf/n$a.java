/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.a$a;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$f;

public abstract class n$a
extends a$a {
    public final n a;
    public n b;
    public boolean c;

    public n$a(n n3) {
        this.a = n3;
        n$f n$f = n$f.NEW_MUTABLE_INSTANCE;
        this.b = n3 = (n)n3.f(n$f);
        this.c = false;
    }

    public static void i(n n3, n n4) {
        GB2 gB2 = GB2.c;
        gB2.getClass();
        Class<?> clazz = n3.getClass();
        gB2.a(clazz).mergeFrom(n3, n4);
    }

    public final n b() {
        return this.a;
    }

    public final Object clone() {
        xo1_0 xo1_02 = this.a;
        xo1_02.getClass();
        Object object = n$f.NEW_BUILDER;
        xo1_02 = (n$a)((n)xo1_02).f((n$f)((Object)object));
        object = this.f();
        ((n$a)xo1_02).g();
        n$a.i(((n$a)xo1_02).b, (n)object);
        return xo1_02;
    }

    public final n e() {
        Object object = this.f();
        boolean bl2 = ((n)object).i();
        if (bl2) {
            return object;
        }
        object = new UninitializedMessageException();
        throw object;
    }

    public final n f() {
        boolean bl2 = this.c;
        if (bl2) {
            return this.b;
        }
        n n3 = this.b;
        n3.getClass();
        GB2 gB2 = GB2.c;
        gB2.getClass();
        Class<?> clazz = n3.getClass();
        gB2.a(clazz).makeImmutable(n3);
        this.c = true;
        return this.b;
    }

    public final void g() {
        boolean bl2 = this.c;
        if (bl2) {
            n n3 = this.b;
            Object object = n$f.NEW_MUTABLE_INSTANCE;
            n3 = (n)n3.f((n$f)((Object)object));
            object = this.b;
            n$a.i(n3, (n)object);
            this.b = n3;
            bl2 = false;
            n3 = null;
            this.c = false;
        }
    }
}


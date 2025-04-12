/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.n$f;

public abstract class n$c
extends n
implements xo1_0 {
    protected l_0 extensions;

    public n$c() {
        l_0 l_02;
        this.extensions = l_02 = l_0.d;
    }

    public final n b() {
        n$f n$f = n$f.GET_DEFAULT_INSTANCE;
        return (n)this.f(n$f);
    }

    public final n$a newBuilderForType() {
        n$f n$f = n$f.NEW_BUILDER;
        return (n$a)this.f(n$f);
    }

    public final n$a toBuilder() {
        Object object = n$f.NEW_BUILDER;
        object = (n$a)this.f((n$f)((Object)object));
        ((n$a)object).g();
        n$a.i(((n$a)object).b, this);
        return object;
    }
}


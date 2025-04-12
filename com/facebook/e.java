/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends AbstractList {
    public static final AtomicInteger e;
    public Handler a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        AtomicInteger atomicInteger;
        e = atomicInteger = new AtomicInteger();
    }

    public e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "requests");
        ArrayList arrayList = String.valueOf((Object)e.incrementAndGet());
        this.b = arrayList;
        this.d = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList(collection);
    }

    public e(GraphRequest ... object) {
        Intrinsics.checkNotNullParameter(object, "requests");
        ArrayList arrayList = String.valueOf((Object)e.incrementAndGet());
        this.b = arrayList;
        this.d = arrayList = new ArrayList();
        object = rp_1.e(object);
        this.c = arrayList = new ArrayList(object);
    }

    public final void add(int n3, Object object) {
        object = (GraphRequest)object;
        Intrinsics.checkNotNullParameter(object, "element");
        this.c.add(n3, object);
    }

    public final boolean add(Object object) {
        object = (GraphRequest)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.c.add(object);
    }

    public final void clear() {
        this.c.clear();
    }

    public final Object get(int n3) {
        return (GraphRequest)this.c.get(n3);
    }

    public final Object remove(int n3) {
        return (GraphRequest)this.c.remove(n3);
    }

    public final Object set(int n3, Object object) {
        object = (GraphRequest)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return (GraphRequest)this.c.set(n3, object);
    }

    public final int size() {
        return this.c.size();
    }
}


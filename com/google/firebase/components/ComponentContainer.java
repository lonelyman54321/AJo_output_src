/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

public interface ComponentContainer {
    public Object get(Qualified var1);

    public Object get(Class var1);

    public Deferred getDeferred(Qualified var1);

    public Deferred getDeferred(Class var1);

    public Provider getProvider(Qualified var1);

    public Provider getProvider(Class var1);

    public Set setOf(Qualified var1);

    public Set setOf(Class var1);

    public Provider setOfProvider(Qualified var1);

    public Provider setOfProvider(Class var1);
}


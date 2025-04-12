/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.f;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;

class OptionalProvider
implements Provider,
Deferred {
    private static final Provider EMPTY_PROVIDER;
    private static final Deferred$DeferredHandler NOOP_HANDLER;
    private volatile Provider delegate;
    private Deferred$DeferredHandler handler;

    static {
        Object object = new Object();
        NOOP_HANDLER = object;
        EMPTY_PROVIDER = object = new Object();
    }

    private OptionalProvider(Deferred$DeferredHandler deferred$DeferredHandler, Provider provider) {
        this.handler = deferred$DeferredHandler;
        this.delegate = provider;
    }

    public static /* synthetic */ Object a() {
        return OptionalProvider.lambda$static$1();
    }

    public static /* synthetic */ void b(Deferred$DeferredHandler deferred$DeferredHandler, Deferred$DeferredHandler deferred$DeferredHandler2, Provider provider) {
        OptionalProvider.lambda$whenAvailable$2(deferred$DeferredHandler, deferred$DeferredHandler2, provider);
    }

    public static /* synthetic */ void c(Provider provider) {
        OptionalProvider.lambda$static$0(provider);
    }

    public static OptionalProvider empty() {
        Deferred$DeferredHandler deferred$DeferredHandler = NOOP_HANDLER;
        Provider provider = EMPTY_PROVIDER;
        OptionalProvider optionalProvider = new OptionalProvider(deferred$DeferredHandler, provider);
        return optionalProvider;
    }

    private static /* synthetic */ void lambda$static$0(Provider provider) {
    }

    private static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    private static /* synthetic */ void lambda$whenAvailable$2(Deferred$DeferredHandler deferred$DeferredHandler, Deferred$DeferredHandler deferred$DeferredHandler2, Provider provider) {
        deferred$DeferredHandler.handle(provider);
        deferred$DeferredHandler2.handle(provider);
    }

    public static OptionalProvider of(Provider provider) {
        OptionalProvider optionalProvider = new OptionalProvider(null, provider);
        return optionalProvider;
    }

    public Object get() {
        return this.delegate.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(Provider object) {
        Object object2 = this.delegate;
        Provider provider = EMPTY_PROVIDER;
        if (object2 == provider) {
            synchronized (this) {
                object2 = this.handler;
                provider = null;
                this.handler = null;
                this.delegate = object;
            }
            object2.handle((Provider)object);
            return;
        }
        object = new IllegalStateException("provide() can be called only once.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void whenAvailable(Deferred$DeferredHandler deferred$DeferredHandler) {
        Provider provider = this.delegate;
        Object object = EMPTY_PROVIDER;
        if (provider != object) {
            deferred$DeferredHandler.handle(provider);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider == object) {
                object = this.handler;
                f f5 = new f((Deferred$DeferredHandler)object, deferred$DeferredHandler);
                this.handler = f5;
                return;
            }
            object = provider;
        }
        if (object == null) return;
        deferred$DeferredHandler.handle(provider);
    }
}


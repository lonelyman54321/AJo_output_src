/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public class Lazy
implements Provider {
    private static final Object UNINITIALIZED;
    private volatile Object instance;
    private volatile Provider provider;

    static {
        Object object;
        UNINITIALIZED = object = new Object();
    }

    public Lazy(Provider provider) {
        Object object;
        this.instance = object = UNINITIALIZED;
        this.provider = provider;
    }

    public Lazy(Object object) {
        Object object2;
        this.instance = object2 = UNINITIALIZED;
        this.instance = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get() {
        Object object = this.instance;
        Object object2 = UNINITIALIZED;
        if (object != object2) return object;
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    object = this.instance;
                    if (object != object2) return object;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.provider;
                this.instance = object = object.get();
                object2 = null;
                this.provider = null;
                return object;
            }
            throw throwable2;
        }
    }

    public boolean isInitialized() {
        boolean bl2;
        Object object = this.instance;
        Object object2 = UNINITIALIZED;
        if (object != object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}


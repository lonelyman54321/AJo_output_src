/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DoubleCheck
implements Provider,
Lazy {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final Object UNINITIALIZED;
    private volatile Object instance;
    private volatile Provider provider;

    static {
        Object object;
        UNINITIALIZED = object = new Object();
    }

    private DoubleCheck(Provider provider) {
        Object object;
        this.instance = object = UNINITIALIZED;
        this.provider = provider;
    }

    public static Lazy lazy(Provider provider) {
        boolean bl2 = provider instanceof Lazy;
        if (bl2) {
            return (Lazy)((Object)provider);
        }
        provider = (Provider)Preconditions.checkNotNull(provider);
        DoubleCheck doubleCheck = new DoubleCheck(provider);
        return doubleCheck;
    }

    public static Provider provider(Provider provider) {
        Preconditions.checkNotNull(provider);
        boolean bl2 = provider instanceof DoubleCheck;
        if (bl2) {
            return provider;
        }
        DoubleCheck doubleCheck = new DoubleCheck(provider);
        return doubleCheck;
    }

    private static Object reentrantCheck(Object object, Object object2) {
        Object object3 = UNINITIALIZED;
        if (object != object3 && object != object2) {
            StringBuilder stringBuilder = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
            stringBuilder.append(object);
            stringBuilder.append(" & ");
            stringBuilder.append(object2);
            stringBuilder.append(". This is likely due to a circular dependency.");
            object = stringBuilder.toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        return object2;
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
                object = object.get();
                object2 = this.instance;
                this.instance = object2 = DoubleCheck.reentrantCheck(object2, object);
                object2 = null;
                this.provider = null;
                return object;
            }
            throw throwable2;
        }
    }
}


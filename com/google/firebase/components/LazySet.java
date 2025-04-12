/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class LazySet
implements Provider {
    private volatile Set actualSet = null;
    private volatile Set providers;

    public LazySet(Collection collection) {
        Object object = new ConcurrentHashMap();
        this.providers = object = Collections.newSetFromMap(object);
        this.providers.addAll(collection);
    }

    public static LazySet fromCollection(Collection collection) {
        collection = (Set)collection;
        LazySet lazySet = new LazySet(collection);
        return lazySet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateSet() {
        synchronized (this) {
            try {
                Object object = this.providers;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = null;
                        this.providers = null;
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (Provider)object2;
                    Set set = this.actualSet;
                    object2 = object2.get();
                    set.add(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(Provider object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Set set;
                    block3: {
                        try {
                            set = this.actualSet;
                            if (set != null) break block3;
                            set = this.providers;
                            set.add(object);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    set = this.actualSet;
                    object = object.get();
                    set.add(object);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set get() {
        Object object = this.actualSet;
        if (object != null) return Collections.unmodifiableSet(this.actualSet);
        synchronized (this) {
            try {
                object = this.actualSet;
                if (object != null) return Collections.unmodifiableSet(this.actualSet);
                object = new ConcurrentHashMap();
                this.actualSet = object = Collections.newSetFromMap(object);
                this.updateSet();
                return Collections.unmodifiableSet(this.actualSet);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


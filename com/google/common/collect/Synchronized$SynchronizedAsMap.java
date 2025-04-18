/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Synchronized;
import com.google.common.collect.Synchronized$SynchronizedAsMapEntries;
import com.google.common.collect.Synchronized$SynchronizedAsMapValues;
import com.google.common.collect.Synchronized$SynchronizedMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class Synchronized$SynchronizedAsMap
extends Synchronized$SynchronizedMap {
    private static final long serialVersionUID;
    transient Set asMapEntrySet;
    transient Collection asMapValues;

    public Synchronized$SynchronizedAsMap(Map map2, Object object) {
        super(map2, object);
    }

    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set entrySet() {
        Object object = this.mutex;
        synchronized (object) {
            try {
                Set set = this.asMapEntrySet;
                if (set != null) return this.asMapEntrySet;
                Set set2 = this.delegate();
                set2 = set2.entrySet();
                Object object2 = this.mutex;
                this.asMapEntrySet = set = new Synchronized$SynchronizedAsMapEntries(set2, object2);
                return this.asMapEntrySet;
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
    public Collection get(Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            object = super.get(object);
            object = (Collection)object;
            if (object == null) {
                return null;
            }
            Object object3 = this.mutex;
            return Synchronized.access$400((Collection)object, object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Collection values() {
        Object object = this.mutex;
        synchronized (object) {
            try {
                Collection collection = this.asMapValues;
                if (collection != null) return this.asMapValues;
                Collection collection2 = this.delegate();
                collection2 = collection2.values();
                Object object2 = this.mutex;
                this.asMapValues = collection = new Synchronized$SynchronizedAsMapValues(collection2, object2);
                return this.asMapValues;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


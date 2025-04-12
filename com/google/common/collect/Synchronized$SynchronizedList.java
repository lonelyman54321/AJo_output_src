/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Synchronized;
import com.google.common.collect.Synchronized$SynchronizedCollection;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class Synchronized$SynchronizedList
extends Synchronized$SynchronizedCollection
implements List {
    private static final long serialVersionUID;

    public Synchronized$SynchronizedList(List list, Object object) {
        super(list, object, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(int n3, Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            Object object3 = this.delegate();
            object3.add(n3, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean addAll(int n3, Collection collection) {
        Object object = this.mutex;
        synchronized (object) {
            Object object2 = this.delegate();
            return (int)(object2.addAll(n3, collection) ? 1 : 0) != 0;
        }
    }

    public List delegate() {
        return (List)super.delegate();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.mutex;
        synchronized (object2) {
            Object object3 = this.delegate();
            return object3.equals(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get(int n3) {
        Object object = this.mutex;
        synchronized (object) {
            Object object2 = this.delegate();
            return object2.get(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        Object object = this.mutex;
        synchronized (object) {
            Object object2 = this.delegate();
            return object2.hashCode();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int indexOf(Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            Object object3 = this.delegate();
            return object3.indexOf(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int lastIndexOf(Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            Object object3 = this.delegate();
            return object3.lastIndexOf(object);
        }
    }

    public ListIterator listIterator() {
        return this.delegate().listIterator();
    }

    public ListIterator listIterator(int n3) {
        return this.delegate().listIterator(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object remove(int n3) {
        Object object = this.mutex;
        synchronized (object) {
            Object object2 = this.delegate();
            return object2.remove(n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object set(int n3, Object object) {
        Object object2 = this.mutex;
        synchronized (object2) {
            Object object3 = this.delegate();
            return object3.set(n3, object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List subList(int n3, int n4) {
        Object object = this.mutex;
        synchronized (object) {
            Object object2 = this.delegate();
            List list = object2.subList(n3, n4);
            Object object3 = this.mutex;
            return Synchronized.access$200(list, object3);
        }
    }
}


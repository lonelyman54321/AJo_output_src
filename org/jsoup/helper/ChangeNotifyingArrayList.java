/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ChangeNotifyingArrayList
extends ArrayList {
    public ChangeNotifyingArrayList(int n3) {
        super(n3);
    }

    public void add(int n3, Object object) {
        this.onContentsChanged();
        super.add(n3, object);
    }

    public boolean add(Object object) {
        this.onContentsChanged();
        return super.add(object);
    }

    public boolean addAll(int n3, Collection collection) {
        this.onContentsChanged();
        return super.addAll(n3, collection);
    }

    public boolean addAll(Collection collection) {
        this.onContentsChanged();
        return super.addAll(collection);
    }

    public void clear() {
        this.onContentsChanged();
        super.clear();
    }

    public abstract void onContentsChanged();

    public Object remove(int n3) {
        this.onContentsChanged();
        return super.remove(n3);
    }

    public boolean remove(Object object) {
        this.onContentsChanged();
        return super.remove(object);
    }

    public boolean removeAll(Collection collection) {
        this.onContentsChanged();
        return super.removeAll(collection);
    }

    public void removeRange(int n3, int n4) {
        this.onContentsChanged();
        super.removeRange(n3, n4);
    }

    public boolean retainAll(Collection collection) {
        this.onContentsChanged();
        return super.retainAll(collection);
    }

    public Object set(int n3, Object object) {
        this.onContentsChanged();
        return super.set(n3, object);
    }
}


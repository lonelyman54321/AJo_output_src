/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class AbstractMapBasedMultimap$WrappedList
extends AbstractMapBasedMultimap$WrappedCollection
implements List {
    final /* synthetic */ AbstractMapBasedMultimap this$0;

    public AbstractMapBasedMultimap$WrappedList(AbstractMapBasedMultimap abstractMapBasedMultimap, Object object, List list, AbstractMapBasedMultimap$WrappedCollection abstractMapBasedMultimap$WrappedCollection) {
        this.this$0 = abstractMapBasedMultimap;
        super(abstractMapBasedMultimap, object, list, abstractMapBasedMultimap$WrappedCollection);
    }

    public void add(int n3, Object object) {
        this.refreshIfEmpty();
        Collection collection = this.getDelegate();
        boolean bl2 = collection.isEmpty();
        List list = this.getListDelegate();
        list.add(n3, object);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
        AbstractMapBasedMultimap.access$208(abstractMapBasedMultimap);
        if (bl2) {
            this.addToMap();
        }
    }

    public boolean addAll(int n3, Collection collection) {
        int n4 = collection.isEmpty();
        if (n4 != 0) {
            return false;
        }
        n4 = this.size();
        Object object = this.getListDelegate();
        n3 = (int)(object.addAll(n3, collection) ? 1 : 0);
        if (n3 != 0) {
            collection = this.getDelegate();
            int n7 = collection.size();
            object = this.this$0;
            AbstractMapBasedMultimap.access$212((AbstractMapBasedMultimap)object, n7 -= n4);
            if (n4 == 0) {
                this.addToMap();
            }
        }
        return n3 != 0;
    }

    public Object get(int n3) {
        this.refreshIfEmpty();
        return this.getListDelegate().get(n3);
    }

    public List getListDelegate() {
        return (List)this.getDelegate();
    }

    public int indexOf(Object object) {
        this.refreshIfEmpty();
        return this.getListDelegate().indexOf(object);
    }

    public int lastIndexOf(Object object) {
        this.refreshIfEmpty();
        return this.getListDelegate().lastIndexOf(object);
    }

    public ListIterator listIterator() {
        this.refreshIfEmpty();
        AbstractMapBasedMultimap$WrappedList$WrappedListIterator abstractMapBasedMultimap$WrappedList$WrappedListIterator = new AbstractMapBasedMultimap$WrappedList$WrappedListIterator(this);
        return abstractMapBasedMultimap$WrappedList$WrappedListIterator;
    }

    public ListIterator listIterator(int n3) {
        this.refreshIfEmpty();
        AbstractMapBasedMultimap$WrappedList$WrappedListIterator abstractMapBasedMultimap$WrappedList$WrappedListIterator = new AbstractMapBasedMultimap$WrappedList$WrappedListIterator(this, n3);
        return abstractMapBasedMultimap$WrappedList$WrappedListIterator;
    }

    public Object remove(int n3) {
        this.refreshIfEmpty();
        Object e2 = this.getListDelegate().remove(n3);
        AbstractMapBasedMultimap.access$210(this.this$0);
        this.removeIfEmpty();
        return e2;
    }

    public Object set(int n3, Object object) {
        this.refreshIfEmpty();
        return this.getListDelegate().set(n3, object);
    }

    public List subList(int n3, int n4) {
        this.refreshIfEmpty();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.this$0;
        Object object = this.getKey();
        List list = this.getListDelegate();
        List list2 = list.subList(n3, n4);
        AbstractMapBasedMultimap$WrappedCollection abstractMapBasedMultimap$WrappedCollection = this.getAncestor();
        abstractMapBasedMultimap$WrappedCollection = abstractMapBasedMultimap$WrappedCollection == null ? this : this.getAncestor();
        return abstractMapBasedMultimap.wrapList(object, list2, abstractMapBasedMultimap$WrappedCollection);
    }
}


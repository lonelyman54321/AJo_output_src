/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset$1;
import com.google.common.collect.ImmutableMultiset$EntrySetSerializedForm;
import com.google.common.collect.IndexedImmutableSet;
import com.google.common.collect.Multiset$Entry;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class ImmutableMultiset$EntrySet
extends IndexedImmutableSet {
    private static final long serialVersionUID;
    final /* synthetic */ ImmutableMultiset this$0;

    private ImmutableMultiset$EntrySet(ImmutableMultiset immutableMultiset) {
        this.this$0 = immutableMultiset;
    }

    public /* synthetic */ ImmutableMultiset$EntrySet(ImmutableMultiset immutableMultiset, ImmutableMultiset$1 immutableMultiset$1) {
        this(immutableMultiset);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use EntrySetSerializedForm");
        throw object;
    }

    public boolean contains(Object object) {
        int n3 = object instanceof Multiset$Entry;
        boolean bl2 = false;
        if (n3 != 0) {
            int n4;
            n3 = (object = (Multiset$Entry)object).getCount();
            if (n3 <= 0) {
                return false;
            }
            ImmutableMultiset immutableMultiset = this.this$0;
            Object object2 = object.getElement();
            n3 = immutableMultiset.count(object2);
            if (n3 == (n4 = object.getCount())) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public Multiset$Entry get(int n3) {
        return this.this$0.getEntry(n3);
    }

    public int hashCode() {
        return this.this$0.hashCode();
    }

    public boolean isPartialView() {
        return this.this$0.isPartialView();
    }

    public int size() {
        return this.this$0.elementSet().size();
    }

    public Object writeReplace() {
        ImmutableMultiset immutableMultiset = this.this$0;
        ImmutableMultiset$EntrySetSerializedForm immutableMultiset$EntrySetSerializedForm = new ImmutableMultiset$EntrySetSerializedForm(immutableMultiset);
        return immutableMultiset$EntrySetSerializedForm;
    }
}


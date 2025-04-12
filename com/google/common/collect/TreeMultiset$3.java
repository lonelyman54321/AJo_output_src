/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.GeneralRange;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.TreeMultiset;
import com.google.common.collect.TreeMultiset$AvlNode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

class TreeMultiset$3
implements Iterator {
    TreeMultiset$AvlNode current;
    Multiset$Entry prevEntry;
    final /* synthetic */ TreeMultiset this$0;

    public TreeMultiset$3(TreeMultiset object) {
        this.this$0 = object;
        this.current = object = TreeMultiset.access$1700((TreeMultiset)object);
        this.prevEntry = null;
    }

    public boolean hasNext() {
        Object object;
        Object object2 = this.current;
        if (object2 == null) {
            return false;
        }
        object2 = TreeMultiset.access$1400(this.this$0);
        boolean bl2 = ((GeneralRange)object2).tooLow(object = this.current.getElement());
        if (bl2) {
            this.current = null;
            return false;
        }
        return true;
    }

    public Multiset$Entry next() {
        boolean bl2 = this.hasNext();
        if (bl2) {
            Objects.requireNonNull(this.current);
            Object object = this.this$0;
            TreeMultiset$AvlNode treeMultiset$AvlNode = this.current;
            this.prevEntry = object = TreeMultiset.access$1500((TreeMultiset)object, treeMultiset$AvlNode);
            treeMultiset$AvlNode = TreeMultiset$AvlNode.access$1200(this.current);
            TreeMultiset$AvlNode treeMultiset$AvlNode2 = TreeMultiset.access$1600(this.this$0);
            if (treeMultiset$AvlNode == treeMultiset$AvlNode2) {
                treeMultiset$AvlNode = null;
                this.current = null;
            } else {
                this.current = treeMultiset$AvlNode = TreeMultiset$AvlNode.access$1200(this.current);
            }
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        boolean bl2;
        Object object = this.prevEntry;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
        object = this.this$0;
        Object object2 = this.prevEntry.getElement();
        ((TreeMultiset)object).setCount(object2, 0);
        this.prevEntry = null;
    }
}


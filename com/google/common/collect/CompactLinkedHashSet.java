/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CompactHashSet;
import com.google.common.collect.ObjectArrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

class CompactLinkedHashSet
extends CompactHashSet {
    private static final int ENDPOINT = 254;
    private transient int firstEntry;
    private transient int lastEntry;
    private transient int[] predecessor;
    private transient int[] successor;

    public CompactLinkedHashSet() {
    }

    public CompactLinkedHashSet(int n3) {
        super(n3);
    }

    public static CompactLinkedHashSet create() {
        CompactLinkedHashSet compactLinkedHashSet = new CompactLinkedHashSet();
        return compactLinkedHashSet;
    }

    public static CompactLinkedHashSet create(Collection collection) {
        CompactLinkedHashSet compactLinkedHashSet = CompactLinkedHashSet.createWithExpectedSize(collection.size());
        compactLinkedHashSet.addAll(collection);
        return compactLinkedHashSet;
    }

    public static CompactLinkedHashSet create(Object ... objectArray) {
        CompactLinkedHashSet compactLinkedHashSet = CompactLinkedHashSet.createWithExpectedSize(objectArray.length);
        Collections.addAll(compactLinkedHashSet, objectArray);
        return compactLinkedHashSet;
    }

    public static CompactLinkedHashSet createWithExpectedSize(int n3) {
        CompactLinkedHashSet compactLinkedHashSet = new CompactLinkedHashSet(n3);
        return compactLinkedHashSet;
    }

    private int getPredecessor(int n3) {
        return this.requirePredecessors()[n3] + -1;
    }

    private int[] requirePredecessors() {
        int[] nArray = this.predecessor;
        Objects.requireNonNull(nArray);
        return nArray;
    }

    private int[] requireSuccessors() {
        int[] nArray = this.successor;
        Objects.requireNonNull(nArray);
        return nArray;
    }

    private void setPredecessor(int n3, int n4) {
        int[] nArray = this.requirePredecessors();
        nArray[n3] = ++n4;
    }

    private void setSucceeds(int n3, int n4) {
        int n7 = -2;
        if (n3 == n7) {
            this.firstEntry = n4;
        } else {
            this.setSuccessor(n3, n4);
        }
        if (n4 == n7) {
            this.lastEntry = n3;
        } else {
            this.setPredecessor(n4, n3);
        }
    }

    private void setSuccessor(int n3, int n4) {
        int[] nArray = this.requireSuccessors();
        nArray[n3] = ++n4;
    }

    public int adjustAfterRemove(int n3, int n4) {
        int n7 = this.size();
        if (n3 >= n7) {
            n3 = n4;
        }
        return n3;
    }

    public int allocArrays() {
        int n3 = super.allocArrays();
        int[] nArray = new int[n3];
        this.predecessor = nArray;
        nArray = new int[n3];
        this.successor = nArray;
        return n3;
    }

    public void clear() {
        int[] nArray;
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            return;
        }
        this.firstEntry = n3 = -2;
        this.lastEntry = n3;
        int[] nArray2 = this.predecessor;
        if (nArray2 != null && (nArray = this.successor) != null) {
            int n4 = this.size();
            Arrays.fill(nArray2, 0, n4, 0);
            nArray2 = this.successor;
            n4 = this.size();
            Arrays.fill(nArray2, 0, n4, 0);
        }
        super.clear();
    }

    public Set convertToHashFloodingResistantImplementation() {
        Set set = super.convertToHashFloodingResistantImplementation();
        this.predecessor = null;
        this.successor = null;
        return set;
    }

    public int firstEntryIndex() {
        return this.firstEntry;
    }

    public int getSuccessor(int n3) {
        return this.requireSuccessors()[n3] + -1;
    }

    public void init(int n3) {
        super.init(n3);
        this.firstEntry = n3 = -2;
        this.lastEntry = n3;
    }

    public void insertEntry(int n3, Object object, int n4, int n7) {
        super.insertEntry(n3, object, n4, n7);
        int n8 = this.lastEntry;
        this.setSucceeds(n8, n3);
        this.setSucceeds(n3, -2);
    }

    public void moveLastEntry(int n3, int n4) {
        int n7 = this.size() + -1;
        super.moveLastEntry(n3, n4);
        n4 = this.getPredecessor(n3);
        int n8 = this.getSuccessor(n3);
        this.setSucceeds(n4, n8);
        if (n3 < n7) {
            n4 = this.getPredecessor(n7);
            this.setSucceeds(n4, n3);
            n4 = this.getSuccessor(n7);
            this.setSucceeds(n3, n4);
        }
        this.requirePredecessors()[n7] = 0;
        this.requireSuccessors()[n7] = 0;
    }

    public void resizeEntries(int n3) {
        super.resizeEntries(n3);
        int[] nArray = Arrays.copyOf(this.requirePredecessors(), n3);
        this.predecessor = nArray;
        int[] nArray2 = Arrays.copyOf(this.requireSuccessors(), n3);
        this.successor = nArray2;
    }

    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public Object[] toArray(Object[] objectArray) {
        return ObjectArrays.toArrayImpl(this, objectArray);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CompactHashMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class CompactLinkedHashMap
extends CompactHashMap {
    private static final int ENDPOINT = 254;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    public CompactLinkedHashMap() {
        this(3);
    }

    public CompactLinkedHashMap(int n3) {
        this(n3, false);
    }

    public CompactLinkedHashMap(int n3, boolean bl2) {
        super(n3);
        this.accessOrder = bl2;
    }

    public static CompactLinkedHashMap create() {
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap();
        return compactLinkedHashMap;
    }

    public static CompactLinkedHashMap createWithExpectedSize(int n3) {
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(n3);
        return compactLinkedHashMap;
    }

    private int getPredecessor(int n3) {
        return (int)(this.link(n3) >>> 32) + -1;
    }

    private long link(int n3) {
        return this.requireLinks()[n3];
    }

    private long[] requireLinks() {
        long[] lArray = this.links;
        Objects.requireNonNull(lArray);
        return lArray;
    }

    private void setLink(int n3, long l2) {
        this.requireLinks()[n3] = l2;
    }

    private void setPredecessor(int n3, int n4) {
        long l2 = this.link(n3) & 0xFFFFFFFFL;
        long l3 = (long)(n4 + 1) << 32;
        this.setLink(n3, l2 |= l3);
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
        long l2 = this.link(n3) & 0xFFFFFFFF00000000L;
        long l3 = (long)(n4 + 1) & 0xFFFFFFFFL;
        this.setLink(n3, l2 |= l3);
    }

    public void accessEntry(int n3) {
        int n4 = this.accessOrder;
        if (n4 != 0) {
            n4 = this.getPredecessor(n3);
            int n7 = this.getSuccessor(n3);
            this.setSucceeds(n4, n7);
            n4 = this.lastEntry;
            this.setSucceeds(n4, n3);
            n4 = -2;
            this.setSucceeds(n3, n4);
            this.incrementModCount();
        }
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
        long[] lArray = new long[n3];
        this.links = lArray;
        return n3;
    }

    public void clear() {
        int n3 = this.needsAllocArrays();
        if (n3 != 0) {
            return;
        }
        this.firstEntry = n3 = -2;
        this.lastEntry = n3;
        long[] lArray = this.links;
        if (lArray != null) {
            int n4 = this.size();
            long l2 = 0L;
            Arrays.fill(lArray, 0, n4, l2);
        }
        super.clear();
    }

    public Map convertToHashFloodingResistantImplementation() {
        Map map2 = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return map2;
    }

    public Map createHashFloodingResistantDelegate(int n3) {
        boolean bl2 = this.accessOrder;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3, 1.0f, bl2);
        return linkedHashMap;
    }

    public int firstEntryIndex() {
        return this.firstEntry;
    }

    public int getSuccessor(int n3) {
        return (int)this.link(n3) + -1;
    }

    public void init(int n3) {
        super.init(n3);
        this.firstEntry = n3 = -2;
        this.lastEntry = n3;
    }

    public void insertEntry(int n3, Object object, Object object2, int n4, int n7) {
        super.insertEntry(n3, object, object2, n4, n7);
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
        this.setLink(n7, 0L);
    }

    public void resizeEntries(int n3) {
        super.resizeEntries(n3);
        long[] lArray = Arrays.copyOf(this.requireLinks(), n3);
        this.links = lArray;
    }
}


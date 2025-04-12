/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ObjectCountHashMap;
import java.util.Arrays;

class ObjectCountLinkedHashMap
extends ObjectCountHashMap {
    private static final int ENDPOINT = 254;
    private transient int firstEntry;
    private transient int lastEntry;
    transient long[] links;

    public ObjectCountLinkedHashMap() {
        this(3);
    }

    public ObjectCountLinkedHashMap(int n3) {
        this(n3, 1.0f);
    }

    public ObjectCountLinkedHashMap(int n3, float f5) {
        super(n3, f5);
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap objectCountHashMap) {
        int n3 = objectCountHashMap.size();
        int n4 = 1065353216;
        float f5 = 1.0f;
        this.init(n3, f5);
        n3 = objectCountHashMap.firstIndex();
        while (true) {
            n4 = -1;
            f5 = 0.0f / 0.0f;
            if (n3 == n4) break;
            Object object = objectCountHashMap.getKey(n3);
            int n7 = objectCountHashMap.getValue(n3);
            this.put(object, n7);
            n3 = objectCountHashMap.nextIndex(n3);
        }
    }

    public static ObjectCountLinkedHashMap create() {
        ObjectCountLinkedHashMap objectCountLinkedHashMap = new ObjectCountLinkedHashMap();
        return objectCountLinkedHashMap;
    }

    public static ObjectCountLinkedHashMap createWithExpectedSize(int n3) {
        ObjectCountLinkedHashMap objectCountLinkedHashMap = new ObjectCountLinkedHashMap(n3);
        return objectCountLinkedHashMap;
    }

    private int getPredecessor(int n3) {
        return (int)(this.links[n3] >>> 32);
    }

    private int getSuccessor(int n3) {
        return (int)this.links[n3];
    }

    private void setPredecessor(int n3, int n4) {
        long[] lArray = this.links;
        long l2 = lArray[n3] & 0xFFFFFFFFL;
        long l3 = (long)n4 << 32;
        lArray[n3] = l2 |= l3;
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
        long[] lArray = this.links;
        long l2 = lArray[n3] & 0xFFFFFFFF00000000L;
        long l3 = (long)n4 & 0xFFFFFFFFL;
        lArray[n3] = l2 |= l3;
    }

    public void clear() {
        int n3;
        super.clear();
        this.firstEntry = n3 = -2;
        this.lastEntry = n3;
    }

    public int firstIndex() {
        int n3 = this.firstEntry;
        int n4 = -2;
        if (n3 == n4) {
            n3 = -1;
        }
        return n3;
    }

    public void init(int n3, float f5) {
        int n4;
        super.init(n3, f5);
        this.firstEntry = n4 = -2;
        this.lastEntry = n4;
        long[] lArray = new long[n3];
        this.links = lArray;
        Arrays.fill(lArray, (long)-1);
    }

    public void insertEntry(int n3, Object object, int n4, int n7) {
        super.insertEntry(n3, object, n4, n7);
        int n8 = this.lastEntry;
        this.setSucceeds(n8, n3);
        this.setSucceeds(n3, -2);
    }

    public void moveLastEntry(int n3) {
        int n4 = this.size() + -1;
        int n7 = this.getPredecessor(n3);
        int n8 = this.getSuccessor(n3);
        this.setSucceeds(n7, n8);
        if (n3 < n4) {
            n7 = this.getPredecessor(n4);
            this.setSucceeds(n7, n3);
            n4 = this.getSuccessor(n4);
            this.setSucceeds(n3, n4);
        }
        super.moveLastEntry(n3);
    }

    public int nextIndex(int n3) {
        int n4;
        if ((n3 = this.getSuccessor(n3)) == (n4 = -2)) {
            n3 = -1;
        }
        return n3;
    }

    public int nextIndexAfterRemove(int n3, int n4) {
        int n7 = this.size();
        if (n3 == n7) {
            n3 = n4;
        }
        return n3;
    }

    public void resizeEntries(int n3) {
        super.resizeEntries(n3);
        long[] lArray = this.links;
        int n4 = lArray.length;
        this.links = lArray = Arrays.copyOf(lArray, n3);
        Arrays.fill(lArray, n4, n3, (long)-1);
    }
}


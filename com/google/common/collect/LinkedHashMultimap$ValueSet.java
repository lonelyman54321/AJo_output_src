/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Hashing;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedHashMultimap$ValueEntry;
import com.google.common.collect.LinkedHashMultimap$ValueSet$1;
import com.google.common.collect.LinkedHashMultimap$ValueSetLink;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Arrays;
import java.util.Iterator;

final class LinkedHashMultimap$ValueSet
extends Sets$ImprovedAbstractSet
implements LinkedHashMultimap$ValueSetLink {
    private LinkedHashMultimap$ValueSetLink firstEntry;
    LinkedHashMultimap$ValueEntry[] hashTable;
    private final Object key;
    private LinkedHashMultimap$ValueSetLink lastEntry;
    private int modCount = 0;
    private int size = 0;
    final /* synthetic */ LinkedHashMultimap this$0;

    public LinkedHashMultimap$ValueSet(LinkedHashMultimap linkedHashMultimap$ValueEntryArray, Object object, int n3) {
        this.this$0 = linkedHashMultimap$ValueEntryArray;
        this.key = object;
        this.firstEntry = this;
        this.lastEntry = this;
        linkedHashMultimap$ValueEntryArray = new LinkedHashMultimap$ValueEntry[Hashing.closedTableSize(n3, 1.0)];
        this.hashTable = linkedHashMultimap$ValueEntryArray;
    }

    public static /* synthetic */ LinkedHashMultimap$ValueSetLink access$000(LinkedHashMultimap$ValueSet linkedHashMultimap$ValueSet) {
        return linkedHashMultimap$ValueSet.firstEntry;
    }

    public static /* synthetic */ int access$100(LinkedHashMultimap$ValueSet linkedHashMultimap$ValueSet) {
        return linkedHashMultimap$ValueSet.modCount;
    }

    private int mask() {
        return this.hashTable.length + -1;
    }

    private void rehashIfNecessary() {
        int n3 = this.size;
        LinkedHashMultimap$ValueEntry[] linkedHashMultimap$ValueEntryArray = this.hashTable;
        int n4 = linkedHashMultimap$ValueEntryArray.length;
        double d2 = 1.0;
        if ((n3 = (int)(Hashing.needsResizing(n3, n4, d2) ? 1 : 0)) != 0) {
            LinkedHashMultimap$ValueEntry[] linkedHashMultimap$ValueEntryArray2 = this.hashTable;
            n3 = linkedHashMultimap$ValueEntryArray2.length * 2;
            this.hashTable = linkedHashMultimap$ValueEntryArray = new LinkedHashMultimap$ValueEntry[n3];
            n3 += -1;
            for (LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = this.firstEntry; linkedHashMultimap$ValueSetLink != this; linkedHashMultimap$ValueSetLink = linkedHashMultimap$ValueSetLink.getSuccessorInValueSet()) {
                LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry;
                LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink2 = linkedHashMultimap$ValueSetLink;
                linkedHashMultimap$ValueSetLink2 = (LinkedHashMultimap$ValueEntry)linkedHashMultimap$ValueSetLink;
                int n7 = ((LinkedHashMultimap$ValueEntry)linkedHashMultimap$ValueSetLink2).smearedValueHash & n3;
                ((LinkedHashMultimap$ValueEntry)linkedHashMultimap$ValueSetLink2).nextInValueBucket = linkedHashMultimap$ValueEntry = linkedHashMultimap$ValueEntryArray[n7];
                linkedHashMultimap$ValueEntryArray[n7] = linkedHashMultimap$ValueSetLink2;
            }
        }
    }

    public boolean add(Object object) {
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry;
        int n3 = Hashing.smearedHash(object);
        int n4 = this.mask() & n3;
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2 = linkedHashMultimap$ValueEntry = this.hashTable[n4];
        while (linkedHashMultimap$ValueEntry2 != null) {
            boolean bl2 = linkedHashMultimap$ValueEntry2.matchesValue(object, n3);
            if (bl2) {
                return false;
            }
            linkedHashMultimap$ValueEntry2 = linkedHashMultimap$ValueEntry2.nextInValueBucket;
        }
        Object object2 = this.key;
        linkedHashMultimap$ValueEntry2 = new LinkedHashMultimap$ValueEntry(object2, object, n3, linkedHashMultimap$ValueEntry);
        LinkedHashMultimap.access$200(this.lastEntry, linkedHashMultimap$ValueEntry2);
        LinkedHashMultimap.access$200(linkedHashMultimap$ValueEntry2, this);
        LinkedHashMultimap.access$400(LinkedHashMultimap.access$300(this.this$0).getPredecessorInMultimap(), linkedHashMultimap$ValueEntry2);
        object = LinkedHashMultimap.access$300(this.this$0);
        LinkedHashMultimap.access$400(linkedHashMultimap$ValueEntry2, (LinkedHashMultimap$ValueEntry)object);
        this.hashTable[n4] = linkedHashMultimap$ValueEntry2;
        int n7 = this.size;
        n3 = 1;
        this.size = n7 += n3;
        this.modCount = n7 = this.modCount + n3;
        this.rehashIfNecessary();
        return n3 != 0;
    }

    public void clear() {
        Object object = this.hashTable;
        Object object2 = null;
        Arrays.fill((Object[])object, null);
        int n3 = 0;
        this.size = 0;
        for (object = this.firstEntry; object != this; object = object.getSuccessorInValueSet()) {
            object2 = object;
            object2 = (LinkedHashMultimap$ValueEntry)object;
            LinkedHashMultimap.access$600((LinkedHashMultimap$ValueEntry)object2);
        }
        LinkedHashMultimap.access$200(this, this);
        this.modCount = n3 = this.modCount + 1;
    }

    public boolean contains(Object object) {
        int n3 = Hashing.smearedHash(object);
        Object object2 = this.hashTable;
        int n4 = this.mask() & n3;
        object2 = object2[n4];
        while (object2 != null) {
            n4 = (int)(((LinkedHashMultimap$ValueEntry)object2).matchesValue(object, n3) ? 1 : 0);
            if (n4 != 0) {
                return true;
            }
            object2 = ((LinkedHashMultimap$ValueEntry)object2).nextInValueBucket;
        }
        return false;
    }

    public LinkedHashMultimap$ValueSetLink getPredecessorInValueSet() {
        return this.lastEntry;
    }

    public LinkedHashMultimap$ValueSetLink getSuccessorInValueSet() {
        return this.firstEntry;
    }

    public Iterator iterator() {
        LinkedHashMultimap$ValueSet$1 linkedHashMultimap$ValueSet$1 = new LinkedHashMultimap$ValueSet$1(this);
        return linkedHashMultimap$ValueSet$1;
    }

    public boolean remove(Object object) {
        int n3 = Hashing.smearedHash(object);
        int n4 = this.mask() & n3;
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = this.hashTable[n4];
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry2 = null;
        while (linkedHashMultimap$ValueEntry != null) {
            boolean bl2 = linkedHashMultimap$ValueEntry.matchesValue(object, n3);
            if (bl2) {
                if (linkedHashMultimap$ValueEntry2 == null) {
                    LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry3;
                    object = this.hashTable;
                    object[n4] = linkedHashMultimap$ValueEntry3 = linkedHashMultimap$ValueEntry.nextInValueBucket;
                } else {
                    linkedHashMultimap$ValueEntry2.nextInValueBucket = object = linkedHashMultimap$ValueEntry.nextInValueBucket;
                }
                LinkedHashMultimap.access$500(linkedHashMultimap$ValueEntry);
                LinkedHashMultimap.access$600(linkedHashMultimap$ValueEntry);
                int n7 = this.size;
                n3 = 1;
                this.size = n7 -= n3;
                this.modCount = n7 = this.modCount + n3;
                return n3 != 0;
            }
            LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry4 = linkedHashMultimap$ValueEntry.nextInValueBucket;
            linkedHashMultimap$ValueEntry2 = linkedHashMultimap$ValueEntry;
            linkedHashMultimap$ValueEntry = linkedHashMultimap$ValueEntry4;
        }
        return false;
    }

    public void setPredecessorInValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        this.lastEntry = linkedHashMultimap$ValueSetLink;
    }

    public void setSuccessorInValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        this.firstEntry = linkedHashMultimap$ValueSetLink;
    }

    public int size() {
        return this.size;
    }
}


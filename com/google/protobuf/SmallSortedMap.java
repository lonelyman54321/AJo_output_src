/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.SmallSortedMap$1;
import com.google.protobuf.SmallSortedMap$DescendingEntrySet;
import com.google.protobuf.SmallSortedMap$EmptySet;
import com.google.protobuf.SmallSortedMap$Entry;
import com.google.protobuf.SmallSortedMap$EntrySet;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap
extends AbstractMap {
    private List entryList;
    private boolean isImmutable;
    private volatile SmallSortedMap$DescendingEntrySet lazyDescendingEntrySet;
    private volatile SmallSortedMap$EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map overflowEntries;
    private Map overflowEntriesDescending;

    private SmallSortedMap(int n3) {
        this.maxArraySize = n3;
        Map map2 = Collections.emptyList();
        this.entryList = map2;
        map2 = Collections.emptyMap();
        this.overflowEntries = map2;
        this.overflowEntriesDescending = map2 = Collections.emptyMap();
    }

    public /* synthetic */ SmallSortedMap(int n3, SmallSortedMap$1 smallSortedMap$1) {
        this(n3);
    }

    public static /* synthetic */ void access$300(SmallSortedMap smallSortedMap) {
        smallSortedMap.checkMutable();
    }

    public static /* synthetic */ List access$600(SmallSortedMap smallSortedMap) {
        return smallSortedMap.entryList;
    }

    public static /* synthetic */ Map access$700(SmallSortedMap smallSortedMap) {
        return smallSortedMap.overflowEntries;
    }

    public static /* synthetic */ Object access$800(SmallSortedMap smallSortedMap, int n3) {
        return smallSortedMap.removeArrayEntryAt(n3);
    }

    public static /* synthetic */ Map access$900(SmallSortedMap smallSortedMap) {
        return smallSortedMap.overflowEntriesDescending;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int binarySearchInArray(Comparable comparable) {
        int n3;
        List list = this.entryList;
        int n4 = list.size();
        int n7 = n4 + -1;
        if (n7 >= 0) {
            Comparable comparable2 = ((SmallSortedMap$Entry)this.entryList.get(n7)).getKey();
            n3 = comparable.compareTo(comparable2);
            if (n3 > 0) {
                ++n4;
                return -n4;
            }
            if (n3 == 0) {
                return n7;
            }
        }
        n4 = 0;
        list = null;
        while (n4 <= n7) {
            n3 = (n4 + n7) / 2;
            Comparable comparable3 = ((SmallSortedMap$Entry)this.entryList.get(n3)).getKey();
            int n8 = comparable.compareTo(comparable3);
            if (n8 < 0) {
                n7 = n3 += -1;
                continue;
            }
            if (n8 <= 0) return n3;
            n4 = ++n3;
        }
        ++n4;
        return -n4;
    }

    private void checkMutable() {
        boolean bl2 = this.isImmutable;
        if (!bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    private void ensureEntryArrayMutable() {
        this.checkMutable();
        ArrayList arrayList = this.entryList;
        boolean bl2 = arrayList.isEmpty();
        if (bl2 && !(bl2 = (arrayList = this.entryList) instanceof ArrayList)) {
            int n3 = this.maxArraySize;
            this.entryList = arrayList = new ArrayList(n3);
        }
    }

    private SortedMap getOverflowEntriesMutable() {
        this.checkMutable();
        NavigableMap navigableMap = this.overflowEntries;
        boolean bl2 = navigableMap.isEmpty();
        if (bl2 && !(bl2 = (navigableMap = this.overflowEntries) instanceof TreeMap)) {
            this.overflowEntries = navigableMap = new NavigableMap();
            this.overflowEntriesDescending = navigableMap = navigableMap.descendingMap();
        }
        return (SortedMap)this.overflowEntries;
    }

    public static SmallSortedMap newFieldMap(int n3) {
        SmallSortedMap$1 smallSortedMap$1 = new SmallSortedMap$1(n3);
        return smallSortedMap$1;
    }

    public static SmallSortedMap newInstanceForTest(int n3) {
        SmallSortedMap smallSortedMap = new SmallSortedMap(n3);
        return smallSortedMap;
    }

    private Object removeArrayEntryAt(int n3) {
        this.checkMutable();
        Object object = ((SmallSortedMap$Entry)this.entryList.remove(n3)).getValue();
        Object object2 = this.overflowEntries;
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            object2 = this.getOverflowEntriesMutable().entrySet().iterator();
            List list = this.entryList;
            Map.Entry entry = (Map.Entry)object2.next();
            SmallSortedMap$Entry smallSortedMap$Entry = new SmallSortedMap$Entry(this, entry);
            list.add(smallSortedMap$Entry);
            object2.remove();
        }
        return object;
    }

    public void clear() {
        this.checkMutable();
        Object object = this.entryList;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.entryList;
            object.clear();
        }
        if (!(bl2 = (object = this.overflowEntries).isEmpty())) {
            object = this.overflowEntries;
            object.clear();
        }
    }

    public boolean containsKey(Object object) {
        Map map2;
        boolean bl2;
        int n3 = this.binarySearchInArray((Comparable)(object = (Comparable)object));
        if (n3 < 0 && !(bl2 = (map2 = this.overflowEntries).containsKey(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Set descendingEntrySet() {
        SmallSortedMap$DescendingEntrySet smallSortedMap$DescendingEntrySet = this.lazyDescendingEntrySet;
        if (smallSortedMap$DescendingEntrySet == null) {
            this.lazyDescendingEntrySet = smallSortedMap$DescendingEntrySet = new SmallSortedMap$DescendingEntrySet(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    public Set entrySet() {
        SmallSortedMap$EntrySet smallSortedMap$EntrySet = this.lazyEntrySet;
        if (smallSortedMap$EntrySet == null) {
            this.lazyEntrySet = smallSortedMap$EntrySet = new SmallSortedMap$EntrySet(this, null);
        }
        return this.lazyEntrySet;
    }

    public boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof SmallSortedMap;
        if (n7 == 0) {
            return super.equals(object);
        }
        object = (SmallSortedMap)object;
        n7 = this.size();
        if (n7 != (n4 = ((SmallSortedMap)object).size())) {
            return false;
        }
        n4 = this.getNumArrayEntries();
        if (n4 != (n3 = ((SmallSortedMap)object).getNumArrayEntries())) {
            Set set = this.entrySet();
            object = ((SmallSortedMap)object).entrySet();
            return set.equals(object);
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry;
            Map.Entry entry2 = this.getArrayEntryAt(n3);
            boolean bl3 = entry2.equals(entry = ((SmallSortedMap)object).getArrayEntryAt(n3));
            if (bl3) continue;
            return false;
        }
        if (n4 != n7) {
            Map map2 = this.overflowEntries;
            object = ((SmallSortedMap)object).overflowEntries;
            return map2.equals(object);
        }
        return bl2;
    }

    public Object get(Object object) {
        int n3 = this.binarySearchInArray((Comparable)(object = (Comparable)object));
        if (n3 >= 0) {
            return ((SmallSortedMap$Entry)this.entryList.get(n3)).getValue();
        }
        return this.overflowEntries.get(object);
    }

    public Map.Entry getArrayEntryAt(int n3) {
        return (Map.Entry)this.entryList.get(n3);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable getOverflowEntries() {
        Object object = this.overflowEntries;
        boolean bl2 = object.isEmpty();
        object = bl2 ? SmallSortedMap$EmptySet.iterable() : this.overflowEntries.entrySet();
        return object;
    }

    public Iterable getOverflowEntriesDescending() {
        Object object = this.overflowEntriesDescending;
        boolean bl2 = object.isEmpty();
        object = bl2 ? SmallSortedMap$EmptySet.iterable() : this.overflowEntriesDescending.entrySet();
        return object;
    }

    public int hashCode() {
        int n3 = this.getNumArrayEntries();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            SmallSortedMap$Entry smallSortedMap$Entry = (SmallSortedMap$Entry)this.entryList.get(i3);
            int n7 = smallSortedMap$Entry.hashCode();
            n4 += n7;
        }
        n3 = this.getNumOverflowEntries();
        if (n3 > 0) {
            Map map2 = this.overflowEntries;
            n3 = map2.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        boolean bl2 = this.isImmutable;
        if (!bl2) {
            Map map2 = this.overflowEntries;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.overflowEntries);
            this.overflowEntries = map2;
            map2 = this.overflowEntriesDescending;
            bl2 = map2.isEmpty();
            map2 = bl2 ? Collections.emptyMap() : Collections.unmodifiableMap(this.overflowEntriesDescending);
            this.overflowEntriesDescending = map2;
            this.isImmutable = bl2 = true;
        }
    }

    public Object put(Comparable comparable, Object object) {
        Object object2;
        int n3;
        this.checkMutable();
        int n4 = this.binarySearchInArray(comparable);
        if (n4 >= 0) {
            return ((SmallSortedMap$Entry)this.entryList.get(n4)).setValue(object);
        }
        this.ensureEntryArrayMutable();
        n4 = -(n4 + 1);
        int n7 = this.maxArraySize;
        if (n4 >= n7) {
            return this.getOverflowEntriesMutable().put(comparable, object);
        }
        Object object3 = this.entryList;
        n7 = object3.size();
        if (n7 == (n3 = this.maxArraySize)) {
            object3 = this.entryList;
            object3 = (SmallSortedMap$Entry)object3.remove(n3 += -1);
            object2 = this.getOverflowEntriesMutable();
            Comparable comparable2 = ((SmallSortedMap$Entry)object3).getKey();
            object3 = ((SmallSortedMap$Entry)object3).getValue();
            object2.put(comparable2, object3);
        }
        object3 = this.entryList;
        object2 = new SmallSortedMap$Entry(this, comparable, object);
        object3.add(n4, object2);
        return null;
    }

    public Object remove(Object object) {
        this.checkMutable();
        object = (Comparable)object;
        int n3 = this.binarySearchInArray((Comparable)object);
        if (n3 >= 0) {
            return this.removeArrayEntryAt(n3);
        }
        Map map2 = this.overflowEntries;
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return null;
        }
        return this.overflowEntries.remove(object);
    }

    public int size() {
        int n3 = this.entryList.size();
        return this.overflowEntries.size() + n3;
    }
}


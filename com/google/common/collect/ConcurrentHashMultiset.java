/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ConcurrentHashMultiset$1;
import com.google.common.collect.ConcurrentHashMultiset$2;
import com.google.common.collect.ConcurrentHashMultiset$3;
import com.google.common.collect.ConcurrentHashMultiset$EntrySet;
import com.google.common.collect.ConcurrentHashMultiset$FieldSettersHolder;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConcurrentHashMultiset
extends AbstractMultiset
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final transient ConcurrentMap countMap;

    public ConcurrentHashMultiset(ConcurrentMap concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", (Object)concurrentMap);
        this.countMap = concurrentMap;
    }

    public static /* synthetic */ ConcurrentMap access$100(ConcurrentHashMultiset concurrentHashMultiset) {
        return concurrentHashMultiset.countMap;
    }

    public static ConcurrentHashMultiset create() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMultiset concurrentHashMultiset = new ConcurrentHashMultiset(concurrentHashMap);
        return concurrentHashMultiset;
    }

    public static ConcurrentHashMultiset create(Iterable iterable) {
        ConcurrentHashMultiset concurrentHashMultiset = ConcurrentHashMultiset.create();
        Iterables.addAll(concurrentHashMultiset, iterable);
        return concurrentHashMultiset;
    }

    public static ConcurrentHashMultiset create(ConcurrentMap concurrentMap) {
        ConcurrentHashMultiset concurrentHashMultiset = new ConcurrentHashMultiset(concurrentMap);
        return concurrentHashMultiset;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        object = ((ObjectInputStream)object).readObject();
        Objects.requireNonNull(object);
        object = (ConcurrentMap)object;
        ConcurrentHashMultiset$FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set((Object)this, object);
    }

    private List snapshot() {
        int n3;
        int n4 = this.size();
        ArrayList arrayList = Lists.newArrayListWithExpectedSize(n4);
        Iterator iterator = this.entrySet().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            Multiset$Entry multiset$Entry = (Multiset$Entry)iterator.next();
            Object object = multiset$Entry.getElement();
            for (n3 = multiset$Entry.getCount(); n3 > 0; n3 += -1) {
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        ConcurrentMap concurrentMap = this.countMap;
        objectOutputStream.writeObject(concurrentMap);
    }

    public int add(Object object, int n3) {
        boolean bl2;
        AtomicInteger atomicInteger;
        Object object2;
        Preconditions.checkNotNull(object);
        if (n3 == 0) {
            return this.count(object);
        }
        Object object3 = "occurrences";
        CollectPreconditions.checkPositive(n3, (String)object3);
        do {
            int n4;
            if ((object3 = (AtomicInteger)Maps.safeGet(this.countMap, object)) == null) {
                object3 = this.countMap;
                atomicInteger = new AtomicInteger(n3);
                if ((object3 = object3.putIfAbsent(object, atomicInteger)) == null) {
                    return 0;
                }
            }
            while ((n4 = ((AtomicInteger)object3).get()) != 0) {
                int n7;
                try {
                    n7 = IntMath.checkedAdd(n4, n3);
                }
                catch (ArithmeticException arithmeticException) {
                    String string2 = D70.b(n3, n4, "Overflow adding ", " occurrences to a count of ");
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                if ((n7 = (int)(((AtomicInteger)object3).compareAndSet(n4, n7) ? 1 : 0)) == 0) continue;
                return n4;
            }
        } while ((object2 = this.countMap.putIfAbsent(object, atomicInteger = new AtomicInteger(n3))) != null && !(bl2 = (object2 = this.countMap).replace(object, object3, atomicInteger)));
        return 0;
    }

    public void clear() {
        this.countMap.clear();
    }

    public int count(Object object) {
        int n3;
        ConcurrentMap concurrentMap = this.countMap;
        if ((object = (AtomicInteger)Maps.safeGet(concurrentMap, object)) == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((AtomicInteger)object).get();
        }
        return n3;
    }

    public Set createElementSet() {
        Set set = this.countMap.keySet();
        ConcurrentHashMultiset$1 concurrentHashMultiset$1 = new ConcurrentHashMultiset$1(this, set);
        return concurrentHashMultiset$1;
    }

    public Set createEntrySet() {
        ConcurrentHashMultiset$EntrySet concurrentHashMultiset$EntrySet = new ConcurrentHashMultiset$EntrySet(this, null);
        return concurrentHashMultiset$EntrySet;
    }

    public int distinctElements() {
        return this.countMap.size();
    }

    public Iterator elementIterator() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }

    public Iterator entryIterator() {
        ConcurrentHashMultiset$2 concurrentHashMultiset$2 = new ConcurrentHashMultiset$2(this);
        ConcurrentHashMultiset$3 concurrentHashMultiset$3 = new ConcurrentHashMultiset$3(this, concurrentHashMultiset$2);
        return concurrentHashMultiset$3;
    }

    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    public Iterator iterator() {
        return Multisets.iteratorImpl(this);
    }

    public int remove(Object object, int n3) {
        int n4;
        if (n3 == 0) {
            return this.count(object);
        }
        CollectPreconditions.checkPositive(n3, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger)Maps.safeGet(this.countMap, object);
        if (atomicInteger == null) {
            return 0;
        }
        while ((n4 = atomicInteger.get()) != 0) {
            int n7 = n4 - n3;
            boolean bl2 = atomicInteger.compareAndSet(n4, n7 = Math.max(0, n7));
            if (!bl2) continue;
            if (n7 == 0) {
                ConcurrentMap concurrentMap = this.countMap;
                concurrentMap.remove(object, atomicInteger);
            }
            return n4;
        }
        return 0;
    }

    public boolean removeExactly(Object object, int n3) {
        int n4;
        int n7;
        boolean bl2 = true;
        if (n3 == 0) {
            return bl2;
        }
        CollectPreconditions.checkPositive(n3, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger)Maps.safeGet(this.countMap, object);
        if (atomicInteger == null) {
            return false;
        }
        do {
            if ((n7 = atomicInteger.get()) >= n3) continue;
            return false;
        } while ((n7 = (int)(atomicInteger.compareAndSet(n7, n4 = n7 - n3) ? 1 : 0)) == 0);
        if (n4 == 0) {
            ConcurrentMap concurrentMap = this.countMap;
            concurrentMap.remove(object, atomicInteger);
        }
        return bl2;
    }

    public int setCount(Object object, int n3) {
        int n4;
        Preconditions.checkNotNull(object);
        Object object2 = "count";
        CollectPreconditions.checkNonnegative(n3, (String)object2);
        block0: while (true) {
            boolean bl2;
            AtomicInteger atomicInteger;
            if ((object2 = (AtomicInteger)Maps.safeGet(this.countMap, object)) == null) {
                if (n3 == 0) {
                    return 0;
                }
                object2 = this.countMap;
                atomicInteger = new AtomicInteger(n3);
                if ((object2 = object2.putIfAbsent(object, atomicInteger)) == null) {
                    return 0;
                }
            }
            do {
                boolean bl3;
                if ((n4 = ((AtomicInteger)object2).get()) != 0) continue;
                if (n3 == 0) {
                    return 0;
                }
                atomicInteger = new AtomicInteger(n3);
                Object object3 = this.countMap.putIfAbsent(object, atomicInteger);
                if (object3 != null && !(bl3 = (object3 = this.countMap).replace(object, object2, atomicInteger))) continue block0;
                return 0;
            } while (!(bl2 = ((AtomicInteger)object2).compareAndSet(n4, n3)));
            break;
        }
        if (n3 == 0) {
            ConcurrentMap concurrentMap = this.countMap;
            concurrentMap.remove(object, object2);
        }
        return n4;
    }

    public boolean setCount(Object object, int n3, int n4) {
        Preconditions.checkNotNull(object);
        CollectPreconditions.checkNonnegative(n3, "oldCount");
        CollectPreconditions.checkNonnegative(n4, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger)Maps.safeGet(this.countMap, object);
        boolean bl2 = false;
        boolean bl3 = true;
        if (atomicInteger == null) {
            if (n3 != 0) {
                return false;
            }
            if (n4 == 0) {
                return bl3;
            }
            ConcurrentMap concurrentMap = this.countMap;
            atomicInteger = new AtomicInteger(n4);
            if ((object = concurrentMap.putIfAbsent(object, atomicInteger)) == null) {
                bl2 = true;
            }
            return bl2;
        }
        int n7 = atomicInteger.get();
        if (n7 == n3) {
            if (n7 == 0) {
                boolean bl4;
                if (n4 == 0) {
                    this.countMap.remove(object, atomicInteger);
                    return bl3;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(n4);
                Object object2 = this.countMap.putIfAbsent(object, atomicInteger2);
                if (object2 == null || (bl4 = (object2 = this.countMap).replace(object, atomicInteger, atomicInteger2))) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = (int)(atomicInteger.compareAndSet(n7, n4) ? 1 : 0);
            if (n3 != 0) {
                if (n4 == 0) {
                    ConcurrentMap concurrentMap = this.countMap;
                    concurrentMap.remove(object, atomicInteger);
                }
                return bl3;
            }
        }
        return false;
    }

    public int size() {
        int n3;
        Iterator iterator = this.countMap.values().iterator();
        long l2 = 0L;
        while ((n3 = iterator.hasNext()) != 0) {
            AtomicInteger atomicInteger = (AtomicInteger)iterator.next();
            n3 = atomicInteger.get();
            long l3 = n3;
            l2 += l3;
        }
        return Ints.saturatedCast(l2);
    }

    public Object[] toArray() {
        return this.snapshot().toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return this.snapshot().toArray(objectArray);
    }
}


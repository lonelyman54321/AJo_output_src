/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.AtomicLongMap$1;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class AtomicLongMap
implements Serializable {
    private transient Map asMap;
    private final ConcurrentHashMap map;

    private AtomicLongMap(ConcurrentHashMap concurrentHashMap) {
        this.map = concurrentHashMap = (ConcurrentHashMap)Preconditions.checkNotNull(concurrentHashMap);
    }

    public static AtomicLongMap create() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        AtomicLongMap atomicLongMap = new AtomicLongMap(concurrentHashMap);
        return atomicLongMap;
    }

    public static AtomicLongMap create(Map map2) {
        AtomicLongMap atomicLongMap = AtomicLongMap.create();
        atomicLongMap.putAll(map2);
        return atomicLongMap;
    }

    private Map createAsMap() {
        ConcurrentHashMap concurrentHashMap = this.map;
        AtomicLongMap$1 atomicLongMap$1 = new AtomicLongMap$1(this);
        return Collections.unmodifiableMap(Maps.transformValues(concurrentHashMap, (Function)atomicLongMap$1));
    }

    public long addAndGet(Object object, long l2) {
        long l3;
        block0: while (true) {
            long l4;
            boolean bl2;
            Serializable serializable;
            Serializable serializable2;
            if ((serializable2 = (AtomicLong)this.map.get(object)) == null) {
                serializable2 = this.map;
                serializable = new AtomicLong(l2);
                if ((serializable2 = ((ConcurrentHashMap)serializable2).putIfAbsent(object, serializable)) == null) {
                    return l2;
                }
            }
            do {
                long l7;
                long l8;
                if ((l8 = (l7 = (l4 = ((AtomicLong)serializable2).get()) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) continue;
                serializable = this.map;
                AtomicLong atomicLong = new AtomicLong(l2);
                boolean bl3 = ((ConcurrentHashMap)serializable).replace(object, serializable2, atomicLong);
                if (!bl3) continue block0;
                return l2;
            } while (!(bl2 = ((AtomicLong)serializable2).compareAndSet(l4, l3 = l4 + l2)));
            break;
        }
        return l3;
    }

    public Map asMap() {
        Map map2 = this.asMap;
        if (map2 == null) {
            this.asMap = map2 = this.createAsMap();
        }
        return map2;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object object) {
        return this.map.containsKey(object);
    }

    public long decrementAndGet(Object object) {
        return this.addAndGet(object, -1);
    }

    public long get(Object object) {
        ConcurrentHashMap concurrentHashMap = this.map;
        long l2 = (object = (AtomicLong)concurrentHashMap.get(object)) == null ? 0L : ((AtomicLong)object).get();
        return l2;
    }

    public long getAndAdd(Object object, long l2) {
        long l3;
        block0: while (true) {
            long l4;
            long l7;
            Serializable serializable;
            Serializable serializable2 = (AtomicLong)this.map.get(object);
            long l8 = 0L;
            if (serializable2 == null) {
                serializable2 = this.map;
                serializable = new AtomicLong(l2);
                if ((serializable2 = ((ConcurrentHashMap)serializable2).putIfAbsent(object, serializable)) == null) {
                    return l8;
                }
            }
            do {
                long l12;
                if ((l7 = (l12 = (l3 = ((AtomicLong)serializable2).get()) - l8) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) continue;
                serializable = this.map;
                AtomicLong atomicLong = new AtomicLong(l2);
                boolean bl2 = ((ConcurrentHashMap)serializable).replace(object, serializable2, atomicLong);
                if (!bl2) continue block0;
                return l8;
            } while ((l7 = (long)((AtomicLong)serializable2).compareAndSet(l3, l4 = l3 + l2)) == false);
            break;
        }
        return l3;
    }

    public long getAndDecrement(Object object) {
        return this.getAndAdd(object, -1);
    }

    public long getAndIncrement(Object object) {
        return this.getAndAdd(object, 1L);
    }

    public long incrementAndGet(Object object) {
        return this.addAndGet(object, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public long put(Object object, long l2) {
        long l3;
        block0: while (true) {
            long l4;
            Serializable serializable;
            Serializable serializable2 = (AtomicLong)this.map.get(object);
            long l7 = 0L;
            if (serializable2 == null) {
                serializable2 = this.map;
                serializable = new AtomicLong(l2);
                if ((serializable2 = ((ConcurrentHashMap)serializable2).putIfAbsent(object, serializable)) == null) {
                    return l7;
                }
            }
            do {
                long l8;
                if ((l4 = (l8 = (l3 = ((AtomicLong)serializable2).get()) - l7) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) continue;
                serializable = this.map;
                AtomicLong atomicLong = new AtomicLong(l2);
                boolean bl2 = ((ConcurrentHashMap)serializable).replace(object, serializable2, atomicLong);
                if (!bl2) continue block0;
                return l7;
            } while ((l4 = (long)((AtomicLong)serializable2).compareAndSet(l3, l2)) == false);
            break;
        }
        return l3;
    }

    public void putAll(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object k2 = object2.getKey();
            object2 = (Long)object2.getValue();
            long l2 = (Long)object2;
            this.put(k2, l2);
        }
    }

    public long putIfAbsent(Object object, long l2) {
        long l3;
        block3: {
            long l4;
            AtomicLong atomicLong;
            Serializable serializable;
            Serializable serializable2;
            boolean bl2;
            do {
                long l7;
                long l8;
                serializable = (AtomicLong)this.map.get(object);
                l4 = 0L;
                if (serializable == null) {
                    serializable = this.map;
                    serializable2 = new AtomicLong(l2);
                    if ((serializable = ((ConcurrentHashMap)serializable).putIfAbsent(object, serializable2)) == null) {
                        return l4;
                    }
                }
                if ((l8 = (l7 = (l3 = ((AtomicLong)serializable).get()) - l4) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) break block3;
            } while (!(bl2 = ((ConcurrentHashMap)(serializable2 = this.map)).replace(object, serializable, atomicLong = new AtomicLong(l2))));
            return l4;
        }
        return l3;
    }

    public long remove(Object object) {
        long l2;
        long l3;
        long l4;
        AtomicLong atomicLong = (AtomicLong)this.map.get(object);
        long l7 = 0L;
        if (atomicLong == null) {
            return l7;
        }
        while ((l4 = (l3 = (l2 = atomicLong.get()) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false && (l4 = (long)atomicLong.compareAndSet(l2, l7)) == false) {
        }
        this.map.remove(object, atomicLong);
        return l2;
    }

    public boolean remove(Object object, long l2) {
        boolean bl2;
        AtomicLong atomicLong = (AtomicLong)this.map.get(object);
        if (atomicLong == null) {
            return false;
        }
        long l3 = atomicLong.get();
        long l4 = l3 - l2;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        l2 = 0L;
        long l7 = l3 - l2;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != false && !(bl2 = atomicLong.compareAndSet(l3, l2))) {
            return false;
        }
        this.map.remove(object, atomicLong);
        return true;
    }

    public void removeAllZeros() {
        boolean bl2;
        Iterator iterator = this.map.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            long l2;
            long l3;
            long l4;
            long l7;
            AtomicLong atomicLong = (AtomicLong)iterator.next().getValue();
            if (atomicLong == null || (l7 = (l4 = (l3 = atomicLong.get()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) continue;
            iterator.remove();
        }
    }

    public boolean removeIfZero(Object object) {
        return this.remove(object, 0L);
    }

    public boolean replace(Object object, long l2, long l3) {
        boolean bl2 = false;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == false) {
            long l8 = this.putIfAbsent(object, l3);
            long l12 = l8 - l4;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 == false) {
                bl2 = true;
            }
            return bl2;
        }
        ConcurrentHashMap concurrentHashMap = this.map;
        if ((object = (AtomicLong)concurrentHashMap.get(object)) != null) {
            bl2 = ((AtomicLong)object).compareAndSet(l2, l3);
        }
        return bl2;
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        boolean bl2;
        Iterator iterator = this.map.values().iterator();
        long l2 = 0L;
        while (bl2 = iterator.hasNext()) {
            AtomicLong atomicLong = (AtomicLong)iterator.next();
            long l3 = atomicLong.get();
            l2 += l3;
        }
        return l2;
    }

    public String toString() {
        return this.map.toString();
    }
}


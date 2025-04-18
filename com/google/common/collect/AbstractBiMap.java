/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractBiMap$1;
import com.google.common.collect.AbstractBiMap$EntrySet;
import com.google.common.collect.AbstractBiMap$Inverse;
import com.google.common.collect.AbstractBiMap$KeySet;
import com.google.common.collect.AbstractBiMap$ValueSet;
import com.google.common.collect.BiMap;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.NullnessCasts;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class AbstractBiMap
extends ForwardingMap
implements BiMap,
Serializable {
    private static final long serialVersionUID;
    private transient Map delegate;
    private transient Set entrySet;
    transient AbstractBiMap inverse;
    private transient Set keySet;
    private transient Set valueSet;

    private AbstractBiMap(Map map2, AbstractBiMap abstractBiMap) {
        this.delegate = map2;
        this.inverse = abstractBiMap;
    }

    public /* synthetic */ AbstractBiMap(Map map2, AbstractBiMap abstractBiMap, AbstractBiMap$1 abstractBiMap$1) {
        this(map2, abstractBiMap);
    }

    public AbstractBiMap(Map map2, Map map3) {
        this.setDelegates(map2, map3);
    }

    public static /* synthetic */ Map access$100(AbstractBiMap abstractBiMap) {
        return abstractBiMap.delegate;
    }

    public static /* synthetic */ Object access$200(AbstractBiMap abstractBiMap, Object object) {
        return abstractBiMap.removeFromBothMaps(object);
    }

    public static /* synthetic */ void access$500(AbstractBiMap abstractBiMap, Object object, boolean bl2, Object object2, Object object3) {
        abstractBiMap.updateInverseMap(object, bl2, object2, object3);
    }

    public static /* synthetic */ void access$600(AbstractBiMap abstractBiMap, Object object) {
        abstractBiMap.removeFromInverseMap(object);
    }

    private Object putInBothMaps(Object object, Object object2, boolean bl2) {
        Object object3;
        Object object4;
        boolean bl3;
        this.checkKey(object);
        this.checkValue(object2);
        boolean bl4 = this.containsKey(object);
        if (bl4 && (bl3 = Objects.equal(object2, object4 = this.get(object)))) {
            return object2;
        }
        if (bl2) {
            object3 = this.inverse();
            object3.remove(object2);
        } else {
            bl2 = this.containsValue(object2) ^ true;
            object4 = "value already present: %s";
            Preconditions.checkArgument(bl2, (String)object4, object2);
        }
        object3 = this.delegate.put(object, object2);
        this.updateInverseMap(object, bl4, object3, object2);
        return object3;
    }

    private Object removeFromBothMaps(Object object) {
        object = NullnessCasts.uncheckedCastNullableTToT(this.delegate.remove(object));
        this.removeFromInverseMap(object);
        return object;
    }

    private void removeFromInverseMap(Object object) {
        this.inverse.delegate.remove(object);
    }

    private void updateInverseMap(Object object, boolean bl2, Object object2, Object object3) {
        if (bl2) {
            Object object4 = NullnessCasts.uncheckedCastNullableTToT(object2);
            this.removeFromInverseMap(object4);
        }
        this.inverse.delegate.put(object3, object);
    }

    public Object checkKey(Object object) {
        return object;
    }

    public Object checkValue(Object object) {
        return object;
    }

    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    public boolean containsValue(Object object) {
        return this.inverse.containsKey(object);
    }

    public Map delegate() {
        return this.delegate;
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            this.entrySet = set = new AbstractBiMap$EntrySet(this, null);
        }
        return set;
    }

    public Iterator entrySetIterator() {
        Iterator iterator = this.delegate.entrySet().iterator();
        AbstractBiMap$1 abstractBiMap$1 = new AbstractBiMap$1(this, iterator);
        return abstractBiMap$1;
    }

    public Object forcePut(Object object, Object object2) {
        return this.putInBothMaps(object, object2, true);
    }

    public BiMap inverse() {
        return this.inverse;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            this.keySet = set = new AbstractBiMap$KeySet(this, null);
        }
        return set;
    }

    public AbstractBiMap makeInverse(Map map2) {
        AbstractBiMap$Inverse abstractBiMap$Inverse = new AbstractBiMap$Inverse(map2, this);
        return abstractBiMap$Inverse;
    }

    public Object put(Object object, Object object2) {
        return this.putInBothMaps(object, object2, false);
    }

    public void putAll(Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            entry = entry.getValue();
            this.put(k2, entry);
        }
    }

    public Object remove(Object object) {
        boolean bl2 = this.containsKey(object);
        object = bl2 ? this.removeFromBothMaps(object) : null;
        return object;
    }

    public void setDelegates(Map map2, Map map3) {
        boolean bl2;
        Map map4 = this.delegate;
        boolean bl3 = false;
        if (map4 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            map4 = null;
        }
        Preconditions.checkState(bl2);
        map4 = this.inverse;
        if (map4 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            map4 = null;
        }
        Preconditions.checkState(bl2);
        Preconditions.checkArgument(map2.isEmpty());
        bl2 = map3.isEmpty();
        Preconditions.checkArgument(bl2);
        if (map2 != map3) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3);
        this.delegate = map2;
        map2 = this.makeInverse(map3);
        this.inverse = map2;
    }

    public void setInverse(AbstractBiMap abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    public Set values() {
        Set set = this.valueSet;
        if (set == null) {
            this.valueSet = set = new AbstractBiMap$ValueSet(this, null);
        }
        return set;
    }
}


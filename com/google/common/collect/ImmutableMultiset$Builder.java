/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset$Entry;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.collect.ObjectCountLinkedHashMap;
import com.google.common.collect.RegularImmutableMultiset;
import java.util.Iterator;
import java.util.Objects;

public class ImmutableMultiset$Builder
extends ImmutableCollection$Builder {
    boolean buildInvoked = false;
    ObjectCountHashMap contents;
    boolean isLinkedHash = false;

    public ImmutableMultiset$Builder() {
        this(4);
    }

    public ImmutableMultiset$Builder(int n3) {
        ObjectCountHashMap objectCountHashMap;
        this.contents = objectCountHashMap = ObjectCountHashMap.createWithExpectedSize(n3);
    }

    public ImmutableMultiset$Builder(boolean bl2) {
        this.contents = null;
    }

    public static ObjectCountHashMap tryGetMap(Iterable iterable) {
        boolean bl2 = iterable instanceof RegularImmutableMultiset;
        if (bl2) {
            return ((RegularImmutableMultiset)iterable).contents;
        }
        bl2 = iterable instanceof AbstractMapBasedMultiset;
        if (bl2) {
            return ((AbstractMapBasedMultiset)iterable).backingMap;
        }
        return null;
    }

    public ImmutableMultiset$Builder add(Object object) {
        return this.addCopies(object, 1);
    }

    public ImmutableMultiset$Builder add(Object ... objectArray) {
        super.add(objectArray);
        return this;
    }

    public ImmutableMultiset$Builder addAll(Iterable iterator) {
        Object object = this.contents;
        Objects.requireNonNull(object);
        int n3 = iterator instanceof Multiset;
        if (n3 != 0) {
            object = ImmutableMultiset$Builder.tryGetMap((Iterable)((Object)(iterator = Multisets.cast((Iterable)((Object)iterator)))));
            if (object != null) {
                iterator = this.contents;
                int n4 = ((ObjectCountHashMap)((Object)iterator)).size();
                int n7 = ((ObjectCountHashMap)object).size();
                n4 = Math.max(n4, n7);
                ((ObjectCountHashMap)((Object)iterator)).ensureCapacity(n4);
                int n8 = ((ObjectCountHashMap)object).firstIndex();
                while (n8 >= 0) {
                    Object object2 = ((ObjectCountHashMap)object).getKey(n8);
                    n7 = ((ObjectCountHashMap)object).getValue(n8);
                    this.addCopies(object2, n7);
                    n8 = ((ObjectCountHashMap)object).nextIndex(n8);
                }
            } else {
                object = iterator.entrySet();
                Object object3 = this.contents;
                int n10 = ((ObjectCountHashMap)object3).size();
                n3 = object.size();
                n3 = Math.max(n10, n3);
                ((ObjectCountHashMap)object3).ensureCapacity(n3);
                iterator = iterator.entrySet().iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object = (Multiset$Entry)iterator.next();
                    object3 = object.getElement();
                    n3 = object.getCount();
                    this.addCopies(object3, n3);
                }
            }
        } else {
            super.addAll((Iterable)((Object)iterator));
        }
        return this;
    }

    public ImmutableMultiset$Builder addAll(Iterator iterator) {
        super.addAll(iterator);
        return this;
    }

    public ImmutableMultiset$Builder addCopies(Object object, int n3) {
        ObjectCountHashMap objectCountHashMap = this.contents;
        Objects.requireNonNull(objectCountHashMap);
        if (n3 == 0) {
            return this;
        }
        boolean bl2 = this.buildInvoked;
        int n4 = 0;
        if (bl2) {
            ObjectCountHashMap objectCountHashMap2 = this.contents;
            this.contents = objectCountHashMap = new ObjectCountHashMap(objectCountHashMap2);
            this.isLinkedHash = false;
        }
        this.buildInvoked = false;
        Preconditions.checkNotNull(object);
        objectCountHashMap = this.contents;
        n4 = objectCountHashMap.get(object);
        objectCountHashMap.put(object, n3 += n4);
        return this;
    }

    public ImmutableMultiset build() {
        ObjectCountHashMap objectCountHashMap;
        Objects.requireNonNull(this.contents);
        Object object = this.contents;
        int n3 = ((ObjectCountHashMap)object).size();
        if (n3 == 0) {
            return ImmutableMultiset.of();
        }
        n3 = (int)(this.isLinkedHash ? 1 : 0);
        if (n3 != 0) {
            objectCountHashMap = this.contents;
            this.contents = object = new ObjectCountHashMap(objectCountHashMap);
            n3 = 0;
            object = null;
            this.isLinkedHash = false;
        }
        this.buildInvoked = true;
        objectCountHashMap = this.contents;
        object = new RegularImmutableMultiset(objectCountHashMap);
        return object;
    }

    public ImmutableMultiset$Builder setCount(Object object, int n3) {
        boolean bl2;
        Objects.requireNonNull(this.contents);
        ObjectCountHashMap objectCountHashMap = null;
        if (n3 == 0 && !(bl2 = this.isLinkedHash)) {
            ObjectCountHashMap objectCountHashMap2 = this.contents;
            ObjectCountLinkedHashMap objectCountLinkedHashMap = new ObjectCountLinkedHashMap(objectCountHashMap2);
            this.contents = objectCountLinkedHashMap;
            this.isLinkedHash = bl2 = true;
        } else {
            bl2 = this.buildInvoked;
            if (bl2) {
                ObjectCountHashMap objectCountHashMap3;
                ObjectCountHashMap objectCountHashMap4 = this.contents;
                this.contents = objectCountHashMap3 = new ObjectCountHashMap(objectCountHashMap4);
                this.isLinkedHash = false;
            }
        }
        this.buildInvoked = false;
        Preconditions.checkNotNull(object);
        if (n3 == 0) {
            ObjectCountHashMap objectCountHashMap5 = this.contents;
            objectCountHashMap5.remove(object);
        } else {
            objectCountHashMap = this.contents;
            object = Preconditions.checkNotNull(object);
            objectCountHashMap.put(object, n3);
        }
        return this;
    }
}


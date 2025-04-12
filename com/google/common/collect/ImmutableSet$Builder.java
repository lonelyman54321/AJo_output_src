/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Hashing;
import com.google.common.collect.ImmutableCollection$ArrayBasedBuilder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class ImmutableSet$Builder
extends ImmutableCollection$ArrayBasedBuilder {
    private int hashCode;
    Object[] hashTable;

    public ImmutableSet$Builder() {
        super(4);
    }

    public ImmutableSet$Builder(int n3) {
        super(n3);
        Object[] objectArray = new Object[ImmutableSet.chooseTableSize(n3)];
        this.hashTable = objectArray;
    }

    private void addDeduping(Object object) {
        Objects.requireNonNull(this.hashTable);
        Object[] objectArray = this.hashTable;
        int n3 = objectArray.length + -1;
        int n4 = object.hashCode();
        int n7 = Hashing.smear(n4);
        while (true) {
            Object[] objectArray2;
            Object object2;
            if ((object2 = (objectArray2 = this.hashTable)[n7 &= n3]) == null) {
                objectArray2[n7] = object;
                this.hashCode = n3 = this.hashCode + n4;
                super.add(object);
                return;
            }
            boolean bl2 = object2.equals(object);
            if (bl2) {
                return;
            }
            ++n7;
        }
    }

    public ImmutableSet$Builder add(Object object) {
        Object[] objectArray;
        int n3;
        int n4;
        Preconditions.checkNotNull(object);
        Object[] objectArray2 = this.hashTable;
        if (objectArray2 != null && (n4 = ImmutableSet.chooseTableSize(this.size)) <= (n3 = (objectArray = this.hashTable).length)) {
            this.addDeduping(object);
            return this;
        }
        this.hashTable = null;
        super.add(object);
        return this;
    }

    public ImmutableSet$Builder add(Object ... objectArray) {
        Object[] objectArray2 = this.hashTable;
        if (objectArray2 != null) {
            for (Object object : objectArray) {
                this.add(object);
            }
        } else {
            super.add(objectArray);
        }
        return this;
    }

    public ImmutableSet$Builder addAll(Iterable object) {
        Preconditions.checkNotNull(object);
        Object object2 = this.hashTable;
        if (object2 != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                this.add(object2);
            }
        } else {
            super.addAll((Iterable)object);
        }
        return this;
    }

    public ImmutableSet$Builder addAll(Iterator iterator) {
        boolean bl2;
        Preconditions.checkNotNull(iterator);
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            this.add(e2);
        }
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public ImmutableSet build() {
        void var5_11;
        int n3;
        int n4 = this.size;
        if (n4 == 0) {
            return ImmutableSet.of();
        }
        int n7 = 1;
        if (n4 == n7) {
            Object object = this.contents[0];
            Objects.requireNonNull(object);
            return ImmutableSet.of(object);
        }
        Object object = this.hashTable;
        if (object != null && (n4 = ImmutableSet.chooseTableSize(n4)) == (n3 = ((Object[])(object = this.hashTable)).length)) {
            RegularImmutableSet regularImmutableSet;
            void var5_7;
            n4 = this.size;
            object = this.contents;
            n3 = ((Object[])object).length;
            if ((n4 = (int)(ImmutableSet.access$000(n4, n3) ? 1 : 0)) != 0) {
                Object[] objectArray = this.contents;
                n3 = this.size;
                Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            } else {
                Object[] objectArray = this.contents;
            }
            void var6_13 = var5_7;
            int n8 = this.hashCode;
            Object[] objectArray = this.hashTable;
            n3 = objectArray.length;
            int n10 = n3 + -1;
            int n14 = this.size;
            object = regularImmutableSet;
            regularImmutableSet = new RegularImmutableSet((Object[])var6_13, n8, objectArray, n10, n14);
        } else {
            n4 = this.size;
            object = this.contents;
            ImmutableSet immutableSet = ImmutableSet.access$100(n4, object);
            this.size = n3 = immutableSet.size();
        }
        this.forceCopy = n7;
        this.hashTable = null;
        return var5_11;
    }

    public ImmutableSet$Builder combine(ImmutableSet$Builder immutableSet$Builder) {
        Object[] objectArray = this.hashTable;
        if (objectArray != null) {
            int n3;
            objectArray = null;
            for (int i3 = 0; i3 < (n3 = immutableSet$Builder.size); ++i3) {
                Object object = immutableSet$Builder.contents[i3];
                Objects.requireNonNull(object);
                this.add(object);
            }
        } else {
            objectArray = immutableSet$Builder.contents;
            int n4 = immutableSet$Builder.size;
            this.addAll(objectArray, n4);
        }
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultiset;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.EnumMultiset$1;
import com.google.common.collect.EnumMultiset$2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public final class EnumMultiset
extends AbstractMultiset
implements Serializable {
    private static final long serialVersionUID;
    private transient int[] counts;
    private transient int distinctElements;
    private transient Enum[] enumConstants;
    private transient long size;
    private transient Class type;

    private EnumMultiset(Class objectArray) {
        this.type = objectArray;
        Preconditions.checkArgument(objectArray.isEnum());
        objectArray = (Enum[])objectArray.getEnumConstants();
        this.enumConstants = objectArray;
        objectArray = new int[objectArray.length];
        this.counts = (int[])objectArray;
    }

    public static /* synthetic */ Enum[] access$000(EnumMultiset enumMultiset) {
        return enumMultiset.enumConstants;
    }

    public static /* synthetic */ int[] access$100(EnumMultiset enumMultiset) {
        return enumMultiset.counts;
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int n3;
        int n4 = enumMultiset.distinctElements;
        enumMultiset.distinctElements = n3 = n4 + -1;
        return n4;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long l2) {
        long l3;
        enumMultiset.size = l3 = enumMultiset.size - l2;
        return l3;
    }

    private void checkIsE(Object object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = this.isActuallyE(object);
        if (bl2) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected an ");
        Class clazz = this.type;
        stringBuilder.append(clazz);
        stringBuilder.append(" but got ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        ClassCastException classCastException = new ClassCastException((String)object);
        throw classCastException;
    }

    public static EnumMultiset create(Class clazz) {
        EnumMultiset enumMultiset = new EnumMultiset(clazz);
        return enumMultiset;
    }

    public static EnumMultiset create(Iterable iterable) {
        Object object = iterable.iterator();
        Preconditions.checkArgument(object.hasNext(), "EnumMultiset constructor passed empty Iterable");
        object = ((Enum)object.next()).getDeclaringClass();
        EnumMultiset enumMultiset = new EnumMultiset((Class)object);
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    public static EnumMultiset create(Iterable iterable, Class serializable) {
        serializable = EnumMultiset.create(serializable);
        Iterables.addAll((Collection)((Object)serializable), iterable);
        return serializable;
    }

    private boolean isActuallyE(Object object) {
        Enum enum_;
        Enum[] enumArray;
        int n3;
        int n4 = object instanceof Enum;
        boolean bl2 = false;
        if (n4 != 0 && (n4 = ((Enum)(object = (Enum)object)).ordinal()) < (n3 = (enumArray = this.enumConstants).length) && (enum_ = enumArray[n4]) == object) {
            bl2 = true;
        }
        return bl2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object[] objectArray = objectInputStream.readObject();
        Objects.requireNonNull(objectArray);
        objectArray = (Class)objectArray;
        this.type = objectArray;
        objectArray = (Enum[])objectArray.getEnumConstants();
        this.enumConstants = objectArray;
        objectArray = new int[objectArray.length];
        this.counts = (int[])objectArray;
        Serialization.populateMultiset(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Class clazz = this.type;
        objectOutputStream.writeObject(clazz);
        Serialization.writeMultiset(this, objectOutputStream);
    }

    public int add(Enum enum_, int n3) {
        long l2;
        int n4;
        int[] nArray;
        boolean bl2;
        this.checkIsE(enum_);
        Object object = "occurrences";
        CollectPreconditions.checkNonnegative(n3, (String)object);
        if (n3 == 0) {
            return this.count(enum_);
        }
        int n7 = enum_.ordinal();
        object = this.counts;
        Object object2 = object[n7];
        long l3 = (long)object2;
        long l4 = n3;
        long l7 = Integer.MAX_VALUE;
        n3 = 1;
        long l8 = (l3 += l4) - l7;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 <= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray = null;
        }
        String string2 = "too many occurrences: %s";
        Preconditions.checkArgument(bl2, string2, l3);
        nArray = this.counts;
        nArray[n7] = n4 = (int)l3;
        if (object2 == false) {
            this.distinctElements = n7 = this.distinctElements + n3;
        }
        this.size = l2 = this.size + l4;
        return (int)object2;
    }

    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    public int count(Object object) {
        boolean bl2;
        if (object != null && (bl2 = this.isActuallyE(object))) {
            object = (Enum)object;
            int[] nArray = this.counts;
            int n3 = ((Enum)object).ordinal();
            return nArray[n3];
        }
        return 0;
    }

    public int distinctElements() {
        return this.distinctElements;
    }

    public Iterator elementIterator() {
        EnumMultiset$1 enumMultiset$1 = new EnumMultiset$1(this);
        return enumMultiset$1;
    }

    public Iterator entryIterator() {
        EnumMultiset$2 enumMultiset$2 = new EnumMultiset$2(this);
        return enumMultiset$2;
    }

    public Iterator iterator() {
        return Multisets.iteratorImpl(this);
    }

    public int remove(Object object, int n3) {
        boolean bl2;
        Object object2 = false;
        if (object != null && (bl2 = this.isActuallyE(object))) {
            Object object3 = object;
            object3 = (Enum)object;
            String string2 = "occurrences";
            CollectPreconditions.checkNonnegative(n3, string2);
            if (n3 == 0) {
                return this.count(object);
            }
            object3 = this.counts;
            int n4 = ((Enum)object3).ordinal();
            Object object4 = object3[n4];
            if (object4 == false) {
                return 0;
            }
            if (object4 <= n3) {
                object3[n4] = false;
                this.distinctElements = n4 = this.distinctElements + -1;
                long l2 = this.size;
                long l3 = (long)object4;
                this.size = l2 -= l3;
            } else {
                object2 = object4 - n3;
                object3[n4] = object2;
                long l4 = this.size;
                long l7 = n3;
                this.size = l4 -= l7;
            }
            return (int)object4;
        }
        return 0;
    }

    public int setCount(Enum enum_, int n3) {
        this.checkIsE(enum_);
        CollectPreconditions.checkNonnegative(n3, "count");
        int n4 = enum_.ordinal();
        int[] nArray = this.counts;
        int n7 = nArray[n4];
        nArray[n4] = n3;
        long l2 = this.size;
        n4 = n3 - n7;
        long l3 = n4;
        this.size = l2 += l3;
        if (n7 == 0 && n3 > 0) {
            this.distinctElements = n4 = this.distinctElements + 1;
        } else if (n7 > 0 && n3 == 0) {
            this.distinctElements = n4 = this.distinctElements + -1;
        }
        return n7;
    }

    public int size() {
        return Ints.saturatedCast(this.size);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.util.Iterator;

public abstract class ImmutableCollection$Builder {
    static final int DEFAULT_INITIAL_CAPACITY = 4;

    public static int expandedCapacity(int n3, int n4) {
        if (n4 >= 0) {
            int n7 = n3 >> 1;
            if ((n3 = n3 + n7 + 1) < n4) {
                n3 = Integer.highestOneBit(n4 += -1) << 1;
            }
            if (n3 < 0) {
                n3 = -1 >>> 1;
            }
            return n3;
        }
        AssertionError assertionError = new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        throw assertionError;
    }

    public abstract ImmutableCollection$Builder add(Object var1);

    public ImmutableCollection$Builder add(Object ... objectArray) {
        for (Object object : objectArray) {
            this.add(object);
        }
        return this;
    }

    public ImmutableCollection$Builder addAll(Iterable object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            this.add(e2);
        }
        return this;
    }

    public ImmutableCollection$Builder addAll(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            this.add(e2);
        }
        return this;
    }

    public abstract ImmutableCollection build();
}


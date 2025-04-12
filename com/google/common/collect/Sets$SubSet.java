/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets$SubSet$1;
import java.util.AbstractSet;
import java.util.Iterator;

final class Sets$SubSet
extends AbstractSet {
    private final ImmutableMap inputSet;
    private final int mask;

    public Sets$SubSet(ImmutableMap immutableMap, int n3) {
        this.inputSet = immutableMap;
        this.mask = n3;
    }

    public static /* synthetic */ ImmutableMap access$100(Sets$SubSet sets$SubSet) {
        return sets$SubSet.inputSet;
    }

    public static /* synthetic */ int access$200(Sets$SubSet sets$SubSet) {
        return sets$SubSet.mask;
    }

    public boolean contains(Object object) {
        int n3;
        block3: {
            block2: {
                ImmutableMap immutableMap = this.inputSet;
                if ((object = (Integer)immutableMap.get(object)) == null) break block2;
                int n4 = this.mask;
                int n7 = (Integer)object;
                n3 = 1;
                if ((n7 = n3 << n7 & n4) != 0) break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public Iterator iterator() {
        Sets$SubSet$1 sets$SubSet$1 = new Sets$SubSet$1(this);
        return sets$SubSet$1;
    }

    public int size() {
        return Integer.bitCount(this.mask);
    }
}


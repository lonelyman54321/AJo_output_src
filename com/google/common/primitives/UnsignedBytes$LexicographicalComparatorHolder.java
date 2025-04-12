/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
import java.util.Objects;

class UnsignedBytes$LexicographicalComparatorHolder {
    static final Comparator BEST_COMPARATOR;
    static final String UNSAFE_COMPARATOR_NAME;

    static {
        UNSAFE_COMPARATOR_NAME = UnsignedBytes$LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
        BEST_COMPARATOR = UnsignedBytes$LexicographicalComparatorHolder.getBestComparator();
    }

    public static Comparator getBestComparator() {
        Object object;
        try {
            object = UNSAFE_COMPARATOR_NAME;
        }
        catch (Throwable throwable) {
            return UnsignedBytes.lexicographicalComparatorJavaImpl();
        }
        object = Class.forName((String)object);
        object = object.getEnumConstants();
        Objects.requireNonNull(object);
        object = object[0];
        return (Comparator)object;
    }
}


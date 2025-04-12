/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.LexicographicalOrdering;
import java.util.Comparator;

public final class Comparators {
    private Comparators() {
    }

    public static boolean isInOrder(Iterable object, Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        object = object.iterator();
        int n3 = object.hasNext();
        if (n3 != 0) {
            boolean bl2;
            Object e2 = object.next();
            while (bl2 = object.hasNext()) {
                Object e5 = object.next();
                n3 = comparator.compare(e2, e5);
                if (n3 > 0) {
                    return false;
                }
                e2 = e5;
            }
        }
        return true;
    }

    public static boolean isInStrictOrder(Iterable object, Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        object = object.iterator();
        int n3 = object.hasNext();
        if (n3 != 0) {
            boolean bl2;
            Object e2 = object.next();
            while (bl2 = object.hasNext()) {
                Object e5 = object.next();
                n3 = comparator.compare(e2, e5);
                if (n3 >= 0) {
                    return false;
                }
                e2 = e5;
            }
        }
        return true;
    }

    public static Comparator lexicographical(Comparator comparator) {
        comparator = (Comparator)Preconditions.checkNotNull(comparator);
        LexicographicalOrdering lexicographicalOrdering = new LexicographicalOrdering(comparator);
        return lexicographicalOrdering;
    }

    public static Comparable max(Comparable comparable, Comparable comparable2) {
        int n3 = comparable.compareTo(comparable2);
        if (n3 < 0) {
            comparable = comparable2;
        }
        return comparable;
    }

    public static Object max(Object object, Object object2, Comparator comparator) {
        int n3 = comparator.compare(object, object2);
        if (n3 < 0) {
            object = object2;
        }
        return object;
    }

    public static Comparable min(Comparable comparable, Comparable comparable2) {
        int n3 = comparable.compareTo(comparable2);
        if (n3 > 0) {
            comparable = comparable2;
        }
        return comparable;
    }

    public static Object min(Object object, Object object2, Comparator comparator) {
        int n3 = comparator.compare(object, object2);
        if (n3 > 0) {
            object = object2;
        }
        return object;
    }
}


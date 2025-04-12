/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;

public final class ArrayIteratorKt {
    public static final Iterator iterator(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        ArrayIterator arrayIterator = new ArrayIterator(objectArray);
        return arrayIterator;
    }
}


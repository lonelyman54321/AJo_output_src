/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped$1;
import com.google.common.util.concurrent.Striped$CompactStriped;
import com.google.common.util.concurrent.Striped$LargeLazyStriped;
import com.google.common.util.concurrent.Striped$PaddedSemaphore;
import com.google.common.util.concurrent.Striped$PowerOfTwoStriped;
import com.google.common.util.concurrent.Striped$SmallLazyStriped;
import com.google.common.util.concurrent.r;
import com.google.common.util.concurrent.s;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Striped {
    private static final int ALL_SET = 255;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    private Striped() {
    }

    public /* synthetic */ Striped(Striped$1 striped$1) {
        this();
    }

    public static /* synthetic */ Semaphore a(int n3) {
        return striped$PaddedSemaphore = new Striped$PaddedSemaphore(n3);
    }

    public static /* synthetic */ int access$200(int n3) {
        return Striped.ceilToPowerOfTwo(n3);
    }

    public static /* synthetic */ int access$300(int n3) {
        return Striped.smear(n3);
    }

    public static /* synthetic */ Lock b() {
        return reentrantLock = new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore c(int n3) {
        return semaphore = new Semaphore(n3, false);
    }

    private static int ceilToPowerOfTwo(int n3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        n3 = IntMath.log2(n3, roundingMode);
        return 1 << n3;
    }

    public static Striped custom(int n3, Supplier supplier) {
        Striped$CompactStriped striped$CompactStriped = new Striped$CompactStriped(n3, supplier, null);
        return striped$CompactStriped;
    }

    private static Striped lazy(int n3, Supplier supplier) {
        int n4 = 1024;
        Striped$PowerOfTwoStriped striped$PowerOfTwoStriped = n3 < n4 ? new Striped$SmallLazyStriped(n3, supplier) : new Striped$LargeLazyStriped(n3, supplier);
        return striped$PowerOfTwoStriped;
    }

    public static Striped lazyWeakLock(int n3) {
        pe3_1 pe3_12 = new Object();
        return Striped.lazy(n3, pe3_12);
    }

    public static Striped lazyWeakReadWriteLock(int n3) {
        r r5 = new Object();
        return Striped.lazy(n3, r5);
    }

    public static Striped lazyWeakSemaphore(int n3, int n4) {
        oe3_1 oe3_12 = new oe3_1(n4);
        return Striped.lazy(n3, oe3_12);
    }

    public static Striped lock(int n3) {
        s s7 = new Object();
        return Striped.custom(n3, s7);
    }

    public static Striped readWriteLock(int n3) {
        qe3_2 qe3_22 = new Object();
        return Striped.custom(n3, qe3_22);
    }

    public static Striped semaphore(int n3, int n4) {
        ne3_1 ne3_12 = new ne3_1(n4);
        return Striped.custom(n3, ne3_12);
    }

    private static int smear(int n3) {
        int n4 = n3 >>> 20;
        int n7 = n3 >>> 12;
        n4 = (n3 ^= (n4 ^= n7)) >>> 7 ^ n3;
        return n3 >>> 4 ^ n4;
    }

    public Iterable bulkGet(Iterable iterable) {
        Object object;
        int n3;
        int n4;
        int n7 = (iterable = Lists.newArrayList(iterable)).isEmpty();
        if (n7 != 0) {
            return ImmutableList.of();
        }
        n7 = iterable.size();
        int[] nArray = new int[n7];
        int n8 = 0;
        Object object2 = null;
        for (n4 = 0; n4 < (n3 = iterable.size()); ++n4) {
            object = iterable.get(n4);
            nArray[n4] = n3 = this.indexFor(object);
        }
        Arrays.sort(nArray);
        n4 = nArray[0];
        object = this.getAt(n4);
        iterable.set(0, object);
        for (n8 = 1; n8 < (n3 = iterable.size()); ++n8) {
            n3 = nArray[n8];
            if (n3 == n4) {
                n3 = n8 + -1;
                object = iterable.get(n3);
                iterable.set(n8, object);
                continue;
            }
            object2 = this.getAt(n3);
            iterable.set(n8, object2);
            n4 = n3;
        }
        return Collections.unmodifiableList(iterable);
    }

    public abstract Object get(Object var1);

    public abstract Object getAt(int var1);

    public abstract int indexFor(Object var1);

    public abstract int size();
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Striped64$1;
import com.google.common.hash.Striped64$Cell;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64
extends Number {
    static final int NCPU;
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    static final Random rng;
    static final ThreadLocal threadHashCode;
    volatile transient long base;
    volatile transient int busy;
    volatile transient Striped64$Cell[] cells;

    static {
        Object object;
        int n3;
        Object object2 = new ThreadLocal();
        threadHashCode = object2;
        rng = object2 = new Random();
        object2 = Runtime.getRuntime();
        NCPU = n3 = ((Runtime)object2).availableProcessors();
        try {
            object2 = Striped64.getUnsafe();
        }
        catch (Exception exception) {
            object = new Error(exception);
            throw object;
        }
        UNSAFE = object2;
        object = Striped64.class;
        Object object3 = "base";
        object3 = ((Class)object).getDeclaredField((String)object3);
        long l2 = ((Unsafe)object2).objectFieldOffset((Field)object3);
        baseOffset = l2;
        object3 = "busy";
        object = ((Class)object).getDeclaredField((String)object3);
        long l3 = ((Unsafe)object2).objectFieldOffset((Field)object);
        busyOffset = l3;
    }

    public static /* synthetic */ Unsafe access$000() {
        return Striped64.getUnsafe();
    }

    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            Striped64$1 striped64$1;
            try {
                striped64$1 = new Striped64$1();
                striped64$1 = AccessController.doPrivileged(striped64$1);
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                RuntimeException runtimeException = new RuntimeException("Could not initialize intrinsics", throwable);
                throw runtimeException;
            }
            return (Unsafe)((Object)striped64$1);
        }
    }

    public final boolean casBase(long l2, long l3) {
        Unsafe unsafe = UNSAFE;
        long l4 = baseOffset;
        return unsafe.compareAndSwapLong(this, l4, l2, l3);
    }

    public final boolean casBusy() {
        Unsafe unsafe = UNSAFE;
        long l2 = busyOffset;
        return unsafe.compareAndSwapInt(this, l2, 0, 1);
    }

    public abstract long fn(long var1, long var3);

    public final void internalReset(long l2) {
        Striped64$Cell[] striped64$CellArray = this.cells;
        this.base = l2;
        if (striped64$CellArray != null) {
            for (Striped64$Cell striped64$Cell : striped64$CellArray) {
                if (striped64$Cell == null) continue;
                striped64$Cell.value = l2;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void retryUpdate(long var1_1, int[] var3_2, boolean var4_3) {
        var5_4 = this;
        var6_5 = var1_1;
        var8_6 = 1;
        if (var3_2 == null) {
            var9_7 = Striped64.threadHashCode;
            var10_8 = new int[var8_6];
            var9_7.set(var10_8);
            var9_7 = Striped64.rng;
            var11_9 = var9_7.nextInt();
            if (var11_9 == 0) {
                var11_9 = 1;
            }
            var10_8[0] = var11_9;
        } else {
            var11_9 = var3_2[0];
            var10_8 = var3_2;
        }
        var12_10 = var11_9;
        var13_11 = 0;
        var14_12 = null;
        var11_9 = (int)var4_3;
        while (true) {
            if ((var15_13 /* !! */  = var5_4.cells) != null && (var16_14 = var15_13 /* !! */ .length) > 0) {
                block28: {
                    var17_15 = var16_14 + -1 & var12_10;
                    var18_16 = var15_13 /* !! */ [var17_15];
                    if (var18_16 == null) {
                        var19_17 = var5_4.busy;
                        if (var19_17 == 0) {
                            var15_13 /* !! */  = new Striped64$Cell(var6_5);
                            var16_14 = var5_4.busy;
                            if (var16_14 == 0 && (var16_14 = (int)this.casBusy()) != 0) {
                                block27: {
                                    block26: {
                                        block25: {
                                            try {
                                                var20_18 = var5_4.cells;
                                                if (var20_18 == null || (var17_15 = var20_18.length) <= 0 || (var21_19 = var20_18[var17_15 = var17_15 + -1 & var12_10]) != null) break block25;
                                                var20_18[var17_15] = var15_13 /* !! */ ;
                                                var19_17 = 1;
                                                break block26;
                                            }
                                            catch (Throwable var22_24) {
                                                break block27;
                                            }
                                        }
                                        var19_17 = 0;
                                        var15_13 /* !! */  = null;
                                    }
                                    var5_4.busy = 0;
                                    if (var19_17 == 0) continue;
                                    return;
                                }
                                var5_4.busy = 0;
                                throw var22_24;
                            }
                        }
                        while (true) {
                            var13_11 = 0;
                            var14_12 = null;
                            break block28;
                            break;
                        }
                    }
                    if (var11_9 == 0) {
                        var11_9 = 1;
                    } else {
                        var23_20 = var18_16.value;
                        var25_21 = var5_4.fn(var23_20, var6_5);
                        var17_15 = (int)var18_16.cas(var23_20, var25_21);
                        if (var17_15 != 0) {
                            return;
                        }
                        if (var16_14 >= (var17_15 = Striped64.NCPU) || (var18_16 = var5_4.cells) != var15_13 /* !! */ ) ** continue;
                        if (var13_11 == 0) {
                            var13_11 = 1;
                        } else {
                            var17_15 = var5_4.busy;
                            if (var17_15 == 0 && (var17_15 = (int)this.casBusy()) != 0) {
                                block30: {
                                    block29: {
                                        try {
                                            var14_12 = var5_4.cells;
                                            if (var14_12 != var15_13 /* !! */ ) break block29;
                                            var13_11 = var16_14 << 1;
                                        }
                                        catch (Throwable var22_25) {
                                            break block30;
                                        }
                                        var14_12 = new Striped64$Cell[var13_11];
                                        var18_16 = null;
                                        for (var17_15 = 0; var17_15 < var16_14; ++var17_15) {
                                            var14_12[var17_15] = var21_19 = var15_13 /* !! */ [var17_15];
                                        }
                                        var5_4.cells = var14_12;
                                    }
                                    var5_4.busy = 0;
                                    var13_11 = 0;
                                    var14_12 = null;
                                    continue;
                                }
                                var5_4.busy = 0;
                                throw var22_25;
                            }
                        }
                    }
                }
                var19_17 = var12_10 << 13;
                var12_10 ^= var19_17;
                var19_17 = var12_10 >>> 17;
                var12_10 ^= var19_17;
                var19_17 = var12_10 << 5;
                var10_8[0] = var12_10 ^= var19_17;
                continue;
            }
            var16_14 = var5_4.busy;
            if (var16_14 == 0 && (var20_18 = var5_4.cells) == var15_13 /* !! */  && (var16_14 = (int)this.casBusy()) != 0) {
                block32: {
                    block33: {
                        block31: {
                            try {
                                var20_18 = var5_4.cells;
                                if (var20_18 != var15_13 /* !! */ ) break block31;
                                var19_17 = 2;
                            }
                            catch (Throwable var22_26) {
                                break block32;
                            }
                            {
                                var15_13 /* !! */  = new Striped64$Cell[var19_17];
                                var16_14 = var12_10 & 1;
                                var15_13 /* !! */ [var16_14] = var18_16 = new Striped64$Cell(var6_5);
                                var5_4.cells = var15_13 /* !! */ ;
                                var19_17 = 1;
                                break block33;
                            }
                        }
                        var19_17 = 0;
                        var15_13 /* !! */  = null;
                    }
                    var5_4.busy = 0;
                    if (var19_17 == 0) continue;
                    return;
                }
                var5_4.busy = 0;
                throw var22_26;
            }
            var27_22 = var5_4.base;
            var29_23 = var5_4.fn(var27_22, var6_5);
            var19_17 = var5_4.casBase(var27_22, var29_23);
            if (var19_17 != 0) break;
        }
    }
}


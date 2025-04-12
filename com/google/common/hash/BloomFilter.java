/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilter$1;
import com.google.common.hash.BloomFilter$SerialForm;
import com.google.common.hash.BloomFilter$Strategy;
import com.google.common.hash.BloomFilterStrategies;
import com.google.common.hash.BloomFilterStrategies$LockFreeBitArray;
import com.google.common.hash.Funnel;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicLongArray;

public final class BloomFilter
implements Predicate,
Serializable {
    private final BloomFilterStrategies$LockFreeBitArray bits;
    private final Funnel funnel;
    private final int numHashFunctions;
    private final BloomFilter$Strategy strategy;

    private BloomFilter(BloomFilterStrategies$LockFreeBitArray object, int n3, Funnel funnel, BloomFilter$Strategy bloomFilter$Strategy) {
        boolean bl2 = false;
        int n4 = n3 > 0 ? 1 : 0;
        String string2 = "numHashFunctions (%s) must be > 0";
        Preconditions.checkArgument(n4 != 0, string2, n3);
        n4 = 255;
        if (n3 <= n4) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "numHashFunctions (%s) must be <= 255", n3);
        object = (BloomFilterStrategies$LockFreeBitArray)Preconditions.checkNotNull(object);
        this.bits = object;
        this.numHashFunctions = n3;
        this.funnel = object = (Funnel)Preconditions.checkNotNull(funnel);
        this.strategy = object = (BloomFilter$Strategy)Preconditions.checkNotNull(bloomFilter$Strategy);
    }

    public /* synthetic */ BloomFilter(BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray, int n3, Funnel funnel, BloomFilter$Strategy bloomFilter$Strategy, BloomFilter$1 bloomFilter$1) {
        this(bloomFilterStrategies$LockFreeBitArray, n3, funnel, bloomFilter$Strategy);
    }

    public static /* synthetic */ BloomFilterStrategies$LockFreeBitArray access$000(BloomFilter bloomFilter) {
        return bloomFilter.bits;
    }

    public static /* synthetic */ int access$100(BloomFilter bloomFilter) {
        return bloomFilter.numHashFunctions;
    }

    public static /* synthetic */ Funnel access$200(BloomFilter bloomFilter) {
        return bloomFilter.funnel;
    }

    public static /* synthetic */ BloomFilter$Strategy access$300(BloomFilter bloomFilter) {
        return bloomFilter.strategy;
    }

    public static BloomFilter create(Funnel funnel, int n3) {
        long l2 = n3;
        return BloomFilter.create(funnel, l2);
    }

    public static BloomFilter create(Funnel funnel, int n3, double d2) {
        long l2 = n3;
        return BloomFilter.create(funnel, l2, d2);
    }

    public static BloomFilter create(Funnel funnel, long l2) {
        return BloomFilter.create(funnel, l2, 0.03);
    }

    public static BloomFilter create(Funnel funnel, long l2, double d2) {
        BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.MURMUR128_MITZ_64;
        return BloomFilter.create(funnel, l2, d2, bloomFilterStrategies);
    }

    public static BloomFilter create(Funnel funnel, long l2, double d2, BloomFilter$Strategy bloomFilter$Strategy) {
        Object object;
        Object object2;
        boolean bl2;
        Preconditions.checkNotNull(funnel);
        long l3 = 0L;
        double d5 = 0.0;
        boolean bl3 = false;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        Object object3 = "Expected insertions (%s) must be >= 0";
        Preconditions.checkArgument(bl2, (String)object3, l2);
        l3 = 0L;
        d5 = 0.0;
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        object3 = d2;
        String string2 = "False positive probability (%s) must be > 0.0";
        Preconditions.checkArgument(bl2, string2, object3);
        l3 = 0x3FF0000000000000L;
        d5 = 1.0;
        d7 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (d7 < 0) {
            bl3 = true;
        }
        object2 = d2;
        object3 = "False positive probability (%s) must be < 1.0";
        Preconditions.checkArgument(bl3, (String)object3, object2);
        Preconditions.checkNotNull(bloomFilter$Strategy);
        if (l4 == false) {
            l2 = 1L;
        }
        long l7 = BloomFilter.optimalNumOfBits(l2, d2);
        int n3 = BloomFilter.optimalNumOfHashFunctions(l2, l7);
        try {
            object2 = new BloomFilterStrategies$LockFreeBitArray(l7);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = Ov2.a(l7, "Could not create BloomFilter of ", " bits");
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException((String)object, illegalArgumentException);
            throw illegalArgumentException2;
        }
        object = new BloomFilter((BloomFilterStrategies$LockFreeBitArray)object2, n3, funnel, bloomFilter$Strategy);
        return object;
    }

    public static long optimalNumOfBits(long l2, double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object == false) {
            d2 = Double.MIN_VALUE;
        }
        double d9 = -l2;
        d2 = Math.log(d2) * d9;
        d9 = 2.0;
        d5 = Math.log(d9);
        d9 = Math.log(d9) * d5;
        return (long)(d2 / d9);
    }

    public static int optimalNumOfHashFunctions(long l2, long l3) {
        double d2 = l3;
        double d5 = l2;
        int n3 = (int)Math.round(Math.log(2.0) * (d2 /= d5));
        return Math.max(1, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static BloomFilter readFrom(InputStream var0, Funnel var1_1) {
        block11: {
            Preconditions.checkNotNull(var0, "InputStream");
            var2_7 = "Funnel";
            Preconditions.checkNotNull(var1_1, var2_7);
            var3_8 = -1;
            try {
                var4_9 = new DataInputStream((InputStream)var0);
                var5_10 = var4_9.readByte();
            }
            catch (RuntimeException var1_6) {
                var5_10 = -1;
                var6_11 = -1;
                break block11;
            }
            try {
                var6_11 = var4_9.readByte();
                var6_11 = UnsignedBytes.toInt((byte)var6_11);
            }
            catch (RuntimeException var1_5) {
                var6_11 = -1;
            }
lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_8 = var5_10;
                    var5_10 = -1;
                    break block11;
                    break;
                }
            }
            var3_8 = var4_9.readInt();
            try {
                var7_12 /* !! */  = BloomFilterStrategies.values();
                var7_12 /* !! */  = var7_12 /* !! */ [var5_10];
                var9_14 = var3_8;
                var11_15 = 64;
                var9_14 = LongMath.checkedMultiply(var9_14, var11_15);
                var8_13 = new BloomFilterStrategies$LockFreeBitArray(var9_14);
                var13_16 = 0;
                while (true) {
                    if (var13_16 >= var3_8) {
                        return new BloomFilter(var8_13, var6_11, var1_1, (BloomFilter$Strategy)var7_12 /* !! */ );
                    }
                    var14_17 = var4_9.readLong();
                    var8_13.putData(var13_16, var14_17);
                    ++var13_16;
                }
            }
            catch (RuntimeException var1_2) {
                var16_18 = var3_8;
                var3_8 = var5_10;
                var5_10 = var16_18;
            }
            break block11;
            catch (RuntimeException var1_3) {}
            ** while (true)
        }
        var2_7 = fQ2.a("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ", " numHashFunctions: ", " dataLength: ", var3_8, var6_11);
        var2_7.append(var5_10);
        var0 = var2_7.toString();
        var2_7 = new IOException((String)var0, (Throwable)var1_4);
        throw var2_7;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    private Object writeReplace() {
        BloomFilter$SerialForm bloomFilter$SerialForm = new BloomFilter$SerialForm(this);
        return bloomFilter$SerialForm;
    }

    public boolean apply(Object object) {
        return this.mightContain(object);
    }

    public long approximateElementCount() {
        long l2 = this.bits.bitSize();
        double d2 = this.bits.bitCount();
        double d5 = l2;
        d2 = -Math.log1p(-(d2 / d5)) * d5;
        d5 = this.numHashFunctions;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return DoubleMath.roundToLong(d2 /= d5, roundingMode);
    }

    public long bitSize() {
        return this.bits.bitSize();
    }

    public BloomFilter copy() {
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = this.bits.copy();
        int n3 = this.numHashFunctions;
        Funnel funnel = this.funnel;
        BloomFilter$Strategy bloomFilter$Strategy = this.strategy;
        BloomFilter bloomFilter = new BloomFilter(bloomFilterStrategies$LockFreeBitArray, n3, funnel, bloomFilter$Strategy);
        return bloomFilter;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof BloomFilter;
        if (n3 != 0) {
            boolean bl3;
            Object object2;
            Object object3;
            object = (BloomFilter)object;
            n3 = this.numHashFunctions;
            int n4 = ((BloomFilter)object).numHashFunctions;
            if (n3 != n4 || (n3 = (int)((object3 = this.funnel).equals(object2 = ((BloomFilter)object).funnel) ? 1 : 0)) == 0 || (n3 = (int)(((BloomFilterStrategies$LockFreeBitArray)(object3 = this.bits)).equals(object2 = ((BloomFilter)object).bits) ? 1 : 0)) == 0 || !(bl3 = (object3 = this.strategy).equals(object = ((BloomFilter)object).strategy))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public double expectedFpp() {
        double d2 = this.bits.bitCount();
        double d5 = this.bitSize();
        d2 /= d5;
        d5 = this.numHashFunctions;
        return Math.pow(d2, d5);
    }

    public int hashCode() {
        Integer n3 = this.numHashFunctions;
        Funnel funnel = this.funnel;
        BloomFilter$Strategy bloomFilter$Strategy = this.strategy;
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = this.bits;
        Object[] objectArray = new Object[]{n3, funnel, bloomFilter$Strategy, bloomFilterStrategies$LockFreeBitArray};
        return Objects.hashCode(objectArray);
    }

    public boolean isCompatible(BloomFilter serializable) {
        boolean bl2;
        BloomFilter$Strategy bloomFilter$Strategy;
        Serializable serializable2;
        long l2;
        long l3;
        long l4;
        long l7;
        int n3;
        int n4;
        Preconditions.checkNotNull(serializable);
        if (this != serializable && (n4 = this.numHashFunctions) == (n3 = serializable.numHashFunctions) && (l7 = (l4 = (l3 = this.bitSize()) - (l2 = serializable.bitSize())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n4 = (int)((serializable2 = this.strategy).equals(bloomFilter$Strategy = serializable.strategy) ? 1 : 0)) != 0 && (bl2 = (serializable2 = this.funnel).equals(serializable = serializable.funnel))) {
            bl2 = true;
        } else {
            bl2 = false;
            serializable = null;
        }
        return bl2;
    }

    public boolean mightContain(Object object) {
        BloomFilter$Strategy bloomFilter$Strategy = this.strategy;
        Funnel funnel = this.funnel;
        int n3 = this.numHashFunctions;
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = this.bits;
        return bloomFilter$Strategy.mightContain(object, funnel, n3, bloomFilterStrategies$LockFreeBitArray);
    }

    public boolean put(Object object) {
        BloomFilter$Strategy bloomFilter$Strategy = this.strategy;
        Funnel funnel = this.funnel;
        int n3 = this.numHashFunctions;
        BloomFilterStrategies$LockFreeBitArray bloomFilterStrategies$LockFreeBitArray = this.bits;
        return bloomFilter$Strategy.put(object, funnel, n3, bloomFilterStrategies$LockFreeBitArray);
    }

    public void putAll(BloomFilter object) {
        Serializable serializable;
        int n3;
        Preconditions.checkNotNull(object);
        boolean bl2 = false;
        Object object2 = null;
        if (this != object) {
            n3 = 1;
        } else {
            n3 = 0;
            serializable = null;
        }
        String string2 = "Cannot combine a BloomFilter with itself.";
        Preconditions.checkArgument(n3 != 0, string2);
        n3 = this.numHashFunctions;
        int n4 = ((BloomFilter)object).numHashFunctions;
        boolean bl3 = n3 == n4;
        String string3 = "BloomFilters must have the same number of hash functions (%s != %s)";
        Preconditions.checkArgument(bl3, string3, n3, n4);
        long l2 = this.bitSize();
        long l3 = ((BloomFilter)object).bitSize();
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl4 = l4 == false;
        long l7 = this.bitSize();
        long l8 = ((BloomFilter)object).bitSize();
        Preconditions.checkArgument(bl4, "BloomFilters must have the same size underlying bit arrays (%s != %s)", l7, l8);
        object2 = this.strategy;
        Serializable serializable2 = ((BloomFilter)object).strategy;
        bl2 = object2.equals(serializable2);
        serializable2 = this.strategy;
        serializable = ((BloomFilter)object).strategy;
        Preconditions.checkArgument(bl2, "BloomFilters must have equal strategies (%s != %s)", (Object)serializable2, (Object)serializable);
        object2 = this.funnel;
        serializable2 = ((BloomFilter)object).funnel;
        bl2 = object2.equals(serializable2);
        serializable2 = this.funnel;
        serializable = ((BloomFilter)object).funnel;
        Preconditions.checkArgument(bl2, "BloomFilters must have equal funnels (%s != %s)", (Object)serializable2, (Object)serializable);
        object2 = this.bits;
        object = ((BloomFilter)object).bits;
        ((BloomFilterStrategies$LockFreeBitArray)object2).putAll((BloomFilterStrategies$LockFreeBitArray)object);
    }

    public void writeTo(OutputStream outputStream) {
        AtomicLongArray atomicLongArray;
        int n3;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        int n4 = SignedBytes.checkedCast(this.strategy.ordinal());
        dataOutputStream.writeByte(n4);
        long l2 = this.numHashFunctions;
        n4 = UnsignedBytes.checkedCast(l2);
        dataOutputStream.writeByte(n4);
        n4 = this.bits.data.length();
        dataOutputStream.writeInt(n4);
        outputStream = null;
        for (n4 = 0; n4 < (n3 = (atomicLongArray = this.bits.data).length()); ++n4) {
            atomicLongArray = this.bits.data;
            l2 = atomicLongArray.get(n4);
            dataOutputStream.writeLong(l2);
        }
    }
}


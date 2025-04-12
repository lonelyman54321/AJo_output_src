/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.StatsAccumulator;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class Stats
implements Serializable {
    static final int BYTES = 40;
    private static final long serialVersionUID;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long l2, double d2, double d5, double d7, double d9) {
        this.count = l2;
        this.mean = d2;
        this.sumOfSquaresOfDeltas = d5;
        this.min = d7;
        this.max = d9;
    }

    public static Stats fromByteArray(byte[] object) {
        ByteOrder byteOrder;
        Preconditions.checkNotNull(object);
        int n3 = ((byte[])object).length;
        int n4 = 40;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            byteOrder = null;
        }
        int n7 = ((byte[])object).length;
        Preconditions.checkArgument(n3 != 0, "Expected Stats.BYTES = %s remaining , got %s", n4, n7);
        object = ByteBuffer.wrap((byte[])object);
        byteOrder = ByteOrder.LITTLE_ENDIAN;
        return Stats.readFrom(((ByteBuffer)object).order(byteOrder));
    }

    public static double meanOf(Iterable iterable) {
        return Stats.meanOf(iterable.iterator());
    }

    public static double meanOf(Iterator iterator) {
        boolean bl2;
        long l2;
        boolean bl3 = iterator.hasNext();
        Preconditions.checkArgument(bl3);
        Number number = (Number)iterator.next();
        double d2 = number.doubleValue();
        long l3 = l2 = 1L;
        while (bl2 = iterator.hasNext()) {
            Number number2 = (Number)iterator.next();
            double d5 = number2.doubleValue();
            l3 += l2;
            boolean bl4 = Doubles.isFinite(d5);
            if (bl4 && (bl4 = Doubles.isFinite(d2))) {
                d5 -= d2;
                double d7 = l3;
                d2 = d5 = d5 / d7 + d2;
                continue;
            }
            d2 = StatsAccumulator.calculateNewMeanNonFinite(d2, d5);
        }
        return d2;
    }

    public static double meanOf(double ... dArray) {
        int n3;
        boolean bl2 = dArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        double d2 = dArray[0];
        for (int i3 = 1; i3 < (n3 = dArray.length); ++i3) {
            double d5 = dArray[i3];
            int n4 = Doubles.isFinite(d5);
            if (n4 != 0 && (n4 = Doubles.isFinite(d2)) != 0) {
                d5 -= d2;
                n4 = i3 + 1;
                double d7 = n4;
                d2 = d5 = d5 / d7 + d2;
                continue;
            }
            d2 = StatsAccumulator.calculateNewMeanNonFinite(d2, d5);
        }
        return d2;
    }

    public static double meanOf(int ... nArray) {
        int n3;
        int n4 = nArray.length;
        n4 = n4 > 0 ? 1 : 0;
        Preconditions.checkArgument(n4 != 0);
        n4 = nArray[0];
        double d2 = n4;
        for (int i3 = 1; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3];
            double d5 = n3;
            int n7 = Doubles.isFinite(d5);
            if (n7 != 0 && (n7 = Doubles.isFinite(d2)) != 0) {
                d5 -= d2;
                n7 = i3 + 1;
                double d7 = n7;
                d2 = d5 = d5 / d7 + d2;
                continue;
            }
            d2 = StatsAccumulator.calculateNewMeanNonFinite(d2, d5);
        }
        return d2;
    }

    public static double meanOf(long ... lArray) {
        int n3;
        boolean bl2 = lArray.length;
        bl2 = bl2 > false;
        Preconditions.checkArgument(bl2);
        long l2 = lArray[0];
        double d2 = l2;
        for (int i3 = 1; i3 < (n3 = lArray.length); ++i3) {
            long l3 = lArray[i3];
            double d5 = l3;
            int n4 = Doubles.isFinite(d5);
            if (n4 != 0 && (n4 = Doubles.isFinite(d2)) != 0) {
                d5 -= d2;
                n4 = i3 + 1;
                double d7 = n4;
                d2 = d5 = d5 / d7 + d2;
                continue;
            }
            d2 = StatsAccumulator.calculateNewMeanNonFinite(d2, d5);
        }
        return d2;
    }

    public static Stats of(Iterable iterable) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    public static Stats of(Iterator iterator) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterator);
        return statsAccumulator.snapshot();
    }

    public static Stats of(double ... dArray) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(dArray);
        return statsAccumulator.snapshot();
    }

    public static Stats of(int ... nArray) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(nArray);
        return statsAccumulator.snapshot();
    }

    public static Stats of(long ... lArray) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(lArray);
        return statsAccumulator.snapshot();
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        Stats stats;
        Preconditions.checkNotNull(byteBuffer);
        int n3 = byteBuffer.remaining();
        int n4 = 40;
        if (n3 >= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            stats = null;
        }
        int n7 = byteBuffer.remaining();
        Preconditions.checkArgument(n3 != 0, "Expected at least Stats.BYTES = %s remaining , got %s", n4, n7);
        long l2 = byteBuffer.getLong();
        double d2 = byteBuffer.getDouble();
        double d5 = byteBuffer.getDouble();
        double d7 = byteBuffer.getDouble();
        double d9 = byteBuffer.getDouble();
        stats = new Stats(l2, d2, d5, d7, d9);
        return stats;
    }

    public long count() {
        return this.count;
    }

    public boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        long l7;
        double d2;
        double d5;
        long l8;
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        Class<Stats> clazz = Stats.class;
        Class<?> clazz2 = object.getClass();
        if (clazz != clazz2) {
            return false;
        }
        object = (Stats)object;
        long l12 = this.count;
        long l14 = ((Stats)object).count;
        long l15 = l12 - l14;
        Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object2 == false && (object2 = (l8 = (l12 = Double.doubleToLongBits(d5 = this.mean)) - (l14 = Double.doubleToLongBits(d2 = ((Stats)object).mean))) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false && (object2 = (l7 = (l12 = Double.doubleToLongBits(d5 = this.sumOfSquaresOfDeltas)) - (l14 = Double.doubleToLongBits(d2 = ((Stats)object).sumOfSquaresOfDeltas))) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false && (object2 = (l4 = (l12 = Double.doubleToLongBits(d5 = this.min)) - (l14 = Double.doubleToLongBits(d2 = ((Stats)object).min))) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (l3 = (l2 = (l12 = Double.doubleToLongBits(d5 = this.max)) - (l14 = Double.doubleToLongBits(d2 = ((Stats)object).max))) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        Long l2 = this.count;
        Double d2 = this.mean;
        Double d5 = this.sumOfSquaresOfDeltas;
        Double d7 = this.min;
        Double d9 = this.max;
        Object[] objectArray = new Object[]{l2, d2, d5, d7, d9};
        return Objects.hashCode(objectArray);
    }

    public double max() {
        long l2 = this.count;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        Preconditions.checkState(bl2);
        return this.max;
    }

    public double mean() {
        long l2 = this.count;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        Preconditions.checkState(bl2);
        return this.mean;
    }

    public double min() {
        long l2 = this.count;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        Preconditions.checkState(bl2);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(this.populationVariance());
    }

    public double populationVariance() {
        long l2 = this.count;
        long l3 = 0L;
        double d2 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkState(bl2);
        double d5 = this.sumOfSquaresOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return 0.0 / 0.0;
        }
        l2 = this.count;
        l3 = 1L;
        d2 = Double.MIN_VALUE;
        object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return 0.0;
        }
        d5 = DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas);
        d2 = this.count();
        return d5 / d2;
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(this.sampleVariance());
    }

    public double sampleVariance() {
        long l2 = this.count;
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkState(bl2);
        double d5 = this.sumOfSquaresOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return 0.0 / 0.0;
        }
        d5 = DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas);
        d2 = this.count - l3;
        return d5 / d2;
    }

    public double sum() {
        double d2 = this.mean;
        double d5 = this.count;
        return d2 * d5;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(40);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer = byteBuffer.order(byteOrder);
        this.writeTo(byteBuffer);
        return byteBuffer.array();
    }

    public String toString() {
        long l2 = this.count();
        long l3 = 0L;
        double d2 = 0.0;
        String string2 = "count";
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
            long l4 = this.count;
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add(string2, l4);
            d2 = this.mean;
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("mean", d2);
            d2 = this.populationStandardDeviation();
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("populationStandardDeviation", d2);
            d2 = this.min;
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add("min", d2);
            d2 = this.max;
            return moreObjects$ToStringHelper.add("max", d2).toString();
        }
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        long l7 = this.count;
        return moreObjects$ToStringHelper.add(string2, l7).toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        int n3 = byteBuffer.remaining();
        int n4 = 40;
        n3 = n3 >= n4 ? 1 : 0;
        int n7 = byteBuffer.remaining();
        Preconditions.checkArgument(n3 != 0, "Expected at least Stats.BYTES = %s remaining , got %s", n4, n7);
        long l2 = this.count;
        byteBuffer = byteBuffer.putLong(l2);
        double d2 = this.mean;
        byteBuffer = byteBuffer.putDouble(d2);
        d2 = this.sumOfSquaresOfDeltas;
        byteBuffer = byteBuffer.putDouble(d2);
        d2 = this.min;
        byteBuffer = byteBuffer.putDouble(d2);
        d2 = this.max;
        byteBuffer.putDouble(d2);
    }
}


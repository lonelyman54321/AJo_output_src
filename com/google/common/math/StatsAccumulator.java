/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.Stats;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

public final class StatsAccumulator {
    private long count = 0L;
    private double max;
    private double mean;
    private double min;
    private double sumOfSquaresOfDeltas;

    public StatsAccumulator() {
        double d2;
        this.mean = d2 = 0.0;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d2 = 0.0 / 0.0;
        this.max = d2;
    }

    public static double calculateNewMeanNonFinite(double d2, double d5) {
        boolean bl2 = Doubles.isFinite(d2);
        if (bl2) {
            return d5;
        }
        bl2 = Doubles.isFinite(d5);
        if (!bl2 && (bl2 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1))) {
            d2 = 0.0 / 0.0;
        }
        return d2;
    }

    private void merge(long l2, double d2, double d5, double d7, double d9) {
        StatsAccumulator statsAccumulator = this;
        double d12 = d2;
        double d13 = d7;
        double d14 = d9;
        long l3 = this.count;
        long l4 = 0L;
        double d15 = 0.0;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            this.count = l2;
            this.mean = d2;
            this.sumOfSquaresOfDeltas = d5;
            this.min = d7;
            this.max = d9;
        } else {
            double d16;
            this.count = l3 += l2;
            double d17 = this.mean;
            boolean bl2 = Doubles.isFinite(d17);
            if (bl2 && (bl2 = Doubles.isFinite(d2))) {
                d17 = this.mean;
                d15 = d2 - d17;
                d16 = l2;
                double d18 = d15 * d16;
                long l7 = this.count;
                d14 = l7;
                d18 /= d14;
                this.mean = d14 = d18 + d17;
                d17 = this.sumOfSquaresOfDeltas;
                this.sumOfSquaresOfDeltas = d12 = (d2 - d14) * d15 * d16 + d5 + d17;
            } else {
                statsAccumulator.mean = d16 = StatsAccumulator.calculateNewMeanNonFinite(statsAccumulator.mean, d12);
                statsAccumulator.sumOfSquaresOfDeltas = d16 = 0.0 / 0.0;
            }
            statsAccumulator.min = d16 = Math.min(statsAccumulator.min, d13);
            d16 = statsAccumulator.max;
            d12 = d9;
            statsAccumulator.max = d16 = Math.max(d16, d9);
        }
    }

    public void add(double d2) {
        long l2 = this.count;
        long l3 = 0L;
        double d5 = 0.0;
        long l4 = 9221120237041090560L;
        double d7 = 0.0 / 0.0;
        long l7 = 1L;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            this.count = l7;
            this.mean = d2;
            this.min = d2;
            this.max = d2;
            boolean bl2 = Doubles.isFinite(d2);
            if (!bl2) {
                this.sumOfSquaresOfDeltas = d7;
            }
        } else {
            double d9;
            this.count = l2 += l7;
            boolean bl3 = Doubles.isFinite(d2);
            if (bl3 && (bl3 = Doubles.isFinite(d9 = this.mean))) {
                d9 = this.mean;
                d5 = d2 - d9;
                l4 = this.count;
                d7 = l4;
                this.mean = d7 = d5 / d7 + d9;
                d9 = this.sumOfSquaresOfDeltas;
                this.sumOfSquaresOfDeltas = d7 = (d2 - d7) * d5 + d9;
            } else {
                this.mean = d9 = StatsAccumulator.calculateNewMeanNonFinite(this.mean, d2);
                this.sumOfSquaresOfDeltas = d7;
            }
            this.min = d9 = Math.min(this.min, d2);
            d9 = this.max;
            this.max = d2 = Math.max(d9, d2);
        }
    }

    public void addAll(Stats stats) {
        long l2;
        long l3 = stats.count();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        long l7 = stats.count();
        double d2 = stats.mean();
        double d5 = stats.sumOfSquaresOfDeltas();
        double d7 = stats.min();
        double d9 = stats.max();
        this.merge(l7, d2, d5, d7, d9);
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        long l2;
        long l3 = statsAccumulator.count();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        long l7 = statsAccumulator.count();
        double d2 = statsAccumulator.mean();
        double d5 = statsAccumulator.sumOfSquaresOfDeltas();
        double d7 = statsAccumulator.min();
        double d9 = statsAccumulator.max();
        this.merge(l7, d2, d5, d7, d9);
    }

    public void addAll(Iterable object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Number number = (Number)object.next();
            double d2 = number.doubleValue();
            this.add(d2);
        }
    }

    public void addAll(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Number number = (Number)iterator.next();
            double d2 = number.doubleValue();
            this.add(d2);
        }
    }

    public void addAll(double ... dArray) {
        for (double d2 : dArray) {
            this.add(d2);
        }
    }

    public void addAll(int ... nArray) {
        for (int n3 : nArray) {
            double d2 = n3;
            this.add(d2);
        }
    }

    public void addAll(long ... lArray) {
        for (long l2 : lArray) {
            double d2 = l2;
            this.add(d2);
        }
    }

    public long count() {
        return this.count;
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

    public final double populationStandardDeviation() {
        return Math.sqrt(this.populationVariance());
    }

    public final double populationVariance() {
        long l2 = this.count;
        long l3 = 0L;
        double d2 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object != false;
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
        d2 = this.count;
        return d5 / d2;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(this.sampleVariance());
    }

    public final double sampleVariance() {
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

    public Stats snapshot() {
        long l2 = this.count;
        double d2 = this.mean;
        double d5 = this.sumOfSquaresOfDeltas;
        double d7 = this.min;
        double d9 = this.max;
        Stats stats = new Stats(l2, d2, d5, d7, d9);
        return stats;
    }

    public final double sum() {
        double d2 = this.mean;
        double d5 = this.count;
        return d2 * d5;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.LinearTransformation;
import com.google.common.math.LinearTransformation$LinearTransformationBuilder;
import com.google.common.math.PairedStats;
import com.google.common.math.Stats;
import com.google.common.math.StatsAccumulator;
import com.google.common.primitives.Doubles;

public final class PairedStatsAccumulator {
    private double sumOfProductsOfDeltas;
    private final StatsAccumulator xStats;
    private final StatsAccumulator yStats;

    public PairedStatsAccumulator() {
        StatsAccumulator statsAccumulator;
        this.xStats = statsAccumulator = new StatsAccumulator();
        this.yStats = statsAccumulator = new StatsAccumulator();
        this.sumOfProductsOfDeltas = 0.0;
    }

    private static double ensureInUnitRange(double d2) {
        return Doubles.constrainToRange(d2, -1.0, 1.0);
    }

    private double ensurePositive(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object > 0) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    public void add(double d2, double d5) {
        StatsAccumulator statsAccumulator = this.xStats;
        statsAccumulator.add(d2);
        boolean bl2 = Doubles.isFinite(d2);
        if (bl2 && (bl2 = Doubles.isFinite(d5))) {
            statsAccumulator = this.xStats;
            long l2 = statsAccumulator.count();
            long l3 = 1L;
            double d7 = Double.MIN_VALUE;
            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object > 0) {
                double d9 = this.sumOfProductsOfDeltas;
                d7 = this.xStats.mean();
                d2 -= d7;
                StatsAccumulator statsAccumulator2 = this.yStats;
                d7 = statsAccumulator2.mean();
                this.sumOfProductsOfDeltas = d7 = (d5 - d7) * d2 + d9;
            }
        } else {
            this.sumOfProductsOfDeltas = d2 = 0.0 / 0.0;
        }
        this.yStats.add(d5);
    }

    public void addAll(PairedStats serializable) {
        long l2 = ((PairedStats)serializable).count();
        long l3 = 0L;
        double d2 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return;
        }
        StatsAccumulator statsAccumulator = this.xStats;
        Stats stats = ((PairedStats)serializable).xStats();
        statsAccumulator.addAll(stats);
        statsAccumulator = this.yStats;
        l2 = statsAccumulator.count();
        object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            double d5;
            this.sumOfProductsOfDeltas = d5 = ((PairedStats)serializable).sumOfProductsOfDeltas();
        } else {
            double d7 = this.sumOfProductsOfDeltas;
            d2 = ((PairedStats)serializable).sumOfProductsOfDeltas();
            Stats stats2 = ((PairedStats)serializable).xStats();
            double d9 = stats2.mean();
            double d12 = this.xStats.mean();
            d9 -= d12;
            Stats stats3 = ((PairedStats)serializable).yStats();
            d12 = stats3.mean();
            StatsAccumulator statsAccumulator2 = this.yStats;
            double d13 = statsAccumulator2.mean();
            d12 = (d12 - d13) * d9;
            long l4 = ((PairedStats)serializable).count();
            d9 = l4;
            this.sumOfProductsOfDeltas = d12 = d12 * d9 + d2 + d7;
        }
        statsAccumulator = this.yStats;
        serializable = ((PairedStats)serializable).yStats();
        statsAccumulator.addAll((Stats)serializable);
    }

    public long count() {
        return this.xStats.count();
    }

    public final LinearTransformation leastSquaresFit() {
        StatsAccumulator statsAccumulator;
        boolean bl2;
        long l2 = this.count();
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        boolean bl3 = false;
        StatsAccumulator statsAccumulator2 = null;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            statsAccumulator = null;
        }
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return LinearTransformation.forNaN();
        }
        statsAccumulator = this.xStats;
        d5 = statsAccumulator.sumOfSquaresOfDeltas();
        l3 = 0L;
        d2 = 0.0;
        double d7 = d5 - d2;
        object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object > 0) {
            statsAccumulator2 = this.yStats;
            double d9 = statsAccumulator2.sumOfSquaresOfDeltas();
            double d12 = d9 - d2;
            object = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            if (object > 0) {
                d2 = this.xStats.mean();
                d9 = this.yStats.mean();
                LinearTransformation$LinearTransformationBuilder linearTransformation$LinearTransformationBuilder = LinearTransformation.mapping(d2, d9);
                double d13 = this.sumOfProductsOfDeltas / d5;
                return linearTransformation$LinearTransformationBuilder.withSlope(d13);
            }
            return LinearTransformation.horizontal(this.yStats.mean());
        }
        statsAccumulator = this.yStats;
        d5 = statsAccumulator.sumOfSquaresOfDeltas();
        double d14 = d5 - d2;
        object = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        if (object > 0) {
            bl3 = true;
        }
        Preconditions.checkState(bl3);
        return LinearTransformation.vertical(this.xStats.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        StatsAccumulator statsAccumulator;
        boolean bl2;
        long l2 = this.count();
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        boolean bl3 = false;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            statsAccumulator = null;
        }
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return 0.0 / 0.0;
        }
        statsAccumulator = this.xStats;
        d5 = statsAccumulator.sumOfSquaresOfDeltas();
        StatsAccumulator statsAccumulator2 = this.yStats;
        d2 = statsAccumulator2.sumOfSquaresOfDeltas();
        double d7 = 0.0;
        double d9 = d5 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        object2 = object2 > 0 ? (Object)true : (Object)false;
        Preconditions.checkState((boolean)object2);
        object2 = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
        if (object2 > 0) {
            bl3 = true;
        }
        Preconditions.checkState(bl3);
        d5 *= d2;
        d5 = this.ensurePositive(d5);
        d2 = this.sumOfProductsOfDeltas;
        d5 = Math.sqrt(d5);
        return PairedStatsAccumulator.ensureInUnitRange(d2 / d5);
    }

    public double populationCovariance() {
        long l2 = this.count();
        long l3 = 0L;
        double d2 = 0.0;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object != false;
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        d2 = this.count();
        return d5 / d2;
    }

    public final double sampleCovariance() {
        long l2 = this.count();
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        d2 = this.count() - l3;
        return d5 / d2;
    }

    public PairedStats snapshot() {
        Stats stats = this.xStats.snapshot();
        Stats stats2 = this.yStats.snapshot();
        double d2 = this.sumOfProductsOfDeltas;
        PairedStats pairedStats = new PairedStats(stats, stats2, d2);
        return pairedStats;
    }

    public Stats xStats() {
        return this.xStats.snapshot();
    }

    public Stats yStats() {
        return this.yStats.snapshot();
    }
}


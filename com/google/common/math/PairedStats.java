/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.LinearTransformation;
import com.google.common.math.LinearTransformation$LinearTransformationBuilder;
import com.google.common.math.Stats;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class PairedStats
implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public PairedStats(Stats stats, Stats stats2, double d2) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d2;
    }

    private static double ensureInUnitRange(double d2) {
        double d5 = 1.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object >= 0) {
            return d5;
        }
        d5 = -1.0;
        double d9 = d2 - d5;
        object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object <= 0) {
            return d5;
        }
        return d2;
    }

    private static double ensurePositive(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object > 0) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] object) {
        Object object2;
        Preconditions.checkNotNull(object);
        int n3 = ((byte[])object).length;
        int n4 = 88;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        int n7 = ((byte[])object).length;
        Preconditions.checkArgument(n3 != 0, "Expected PairedStats.BYTES = %s, got %s", n4, n7);
        object = ByteBuffer.wrap((byte[])object);
        object2 = ByteOrder.LITTLE_ENDIAN;
        object = ((ByteBuffer)object).order((ByteOrder)object2);
        object2 = Stats.readFrom((ByteBuffer)object);
        Stats stats = Stats.readFrom((ByteBuffer)object);
        double d2 = ((ByteBuffer)object).getDouble();
        object = new PairedStats((Stats)object2, stats, d2);
        return object;
    }

    public long count() {
        return this.xStats.count();
    }

    public boolean equals(Object object) {
        double d2;
        long l2;
        double d5;
        long l3;
        long l4;
        long l7;
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        Object object2 = PairedStats.class;
        Serializable serializable = object.getClass();
        if (object2 != serializable) {
            return false;
        }
        object = (PairedStats)object;
        serializable = this.xStats;
        object2 = ((PairedStats)object).xStats;
        boolean bl3 = ((Stats)serializable).equals(object2);
        if (bl3 && (bl3 = ((Stats)(serializable = this.yStats)).equals(object2 = ((PairedStats)object).yStats)) && (l7 = (l4 = (l3 = Double.doubleToLongBits(d5 = this.sumOfProductsOfDeltas)) - (l2 = Double.doubleToLongBits(d2 = ((PairedStats)object).sumOfProductsOfDeltas))) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            bl2 = true;
        }
        return bl2;
    }

    public int hashCode() {
        Stats stats = this.xStats;
        Stats stats2 = this.yStats;
        Double d2 = this.sumOfProductsOfDeltas;
        Object[] objectArray = new Object[]{stats, stats2, d2};
        return Objects.hashCode(objectArray);
    }

    public LinearTransformation leastSquaresFit() {
        Stats stats;
        boolean bl2;
        long l2 = this.count();
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        boolean bl3 = false;
        Stats stats2 = null;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            stats = null;
        }
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return LinearTransformation.forNaN();
        }
        stats = this.xStats;
        d5 = stats.sumOfSquaresOfDeltas();
        l3 = 0L;
        d2 = 0.0;
        double d7 = d5 - d2;
        object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object > 0) {
            stats2 = this.yStats;
            double d9 = stats2.sumOfSquaresOfDeltas();
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
        stats = this.yStats;
        d5 = stats.sumOfSquaresOfDeltas();
        double d14 = d5 - d2;
        object = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        if (object > 0) {
            bl3 = true;
        }
        Preconditions.checkState(bl3);
        return LinearTransformation.vertical(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        Stats stats;
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
            stats = null;
        }
        Preconditions.checkState(bl2);
        double d5 = this.sumOfProductsOfDeltas;
        bl2 = Double.isNaN(d5);
        if (bl2) {
            return 0.0 / 0.0;
        }
        stats = this.xStats();
        d5 = stats.sumOfSquaresOfDeltas();
        Stats stats2 = this.yStats();
        d2 = stats2.sumOfSquaresOfDeltas();
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
        d5 = PairedStats.ensurePositive(d5 * d2);
        d2 = this.sumOfProductsOfDeltas;
        d5 = Math.sqrt(d5);
        return PairedStats.ensureInUnitRange(d2 / d5);
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

    public double sampleCovariance() {
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

    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(88);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer = byteBuffer.order(byteOrder);
        this.xStats.writeTo(byteBuffer);
        this.yStats.writeTo(byteBuffer);
        double d2 = this.sumOfProductsOfDeltas;
        byteBuffer.putDouble(d2);
        return byteBuffer.array();
    }

    public String toString() {
        long l2 = this.count();
        long l3 = 0L;
        double d2 = 0.0;
        String string2 = "yStats";
        String string3 = "xStats";
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
            Stats stats = this.xStats;
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add(string3, stats);
            stats = this.yStats;
            moreObjects$ToStringHelper = moreObjects$ToStringHelper.add(string2, stats);
            d2 = this.populationCovariance();
            return moreObjects$ToStringHelper.add("populationCovariance", d2).toString();
        }
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        Stats stats = this.xStats;
        moreObjects$ToStringHelper = moreObjects$ToStringHelper.add(string3, stats);
        stats = this.yStats;
        return moreObjects$ToStringHelper.add(string2, stats).toString();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.math.Quantiles;
import com.google.common.math.Quantiles$1;
import com.google.common.primitives.Doubles;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Quantiles$ScaleAndIndexes {
    private final int[] indexes;
    private final int scale;

    private Quantiles$ScaleAndIndexes(int n3, int[] nArray) {
        int n4 = nArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = nArray[i3];
            Quantiles.access$300(n7, n3);
        }
        n4 = nArray.length;
        if (n4 > 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Indexes must be a non empty array");
        this.scale = n3;
        this.indexes = nArray;
    }

    public /* synthetic */ Quantiles$ScaleAndIndexes(int n3, int[] nArray, Quantiles$1 quantiles$1) {
        this(n3, nArray);
    }

    public Map compute(Collection object) {
        object = Doubles.toArray((Collection)object);
        return this.computeInPlace((double[])object);
    }

    public Map compute(double ... dArray) {
        dArray = (double[])dArray.clone();
        return this.computeInPlace(dArray);
    }

    public Map compute(int ... objectArray) {
        objectArray = Quantiles.access$500(objectArray);
        return this.computeInPlace((double[])objectArray);
    }

    public Map compute(long ... objectArray) {
        objectArray = Quantiles.access$400(objectArray);
        return this.computeInPlace((double[])objectArray);
    }

    public Map computeInPlace(double ... dArray) {
        int n3;
        int[] nArray;
        int n4;
        LinkedHashMap<Integer, Double> linkedHashMap;
        Quantiles$ScaleAndIndexes quantiles$ScaleAndIndexes = this;
        double[] dArray2 = dArray;
        int n7 = dArray.length;
        int n8 = 0;
        int n10 = 1;
        if (n7 > 0) {
            n7 = 1;
        } else {
            n7 = 0;
            linkedHashMap = null;
        }
        Object object = "Cannot calculate quantiles of an empty dataset";
        Preconditions.checkArgument(n7 != 0, object);
        n7 = Quantiles.access$600(dArray);
        if (n7 != 0) {
            linkedHashMap = new LinkedHashMap<Integer, Double>();
            int[] nArray2 = quantiles$ScaleAndIndexes.indexes;
            int n14 = nArray2.length;
            while (n8 < n14) {
                int n15 = nArray2[n8];
                Integer n16 = n15;
                long l2 = 9221120237041090560L;
                double d2 = 0.0 / 0.0;
                Double d5 = d2;
                linkedHashMap.put(n16, d5);
                ++n8;
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }
        linkedHashMap = (LinkedHashMap<Integer, Double>)quantiles$ScaleAndIndexes.indexes;
        int[] nArray3 = new int[((Object)linkedHashMap).length];
        int[] nArray4 = new int[((Object)linkedHashMap).length];
        n7 = ((Object)linkedHashMap).length * 2;
        linkedHashMap = (LinkedHashMap<Integer, Double>)new int[n7];
        int n17 = 0;
        object = null;
        int n18 = 0;
        double[] dArray3 = null;
        while (n17 < (n4 = (nArray = quantiles$ScaleAndIndexes.indexes).length)) {
            n3 = nArray[n17];
            long l3 = n3;
            long l4 = dArray2.length - n10;
            l3 *= l4;
            l4 = quantiles$ScaleAndIndexes.scale;
            RoundingMode roundingMode = RoundingMode.DOWN;
            l4 = LongMath.divide(l3, l4, roundingMode);
            int n19 = (int)l4;
            long l7 = n19;
            int n20 = quantiles$ScaleAndIndexes.scale;
            int n21 = n17;
            long l8 = n20;
            n10 = (int)(l3 -= (l7 *= l8));
            nArray3[n17] = n19;
            nArray4[n17] = n10;
            linkedHashMap[n18] = (LinkedHashMap)n19;
            n17 = n18 + 1;
            if (n10 != 0) {
                linkedHashMap[n17] = (LinkedHashMap)(++n19);
                n18 += 2;
            } else {
                n18 = n17;
            }
            n17 = n21 + 1;
            n10 = 1;
        }
        Arrays.sort((int[])linkedHashMap, 0, n18);
        n17 = n18 + -1;
        n18 = dArray2.length;
        n4 = n18 + -1;
        n10 = 0;
        Object object2 = null;
        n3 = 0;
        nArray = null;
        dArray3 = dArray;
        Quantiles.access$900((int[])linkedHashMap, 0, n17, dArray, 0, n4);
        linkedHashMap = new LinkedHashMap<Integer, Double>();
        while (n8 < (n17 = ((int[])(object2 = quantiles$ScaleAndIndexes.indexes)).length)) {
            double d7;
            n17 = nArray3[n8];
            n18 = nArray4[n8];
            if (n18 == 0) {
                n10 = object2[n8];
                object2 = n10;
                d7 = dArray2[n17];
                object = d7;
                linkedHashMap.put((Integer)object2, (Double)object);
            } else {
                n10 = object2[n8];
                object2 = n10;
                double d9 = dArray2[n17];
                double d12 = dArray2[++n17];
                d7 = n18;
                n3 = quantiles$ScaleAndIndexes.scale;
                double d13 = n3;
                d7 = Quantiles.access$800(d9, d12, d7, d13);
                object = d7;
                linkedHashMap.put((Integer)object2, (Double)object);
            }
            ++n8;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}


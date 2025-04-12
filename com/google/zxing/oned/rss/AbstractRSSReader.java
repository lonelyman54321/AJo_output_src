/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;

public abstract class AbstractRSSReader
extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.2f;
    private static final float MAX_FINDER_PATTERN_RATIO = 0.89285713f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.45f;
    private static final float MIN_FINDER_PATTERN_RATIO = 0.7916667f;
    private final int[] dataCharacterCounters;
    private final int[] decodeFinderCounters;
    private final int[] evenCounts;
    private final float[] evenRoundingErrors;
    private final int[] oddCounts;
    private final float[] oddRoundingErrors;

    public AbstractRSSReader() {
        int n3 = 4;
        int[] nArray = new int[n3];
        this.decodeFinderCounters = nArray;
        nArray = new int[8];
        this.dataCharacterCounters = nArray;
        float[] fArray = new float[n3];
        this.oddRoundingErrors = fArray;
        Object[] objectArray = new float[n3];
        this.evenRoundingErrors = objectArray;
        objectArray = new int[nArray.length / 2];
        this.oddCounts = (int[])objectArray;
        objectArray = new int[nArray.length / 2];
        this.evenCounts = (int[])objectArray;
    }

    public static int count(int[] nArray) {
        return MathUtils.sum(nArray);
    }

    public static void decrement(int[] nArray, float[] fArray) {
        int n3;
        int n4;
        int n7 = 0;
        float f5 = fArray[0];
        int n8 = 1;
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            float f6 = fArray[i3];
            float f7 = f6 - f5;
            Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object >= 0) continue;
            n7 = i3;
            f5 = f6;
        }
        nArray[n7] = n3 = nArray[n7] - n8;
    }

    public static void increment(int[] nArray, float[] fArray) {
        int n3;
        int n4;
        int n7 = 0;
        float f5 = fArray[0];
        int n8 = 1;
        for (int i3 = 1; i3 < (n4 = nArray.length); ++i3) {
            float f6 = fArray[i3];
            float f7 = f6 - f5;
            Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object <= 0) continue;
            n7 = i3;
            f5 = f6;
        }
        nArray[n7] = n3 = nArray[n7] + n8;
    }

    public static boolean isFinderPattern(int[] nArray) {
        int n3 = nArray[0];
        boolean bl2 = true;
        int n4 = nArray[bl2];
        n3 += n4;
        n4 = nArray[2] + n3;
        int n7 = nArray[3];
        float f5 = n3;
        float f6 = n4 += n7;
        float f7 = (f5 /= f6) - (f6 = 0.7916667f);
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 >= 0) {
            n4 = 1063555657;
            f6 = 0.89285713f;
            float f8 = f5 - f6;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1));
            if (n3 <= 0) {
                n3 = nArray.length;
                n4 = -1 >>> 1;
                f6 = 0.0f / 0.0f;
                n7 = -1 << -1;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n8 = nArray[i3];
                    if (n8 > n7) {
                        n7 = n8;
                    }
                    if (n8 >= n4) continue;
                    n4 = n8;
                }
                if (n7 < (n4 *= 10)) {
                    return bl2;
                }
            }
        }
        return false;
    }

    public static int parseFinderValue(int[] nArray, int[][] nArray2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = nArray2.length); ++i3) {
            float f5;
            int[] nArray3 = nArray2[i3];
            float f6 = OneDReader.patternMatchVariance(nArray, nArray3, 0.45f);
            float f7 = f6 - (f5 = 0.2f);
            n3 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
            if (n3 >= 0) continue;
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] getDataCharacterCounters() {
        return this.dataCharacterCounters;
    }

    public final int[] getDecodeFinderCounters() {
        return this.decodeFinderCounters;
    }

    public final int[] getEvenCounts() {
        return this.evenCounts;
    }

    public final float[] getEvenRoundingErrors() {
        return this.evenRoundingErrors;
    }

    public final int[] getOddCounts() {
        return this.oddCounts;
    }

    public final float[] getOddRoundingErrors() {
        return this.oddRoundingErrors;
    }
}


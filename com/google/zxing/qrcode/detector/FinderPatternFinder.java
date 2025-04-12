/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder$CenterComparator;
import com.google.zxing.qrcode.detector.FinderPatternFinder$FurthestFromAverageComparator;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List possibleCenters;
    private final ResultPointCallback resultPointCallback;

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public FinderPatternFinder(BitMatrix object, ResultPointCallback resultPointCallback) {
        this.image = object;
        this.possibleCenters = object;
        object = new int[5];
        this.crossCheckStateCount = (int[])object;
        this.resultPointCallback = resultPointCallback;
    }

    private static float centerFromEnd(int[] nArray, int n3) {
        int n4 = nArray[4];
        n3 -= n4;
        n4 = nArray[3];
        float f5 = n3 - n4;
        float f6 = (float)nArray[2] / 2.0f;
        return f5 - f6;
    }

    private boolean crossCheckDiagonal(int n3, int n4) {
        BitMatrix bitMatrix;
        int n7;
        int n8;
        int n10;
        BitMatrix bitMatrix2;
        int n14;
        int n15;
        int n16;
        int[] nArray = this.getCrossCheckStateCount();
        int n17 = 0;
        BitMatrix bitMatrix3 = null;
        while (true) {
            n16 = 2;
            n15 = 1;
            if (n3 < n17 || n4 < n17 || (n14 = (int)((bitMatrix2 = this.image).get(n10 = n4 - n17, n8 = n3 - n17) ? 1 : 0)) == 0) break;
            nArray[n16] = n14 = nArray[n16] + n15;
            ++n17;
        }
        n14 = nArray[n16];
        if (n14 == 0) {
            return false;
        }
        while (n3 >= n17 && n4 >= n17 && (n14 = (int)((bitMatrix2 = this.image).get(n10 = n4 - n17, n8 = n3 - n17) ? 1 : 0)) == 0) {
            nArray[n15] = n14 = nArray[n15] + n15;
            ++n17;
        }
        n14 = nArray[n15];
        if (n14 == 0) {
            return false;
        }
        while (n3 >= n17 && n4 >= n17 && (n14 = (int)((bitMatrix2 = this.image).get(n10 = n4 - n17, n8 = n3 - n17) ? 1 : 0)) != 0) {
            nArray[0] = n14 = nArray[0] + n15;
            ++n17;
        }
        n17 = nArray[0];
        if (n17 == 0) {
            return false;
        }
        bitMatrix3 = this.image;
        n17 = bitMatrix3.getHeight();
        bitMatrix2 = this.image;
        n14 = bitMatrix2.getWidth();
        n10 = 1;
        while ((n8 = n3 + n10) < n17 && (n7 = n4 + n10) < n14 && (n8 = (int)((bitMatrix = this.image).get(n7, n8) ? 1 : 0)) != 0) {
            nArray[n16] = n8 = nArray[n16] + n15;
            ++n10;
        }
        while (true) {
            n16 = n3 + n10;
            n8 = 3;
            if (n16 >= n17 || (n7 = n4 + n10) >= n14 || (n16 = (int)((bitMatrix = this.image).get(n7, n16) ? 1 : 0)) != 0) break;
            nArray[n8] = n16 = nArray[n8] + n15;
            ++n10;
        }
        n16 = nArray[n8];
        if (n16 == 0) {
            return false;
        }
        while (true) {
            n16 = n3 + n10;
            n8 = 4;
            if (n16 >= n17 || (n7 = n4 + n10) >= n14 || (n16 = (int)((bitMatrix = this.image).get(n7, n16) ? 1 : 0)) == 0) break;
            nArray[n8] = n16 = nArray[n8] + n15;
            ++n10;
        }
        n3 = nArray[n8];
        if (n3 == 0) {
            return false;
        }
        return FinderPatternFinder.foundPatternDiagonal(nArray);
    }

    private float crossCheckHorizontal(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        int n16;
        BitMatrix bitMatrix = this.image;
        int n17 = bitMatrix.getWidth();
        int[] nArray = this.getCrossCheckStateCount();
        int n18 = n3;
        while (true) {
            n16 = 2;
            n15 = 1;
            if (n18 < 0 || (n14 = (int)(bitMatrix.get(n18, n4) ? 1 : 0)) == 0) break;
            nArray[n16] = n14 = nArray[n16] + n15;
            n18 += -1;
        }
        n14 = 2143289344;
        float f5 = 0.0f / 0.0f;
        if (n18 < 0) {
            return f5;
        }
        while (n18 >= 0 && (n10 = bitMatrix.get(n18, n4)) == 0 && (n10 = nArray[n15]) <= n7) {
            nArray[n15] = ++n10;
            n18 += -1;
        }
        if (n18 >= 0 && (n10 = nArray[n15]) <= n7) {
            int n19;
            while (true) {
                n10 = 0;
                if (n18 < 0 || (n19 = bitMatrix.get(n18, n4)) == 0 || (n19 = nArray[0]) > n7) break;
                nArray[0] = ++n19;
                n18 += -1;
            }
            n18 = nArray[0];
            if (n18 > n7) {
                return f5;
            }
            n3 += n15;
            while (n3 < n17 && (n18 = (int)(bitMatrix.get(n3, n4) ? 1 : 0)) != 0) {
                nArray[n16] = n18 = nArray[n16] + n15;
                ++n3;
            }
            if (n3 == n17) {
                return f5;
            }
            while (true) {
                n18 = 3;
                if (n3 >= n17 || (n19 = (int)(bitMatrix.get(n3, n4) ? 1 : 0)) != 0 || (n19 = nArray[n18]) >= n7) break;
                nArray[n18] = ++n19;
                ++n3;
            }
            if (n3 != n17 && (n19 = nArray[n18]) < n7) {
                while (true) {
                    int n20;
                    n19 = 4;
                    if (n3 >= n17 || (n20 = bitMatrix.get(n3, n4)) == 0 || (n20 = nArray[n19]) >= n7) break;
                    nArray[n19] = ++n20;
                    ++n3;
                }
                n4 = nArray[n19];
                if (n4 >= n7) {
                    return f5;
                }
                n7 = nArray[0];
                int n21 = nArray[n15];
                n7 += n21;
                n21 = nArray[n16];
                n7 += n21;
                n21 = nArray[n18];
                if ((n4 = Math.abs(n7 = n7 + n21 + n4 - n8) * 5) >= n8) {
                    return f5;
                }
                n4 = (int)(FinderPatternFinder.foundPatternCross(nArray) ? 1 : 0);
                if (n4 != 0) {
                    return FinderPatternFinder.centerFromEnd(nArray, n3);
                }
            }
        }
        return f5;
    }

    private float crossCheckVertical(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        int n16;
        BitMatrix bitMatrix = this.image;
        int n17 = bitMatrix.getHeight();
        int[] nArray = this.getCrossCheckStateCount();
        int n18 = n3;
        while (true) {
            n16 = 2;
            n15 = 1;
            if (n18 < 0 || (n14 = (int)(bitMatrix.get(n4, n18) ? 1 : 0)) == 0) break;
            nArray[n16] = n14 = nArray[n16] + n15;
            n18 += -1;
        }
        n14 = 2143289344;
        float f5 = 0.0f / 0.0f;
        if (n18 < 0) {
            return f5;
        }
        while (n18 >= 0 && (n10 = bitMatrix.get(n4, n18)) == 0 && (n10 = nArray[n15]) <= n7) {
            nArray[n15] = ++n10;
            n18 += -1;
        }
        if (n18 >= 0 && (n10 = nArray[n15]) <= n7) {
            int n19;
            while (true) {
                n10 = 0;
                if (n18 < 0 || (n19 = bitMatrix.get(n4, n18)) == 0 || (n19 = nArray[0]) > n7) break;
                nArray[0] = ++n19;
                n18 += -1;
            }
            n18 = nArray[0];
            if (n18 > n7) {
                return f5;
            }
            n3 += n15;
            while (n3 < n17 && (n18 = (int)(bitMatrix.get(n4, n3) ? 1 : 0)) != 0) {
                nArray[n16] = n18 = nArray[n16] + n15;
                ++n3;
            }
            if (n3 == n17) {
                return f5;
            }
            while (true) {
                n18 = 3;
                if (n3 >= n17 || (n19 = (int)(bitMatrix.get(n4, n3) ? 1 : 0)) != 0 || (n19 = nArray[n18]) >= n7) break;
                nArray[n18] = ++n19;
                ++n3;
            }
            if (n3 != n17 && (n19 = nArray[n18]) < n7) {
                while (true) {
                    int n20;
                    n19 = 4;
                    if (n3 >= n17 || (n20 = bitMatrix.get(n4, n3)) == 0 || (n20 = nArray[n19]) >= n7) break;
                    nArray[n19] = ++n20;
                    ++n3;
                }
                n4 = nArray[n19];
                if (n4 >= n7) {
                    return f5;
                }
                n7 = nArray[0];
                int n21 = nArray[n15];
                n7 += n21;
                n21 = nArray[n16];
                n7 += n21;
                n21 = nArray[n18];
                if ((n4 = Math.abs(n7 = n7 + n21 + n4 - n8) * 5) >= (n8 *= 2)) {
                    return f5;
                }
                n4 = (int)(FinderPatternFinder.foundPatternCross(nArray) ? 1 : 0);
                if (n4 != 0) {
                    return FinderPatternFinder.centerFromEnd(nArray, n3);
                }
            }
        }
        return f5;
    }

    private int findRowSkip() {
        boolean bl2;
        Object object = this.possibleCenters;
        int n3 = object.size();
        float f5 = 0.0f;
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        if (n3 <= n4) {
            return 0;
        }
        object = this.possibleCenters.iterator();
        FinderPattern finderPattern = null;
        while (bl2 = object.hasNext()) {
            int n7;
            FinderPattern finderPattern2 = (FinderPattern)object.next();
            int n8 = finderPattern2.getCount();
            if (n8 < (n7 = 2)) continue;
            if (finderPattern == null) {
                finderPattern = finderPattern2;
                continue;
            }
            this.hasSkipped = n4;
            float f7 = finderPattern.getX();
            f5 = finderPattern2.getX();
            f7 = Math.abs(f7 - f5);
            f5 = finderPattern.getY();
            f6 = finderPattern2.getY();
            f5 = Math.abs(f5 - f6);
            return (int)(f7 - f5) / n7;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean foundPatternCross(int[] nArray) {
        void var3_6;
        float f5;
        boolean bl3 = false;
        float f6 = 0.0f;
        boolean bl2 = false;
        float f7 = 0.0f;
        while (true) {
            void var1_2;
            int n3 = 5;
            f5 = 7.0E-45f;
            if (var1_2 >= n3) break;
            n3 = nArray[var1_2];
            if (n3 == 0) {
                return false;
            }
            var3_6 += n3;
            ++var1_2;
        }
        int n4 = 7;
        f6 = 9.8E-45f;
        if (var3_6 < n4) {
            return false;
        }
        f6 = (float)var3_6 / 7.0f;
        int n7 = 0x40000000;
        f7 = f6 / 2.0f;
        f5 = nArray[0];
        float f8 = (f5 = Math.abs(f6 - f5)) - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            boolean bl4 = true;
            f5 = Float.MIN_VALUE;
            float f11 = nArray[bl4];
            float f12 = (f11 = Math.abs(f6 - f11)) - f7;
            Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                f11 = 3.0f;
                float f14 = f6 * f11;
                int n8 = nArray[2];
                float f15 = n8;
                float f16 = (f14 = Math.abs(f14 - f15)) - (f11 *= f7);
                object2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                if (object2 < 0) {
                    f11 = nArray[3];
                    float f17 = (f11 = Math.abs(f6 - f11)) - f7;
                    object2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    if (object2 < 0) {
                        object2 = 4;
                        f11 = 5.6E-45f;
                        float f18 = nArray[object2];
                        float f19 = (f18 = Math.abs(f6 -= f18)) - f7;
                        Object object3 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                        if (object3 < 0) {
                            return bl4;
                        }
                    }
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean foundPatternDiagonal(int[] nArray) {
        void var3_6;
        float f5;
        boolean bl3 = false;
        float f6 = 0.0f;
        boolean bl2 = false;
        float f7 = 0.0f;
        while (true) {
            void var1_2;
            int n3 = 5;
            f5 = 7.0E-45f;
            if (var1_2 >= n3) break;
            n3 = nArray[var1_2];
            if (n3 == 0) {
                return false;
            }
            var3_6 += n3;
            ++var1_2;
        }
        int n4 = 7;
        f6 = 9.8E-45f;
        if (var3_6 < n4) {
            return false;
        }
        f6 = (float)var3_6 / 7.0f;
        int n7 = 1068146622;
        f7 = f6 / 1.333f;
        f5 = nArray[0];
        float f8 = (f5 = Math.abs(f6 - f5)) - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            boolean bl4 = true;
            f5 = Float.MIN_VALUE;
            float f11 = nArray[bl4];
            float f12 = (f11 = Math.abs(f6 - f11)) - f7;
            Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                f11 = 3.0f;
                float f14 = f6 * f11;
                int n8 = nArray[2];
                float f15 = n8;
                float f16 = (f14 = Math.abs(f14 - f15)) - (f11 *= f7);
                object2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                if (object2 < 0) {
                    f11 = nArray[3];
                    float f17 = (f11 = Math.abs(f6 - f11)) - f7;
                    object2 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    if (object2 < 0) {
                        object2 = 4;
                        f11 = 5.6E-45f;
                        float f18 = nArray[object2];
                        float f19 = (f18 = Math.abs(f6 -= f18)) - f7;
                        Object object3 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                        if (object3 < 0) {
                            return bl4;
                        }
                    }
                }
            }
        }
        return false;
    }

    private int[] getCrossCheckStateCount() {
        int[] nArray = this.crossCheckStateCount;
        this.clearCounts(nArray);
        return this.crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters() {
        boolean bl2;
        List list = this.possibleCenters;
        int n3 = list.size();
        Iterator iterator = this.possibleCenters.iterator();
        float f5 = 0.0f;
        int n4 = 0;
        float f6 = 0.0f;
        FinderPattern finderPattern = null;
        float f7 = 0.0f;
        while (bl2 = iterator.hasNext()) {
            int n7;
            FinderPattern finderPattern2 = (FinderPattern)iterator.next();
            int n8 = finderPattern2.getCount();
            if (n8 < (n7 = 2)) continue;
            ++n4;
            float f8 = finderPattern2.getEstimatedModuleSize();
            f7 += f8;
        }
        int n10 = 3;
        if (n4 < n10) {
            return false;
        }
        float f11 = n3;
        f11 = f7 / f11;
        iterator = this.possibleCenters.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            finderPattern = (FinderPattern)iterator.next();
            f6 = Math.abs(finderPattern.getEstimatedModuleSize() - f11);
            f5 += f6;
        }
        f11 = 0.05f;
        float f12 = f5 - (f7 *= f11);
        n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
        return n3 <= 0;
    }

    private FinderPattern[] selectBestPatterns() {
        int n3;
        int n4 = 2;
        int n7 = 1;
        List list = this.possibleCenters;
        int n8 = list.size();
        if (n8 >= (n3 = 3)) {
            int n10;
            float f5;
            float f6;
            Object object;
            int n14 = 0;
            FinderPattern finderPattern = null;
            float f7 = 0.0f;
            FinderPattern finderPattern2 = null;
            if (n8 > n3) {
                boolean bl2;
                object = this.possibleCenters.iterator();
                float f8 = 0.0f;
                int n15 = 0;
                float f11 = 0.0f;
                Object object2 = null;
                while (bl2 = object.hasNext()) {
                    FinderPattern finderPattern3 = (FinderPattern)object.next();
                    float f12 = finderPattern3.getEstimatedModuleSize();
                    f8 += f12;
                    f12 *= f12;
                    f11 += f12;
                }
                f6 = n8;
                f8 /= f6;
                f11 /= f6;
                f6 = f8 * f8;
                double d2 = Math.sqrt(f11 -= f6);
                f6 = (float)d2;
                object = this.possibleCenters;
                object2 = new FinderPatternFinder$FurthestFromAverageComparator(f8, null);
                Collections.sort(object, object2);
                f6 = Math.max(0.2f * f8, f6);
                f5 = 0.0f;
                object = null;
                for (n10 = 0; n10 < (n15 = (object2 = this.possibleCenters).size()) && (n15 = (object2 = this.possibleCenters).size()) > n3; n10 += n7) {
                    object2 = (FinderPattern)this.possibleCenters.get(n10);
                    f11 = Math.abs(((FinderPattern)object2).getEstimatedModuleSize() - f8);
                    float f14 = f11 - f6;
                    n15 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                    if (n15 <= 0) continue;
                    object2 = this.possibleCenters;
                    object2.remove(n10);
                    n10 += -1;
                }
            }
            if ((n8 = (list = this.possibleCenters).size()) > n3) {
                list = this.possibleCenters.iterator();
                while ((n10 = list.hasNext()) != 0) {
                    object = (FinderPattern)list.next();
                    f5 = ((FinderPattern)object).getEstimatedModuleSize();
                    f7 += f5;
                }
                n8 = this.possibleCenters.size();
                f6 = n8;
                list = this.possibleCenters;
                object = new FinderPatternFinder$CenterComparator(f7 /= f6, null);
                Collections.sort(list, object);
                list = this.possibleCenters;
                n14 = list.size();
                list = list.subList(n3, n14);
                list.clear();
            }
            list = (FinderPattern)this.possibleCenters.get(0);
            finderPattern = (FinderPattern)this.possibleCenters.get(n7);
            finderPattern2 = (FinderPattern)this.possibleCenters.get(n4);
            FinderPattern[] finderPatternArray = new FinderPattern[n3];
            finderPatternArray[0] = list;
            finderPatternArray[n7] = finderPattern;
            finderPatternArray[n4] = finderPattern2;
            return finderPatternArray;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void clearCounts(int[] nArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            nArray[i3] = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final FinderPatternInfo find(Map resultPointArray) {
        int n3;
        Object object;
        int n4;
        FinderPatternInfo finderPatternInfo = null;
        int n7 = 1;
        if (resultPointArray != null && (n4 = resultPointArray.containsKey(object = DecodeHintType.TRY_HARDER)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            resultPointArray = null;
        }
        object = this.image;
        int n8 = ((BitMatrix)object).getHeight();
        BitMatrix bitMatrix = this.image;
        int n10 = bitMatrix.getWidth();
        int n14 = n8 * 3 / 388;
        int n15 = 3;
        if (n14 < n15 || n4 != 0) {
            n3 = 3;
        }
        n4 = 5;
        resultPointArray = (ResultPoint[])new int[n4];
        int n16 = n3 + -1;
        boolean bl2 = false;
        while (true) {
            reference var9_11;
            int n17;
            int n18;
            if (n16 < n8 && !bl2) {
                this.clearCounts((int[])resultPointArray);
                n18 = 0;
            } else {
                resultPointArray = this.selectBestPatterns();
                ResultPoint.orderBestPatterns(resultPointArray);
                return new FinderPatternInfo((FinderPattern[])resultPointArray);
            }
            for (n17 = 0; n17 < n10; n17 += n7) {
                BitMatrix bitMatrix2 = this.image;
                Object object2 = bitMatrix2.get(n17, n16);
                if (object2 != 0) {
                    object2 = n18 & 1;
                    if (object2 == n7) {
                        ++n18;
                    }
                    object2 = resultPointArray[n18] + n7;
                    resultPointArray[n18] = (ResultPoint)object2;
                    continue;
                }
                object2 = n18 & 1;
                if (object2 == 0) {
                    object2 = 4;
                    if (n18 == object2) {
                        n18 = (int)(FinderPatternFinder.foundPatternCross((int[])resultPointArray) ? 1 : 0);
                        if (n18 != 0) {
                            n18 = (int)(this.handlePossibleCenter((int[])resultPointArray, n16, n17) ? 1 : 0);
                            if (n18 != 0) {
                                var9_11 = (reference)this.hasSkipped;
                                n18 = 2;
                                if (var9_11 != false) {
                                    bl2 = this.haveMultiplyConfirmedCenters();
                                } else {
                                    var9_11 = (reference)this.findRowSkip();
                                    if (var9_11 > (object2 = (Object)resultPointArray[n18])) {
                                        var9_11 = var9_11 - object2 - n18;
                                        n16 += var9_11;
                                        n17 = n10 + -1;
                                    }
                                }
                                this.clearCounts((int[])resultPointArray);
                                var9_11 = (reference)2;
                                n18 = 0;
                                continue;
                            }
                            this.shiftCounts2((int[])resultPointArray);
                        } else {
                            this.shiftCounts2((int[])resultPointArray);
                        }
                        n18 = 3;
                        continue;
                    }
                    object2 = resultPointArray[++n18] + n7;
                    resultPointArray[n18] = (ResultPoint)object2;
                    continue;
                }
                object2 = resultPointArray[n18] + n7;
                resultPointArray[n18] = (ResultPoint)object2;
            }
            n17 = (int)(FinderPatternFinder.foundPatternCross((int[])resultPointArray) ? 1 : 0);
            if (n17 != 0 && (n17 = (int)(this.handlePossibleCenter((int[])resultPointArray, n16, n10) ? 1 : 0)) != 0) {
                var9_11 = resultPointArray[0];
                n17 = (int)(this.hasSkipped ? 1 : 0);
                if (n17 != 0) {
                    bl2 = this.haveMultiplyConfirmedCenters();
                }
            }
            n16 += var9_11;
        }
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final List getPossibleCenters() {
        return this.possibleCenters;
    }

    public final boolean handlePossibleCenter(int[] object, int n3, int n4) {
        int n7;
        float f5;
        FinderPattern finderPattern = null;
        int n8 = object[0];
        boolean bl2 = true;
        int n10 = object[bl2];
        n8 += n10;
        n10 = 2;
        int n14 = object[n10];
        n8 += n14;
        n14 = object[3];
        n8 += n14;
        n14 = object[4];
        n8 += n14;
        float f6 = FinderPatternFinder.centerFromEnd((int[])object, n4);
        n4 = (int)f6;
        n14 = object[n10];
        float f7 = this.crossCheckVertical(n3, n4, n14, n8);
        if ((n14 = (int)(Float.isNaN(f7) ? 1 : 0)) == 0 && (n4 = (int)(Float.isNaN(f5 = this.crossCheckHorizontal(n4, n14 = (int)f7, n7 = object[n10], n8)) ? 1 : 0)) == 0) {
            n4 = (int)f5;
            if ((n4 = (int)(this.crossCheckDiagonal(n14, n4) ? 1 : 0)) != 0) {
                block4: {
                    Object object2;
                    f6 = n8;
                    n8 = 0x40E00000;
                    float f8 = 7.0f;
                    f6 /= f8;
                    for (int i3 = 0; i3 < (n8 = (object2 = this.possibleCenters).size()); ++i3) {
                        object2 = (FinderPattern)this.possibleCenters.get(i3);
                        n10 = (int)(((FinderPattern)object2).aboutEquals(f6, f7, f5) ? 1 : 0);
                        if (n10 == 0) continue;
                        List list = this.possibleCenters;
                        object = ((FinderPattern)object2).combineEstimate(f7, f5, f6);
                        list.set(i3, object);
                        break block4;
                    }
                    finderPattern = new FinderPattern(f5, f7, f6);
                    this.possibleCenters.add(finderPattern);
                    object = this.resultPointCallback;
                    if (object != null) {
                        object.foundPossibleResultPoint(finderPattern);
                    }
                }
                return bl2;
            }
        }
        return false;
    }

    public final boolean handlePossibleCenter(int[] nArray, int n3, int n4, boolean bl2) {
        return this.handlePossibleCenter(nArray, n3, n4);
    }

    public final void shiftCounts2(int[] nArray) {
        int n3;
        int n4;
        int n7 = 2;
        nArray[0] = n4 = nArray[n7];
        n4 = 3;
        int n8 = nArray[n4];
        int n10 = 1;
        nArray[n10] = n8;
        n8 = 4;
        nArray[n7] = n3 = nArray[n8];
        nArray[n4] = n10;
        nArray[n8] = 0;
    }
}

